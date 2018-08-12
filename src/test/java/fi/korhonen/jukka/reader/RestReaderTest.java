package fi.korhonen.jukka.reader;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import fi.korhonen.jukka.error.TechnicalException;
import fi.korhonen.jukka.model.sode.Course;

public class RestReaderTest {

	private RestReader reader;

	@Before
	public void init() {
		reader = new RestReader();
	}

	@Test
	public void readRestauranta_test() {

		try {
			Course course = reader.readRestaurantData(LocalDate.now());
			assertTrue(course != null);
			assertTrue(course.getAdditionalProperties() != null);
		} catch (TechnicalException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void createAddress_test() {
		LocalDate date = LocalDate.now();

		String address = reader.createAddress(date);
		assertTrue(address != null);
		assertTrue(address.startsWith("https://www.sodexo.fi/ruokalistat/output/daily_json/27793/"));
	}
}
