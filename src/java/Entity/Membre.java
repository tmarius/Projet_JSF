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
@Table(name = "MEMBRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Membre.findAll", query = "SELECT m FROM Membre m")
    , @NamedQuery(name = "Membre.findByIdMembre", query = "SELECT m FROM Membre m WHERE m.idMembre = :idMembre")
    , @NamedQuery(name = "Membre.findByNomMembre", query = "SELECT m FROM Membre m WHERE m.nomMembre = :nomMembre")
    , @NamedQuery(name = "Membre.findByPrenomMembre", query = "SELECT m FROM Membre m WHERE m.prenomMembre = :prenomMembre")
    , @NamedQuery(name = "Membre.findByCodeMembre", query = "SELECT m FROM Membre m WHERE m.codeMembre = :codeMembre")
    , @NamedQuery(name = "Membre.findByVivant", query = "SELECT m FROM Membre m WHERE m.vivant = :vivant")
    , @NamedQuery(name = "Membre.findByCible", query = "SELECT m FROM Membre m WHERE m.cible = :cible")})
public class Membre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MEMBRE")
    private Integer idMembre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOM_MEMBRE")
    private String nomMembre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PRENOM_MEMBRE")
    private String prenomMembre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "CODE_MEMBRE")
    private String codeMembre;
    @Column(name = "VIVANT")
    private Boolean vivant;
    @Column(name = "CIBLE")
    private Boolean cible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDead")
    private Collection<Killfeed> killfeedCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKiller")
    private Collection<Killfeed> killfeedCollection1;
    @JoinColumn(name = "ID_EQUIPE", referencedColumnName = "ID_EQUIPE")
    @ManyToOne
    private Equipe idEquipe;
    @JoinColumn(name = "ID_JEUX", referencedColumnName = "ID_JEUX")
    @ManyToOne(optional = false)
    private Jeux idJeux;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembre")
    private Collection<RetourMission> retourMissionCollection;

    public Membre() {
    }

    public Membre(Integer idMembre) {
        this.idMembre = idMembre;
    }

    public Membre(Integer idMembre, String nomMembre, String prenomMembre, String codeMembre) {
        this.idMembre = idMembre;
        this.nomMembre = nomMembre;
        this.prenomMembre = prenomMembre;
        this.codeMembre = codeMembre;
    }

    public Integer getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Integer idMembre) {
        this.idMembre = idMembre;
    }

    public String getNomMembre() {
        return nomMembre;
    }

    public void setNomMembre(String nomMembre) {
        this.nomMembre = nomMembre;
    }

    public String getPrenomMembre() {
        return prenomMembre;
    }

    public void setPrenomMembre(String prenomMembre) {
        this.prenomMembre = prenomMembre;
    }

    public String getCodeMembre() {
        return codeMembre;
    }

    public void setCodeMembre(String codeMembre) {
        this.codeMembre = codeMembre;
    }

    public Boolean getVivant() {
        return vivant;
    }

    public void setVivant(Boolean vivant) {
        this.vivant = vivant;
    }

    public Boolean getCible() {
        return cible;
    }

    public void setCible(Boolean cible) {
        this.cible = cible;
    }

    @XmlTransient
    public Collection<Killfeed> getKillfeedCollection() {
        return killfeedCollection;
    }

    public void setKillfeedCollection(Collection<Killfeed> killfeedCollection) {
        this.killfeedCollection = killfeedCollection;
    }

    @XmlTransient
    public Collection<Killfeed> getKillfeedCollection1() {
        return killfeedCollection1;
    }

    public void setKillfeedCollection1(Collection<Killfeed> killfeedCollection1) {
        this.killfeedCollection1 = killfeedCollection1;
    }

    public Equipe getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Equipe idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Jeux getIdJeux() {
        return idJeux;
    }

    public void setIdJeux(Jeux idJeux) {
        this.idJeux = idJeux;
    }

    @XmlTransient
    public Collection<RetourMission> getRetourMissionCollection() {
        return retourMissionCollection;
    }

    public void setRetourMissionCollection(Collection<RetourMission> retourMissionCollection) {
        this.retourMissionCollection = retourMissionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMembre != null ? idMembre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membre)) {
            return false;
        }
        Membre other = (Membre) object;
        if ((this.idMembre == null && other.idMembre != null) || (this.idMembre != null && !this.idMembre.equals(other.idMembre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Membre[ idMembre=" + idMembre + " ]";
    }
    
}
