package Entities;

public class Cliente {
    private String nome;
    private String numero;
    private String item;
    private Double valor;
    private boolean resgatado;

    public Cliente(String nome, String numero, String item, Double valor, boolean resgatado) {
        this.nome = nome;
        this.numero = numero;
        this.item = item;
        this.valor = valor;
        this.resgatado = resgatado;
    }

    public Cliente(String nome, String numero, String item, Double valor) {
        this.nome = nome;
        this.numero = numero;
        this.item = item;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }



    public String getNumero() {
        return numero;
    }



    public String getItem() {
        return item;
    }


    public Double getValor() {
        return valor;
    }


    public Boolean getResgatado() {
        return resgatado;
    }

    public void setResgatado(Boolean resgatado) {
        this.resgatado = resgatado;
    }
    public String toString(){
        return "nome: " + nome
                +"\nnumero: "
                +numero
                +"\nitem: "
                + item
                +"\nvalor: R$" +String.format("%.2f", valor)
                + "\nResgatado: "
                +resgatado;
    }
}




