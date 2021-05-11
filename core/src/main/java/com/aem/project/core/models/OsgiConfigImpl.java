package com.aem.project.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import com.aem.project.components.DimensionsConfig;

@Model(adaptables = Resource.class, adapters = OsgiConfig.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OsgiConfigImpl implements OsgiConfig {

	@OSGiService
	DimensionsConfig dimensionsConfig;

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return dimensionsConfig.getLength();
	}

	@Override
	public int getBreadth() {
		// TODO Auto-generated method stub
		return dimensionsConfig.getBreadth();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return dimensionsConfig.getPassword();
	}

	@Override
	public boolean getInstall() {
		// TODO Auto-generated method stub
		return dimensionsConfig.getInstall();
	}

	@Override
	public String[] getCountry() {
		// TODO Auto-generated method stub
		return dimensionsConfig.getCountry();
	}

	@Override
	public String getRunMode() {
		// TODO Auto-generated method stub
		return dimensionsConfig.getRunMode();
	}
	
	

}
