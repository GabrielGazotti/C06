package Funcionalidade;

import Excecoes.RedeSocialException;
import Excecoes.UsuarioInvalidoException;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nome;
    private String email;
    private Set<RedeSocial> redesSociais;

    public Usuario(String nome, String email, Set<RedeSocial> redesSociais) {
        if (nome == null || nome.isEmpty() || email == null || email.isEmpty()) {
            throw new UsuarioInvalidoException("Nome ou email do usuário não podem estar vazios.");
        }
        if (redesSociais == null || redesSociais.isEmpty()) {
            throw new UsuarioInvalidoException("O usuário deve possuir ao menos uma rede social.");
        }
        this.nome = nome;
        this.email = email;
        this.redesSociais = new HashSet<>(redesSociais);
    }

    public void adicionarRedeSocial(RedeSocial rede) throws RedeSocialException {
        if (redesSociais.contains(rede)) {
            throw new RedeSocialException("A rede social já foi adicionada.");
        }
        redesSociais.add(rede);
    }

    public void usarRedesSociais() {
        int count = 0;

        for (RedeSocial rede : redesSociais) {
            System.out.println("\nUsando a rede social:");

            // Garantindo que cada rede social execute métodos diferentes
            switch (count) {
                case 0: // Primeira rede social
                    rede.postarFoto();
                    rede.curtirPublicacao();
                    if (rede instanceof Compartilhamento) {
                        ((Compartilhamento) rede).compartilhar();
                    }
                    break;

                case 1: // Segunda rede social
                    rede.postarVideo();
                    rede.postarComentario();
                    if (rede instanceof VideoConferencia) {
                        ((VideoConferencia) rede).fazStreaming();
                    }
                    break;

                default:
                    System.out.println("Nenhuma ação definida para essa rede social.");
                    break;
            }

            count++;
        }
    }
}
