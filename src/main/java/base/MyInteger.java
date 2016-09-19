package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (getiValue() % 2 == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {
		if (getiValue() % 2 == 1)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		if (getiValue() < 2)
			return false;
		else if (getiValue() == 2)
			return true;
		for (int counter = 3; counter * counter <= getiValue(); counter += 2) {
			if (getiValue() % counter == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int value) {
		if (value % 2 == 1)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int value) {
		if (value < 2)
			return false;
		else if (value == 2)
			return true;
		for (int counter = 3; counter * counter <= value; counter += 2) {
			if (value % counter == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger value) {
		if (value.getiValue() % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(MyInteger value) {
		if (value.getiValue() % 2 == 1)
			return true;
		else
			return false;
	}

	public static boolean isPrime(MyInteger value) {
		if (value.getiValue() < 2)
			return false;
		else if (value.getiValue() == 2)
			return true;
		for (int counter = 3; counter * counter <= value.getiValue(); counter += 2) {
			if (value.getiValue() % counter == 0)
				return false;
		}
		return true;
	}

	public boolean equals(int value) {
		if (value == this.getiValue())
			return true;
		 else
			return false;
	}

	public boolean equals(MyInteger value) {
		if (value.getiValue() == this.getiValue())
			return true;
		else
			return false;
	}
}
