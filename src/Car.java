public class Car {

    int anoDeLancamento;
    private String marca;
    private String modelo;

    public Car(int anoDeLancamento, String marca, String modelo){
        this.anoDeLancamento = anoDeLancamento;
        this.marca = marca;
        this.modelo = modelo;
    }
  
    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int newAnoDeLancamento){
        anoDeLancamento = newAnoDeLancamento;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String newMarca){
        marca = newMarca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String newModelo){
        modelo = newModelo;
    }

    
}