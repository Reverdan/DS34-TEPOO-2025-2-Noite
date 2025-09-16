package com.example.primeiraaulanoite.modelo;

public class Calculos
{
    private Double n1 = 0.0;
    private Double n2 = 0.0;
    private Double resultado = 0.0;
    private String op = "";

    public Calculos(Double n1, Double n2, String op)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
        executar();
    }

    private void executar()
    {
        if (op.equals("+"))
            this.resultado = this.n1 + this.n2;
        if (op.equals("-"))
            this.resultado = this.n1 - this.n2;
        if (op.equals("*"))
            this.resultado = this.n1 * this.n2;
        if (op.equals("/"))
            this.resultado = this.n1 / this.n2;
    }

    @Override
    public String toString()
    {
        return resultado.toString();
    }
}
