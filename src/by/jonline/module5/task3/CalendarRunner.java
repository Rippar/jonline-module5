package by.jonline.module5.task3;

/*Создать класс календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях */

public class CalendarRunner {

	public static void main(String[] args) {

		CalendarView view = new CalendarView();
		CalendarLogic logic = new CalendarLogic();

		Calendar calendar = new Calendar(2022);

		for (int i = 1; i <= 31; i++) {
			calendar.addDay(new Calendar.Day(i, 0));
		}

		logic.makeDayOff(calendar, 1, 0);
		logic.makeHolidayDay(calendar, 1, 0);
		logic.makeDayOff(calendar, 7, 0);
		logic.makeHolidayDay(calendar, 7, 0);

		view.printCalendar(calendar);

	}

}
