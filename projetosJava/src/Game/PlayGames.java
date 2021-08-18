package Game;

public class PlayGames {
    public static void main(String[] args) {
        UsuarioJogo glysns = new UsuarioJogo("GLEYSON","glysns");
        glysns.aumentarPontuacao();
        glysns.aumentarPontuacao();

        glysns.subirNivel();

        glysns.bonificar(10);

        System.out.println("O usuario: "+ glysns.getNickname()
                + " Teve pontuação: " + glysns.getPontuacao()
                + " e está no nivel: "+ glysns.getNivel() );
    }
}
