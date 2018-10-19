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
@Table(name = "RETOUR_MISSION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RetourMission.findAll", query = "SELECT r FROM RetourMission r")
    , @NamedQuery(name = "RetourMission.findByIdRetour", query = "SELECT r FROM RetourMission r WHERE r.idRetour = :idRetour")})
public class RetourMission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_RETOUR")
    private Integer idRetour;
    @Lob
    @Column(name = "PHOTO_RETOUR")
    private byte[] photoRetour;
    @Lob
    @Size(max = 65535)
    @Column(name = "MESSAGE_RETOUR")
    private String messageRetour;
    @JoinColumn(name = "ID_MEMBRE", referencedColumnName = "ID_MEMBRE")
    @ManyToOne(optional = false)
    private Membre idMembre;

    public RetourMission() {
    }

    public RetourMission(Integer idRetour) {
        this.idRetour = idRetour;
    }

    public Integer getIdRetour() {
        return idRetour;
    }

    public void setIdRetour(Integer idRetour) {
        this.idRetour = idRetour;
    }

    public byte[] getPhotoRetour() {
        return photoRetour;
    }

    public void setPhotoRetour(byte[] photoRetour) {
        this.photoRetour = photoRetour;
    }

    public String getMessageRetour() {
        return messageRetour;
    }

    public void setMessageRetour(String messageRetour) {
        this.messageRetour = messageRetour;
    }

    public Membre getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Membre idMembre) {
        this.idMembre = idMembre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRetour != null ? idRetour.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetourMission)) {
            return false;
        }
        RetourMission other = (RetourMission) object;
        if ((this.idRetour == null && other.idRetour != null) || (this.idRetour != null && !this.idRetour.equals(other.idRetour))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.RetourMission[ idRetour=" + idRetour + " ]";
    }
    
}
