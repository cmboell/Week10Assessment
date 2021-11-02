/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Oct 18, 2021
 */
package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author cmboe
 *
 */
@Embeddable
public class RecordLabel {
	private String labelName;
	private String location;
	private String owner;
	public RecordLabel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecordLabel(String labelName, String location, String owner) {
		super();
		this.labelName = labelName;
		this.location = location;
		this.owner = owner;
	}
	public String getLabelName() {
		return labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Address [labelName=" + labelName + ", location=" + location + ", owner=" + owner + "]";
	}

}