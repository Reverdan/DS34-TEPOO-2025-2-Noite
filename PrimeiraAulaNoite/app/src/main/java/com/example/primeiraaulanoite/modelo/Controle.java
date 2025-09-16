package com.example.primeiraaulanoite.modelo;

public class Controle
{
    private String num1 = "";
    private String num2 = "";
    private String op = "";
    private String mensagem = "";
    private String resposta = "";

    public Controle(String num1, String num2, String op)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        Executar();
    }

    private void Executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(this.num1, this.num2, this.op);
        if (validacao.getMensagem().equals(""))
        {
            Calculos calculos = new Calculos(validacao.getN1(), validacao.getN2(), this.op);
            this.resposta = calculos.toString();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }

    @Override
    public String toString()
    {
        return this.resposta;
    }

    public String getMensagem()
    {
        return mensagem;
    }
}
