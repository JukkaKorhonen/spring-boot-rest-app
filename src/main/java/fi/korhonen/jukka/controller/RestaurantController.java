package fi.korhonen.jukka.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fi.korhonen.jukka.error.TechnicalException;
import fi.korhonen.jukka.model.sode.Course;
import fi.korhonen.jukka.reader.RestReader;

@Controller
public class RestaurantController {

	@GetMapping("/")
	public String test1(Model model) throws IOException {

		//Tomorrow after 4PM
		LocalDate date = LocalDate.now();
		if (LocalDateTime.now().getHour() > 16) {
			date = date.plusDays(1);
		}
		
		RestReader reader = new RestReader();
		try {
			Optional<Course> restaurantListToday = Optional.ofNullable(reader.readRestaurantData(date));

			List<Course> course = new ArrayList<Course>();
			model.addAttribute("course", course);
			
//			if (restaurantListToday.isPresent()) {
//				if (restaurantListToday.get().getAdditionalProperties() == null) {
//					return "nofood";
//				}
//				
//				Map<String, Object> menuu = restaurantListToday.get().getAdditionalProperties();
//				@SuppressWarnings("unchecked")
//				List<Course> course = (List<Course>) menuu.get("courses");
//				
//				model.addAttribute("course", course);
//				
//			}

		} catch (TechnicalException e) {
			return "error";
		}

		return "index";

	}
}
