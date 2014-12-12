
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
    private float CantidadProteinas; // Aqui se almacena la cantidad de proteinas
    private float CantidadCarbohidratos; //Aqui se almacena la cantidad de carbohidratos
    private float CantidadGrasas; // Aqui se almacena la cantidad de grasas
    private float CantidadCalorias; // Aqui se almacena la cantidad de calorias
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
        CantidadCalorias =(CantidadProteinas*4) + (CantidadGrasas*9);
    }

    /**
     * Metodo que hace que el usuario coma
     */
    public void comer(Alimento nombre, int cantidad)
    {
       CantidadIngerida = cantidad;
       this.AlimentoIngerido = AlimentoIngerido + nombre.getNombreAlimento();
       this.CantidadIngerida = CantidadIngerida + cantidad;
       this.CantidadProteinas = cantidad * nombre.getCantidadProteinas();
       this.CantidadCarbohidratos = cantidad * nombre.getCantidadCarbohidratos();
       this.CantidadGrasas = cantidad * nombre.getCantidadGrasas();
 
    }
    
    /**
     * Metodo que muestra los datos del usuario, y del alimento que ha consumido en proporcion
     */
    public void muestraDatosUsuario()
   
    {
        System.out.println ("Nombre: " + nombre);
        System.out.println ("Gramos proteinas ingeridos: " + CantidadProteinas + "" + "(" + ((CantidadIngerida * CantidadProteinas)/100 )+"%" + ")" );
        System.out.println ("Gramos carbohidratos ingeridos: " + CantidadCarbohidratos + "" + "(" + ((CantidadIngerida * CantidadCarbohidratos)/100 )+"%" +")" );
        System.out.println ("Gramos de grasas ingeridas: " + CantidadGrasas + "" + "(" + ((CantidadIngerida * CantidadGrasas)/100 )+"%" + ")");
        System.out.println ("Calorias ingeridas: " + CantidadCalorias);
    }
    
    /**
     * Metodo que compara a un usuario con otro
     */
    
    public void ComparaUsuarios(Usuario nombre)
    {
        float CaloriasOtroUsuario = nombre.CantidadCalorias;
        String NombreOtroUsuario = nombre.getNombre();
        if (CantidadCalorias > nombre.CantidadCalorias)
            {
                System.out.println (this.nombre + " ha consumido mas calorias que " + NombreOtroUsuario);
            }
        else 
            {
                System.out.println (NombreOtroUsuario + " ha consumido menos calorias que " + this.nombre);
            }
    }
   
    /**
     * Metodo que muestra el nombre del usuario
     */
    public String getNombre()
    {
        return nombre;
    }
}
