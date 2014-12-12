import java.util.ArrayList;
/**
 *Clase Alimento
 * 
 * @author (Daniel Alvarez Vaquero) 
 * @version (12/12/2014)
 */
public class Alimento
{
    //Se crean los atributos de la clase Alimento
    private String NombreAlimento;
    private float GramosProteinas;
    private float Carbohidratos;
    private float Grasas;
    private ArrayList<String> ListaAlimentos;
    
    /**
     * Constructor para los objetos de la clase Alimento
     */
    public Alimento(String Nombre, float Proteinas, float Hidratos, float GrasasAli)
    {
        // Inicializamos los atributos de la clase Alimento
        NombreAlimento = Nombre;
        GramosProteinas = Proteinas;
        Carbohidratos = Hidratos;
        Grasas = GrasasAli;
        ListaAlimentos = new ArrayList<String>();

    }
    
    /**
     * Metodo que añade un alimento a la lista
     */
    public void añadirAlimento(String nombre)
    {
        ListaAlimentos.add(nombre);
    }
    
   
    /**
     * Metodo que muestra la información nutricional 
     */
    public void muestraDatos()

    {
        System.out.println ("Nombre: " + NombreAlimento);
        System.out.println ("Proteinas por cada 100 gramos: " + GramosProteinas);
        System.out.println ("Carbohidratos por cada 100 gramos: " + Carbohidratos);
        System.out.println ("Grasas por cada 100 gramos: " + Grasas);
        System.out.println ("Calorias: " + CalcuCalorias());
        if (GramosProteinas > Carbohidratos && GramosProteinas > Grasas)
        {
            System.out.println ("Componente/s mayoritario/s: Proteinas");
        }
        else if (Carbohidratos > GramosProteinas && Carbohidratos > Grasas)
        {
            System.out.println ("Componente/s mayoritario/s: Carbohidratos");
        }
        else if (Grasas > GramosProteinas && Grasas > Carbohidratos)
        {
            System.out.println ("Componente/s mayoritario/s: Grasas");
        }

    }

    /**
     * Metodo que calcula la cantidad de calorias
     */
    private float CalcuCalorias()
    {
        float CaloriasPorProteina = GramosProteinas*4;
        float CaloriasPorGrasa = Grasas*9;
        float CaloriasTotales = CaloriasPorProteina + CaloriasPorGrasa;
        return CaloriasTotales;
    }

    /**
     * Metodo que devuelve el nombre del alimento
     */

    public String getNombreAlimento()
    {
        return NombreAlimento;
    }

    /**
     * Metodo que devuelve la cantidad de proteinas del alimento
     */
    public float getCantidadProteinas()
    {
        return GramosProteinas;
    }

    /**
     * Metodo que devuelve la cantidad de carbohidratos
     */
    public float getCantidadCarbohidratos()
    {
        return Carbohidratos;
    }

    /**
     * Metodo que devuelve la cantidad de grasas
     */
    public float getCantidadGrasas()
    {
        return Grasas;
    }

}
