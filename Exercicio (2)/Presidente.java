public class Presidente extends Funcionario{

  public double Salario;
  public double Bonificacao;

   public void setSalario(double Salario){
    this.Salario = Salario;
  }

  @Override
  public String obterCargo(){
    return "Presidente";
  }

  @Override
  public String getBonificacao(){
    return "30%";
  }


  @Override
  public double obterSalario(){
    return 10000 + (10000*0.3);
  }
}