
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO Anotaciones sirven para comunicar con el html
 */
@ManagedBean(name = "login")
@RequestScoped
public class Login {

    private String usuario;
    private String contraseña;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void ingresar() {
        FacesContext context = FacesContext.getCurrentInstance();
        if ("admin".equals(usuario) && "1234".equals(contraseña)) {
            System.out.println("ingreso");

            context.addMessage(null, new FacesMessage("Successful", "Your message: " + "Datos Ingresados correctamente"));
        } else {
            System.out.println("no ingreso");
            context.addMessage(null, new FacesMessage("Invalid", "Your message: " + "Datos Ingresados erronesos"));
        }
    }

}
