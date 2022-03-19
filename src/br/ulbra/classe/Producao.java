package br.ulbra.classe;

/**
 * 16/03/2022
 *
 * @author Giovanna Renner
 */
public class Producao {

    protected String peca;
    protected int segundos;
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Producao(int hora) {
        this.peca = "Mouse";
        this.segundos = 100;
        this.hora = hora;
      
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {

        if (segundos < 0) {
            System.out.println("NEGATIVO");
        }else {
          this.segundos = segundos;
      

        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void calcularHMS() {
        int segundoss;
        segundoss = 0;
        this.hora = segundos / 3600;
        segundoss = segundos % 3600;
        this.minuto = segundoss/60;
        segundoss %= 60;
        segundo = segundoss;
        
    }

    @Override
    public String toString() {
        return  "A peça: " + this.getPeca()
                + "  levou um total de   " + segundos
                +" "+  this.getHora() 
                + "   Hora  " 
                + this.getMinuto() 
                + " minuto e " 
                + this.getSegundo() 
                + " segundos para ficar pronta! ";
    }
}
