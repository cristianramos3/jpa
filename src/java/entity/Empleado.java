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
@Table(name = "EMPLEADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByIdE", query = "SELECT e FROM Empleado e WHERE e.idE = :idE"),
    @NamedQuery(name = "Empleado.findByNombre", query = "SELECT e FROM Empleado e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleado.findByApellido", query = "SELECT e FROM Empleado e WHERE e.apellido = :apellido"),
    @NamedQuery(name = "Empleado.findByEdad", query = "SELECT e FROM Empleado e WHERE e.edad = :edad"),
    @NamedQuery(name = "Empleado.findBySexo", query = "SELECT e FROM Empleado e WHERE e.sexo = :sexo"),
    @NamedQuery(name = "Empleado.findByPuesto", query = "SELECT e FROM Empleado e WHERE e.puesto = :puesto"),
    @NamedQuery(name = "Empleado.findByNombreDeAgencia", query = "SELECT e FROM Empleado e WHERE e.nombreDeAgencia = :nombreDeAgencia"),
    @NamedQuery(name = "Empleado.findByIdA", query = "SELECT e FROM Empleado e WHERE e.idA = :idA")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_E")
    private BigDecimal idE;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 29)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "APELLIDO")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EDAD")
    private BigInteger edad;
    @Size(max = 1)
    @Column(name = "SEXO")
    private String sexo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PUESTO")
    private String puesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMBRE_DE_AGENCIA")
    private String nombreDeAgencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_A")
    private BigInteger idA;

    public Empleado() {
    }

    public Empleado(BigDecimal idE) {
        this.idE = idE;
    }

    public Empleado(BigDecimal idE, String nombre, String apellido, BigInteger edad, String puesto, String nombreDeAgencia, BigInteger idA) {
        this.idE = idE;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.puesto = puesto;
        this.nombreDeAgencia = nombreDeAgencia;
        this.idA = idA;
    }

    public BigDecimal getIdE() {
        return idE;
    }

    public void setIdE(BigDecimal idE) {
        this.idE = idE;
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

    public BigInteger getEdad() {
        return edad;
    }

    public void setEdad(BigInteger edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombreDeAgencia() {
        return nombreDeAgencia;
    }

    public void setNombreDeAgencia(String nombreDeAgencia) {
        this.nombreDeAgencia = nombreDeAgencia;
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
        hash += (idE != null ? idE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idE == null && other.idE != null) || (this.idE != null && !this.idE.equals(other.idE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Empleado[ idE=" + idE + " ]";
    }
    
}
