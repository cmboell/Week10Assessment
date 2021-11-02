/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Oct 18, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.RecordLabel;
import dmacc.beans.Musician;

/**
 * @author cmboe
 *
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Musician musician() {
		Musician bean = new Musician("Eric Carle");
	/*bean.setArtistName("Kid Rock");
	bean.setPhone("555-555-5555");
	bean.setGenre("Country");*/
		return bean;
	}

	@Bean
	public RecordLabel RecordLabel() {
		RecordLabel bean = new RecordLabel("Warner Bros. Studio", "Burbank,CA", "WarnerMedia");
		return bean;
	}
}