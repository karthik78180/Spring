package com.karthik.spring.SpringCore.properties;

import java.util.Properties;

public class CountriesandLanguages {
	private Properties countryandLangs;

	public Properties getCountryandLangs() {
		return countryandLangs;
	}

	public void setCountryandLangs(Properties countryandLangs) {
		this.countryandLangs = countryandLangs;
	}

	@Override
	public String toString() {
		return "CountriesandLanguages [countryandLangs=" + countryandLangs + "]";
	}

}
