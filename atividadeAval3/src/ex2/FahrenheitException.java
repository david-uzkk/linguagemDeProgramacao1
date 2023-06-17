package ex2;

public class FahrenheitException extends TemperatureException{
    public void TestTemperatura(double temperatura) throws TemperatureException{
        if(temperatura < -459.67){
            throw new TemperatureException();
        }
    }
}
