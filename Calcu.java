
package interfaz;

public class Calcu 
{
    private String cadena;
    private double total;
    private boolean suma;
    private boolean resta;
    private boolean mult;
    private boolean div;
    
    public Calcu()
    {
        cadena = " "; 
        suma = false;
        resta = false;
        mult = false; 
        div = false; 
    }
    public String espacio (String cadena)
    {
        this.cadena = this.cadena+cadena;
        return this.cadena;
    }
    public void suma(String cadena)
    {
        this.total = Double.parseDouble(cadena);
        suma = true;
        this.cadena = " ";
    }
    public void resta(String cadena)
    {
        this.total = Double.parseDouble(cadena);
        resta = true;
        this.cadena = " ";
    }
    public void mult(String cadena)
    {
        this.total = Double.parseDouble(cadena);
        mult = true;
        this.cadena = " ";
    }
    public void div(String cadena)
    {
        this.total = Double.parseDouble(cadena);
        div = true;
        this.cadena = " ";
    }
    public double total(String num)
    {
        if(suma==true)
        {
            total = total+Double.parseDouble(num);
            
        }else if(resta == true)
        {
            total = total-Double.parseDouble(num);
        }
        else if(mult==true)
        {
            total = total*Double.parseDouble(num);
        }
        else if(div==true)
        {
            total = total/Double.parseDouble(num);
        }
        suma = false;
        resta = false;
        mult = false;
        div = false;
        
        return total;
    }
}
