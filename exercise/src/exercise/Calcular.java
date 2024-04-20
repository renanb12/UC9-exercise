package exercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calcular {
    int tipoPessoa;
    int bicicleta;
    LocalDate dataInicio;
    LocalDate dataDevolucao;

    public Calcular(int tipoPessoa, int bicicleta, LocalDate dataInicio, LocalDate dataDevolucao) {
        this.tipoPessoa = tipoPessoa;
        this.bicicleta = bicicleta;
        this.dataInicio = dataInicio;
        this.dataDevolucao = dataDevolucao;
    }

    public int getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(int tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public int getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(int bicicleta) {
        this.bicicleta = bicicleta;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public double CalcularValorTotal(){ 
        double valorBicicleta = 0;
        double desconto = 0;
        double valorTotal = 0;
        
        switch(tipoPessoa){ 
            case 0:
                desconto = 0.5;
                break;
            case 1:
                desconto = 0.1;
                break;
        }
        
        switch(bicicleta){ 
            case 0:
                valorBicicleta = 25.0;
                break;
            case 1:
                valorBicicleta = 45.0;
                break;
        }
        
        int dias = CalcularData();
        
        if(dias > 20){
            desconto += 0.1;
        }
        
        valorTotal = (valorBicicleta * dias) - (valorBicicleta * dias * desconto);
        
        return valorTotal;
    }
    
    public int CalcularData() {
        long diferencaEmDias = ChronoUnit.DAYS.between(dataInicio, dataDevolucao);
        
        int diferenca = (int) (long) diferencaEmDias;
        return diferenca;
    }
}
