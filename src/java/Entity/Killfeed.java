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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "KILLFEED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Killfeed.findAll", query = "SELECT k FROM Killfeed k")
    , @NamedQuery(name = "Killfeed.findByIdKill", query = "SELECT k FROM Killfeed k WHERE k.idKill = :idKill")
    , @NamedQuery(name = "Killfeed.findByIdJeux", query = "SELECT k FROM Killfeed k WHERE k.idJeux = :idJeux")})
public class Killfeed implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_KILL")
    private Integer idKill;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_JEUX")
    private int idJeux;
    @JoinColumn(name = "ID_DEAD", referencedColumnName = "ID_MEMBRE")
    @ManyToOne(optional = false)
    private Membre idDead;
    @JoinColumn(name = "ID_KILLER", referencedColumnName = "ID_MEMBRE")
    @ManyToOne(optional = false)
    private Membre idKiller;

    public Killfeed() {
    }

    public Killfeed(Integer idKill) {
        this.idKill = idKill;
    }

    public Killfeed(Integer idKill, int idJeux) {
        this.idKill = idKill;
        this.idJeux = idJeux;
    }

    public Integer getIdKill() {
        return idKill;
    }

    public void setIdKill(Integer idKill) {
        this.idKill = idKill;
    }

    public int getIdJeux() {
        return idJeux;
    }

    public void setIdJeux(int idJeux) {
        this.idJeux = idJeux;
    }

    public Membre getIdDead() {
        return idDead;
    }

    public void setIdDead(Membre idDead) {
        this.idDead = idDead;
    }

    public Membre getIdKiller() {
        return idKiller;
    }

    public void setIdKiller(Membre idKiller) {
        this.idKiller = idKiller;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKill != null ? idKill.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Killfeed)) {
            return false;
        }
        Killfeed other = (Killfeed) object;
        if ((this.idKill == null && other.idKill != null) || (this.idKill != null && !this.idKill.equals(other.idKill))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Killfeed[ idKill=" + idKill + " ]";
    }
    
}
