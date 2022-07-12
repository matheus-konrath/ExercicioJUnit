package Entitie;

public class Financing {

    private Double totalAmount;
    private Double income;
    private Integer months;

    public Financing(Double totalAmount, Double income, Integer months){
        validatedFinancing(totalAmount, income, months);
        this.totalAmount = totalAmount;
        this.income = income;
        this.months = months;
    }

    public Double getTotalAmount(){
        return totalAmount;
    }

    public Double getIncome(){
        return income;
    }

    public Integer getMonths(){
        return months;
    }

    public void setTotalAmount(Double totalAmount){
        validatedFinancing(totalAmount, income, months);
        this.totalAmount = totalAmount;
    }

    public void setIncome(Double income){
        validatedFinancing(totalAmount, income, months);
        this.income = income;
    }

    public void setMonths(Integer months){
        validatedFinancing(totalAmount, income, months);
        this.months = months;
    }

    public Double entry(){
       return totalAmount * 0.2;
    }

    public Double quota(){
        return (totalAmount - entry()) / months;
    }

    public void validatedFinancing(Double totalAmount, Double income, Integer months){
        if(totalAmount * 0.8 / months > income / 2.0){
            throw new IllegalArgumentException("Não é possivel validar o financiamento");
        }
    }
    
}
