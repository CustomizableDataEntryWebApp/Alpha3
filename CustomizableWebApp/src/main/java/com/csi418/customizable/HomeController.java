package com.csi418.customizable;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	// Default view so when browser is launched, jsp file "home" is opened as the home page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	
	// url with /admin/privatePage is opened calling the jsp file : privatePage (.jsp)
	@RequestMapping(value = "/admin/privatePage", method = RequestMethod.GET)
	public String privatePage() {
		return "privatePage";
	}
	
	@RequestMapping(value = "/forms", method = RequestMethod.GET)
	public String forms() {
		return "forms";
	}
	
}
