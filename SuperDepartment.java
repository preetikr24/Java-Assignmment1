
public class SuperDepartment {
	
	    public String departmentName()
	    {
	        return("Super Department");
	    }
	    public String getTodaysWork()
	    {
	        return("No Work as of now");
	    }
	    public String getWorkDeadline()
	    {
	        return("Nil");
	    }
	    public String isTodayAHoliday()
	    {
	        return("Today is not a Holiday");
	    }
	}
	class AdminDepartment extends SuperDepartment
	{
	    public String departmentName()
	    {
	        return("Admin Department");
	    }
	    public String getTodaysWork()
	    {
	        return("Complete your Document Submission");
	    }
	    public String getWorkDeadline()
	    {
	        return("Complete by EOD");
	    }
	}
	class HrDepartment extends SuperDepartment
	{
	    public String departmentName()
	    {
	        return("Hr Department");
	    }
	    public String getTodaysWork()
	    {
	        return("Fill today's worksheet and mark your attendance");
	    }
	    public String getWorkDeadline()
	    {
	        return("Complete by EOD");
	    }
	    public String doActivity()
	    {
	        return("Team Lunch");
	    }
	}
	class TechDepartment extends SuperDepartment
	{
	    public String departmentName()
	    {
	        return("Tech Department");
	    }
	    public String getTodaysWork()
	    {
	        return("Complete code of module 1");
	    }
	    public String getWorkDeadline()
	    {
	        return("Complete by EOD");
	    }
	    public String getTechStackInformation()
	    {
	        return("Core Java");
	    }
	}

	//Driver Class

	 class Main
	{

	public static void main(String[] args) 
	{
		 AdminDepartment ad = new AdminDepartment();
			HrDepartment hd = new HrDepartment();
			TechDepartment td = new TechDepartment();
			System.out.println(ad.departmentName());
			System.out.println(ad.getTodaysWork());
			System.out.println(ad.getWorkDeadline());
			System.out.println(ad.isTodayAHoliday());
			System.out.println();
			System.out.println(hd.departmentName());
			System.out.println(hd.getTodaysWork());
			System.out.println(hd.getWorkDeadline());
			System.out.println(hd.doActivity());
			System.out.println(hd.isTodayAHoliday());
			System.out.println();
			System.out.println(td.departmentName());
			System.out.println(td.getTodaysWork());
			System.out.println(td.getWorkDeadline());
			System.out.println(td.getTechStackInformation());
			System.out.println(td.isTodayAHoliday());
			
			
			//System.out.println(hd.getTodaysWork());
			//System.out.println(td.getTodaysWork());
			

	}

}
