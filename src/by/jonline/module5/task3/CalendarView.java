package by.jonline.module5.task3;

import by.jonline.module5.task3.Calendar.Day;

public class CalendarView {

	public void printCalendar(Calendar calendar) {
		StringBuilder result = new StringBuilder("Год: " + calendar.getYear() + "\nСписок дней:\n");
		for (Day day : calendar.getDays()) {
			result.append("День: " + day.getNumOfDay() + ", месяц: " + determineMonth(day.getNumOfMonth())
					+ ", выходной день?: " + ((day.isFreeDay()) ? "да" : "нет") + ", праздничный день?: "
					+ ((day.isHoliday()) ? "да" : "нет") + "\n");
		}

		System.out.println(result);
	}

	private String determineMonth(int number) {
		switch (number) {

		case (0):
			return "январь";

		case (1):
			return "февраль";

		case (2):
			return "март";

		case (3):
			return "апрель";

		case (4):
			return "май";

		case (5):
			return "июнь";

		case (6):
			return "июль";

		case (7):
			return "август";

		case (8):
			return "сентябрь";

		case (9):
			return "октябрь";

		case (10):
			return "ноябрь";

		case (11):
			return "декабрь";

		default:
			return "месяц не определен";
		}
	}
}
