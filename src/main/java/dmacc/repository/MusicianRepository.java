/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Oct 18, 2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Musician;

/**
 * @author cmboe
 *
 */
public interface MusicianRepository extends JpaRepository<Musician, Long>{

}