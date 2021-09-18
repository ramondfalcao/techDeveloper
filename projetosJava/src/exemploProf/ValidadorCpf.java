package exemploProf;

public class ValidadorCpf {
    public static boolean validar(String cpf) throws CpfInvalidoException {
        if(cpf.length()<11)
            throw new CpfInvalidoException("o cpf precisa ter 11 digitos");
        return true;
    }
}
