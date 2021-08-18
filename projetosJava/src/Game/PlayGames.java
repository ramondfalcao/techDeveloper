package Game;

public class SistemaJogo {
    public static void main(String[] args) {
        UsuarioJogo user1 = new UsuarioJogo();
        user1.setnome("Ramond");
        user1.setNickname("Falcon87");
        user1.getPontuacao(SistemaJogo.getPontuacao());
    }
}
