package OrientacaoAoObjeto;
public class Constructor {
    private String marca;
    private int ano;
    
    public Constructor() {
        this("", 0);
    }

    public Constructor(String marca){
        this(marca, 0);
    }

    public Constructor(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public void setMarca(String marca){
            this.marca = marca;
        }
    
    public String getMarca(){
            return marca;
        }

    public void setAno(int ano){
            this.ano = ano;
        }
    
    public int getAno(){
            return ano;
        }
}
