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
@Table(name = "SOLICITUD_COMPRA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SolicitudCompra.findAll", query = "SELECT s FROM SolicitudCompra s"),
    @NamedQuery(name = "SolicitudCompra.findByNumeroS", query = "SELECT s FROM SolicitudCompra s WHERE s.numeroS = :numeroS"),
    @NamedQuery(name = "SolicitudCompra.findByFecha", query = "SELECT s FROM SolicitudCompra s WHERE s.fecha = :fecha"),
    @NamedQuery(name = "SolicitudCompra.findByPaquete", query = "SELECT s FROM SolicitudCompra s WHERE s.paquete = :paquete"),
    @NamedQuery(name = "SolicitudCompra.findByVendedor", query = "SELECT s FROM SolicitudCompra s WHERE s.vendedor = :vendedor"),
    @NamedQuery(name = "SolicitudCompra.findByPrecio", query = "SELECT s FROM SolicitudCompra s WHERE s.precio = :precio")})
public class SolicitudCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO_S")
    private BigDecimal numeroS;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FECHA")
    private String fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 29)
    @Column(name = "PAQUETE")
    private String paquete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 29)
    @Column(name = "VENDEDOR")
    private String vendedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO")
    private BigInteger precio;

    public SolicitudCompra() {
    }

    public SolicitudCompra(BigDecimal numeroS) {
        this.numeroS = numeroS;
    }

    public SolicitudCompra(BigDecimal numeroS, String fecha, String paquete, String vendedor, BigInteger precio) {
        this.numeroS = numeroS;
        this.fecha = fecha;
        this.paquete = paquete;
        this.vendedor = vendedor;
        this.precio = precio;
    }

    public BigDecimal getNumeroS() {
        return numeroS;
    }

    public void setNumeroS(BigDecimal numeroS) {
        this.numeroS = numeroS;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroS != null ? numeroS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudCompra)) {
            return false;
        }
        SolicitudCompra other = (SolicitudCompra) object;
        if ((this.numeroS == null && other.numeroS != null) || (this.numeroS != null && !this.numeroS.equals(other.numeroS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.SolicitudCompra[ numeroS=" + numeroS + " ]";
    }
    
}
