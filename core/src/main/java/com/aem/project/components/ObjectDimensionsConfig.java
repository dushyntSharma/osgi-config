package com.aem.project.components;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "Object factory configuration for the dimensions", description = "Object Factory for the Dimensions")
public @interface ObjectDimensionsConfig {
	@AttributeDefinition(name = "length", description = "length of the area", type = AttributeType.INTEGER)
	int length();

	@AttributeDefinition(name = "breadth", description = "Breadth of the area", type = AttributeType.INTEGER)
	int breadth();

	@AttributeDefinition(name = "password", description = "password", type = AttributeType.PASSWORD)
	String password();

	@AttributeDefinition(name = "isInstalled", description = "Bundle Installed?", type = AttributeType.BOOLEAN)
	boolean install();

	@AttributeDefinition(name = "Countries", description = "Add countries locales for which you want to run this service.", type = AttributeType.STRING)
	String[] country();

	@AttributeDefinition(name = "Run Modes", description = "Select Run Mode.", options = {
			@Option(label = "Author", value = "author"), @Option(label = "Publish", value = "publish"),
			@Option(label = "Both", value = "both") }, type = AttributeType.STRING)
	String runMode();
}
