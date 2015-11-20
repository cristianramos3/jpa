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
@Table(name = "ADMINISTRADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.findByNit", query = "SELECT a FROM Administrador a WHERE a.nit = :nit"),
    @NamedQuery(name = "Administrador.findByNombre", query = "SELECT a FROM Administrador a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Administrador.findByEdad", query = "SELECT a FROM Administrador a WHERE a.edad = :edad"),
    @NamedQuery(name = "Administrador.findBySalarioDevengado", query = "SELECT a FROM Administrador a WHERE a.salarioDevengado = :salarioDevengado"),
    @NamedQuery(name = "Administrador.findByIdA", query = "SELECT a FROM Administrador a WHERE a.idA = :idA")})
public class Administrador implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NIT")
    private BigDecimal nit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 29)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EDAD")
    private BigInteger edad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SALARIO_DEVENGADO")
    private BigInteger salarioDevengado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_A")
    private BigInteger idA;

    public Administrador() {
    }

    public Administrador(BigDecimal nit) {
        this.nit = nit;
    }

    public Administrador(BigDecimal nit, String nombre, BigInteger edad, BigInteger salarioDevengado, BigInteger idA) {
        this.nit = nit;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioDevengado = salarioDevengado;
        this.idA = idA;
    }

    public BigDecimal getNit() {
        return nit;
    }

    public void setNit(BigDecimal nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigInteger getEdad() {
        return edad;
    }

    public void setEdad(BigInteger edad) {
        this.edad = edad;
    }

    public BigInteger getSalarioDevengado() {
        return salarioDevengado;
    }

    public void setSalarioDevengado(BigInteger salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }

    public BigInteger getIdA() {
        return idA;
    }

    public void setIdA(BigInteger idA) {
        this.idA = idA;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nit != null ? nit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.nit == null && other.nit != null) || (this.nit != null && !this.nit.equals(other.nit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Administrador[ nit=" + nit + " ]";
    }
    
}
