package _2.Q;

import java.time.DateTimeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class EmployeeBonus {
	public double getBonus(String joiningDate) throws InvalidAge  {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			LocalDate jd = LocalDate.parse(joiningDate, dtf);
			LocalDate cur = LocalDate.now();
			Period experience = Period.between(jd,cur);
			
//			System.out.println(experience.getDays());
			if(experience.getYears()<1 && experience.getDays()>0) {
				return 5000;
			}
			else if(experience.getYears()>=1 && experience.getYears()<2) {
				return 8000;
			}
			else if(experience.getYears()>=2) {
				return 10000;
			}
			else if(experience.getDays()<0 ) {
				InvalidAge ag = new InvalidAge("Age should not be in the future");
				throw ag;
			}
			
		}
		catch(DateTimeException e) {
			InvalidAge ia = new InvalidAge("Please pass the date in the correct format");
			throw ia;
		}
		return 0;
		
		
	}
}
