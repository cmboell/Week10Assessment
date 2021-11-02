/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Oct 25, 2021
 */

package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Musician;
import dmacc.repository.MusicianRepository;

/**
 * @author cmboe
 *
 */
@Controller
public class WebController {
	@Autowired
	MusicianRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllMusicians(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewMusician(model);
		}
		
		model.addAttribute("musicians", repo.findAll());
		return "results";
	}

	@GetMapping("/inputMusician")
	public String addNewMusician(Model model) {
		Musician m = new Musician();
		model.addAttribute("newMusician", m);
		return "input";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateMusician(@PathVariable("id") long id, Model model) {
	Musician m = repo.findById(id).orElse(null);
	model.addAttribute("newMusician", m);
	return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseMusician(Musician m, Model model) {
	repo.save(m);
	return viewAllMusicians(model);
	}
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
	Musician m = repo.findById(id).orElse(null);
	repo.delete(m);
	return viewAllMusicians(model);
	}
}
