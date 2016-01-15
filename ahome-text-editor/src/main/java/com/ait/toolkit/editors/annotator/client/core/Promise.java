/*
 * Copyright (c) 2015 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.editors.annotator.client.core;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Promise extends JsObject {

    protected Promise( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public native Promise then( Function callback )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var p = peer.then(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
		return @com.ait.toolkit.editors.annotator.client.core.Promise::new(Lcom/google/gwt/core/client/JavaScriptObject;)(p);
    }-*/;

}
