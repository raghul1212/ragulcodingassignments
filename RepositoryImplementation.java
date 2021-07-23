package com.revature.practice;


class Repository{
	 String getCountryName(String countryCode) throws InvalidCodeException{ 
																	
																	//70 to 99  -India
																	//908 = US
																	
																	//011      -Dial somewhere outside of USA 
																	
																	// No country with given code found
		String result=null;
		int countryCodeInt=Integer.parseInt(countryCode);
		if(countryCodeInt>=70 && countryCodeInt<=99)
			result="India";
		else if(countryCodeInt==908)
			result="US";
		else if(countryCodeInt==011)
			throw new InvalidCodeException("Dial somewhere outside of USA");
		else 
			throw new InvalidCodeException("No country with given code found");
		
	return result;
 }
	
}
 class RepositoryImplementation {
	
	public static void main(String[] args) throws InvalidCodeException {
		Repository st=new Repository();
		System.out.println(st.getCountryName("80"));
		System.out.println(st.getCountryName("908"));
		System.out.println(st.getCountryName("1001"));
	}
}
 


