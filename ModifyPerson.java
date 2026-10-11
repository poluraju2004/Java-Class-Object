class ModifyPerson{
	String name;
	int age;
	String country;

	// Parameterized Constructor
	public ModifyPerson(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}
	public String toString(){
		return name+" "+ age+" "+ country;
	}

	public static  void comparedAge(ModifyPerson mp1,ModifyPerson mp2 ){
		int age1 = mp1.age;
		int age2 = mp2.age;
		int smallAge = age1 < age2 ? age1 : age2;
		System.out.println("Younger age = "  +smallAge);

	}

	public static void main(String[] args) {
		ModifyPerson mp1 = new ModifyPerson("ABC",28,"India");
		System.out.println(mp1);
		ModifyPerson mp2 = new ModifyPerson("BCD",26,"USA");
		System.out.println(mp2);
		//ModifyPerson.comparedAge(mp1,mp2);
		comparedAge(mp1,mp2);
		
	}
}