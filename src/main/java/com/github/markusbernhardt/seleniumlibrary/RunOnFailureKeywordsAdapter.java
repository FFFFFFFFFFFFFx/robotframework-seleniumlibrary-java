package com.github.markusbernhardt.seleniumlibrary;

import org.robotframework.javalib.annotation.Autowired;

import com.github.markusbernhardt.seleniumlibrary.keywords.RunOnFailure;

public abstract class RunOnFailureKeywordsAdapter implements RunOnFailureKeywords {

	@Autowired
	private RunOnFailure runOnFailure;

	/**
	 * This method is called by the
	 * com.github.markusbernhardt.seleniumlibrary.aspects.RunOnFailureAspect in
	 * case a exception is thrown in one of the public methods of a keyword
	 * class.
	 */
	@Override
	public void runOnFailureByAspectJ() {
		runOnFailure.runOnFailure();
	}

}
