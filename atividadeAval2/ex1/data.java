package ex1;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class data {
    public int dia;
    public int mes;
    public int ano;

    public void testeData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (dia < 1 || dia > 30) {
            System.out.printf("Dia invalido!\n");
        } else
            System.out.printf("Dia valido!\n");
        if (mes < 1 || mes > 12) {
            System.out.printf("Mes invalido!\n");
        } else
            System.out.printf("Mes valido!\n");
        if (ano < 0 || ano > 2022) {
            System.out.printf("Ano invalido!\n");
        } else
            System.out.printf("Ano valido!\n");
    }

    public void sistemaData() {
        Date datatual = new Date(System.currentTimeMillis());
        this.dia = Integer.parseInt(new SimpleDateFormat("d").format(datatual));
        this.mes = Integer.parseInt(new SimpleDateFormat("M").format(datatual));
        this.ano = Integer.parseInt(new SimpleDateFormat("y").format(datatual));
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public String toString(String data) {
        data = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
        return data;
    }

    public void avancarDia(int dia, int mes, int ano) {
        if (dia == 30) {
            dia = 1;
            if (mes == 12) {
                mes = 1;
                ano++;
            } else
                mes++;
        } else
            dia++;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

}
