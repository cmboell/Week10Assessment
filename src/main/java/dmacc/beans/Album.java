/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Nov 2, 2021
 */

package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author cmboe
 *
 */
@Embeddable
public class Album {

	private String albumName;
	private String releaseDate;
	
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Album(String albumName, String releaseDate) {
		super();
		this.albumName = albumName;
		this.releaseDate = releaseDate;
		
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	@Override
	public String toString() {
		return "Address [albumName=" + albumName + ", releaseDate=" + releaseDate  + "]";
	}

}