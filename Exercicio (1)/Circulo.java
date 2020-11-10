public class Circulo extends Forma {

    
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    
    @Override
    public String getNome() {
        return "Circulo";
    }
    
    
    @Override
    double calcularPerimetro() {
       return (raio * 2) * 3.14;
    }
    
    @Override
    public double getArea() {

        return (raio * raio) * 3.14;
    }
    



}