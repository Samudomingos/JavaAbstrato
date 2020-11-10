public class Diretor extends Gerente{

  public double Salario;
  public double Bonificacao;

   public void setSalario(double Salario){
    this.Salario = Salario;
  }
 
   

  @Override
  public String obterCargo(){
    return "Diretor";
  }

  @Override
  public String getBonificacao(){
    return "Sem bonificação";
  }

  @Override
  public double obterSalario(){
    return Salario;
  }
}