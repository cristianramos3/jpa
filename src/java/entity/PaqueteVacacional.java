/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cristiian
 */
@Entity
@Table(name = "PAQUETE_VACACIONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaqueteVacacional.findAll", query = "SELECT p FROM PaqueteVacacional p"),
    @NamedQuery(name = "PaqueteVacacional.findByIdP", query = "SELECT p FROM PaqueteVacacional p WHERE p.idP = :idP"),
    @NamedQuery(name = "PaqueteVacacional.findByNombre", query = "SELECT p FROM PaqueteVacacional p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PaqueteVacacional.findByApellido", query = "SELECT p FROM PaqueteVacacional p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "PaqueteVacacional.findByDescripcion", query = "SELECT p FROM PaqueteVacacional p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "PaqueteVacacional.findByFechaDeEjecucion", query = "SELECT p FROM PaqueteVacacional p WHERE p.fechaDeEjecucion = :fechaDeEjecucion"),
    @NamedQuery(name = "PaqueteVacacional.findByPrecio", query = "SELECT p FROM PaqueteVacacional p WHERE p.precio = :precio"),
    @NamedQuery(name = "PaqueteVacacional.findByNumeroS", query = "SELECT p FROM PaqueteVacacional p WHERE p.numeroS = :numeroS")})
public class PaqueteVacacional implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_P")
    private BigDecimal idP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 29)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 29)
    @Column(name = "APELLIDO")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 29)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FECHA_DE_EJECUCION")
    private String fechaDeEjecucion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO")
    private BigInteger precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO_S")
    private BigInteger numeroS;

    public PaqueteVacacional() {
    }

    public PaqueteVacacional(BigDecimal idP) {
        this.idP = idP;
    }

    public PaqueteVacacional(BigDecimal idP, String nombre, String apellido, String descripcion, String fechaDeEjecucion, BigInteger precio, BigInteger numeroS) {
        this.idP = idP;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.fechaDeEjecucion = fechaDeEjecucion;
        this.precio = precio;
        this.numeroS = numeroS;
    }

    public BigDecimal getIdP() {
        return idP;
    }

    public void setIdP(BigDecimal idP) {
        this.idP = idP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaDeEjecucion() {
        return fechaDeEjecucion;
    }

    public void setFechaDeEjecucion(String fechaDeEjecucion) {
        this.fechaDeEjecucion = fechaDeEjecucion;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public BigInteger getNumeroS() {
        return numeroS;
    }

    public void setNumeroS(BigInteger numeroS) {
        this.numeroS = numeroS;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idP != null ? idP.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaqueteVacacional)) {
            return false;
        }
        PaqueteVacacional other = (PaqueteVacacional) object;
        if ((this.idP == null && other.idP != null) || (this.idP != null && !this.idP.equals(other.idP))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PaqueteVacacional[ idP=" + idP + " ]";
    }
    
}
