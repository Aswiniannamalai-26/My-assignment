package week1day2;

public class Browser {

	public void launchBrowser(String browsername) {
		// TODO Auto-generated method stub
        System.out.println("Browser Launched Successfully");
        }
	
	private void loadURL(String URL, int a) {
		// TODO Auto-generated method stub
    System.out.println("Application URL Loaded Successfully");
    }
	
	{
		System.out.println("a.loadURL");
	}

    public static void main(String[] args) {
		Browser a = new Browser();
		a.launchBrowser("chrome");
		a.loadURL("https://www.google.com", 120);
	}
}
