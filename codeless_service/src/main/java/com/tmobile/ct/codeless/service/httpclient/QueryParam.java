/*******************************************************************************
 * * Copyright 2018 T Mobile, Inc. or its affiliates. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  * use this file except in compliance with the License.  You may obtain a copy
 *  * of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 *  * License for the specific language governing permissions and limitations under
 *  * the License.
 ******************************************************************************/
package com.tmobile.ct.codeless.service.httpclient;

import java.util.List;

import com.tmobile.ct.codeless.core.datastructure.MultiValue;

/**
 * The Class QueryParam.
 *
 * @author Rob Graff
 */
public class QueryParam extends MultiValue<String,String> {

	/**
	 * Instantiates a new query param.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public QueryParam(String key, String value) {
		super(key, value);
	}
	
	/**
	 * Instantiates a new query param.
	 *
	 * @param key the key
	 * @param values the values
	 */
	public QueryParam(String key, List<String> values){
		super(key, values);
	}
	
	/**
	 * Instantiates a new query param.
	 */
	public QueryParam(){}

}
