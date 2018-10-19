/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "EXPLICATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Explication.findAll", query = "SELECT e FROM Explication e")
    , @NamedQuery(name = "Explication.findByIdExplication", query = "SELECT e FROM Explication e WHERE e.idExplication = :idExplication")})
public class Explication implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EXPLICATION")
    private Integer idExplication;
    @Lob
    @Size(max = 65535)
    @Column(name = "DESCRIPTION_EXPLICATION")
    private String descriptionExplication;
    @Lob
    @Column(name = "IMAGE_EXPLICATION")
    private byte[] imageExplication;
    @JoinColumn(name = "ID_MISSION", referencedColumnName = "ID_MISSION")
    @ManyToOne(optional = false)
    private Mission idMission;

    public Explication() {
    }

    public Explication(Integer idExplication) {
        this.idExplication = idExplication;
    }

    public Integer getIdExplication() {
        return idExplication;
    }

    public void setIdExplication(Integer idExplication) {
        this.idExplication = idExplication;
    }

    public String getDescriptionExplication() {
        return descriptionExplication;
    }

    public void setDescriptionExplication(String descriptionExplication) {
        this.descriptionExplication = descriptionExplication;
    }

    public byte[] getImageExplication() {
        return imageExplication;
    }

    public void setImageExplication(byte[] imageExplication) {
        this.imageExplication = imageExplication;
    }

    public Mission getIdMission() {
        return idMission;
    }

    public void setIdMission(Mission idMission) {
        this.idMission = idMission;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExplication != null ? idExplication.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Explication)) {
            return false;
        }
        Explication other = (Explication) object;
        if ((this.idExplication == null && other.idExplication != null) || (this.idExplication != null && !this.idExplication.equals(other.idExplication))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Explication[ idExplication=" + idExplication + " ]";
    }
    
}
