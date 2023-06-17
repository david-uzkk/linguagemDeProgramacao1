package ex1;

public class aplicativoTeste extends data{
    public static void main(String[] args) {
        data d = new data();
        d.testeData(12, 10, 2022);
        d.sistemaData();
        d.setDia(30);
        d.setMes(8); 
        d.setAno(2001);
        System.out.println(d.getDia());
        System.out.println(d.getMes());
        System.out.println(d.getAno());
        System.out.println(d.toString(""));
        d.avancarDia(1, 10, 2022);
        
    }
}
