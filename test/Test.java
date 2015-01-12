
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Metodo que muestra los multiplos de 5 entre 10 y 95
     */
    public void multiplesofFive()
    {
        int mul = 3;
        int cont = 11;
        
        while (cont > 10 && cont < 95)
        {
            cont = 5 * mul;
            System.out.println(cont);
            mul ++;
        }
    }
    
    /**
     * Metodo que muestra la suma de los numeros comprendidos entre 0 y 10 incluidos
     */
    public void sumValues ()
    {
        int index = 0;
        int end = 0;
        
        while (end<=10)
        {   
            index = index + end;
            end ++;
    
        }
        System.out.println(index);
    }
    
    /**
     * Metodo que muestra la suma de los valores comprendidos entre los numeros dados por parametro
     */
    public void sumValuesInterval(int a, int b)
    {
        int res = a;
        int resultado = 0;
        while(res <= b)
        {
            resultado = a + res;
            a++;
            res ++;
        }
        System.out.println(resultado);
    }
    
    /**
     * MEtodo que devuelve V o F si n es primo o no.
     */

}
