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
@Table(name = "AGENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencia.findAll", query = "SELECT a FROM Agencia a"),
    @NamedQuery(name = "Agencia.findByIdA", query = "SELECT a FROM Agencia a WHERE a.idA = :idA"),
    @NamedQuery(name = "Agencia.findByNombre", query = "SELECT a FROM Agencia a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Agencia.findByDireccion", query = "SELECT a FROM Agencia a WHERE a.direccion = :direccion"),
    @NamedQuery(name = "Agencia.findByDepartamento", query = "SELECT a FROM Agencia a WHERE a.departamento = :departamento"),
    @NamedQuery(name = "Agencia.findByTelefono", query = "SELECT a FROM Agencia a WHERE a.telefono = :telefono")})
public class Agencia implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_A")
    private BigDecimal idA;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 29)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 29)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO")
    private BigInteger telefono;

    public Agencia() {
    }

    public Agencia(BigDecimal idA) {
        this.idA = idA;
    }

    public Agencia(BigDecimal idA, String nombre, String direccion, String departamento, BigInteger telefono) {
        this.idA = idA;
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamento = departamento;
        this.telefono = telefono;
    }

    public BigDecimal getIdA() {
        return idA;
    }

    public void setIdA(BigDecimal idA) {
        this.idA = idA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idA != null ? idA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencia)) {
            return false;
        }
        Agencia other = (Agencia) object;
        if ((this.idA == null && other.idA != null) || (this.idA != null && !this.idA.equals(other.idA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Agencia[ idA=" + idA + " ]";
    }
    
}
