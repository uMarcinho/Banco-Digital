public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.nome = nome;
        this.cpf = cpf;
    }

    public boolean autenticar(String cpf) {
        return this.cpf.equals(cpf);
    }

    @Override
    public String toString() {
        return String.format("Cliente{nome='%s', cpf='%s'}", nome, cpf);
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
}