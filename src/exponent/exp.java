package exponent;
/**
 * @author Anastasia
 */
public class exp {
    private int value;   
    
    
    public exp(int a){
          value = a;          
    }    
    public exp st(exp a1){
        return new exp ((int) Math.pow(value,a1.getValue()));
    }
    public int getValue(){
        return value;
    }
     public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null)
        return false;
        if (getClass() != obj.getClass())
        return false;
        exp other = (exp) obj;
        return value == other.value;
    }
}
