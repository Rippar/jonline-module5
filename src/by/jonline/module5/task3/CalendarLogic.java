package by.jonline.module5.task3;

import by.jonline.module5.task3.Calendar.Day;

public class CalendarLogic {

	public boolean makeDayOff(Calendar calendar, int numOfDay, int numOfMonth) {

		for (Day day : calendar.getDays()) {

			if (day.getNumOfDay() == numOfDay && day.getNumOfMonth() == numOfMonth) {
				day.setFreeDay(true);
				return true;
			}
		}
		return false;

	}

	public boolean makeWorkingDay(Calendar calendar, int numOfDay, int numOfMonth) {

		for (Day day : calendar.getDays()) {

			if (day.getNumOfDay() == numOfDay && day.getNumOfMonth() == numOfMonth) {
				day.setFreeDay(false);
				return true;
			}
		}
		return false;

	}

	public boolean makeHolidayDay(Calendar calendar, int numOfDay, int numOfMonth) {

		for (Day day : calendar.getDays()) {

			if (day.getNumOfDay() == numOfDay && day.getNumOfMonth() == numOfMonth) {
				day.setHoliday(true);
				return true;
			}
		}
		return false;

	}

	public boolean makeNonHolidayDay(Calendar calendar, int numOfDay, int numOfMonth) {

		for (Day day : calendar.getDays()) {

			if (day.getNumOfDay() == numOfDay && day.getNumOfMonth() == numOfMonth) {
				day.setHoliday(false);
				return true;
			}
		}
		return false;

	}

}
