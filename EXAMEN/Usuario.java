
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // Definimos los atributos de la clase usuario
    private String nombre; // Aqui se almacena el nombre del usuario
    private String AlimentoIngerido; // Aqui se almacena el alimento que ingiere
    private float CantidadIngerida; // Aqui se almacena la cantidad que ingiere
    private float CantidadProteinas;
    private float CantidadCarbohidratos;
    private float CantidadGrasas;
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombre)
    {
        this.nombre = nombre;
        AlimentoIngerido = nombre;
        CantidadIngerida = 0;
        CantidadProteinas = 0;
        CantidadCarbohidratos = 0;
        CantidadGrasas = 0;
    }

    /**
     * Metodo que hace que el usuario coma
     */
    public void comer(Alimento nombre, int cantidad)
    {
       this.AlimentoIngerido = AlimentoIngerido + nombre.getNombreAlimento();
       this.CantidadIngerida = CantidadIngerida + cantidad;
       this.CantidadProteinas = cantidad * nombre.getCantidadProteinas();
       this.CantidadCarbohidratos = cantidad * nombre.getCantidadCarbohidratos();
       this.CantidadGrasas = cantidad * nombre.getCantidadGrasas();
 
    }
    
    public void muestraDatosUsuario()
   
    {
        System.out.println ("Nombre: " + nombre);
        System.out.println ("Gramos proteinas ingeridos: " + CantidadProteinas );
        System.out.println ("Gramos carbohidratos ingeridos: " + CantidadCarbohidratos );
        System.out.println ("Gramos de grasas ingeridas: " + CantidadGrasas );
        System.out.println ("Calorias ingeridas: " + ((CantidadProteinas*4) + (CantidadGrasas*9)) );
    }
}
