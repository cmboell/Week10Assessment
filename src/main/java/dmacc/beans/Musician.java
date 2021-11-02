/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Oct 18, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author cmboe
 *
 */
@Entity
public class Musician {
	@Id
	@GeneratedValue
	private long id;
	private String artistName;
	private String phone;
	private String genre;
	@Autowired
	private RecordLabel recordLabel;
	
	public Musician() {
		super();
		// TODO Auto-generated constructor stub
		this.genre = "rock";
	}
	
	public Musician(String artistName) {
		super();
		this.artistName = artistName;
	}

	public Musician(String artistName, String phone, String genre) {
		super();
		this.artistName = artistName;
		this.phone = phone;
		this.genre = genre;
	}
	public Musician(long id, String artistName, String phone, String genre) {
		super();
		this.id = id;
		this.artistName = artistName;
		this.phone = phone;
		this.genre = genre;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtestName(String artistName) {
		this.artistName = artistName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public RecordLabel getRecordLabel() {
		return recordLabel;
	}

	public void setRecordLabel(RecordLabel recordLabel) {
		this.recordLabel = recordLabel;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", artistName=" + artistName + ", phone=" + phone + ", genre=" + genre
				+ ", address=" + recordLabel + "]";
	}

	
}