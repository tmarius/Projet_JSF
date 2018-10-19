/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "JEUX")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jeux.findAll", query = "SELECT j FROM Jeux j")
    , @NamedQuery(name = "Jeux.findByIdJeux", query = "SELECT j FROM Jeux j WHERE j.idJeux = :idJeux")})
public class Jeux implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_JEUX")
    private Integer idJeux;
    @Lob
    @Column(name = "_JEUX")
    private byte[] jeux;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJeux")
    private Collection<Membre> membreCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJeux")
    private Collection<Mission> missionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJeux")
    private Collection<Annonce> annonceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJeux")
    private Collection<Equipe> equipeCollection;

    public Jeux() {
    }

    public Jeux(Integer idJeux) {
        this.idJeux = idJeux;
    }

    public Integer getIdJeux() {
        return idJeux;
    }

    public void setIdJeux(Integer idJeux) {
        this.idJeux = idJeux;
    }

    public byte[] getJeux() {
        return jeux;
    }

    public void setJeux(byte[] jeux) {
        this.jeux = jeux;
    }

    @XmlTransient
    public Collection<Membre> getMembreCollection() {
        return membreCollection;
    }

    public void setMembreCollection(Collection<Membre> membreCollection) {
        this.membreCollection = membreCollection;
    }

    @XmlTransient
    public Collection<Mission> getMissionCollection() {
        return missionCollection;
    }

    public void setMissionCollection(Collection<Mission> missionCollection) {
        this.missionCollection = missionCollection;
    }

    @XmlTransient
    public Collection<Annonce> getAnnonceCollection() {
        return annonceCollection;
    }

    public void setAnnonceCollection(Collection<Annonce> annonceCollection) {
        this.annonceCollection = annonceCollection;
    }

    @XmlTransient
    public Collection<Equipe> getEquipeCollection() {
        return equipeCollection;
    }

    public void setEquipeCollection(Collection<Equipe> equipeCollection) {
        this.equipeCollection = equipeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJeux != null ? idJeux.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jeux)) {
            return false;
        }
        Jeux other = (Jeux) object;
        if ((this.idJeux == null && other.idJeux != null) || (this.idJeux != null && !this.idJeux.equals(other.idJeux))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Jeux[ idJeux=" + idJeux + " ]";
    }
    
}
