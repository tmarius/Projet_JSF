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
@Table(name = "MISSION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mission.findAll", query = "SELECT m FROM Mission m")
    , @NamedQuery(name = "Mission.findByIdMission", query = "SELECT m FROM Mission m WHERE m.idMission = :idMission")
    , @NamedQuery(name = "Mission.findByNomMission", query = "SELECT m FROM Mission m WHERE m.nomMission = :nomMission")})
public class Mission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MISSION")
    private Integer idMission;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOM_MISSION")
    private String nomMission;
    @Lob
    @Size(max = 65535)
    @Column(name = "DESCRIPTION_MISSION")
    private String descriptionMission;
    @JoinColumn(name = "ID_JEUX", referencedColumnName = "ID_JEUX")
    @ManyToOne(optional = false)
    private Jeux idJeux;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMission")
    private Collection<Explication> explicationCollection;

    public Mission() {
    }

    public Mission(Integer idMission) {
        this.idMission = idMission;
    }

    public Mission(Integer idMission, String nomMission) {
        this.idMission = idMission;
        this.nomMission = nomMission;
    }

    public Integer getIdMission() {
        return idMission;
    }

    public void setIdMission(Integer idMission) {
        this.idMission = idMission;
    }

    public String getNomMission() {
        return nomMission;
    }

    public void setNomMission(String nomMission) {
        this.nomMission = nomMission;
    }

    public String getDescriptionMission() {
        return descriptionMission;
    }

    public void setDescriptionMission(String descriptionMission) {
        this.descriptionMission = descriptionMission;
    }

    public Jeux getIdJeux() {
        return idJeux;
    }

    public void setIdJeux(Jeux idJeux) {
        this.idJeux = idJeux;
    }

    @XmlTransient
    public Collection<Explication> getExplicationCollection() {
        return explicationCollection;
    }

    public void setExplicationCollection(Collection<Explication> explicationCollection) {
        this.explicationCollection = explicationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMission != null ? idMission.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mission)) {
            return false;
        }
        Mission other = (Mission) object;
        if ((this.idMission == null && other.idMission != null) || (this.idMission != null && !this.idMission.equals(other.idMission))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Mission[ idMission=" + idMission + " ]";
    }
    
}
