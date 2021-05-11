package com.aem.project.components;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = DimensionsConfig.class, immediate = true)
@Designate(ocd = ObjectDimensionsConfig.class)
public class DimensionsConfigImpl implements DimensionsConfig {

	// private final Logger logger = LoggerFactory.getLogger(getClass());

	private int length;
	private int breadth;
	private String password;
	private boolean install;
	private String[] country;
	private String runMode;

	@Activate
	@Modified
	protected void activate(ObjectDimensionsConfig objectDimensionsConfig) {
		length = objectDimensionsConfig.length();
		breadth = objectDimensionsConfig.breadth();
		password = objectDimensionsConfig.password();
		install = objectDimensionsConfig.install();
		country = objectDimensionsConfig.country();
		runMode = objectDimensionsConfig.runMode();

	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public int getBreadth() {
		// TODO Auto-generated method stub
		return breadth;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public boolean getInstall() {
		// TODO Auto-generated method stub
		return install;
	}

	@Override
	public String[] getCountry() {
		// TODO Auto-generated method stub
		return country;
	}

	@Override
	public String getRunMode() {
		// TODO Auto-generated method stub
		return runMode;
	}

}
