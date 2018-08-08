package fi.korhonen.jukka.reader;

import java.io.IOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.ObjectMapper;

import fi.korhonen.jukka.error.TechnicalException;
import fi.korhonen.jukka.model.sode.Course;

public class RestReader {

	public Course readRestaurantData(LocalDate date) throws TechnicalException {
		String address = createAddress(date);

		ObjectMapper mapper = new ObjectMapper();

		try {
			Course usrPost = mapper.readValue(new URL(address), Course.class);
			return usrPost;
		} catch (UnknownHostException e) {
			e.printStackTrace();
			throw new TechnicalException("Cannot connect to address ", e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new TechnicalException("Unknown exception ", e);
		}
	}

	protected String createAddress(LocalDate date) {
		StringBuilder sb = new StringBuilder();
		sb.append("https://www.sodexo.fi/ruokalistat/output/daily_json/27793/");
		sb.append(date.getYear() + "/");

		if (date.getMonthValue() == 11 || date.getMonthValue() == 12) {
			sb.append(date.getMonthValue() + "/");
		} else {
			sb.append("0" + date.getMonthValue() + "/");
		}

		if (date.getDayOfMonth() < 10) {
			sb.append("0" + date.getDayOfMonth() + "/");
		} else {
			sb.append(date.getDayOfMonth() + "/");
		}

		sb.append("fi");
		return sb.toString();
	}
}
