/*
 *   __    __ _ _     _   ___           _   _     _             __  __
 *  / / /\ \ (_) | __(_) / _ \__ _ _ __| |_(_) __| | ___   /\/\ \ \/ /
 *  \ \/  \/ / | |/ /| |/ /_)/ _` | '__| __| |/ _` |/ _ \ /    \ \  / 
 *   \  /\  /| |   < | / ___/ (_| | |  | |_| | (_| | (_) / /\/\ \/  \ 
 *    \/  \/ |_|_|\_\|_\/    \__,_|_|   \__|_|\__,_|\___/\/    \/_/\_\
 *                                              
 *                                              
 *  
 * Wikipartido de Mexico
 * VER ARCHIVO DE LiCENCIA
 * 
 * 
 */
package timon.entities.votacionydebate;


import java.io.Serializable;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.*;

/**
 *
 * @author alfonso
 */
@Entity
public class ImagenVotacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    private Votacion votacion;
    
    @Lob @Basic(fetch=LAZY)
    private byte[] file;    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImagenVotacion)) {
            return false;
        }
        ImagenVotacion other = (ImagenVotacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.votacionydebate.ImagenVotacion[ id=" + id + " ]";
    }

    /**
     * @return the votacion
     */
    public Votacion getVotacion() {
        return votacion;
    }

    /**
     * @param votacion the votacion to set
     */
    public void setVotacion(Votacion votacion) {
        this.votacion = votacion;
    }

    /**
     * @return the file
     */
    public byte[] getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(byte[] file) {
        this.file = file;
    }
    
}
