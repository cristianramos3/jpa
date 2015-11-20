
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;
import entity.*;
import javax.ejb.EJB;
import modelo.AdministradorFacade;
import modelo.AgenciaFacade;
import modelo.EmpleadoFacade;
import modelo.PaqueteVacacionalFacade;
import modelo.SolicitudCompraFacade;



@Named (value = "datosController")
@ManagedBean
@SessionScoped
public class DatosController implements Serializable {
    @EJB
    private SolicitudCompraFacade solicitudCompraFacade;
    @EJB
    private PaqueteVacacionalFacade paqueteVacacionalFacade;
    @EJB
    private EmpleadoFacade empleadoFacade;
    @EJB
    private AgenciaFacade agenciaFacade;
    @EJB
    private AdministradorFacade administradorFacade;

    private Administrador ad = new Administrador();
    private Empleado e = new Empleado();
    private Agencia ag = new Agencia();
    private SolicitudCompra s = new SolicitudCompra();
    private PaqueteVacacional p = new PaqueteVacacional();

    public Administrador getAd() {
        return ad;
    }

    public void setAd(Administrador ad) {
        this.ad = ad;
    }

    public Empleado getE() {
        return e;
    }

    public void setE(Empleado e) {
        this.e = e;
    }

    public Agencia getAg() {
        return ag;
    }

    public void setAg(Agencia ag) {
        this.ag = ag;
    }

    public SolicitudCompra getS() {
        return s;
    }

    public void setS(SolicitudCompra s) {
        this.s = s;
    }

    public PaqueteVacacional getP() {
        return p;
    }

    public void setP(PaqueteVacacional p) {
        this.p = p;
    }
    
    
    
    
    public DatosController() {
    }
    
    public List<Administrador> findAllad(){
    return this.administradorFacade.findAll();
    }
    public List<Agencia> findAllag(){
    return this.agenciaFacade.findAll();
    }
    public List<Empleado> findAlle(){
    return this.empleadoFacade.findAll();
    }
    public List<PaqueteVacacional> findAllp(){
    return this.paqueteVacacionalFacade.findAll();
    }
    public List<SolicitudCompra> findAlls(){
    return this.solicitudCompraFacade.findAll();
    }
    
    
    public String addad(){
    this.administradorFacade.create(this.ad);
    this.ad = new Administrador();
    return "index";
    }
    public String adde(){
    this.empleadoFacade.create(this.e);
    this.e = new Empleado();
    return "index";
    }
    public String addag(){
    this.agenciaFacade.create(this.ag);
    this.ag = new Agencia();
    return "index";
    }
    public String addp(){
    this.paqueteVacacionalFacade.create(this.p);
    this.p = new PaqueteVacacional();
    return "index";
    }
    public String adds(){
    this.solicitudCompraFacade.create(this.s);
    this.s = new SolicitudCompra();
    return "index";
    }
    
    public void delete(Administrador ad){
    this.administradorFacade.remove(ad);
    }
    public String edtad(Administrador ad){
    this.ad=ad;
    return "edtad";
    }
    public void deletee(Empleado e){
    this.empleadoFacade.remove(e);
    }
    public String edte(Empleado e){
    this.e=e;
    return "edte";
    }
    public void deleteag(Agencia ag){
    this.agenciaFacade.remove(ag);
    }
    public String edtag(Agencia ag){
    this.ag=ag;
    return "edtag";
    }
    public void deletep(PaqueteVacacional p){
    this.paqueteVacacionalFacade.remove(p);
    }
    public String edtp(PaqueteVacacional p){
    this.p=p;
    return "edtp";
    }
    public void deletes(SolicitudCompra s){
    this.solicitudCompraFacade.remove(s);
    }
    public String edts(SolicitudCompra s){
    this.s=s;
    return "edts";
    }
    
    
    public String edtad(){
    this.administradorFacade.edit(this.ad);
    return "index";
    }
    public String edte(){
    this.empleadoFacade.edit(this.e);
    return "index";
    }
    public String edtag(){
    this.agenciaFacade.edit(this.ag);
    return "index";
    }
    public String edtp(){
    this.paqueteVacacionalFacade.edit(this.p);
    return "index";
    }
    public String edts(){
    this.solicitudCompraFacade.edit(this.s);
    return "index";
    }
    
}
