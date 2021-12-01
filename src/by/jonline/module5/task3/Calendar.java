package by.jonline.module5.task3;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private int year;
	private List<Day> days;

	public Calendar() {
		days = new ArrayList<Day>();
	}

	public Calendar(int year) {
		this.year = year;
		days = new ArrayList<Day>();
	}

	public Calendar(int year, List<Day> days) {
		this.year = year;
		this.days = days;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Day> getDays() {
		return days;
	}

	public void setDays(List<Day> days) {
		this.days = days;
	}

	public boolean addDay(Day day) {
		return days.add(day);
	}

	public boolean removeDay(Day day) {
		return days.remove(day);
	}

	public static class Day {

		private int numOfDay;
		private int numOfMonth;
		private boolean isFreeDay;
		private boolean isHoliday;

		public Day() {

		}

		public Day(int numOfDay, int numOfMonth) {
			this.numOfDay = numOfDay;
			this.numOfMonth = numOfMonth;
		}

		public Day(int numOfDay, int numOfMonth, boolean isFreeDay, boolean isHoliday) {
			this.numOfDay = numOfDay;
			this.numOfMonth = numOfMonth;
			this.isFreeDay = isFreeDay;
			this.isHoliday = isHoliday;
		}

		public int getNumOfDay() {
			return numOfDay;
		}

		public void setNumOfDay(int numOfDay) {
			this.numOfDay = numOfDay;
		}

		public int getNumOfMonth() {
			return numOfMonth;
		}

		public void setNumOfMonth(int numOfMonth) {
			this.numOfMonth = numOfMonth;
		}

		public boolean isFreeDay() {
			return isFreeDay;
		}

		public void setFreeDay(boolean isFreeDay) {
			this.isFreeDay = isFreeDay;
		}

		public boolean isHoliday() {
			return isHoliday;
		}

		public void setHoliday(boolean isHoliday) {
			this.isHoliday = isHoliday;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (isFreeDay ? 1231 : 1237);
			result = prime * result + (isHoliday ? 1231 : 1237);
			result = prime * result + numOfDay;
			result = prime * result + numOfMonth;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Day other = (Day) obj;
			if (isFreeDay != other.isFreeDay)
				return false;
			if (isHoliday != other.isHoliday)
				return false;
			if (numOfDay != other.numOfDay)
				return false;
			if (numOfMonth != other.numOfMonth)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + " numOfDay= " + numOfDay + ", numOfMonth=" + numOfMonth + ", isFreeDay="
					+ isFreeDay + ", isHoliday=" + isHoliday;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " year=" + year + ", days=" + days;
	}

}
