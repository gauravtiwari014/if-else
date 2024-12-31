public class IfElseSample {

	// Sample of If .. else construct
	public void checkScore(int score)
	{
		if(score >= 50)
		{
			System.out.println("Good Passed...");
		}
		else
		{
			System.out.println("Sorry Try Again....");
		}
	}
	// Sample of If.. else if ... else construct
	public void checkScoreWithMax(int score)
	{
		
	if((score >= 0) && (score <= 100))
	{
		if((score >= 50) && (score < 60))
		{
			System.out.println("Good Passed...");
		}
		else if((score >= 60) && (score < 70))
		{
			System.out.println("V Good Secured First Class...");
		}
		else if ((score >= 70) && (score <= 100))
		{
			System.out.println("Excellent Secured Distinction...");
		}
		else
		{
			System.out.println("Sorry Try Again...");
		}
	}
	else
	{
		System.out.println("Sorry Valid Score is 0-100");
	}
	}
	//Switch Case Example...
	public void switcherSample(int day)
	{
		switch(day)
		{
			case 1:
			{
				System.out.println("The Day is Monday...");
				break;
			}
			case 2:
			{
				System.out.println("The Day is Tuesday...");
				break;
			}
			case 3:
			{
				System.out.println("The Day is Wednesday...");
				break;
			}
			case 4:
			{
				System.out.println("The Day is Thursday...");
				break;
			}
			case 5:
			{
				System.out.println("The Day is Friday...");
				break;
			}
			case 6:
			{
				System.out.println("The Day is Saturday...");
				break;
			}
			case 7:
			{
				System.out.println("The Day is Sunday...");
				break;
			}
			default:
			{
				System.out.println("The Valid Day is 1-7...");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElseSample ifSample = new IfElseSample();
	/*	ifSample.checkScore(45);
		ifSample.checkScore(67);
		ifSample.checkScore(124);
		ifSample.checkScore(-23); 
		ifSample.checkScoreWithMax(45);
		ifSample.checkScoreWithMax(55);
		ifSample.checkScoreWithMax(65);
		ifSample.checkScoreWithMax(75);
		ifSample.checkScoreWithMax(124);
		ifSample.checkScoreWithMax(-23);*/
		
		ifSample.switcherSample(1);
		ifSample.switcherSample(5);
		ifSample.switcherSample(3);
		ifSample.switcherSample(2);
		ifSample.switcherSample(7);
		ifSample.switcherSample(240);		
	}
}


