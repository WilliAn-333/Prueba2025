package gestionproductos;


import ec.edu.espoch.finciclocorreccion.modelo.GestorProducto;
import ec.edu.espoch.finciclocorreccion.modelo.Producto;
import ec.edu.espoch.finciclocorreccion.vista.Listar;
import ec.edu.espoch.finciclocorreccion.vista.Principal;


public class Controlador {
    
    private Principal principal;
    private GestorProducto gestorProducto;
    private Listar listar;
   

    public Controlador(Principal principal, Listar listar) {
        this.principal = principal;
        this.listar = listar;
        this.gestorProducto = new GestorProducto();
    }

    public void agregarTarea() {

        try {
            if (this.principal != null) {
                Producto objProducto = new Producto();
                objProducto.setTitulo(this.principal.getTitulo());
                objProducto.setDescripcion(this.principal.getDescripcion());
                objProducto.setEstado(this.principal.getEstado());
                String msm = gestorProducto.agregarTarea(objProducto);
                principal.error(msm);

            } else {
                principal.error("Completa los datos!");
            }
        } catch (Exception e) {
            principal.error("Error controlado:" + e);
        }
    }

    public void listarTarea() {

        try {
            String msm = "";
            Producto[] tareas = new Producto[5];
            tareas = gestorProducto.listarTareas();
            if (tareas != null) {
                String lista = "";
                for (int i = 0; i < tareas.length; i++) {
                    if (tareas[i] != null) {
                        lista = lista + "id:" + tareas[i].getId() + "\n"
                                + "Titulo:" + tareas[i].getTitulo() + "\n"
                                + "Descripcion:" + tareas[i].getDescripcion() + "\n"
                                + "Estado:" + tareas[i].getEstado() + "\n";
                    }
                }
                msm = lista;
            } else {
                msm = "No hay datos que mostrar";
            }
            listar.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listarTarea: " + e);
        }
    }
}
    
