/**
 * Copyright (c) 2016 Source Auditor Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
*/
package org.openchain.certification.model;

/**
 * Same functionality as YesNoAnswer, but allows for not applicable response
 * We are making this a separate class so that we can provide the proper formatting
 * @author Gary O'Neall
 *
 */
public class YesNoNotApplicableQuestion extends YesNoQuestion {
	
	public static final String TYPE_NAME = "YES_NO_NA";
	
	String notApplicablePrompt;

	public YesNoNotApplicableQuestion(String question, String sectionName,
			String number, String specVersion, YesNo correctAnswer, String notApplicablePrompt) throws QuestionException {
		super(question, sectionName, number, specVersion, correctAnswer);
		this.notApplicablePrompt = notApplicablePrompt;
		this.type = TYPE_NAME;
	}

	/**
	 * @return the notApplicablePrompt
	 */
	public String getNotApplicablePrompt() {
		return notApplicablePrompt;
	}

	/**
	 * @param notApplicablePrompt the notApplicablePrompt to set
	 */
	public void setNotApplicablePrompt(String notApplicablePrompt) {
		this.notApplicablePrompt = notApplicablePrompt;
	}

}
