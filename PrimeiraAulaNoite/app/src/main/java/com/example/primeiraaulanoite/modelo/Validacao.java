package com.example.primeiraaulanoite.modelo;

public class Validacao
{
    private String num1 = "";
    private String num2 = "";
    private String op = "";
    private Double n1 = 0.0;
    private Double n2 = 0.0;
    private String mensagem = "";

    public Validacao(String num1, String num2, String op)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        Validar();
    }

    private void Validar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(this.num1);
            this.n2 = Double.parseDouble(this.num2);
            if (this.n2.equals(0.0) && this.op.equals("/"))
                this.mensagem = "Divisão por zero";
        }
        catch (Exception e)
        {
            this.mensagem = "Valores inválidos";
        }
    }

    public Double getN1()
    {
        return n1;
    }

    public Double getN2()
    {
        return n2;
    }

    public String getMensagem()
    {
        return mensagem;
    }
}
