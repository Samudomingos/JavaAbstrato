public class Gerente extends Funcionario{

  public double Salario;
  public double Bonificacao;

   public void setSalario(double Salario){
    this.Salario = Salario;
  }

  @Override
  public String obterCargo(){
    return "Gerente";
  }

  @Override
  public String getBonificacao(){
    return "20%";
  }


  @Override
  public double obterSalario(){
    return 3000 + (3000*0.2);
  }
}