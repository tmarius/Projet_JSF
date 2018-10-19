/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "EQUIPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipe.findAll", query = "SELECT e FROM Equipe e")
    , @NamedQuery(name = "Equipe.findByIdEquipe", query = "SELECT e FROM Equipe e WHERE e.idEquipe = :idEquipe")
    , @NamedQuery(name = "Equipe.findByNomEquipe", query = "SELECT e FROM Equipe e WHERE e.nomEquipe = :nomEquipe")
    , @NamedQuery(name = "Equipe.findByPointEquipe", query = "SELECT e FROM Equipe e WHERE e.pointEquipe = :pointEquipe")
    , @NamedQuery(name = "Equipe.findByNomObjetEquipe", query = "SELECT e FROM Equipe e WHERE e.nomObjetEquipe = :nomObjetEquipe")})
public class Equipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EQUIPE")
    private Integer idEquipe;
    @Lob
    @Column(name = "IMAGE_EQUIPE")
    private byte[] imageEquipe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOM_EQUIPE")
    private String nomEquipe;
    @Lob
    @Size(max = 65535)
    @Column(name = "DESCRIPTION_EQUIPE")
    private String descriptionEquipe;
    @Column(name = "POINT_EQUIPE")
    private Integer pointEquipe;
    @Size(max = 50)
    @Column(name = "NOM_OBJET_EQUIPE")
    private String nomObjetEquipe;
    @Lob
    @Column(name = "IMAGE_OBJET_EQUIPE")
    private byte[] imageObjetEquipe;
    @OneToMany(mappedBy = "idEquipe")
    private Collection<Membre> membreCollection;
    @JoinColumn(name = "ID_JEUX", referencedColumnName = "ID_JEUX")
    @ManyToOne(optional = false)
    private Jeux idJeux;

    public Equipe() {
    }

    public Equipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Equipe(Integer idEquipe, String nomEquipe) {
        this.idEquipe = idEquipe;
        this.nomEquipe = nomEquipe;
    }

    public Integer getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public byte[] getImageEquipe() {
        return imageEquipe;
    }

    public void setImageEquipe(byte[] imageEquipe) {
        this.imageEquipe = imageEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public String getDescriptionEquipe() {
        return descriptionEquipe;
    }

    public void setDescriptionEquipe(String descriptionEquipe) {
        this.descriptionEquipe = descriptionEquipe;
    }

    public Integer getPointEquipe() {
        return pointEquipe;
    }

    public void setPointEquipe(Integer pointEquipe) {
        this.pointEquipe = pointEquipe;
    }

    public String getNomObjetEquipe() {
        return nomObjetEquipe;
    }

    public void setNomObjetEquipe(String nomObjetEquipe) {
        this.nomObjetEquipe = nomObjetEquipe;
    }

    public byte[] getImageObjetEquipe() {
        return imageObjetEquipe;
    }

    public void setImageObjetEquipe(byte[] imageObjetEquipe) {
        this.imageObjetEquipe = imageObjetEquipe;
    }

    @XmlTransient
    public Collection<Membre> getMembreCollection() {
        return membreCollection;
    }

    public void setMembreCollection(Collection<Membre> membreCollection) {
        this.membreCollection = membreCollection;
    }

    public Jeux getIdJeux() {
        return idJeux;
    }

    public void setIdJeux(Jeux idJeux) {
        this.idJeux = idJeux;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipe != null ? idEquipe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if ((this.idEquipe == null && other.idEquipe != null) || (this.idEquipe != null && !this.idEquipe.equals(other.idEquipe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Equipe[ idEquipe=" + idEquipe + " ]";
    }
    
}
