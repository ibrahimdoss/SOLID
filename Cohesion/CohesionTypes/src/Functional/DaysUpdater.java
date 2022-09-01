package Functional;

public class DaysUpdater implements BiFunction<Date, Integer, Date>{
	 //verilen günleri geçen tarihe ekleyen bir işlev
	  @Override
	    public Date apply(Date date, Integer days) {
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(date);
	        calendar.add(Calendar.DAY_OF_MONTH, days);
	        return calendar.getTime();
	    }

}
