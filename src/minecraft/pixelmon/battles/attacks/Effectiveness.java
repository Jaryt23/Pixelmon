package pixelmon.battles.attacks;

public enum Effectiveness 
{
	Normal(1F),
	Super(2F),
	Max(4F), 
	Not(0.5F), 
	Barely(0.25F),
	None(0F);
	
	public float value;
	
	private Effectiveness(float f)
	{
		value = f;
	}
}
