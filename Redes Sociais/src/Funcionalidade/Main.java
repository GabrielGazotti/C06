package Funcionalidade;

import Excecoes.RedeSocialException;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            // Criação das redes sociais
            RedeSocial facebook = new Facebook("senha123", 150);
            RedeSocial instagram = new Instagram("senha456", 200);

            // Coleção de redes sociais
            Set<RedeSocial> redesSociais = new HashSet<>();
            redesSociais.add(facebook);
            redesSociais.add(instagram);

            // Criação de um usuário usando o construtor
            Usuario usuario = new Usuario("Ana", "ana@email.com", redesSociais);

            // Usando as redes sociais
            usuario.usarRedesSociais();

            // Tentativa de adicionar a mesma rede social novamente
            usuario.adicionarRedeSocial(facebook);

        } catch (RedeSocialException e) {
            System.err.println("Erro ao adicionar rede social: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
