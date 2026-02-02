package sistemacadastro;

public class Cadastro {

    private String nome;
    private String cargo;
    private int idade;
    private int id;

    public Cadastro() {

    }

    public String getNome() {
        return nome;
    }

    // não permite o que o campo nome fique em branco
    // não permite que o usuário digite nada além de letras
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Campo nome não pode ficar em branco!");
        }

        if (!nome.matches("^[a-zA-z\\s]+$")) {
            throw new IllegalArgumentException("Campo nome deve conter apenas letras!");
        }
        this.nome = nome.trim();
    }

    public String getCargo() {
        return cargo;
    }

    // não permite que o campo cargo fique em branco
    // não permite que o usuário digite nada além de letras
    public void setCargo(String cargo) {
        if (cargo == null || cargo.isBlank()) {
            throw new IllegalArgumentException("Campo cargo não pode ficar vazio!");
        }
        if (!cargo.matches("^[a-zA-z\\s]+$")) {
            throw new IllegalArgumentException("Campo cargo deve conter apenas letras!");
        }
        this.cargo = cargo.trim();
    }

    public int getIdade() {
        return idade;
    }

    // não permite que o usuario insira algo além de números
    // idades válidas: maiores de 18 anos e menores de 81
    // mesmo com o erro o usuario tente novamente
    public void setIdade(String idadeString) {
        int idade;

        try {
            idade = Integer.parseInt(idadeString);
        } catch (NumberFormatException erro) {
            throw new IllegalArgumentException("O campo idade deve conter apenas números! ");
        }
        if (idade <= 0) {
            throw new IllegalArgumentException("Campo idade deve ser maior que zero!");
        } else if (idade < 18) {
            throw new IllegalArgumentException("Você deve ser maior de idade!");
        } else if (idade > 80) {
            throw new IllegalArgumentException("Insira uma idade válida!");
        }

        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    // não permite que o usuário insira algo além de números
    // campo id contém somente 4 números
    public void setId(String idString) {
        int id;

        try {
            id = Integer.parseInt(idString);
        } catch (NumberFormatException erro) {
            throw new IllegalArgumentException("O campo ID deve conter apenas números!");
        }
        if (id < 1000 || id > 9999) {
            throw new IllegalArgumentException("Campo ID deve conter 4 dígitos!");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\nCargo: %s\nIdade: %d\nID: %d",
                nome, cargo, idade, id);
    }

}
