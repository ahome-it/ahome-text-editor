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
package com.ait.toolkit.editors.annotator.client.modules;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class HttpStorageOption extends JsObject {

    protected HttpStorageOption() {
        jsObj = JsoHelper.createObject();
    }

    public HttpStorageOption setPrefix( String value ) {
        JsoHelper.setAttribute( jsObj, "prefix", value );
        return this;
    }

    public HttpStorageOption setEmulateHttp( boolean value ) {
        JsoHelper.setAttribute( jsObj, "emulateHTTP", value );
        return this;
    }

    public HttpStorageOption setEmulateJson( boolean value ) {
        JsoHelper.setAttribute( jsObj, "emulateJSON", value );
        return this;
    }

    public HttpStorageOption setHeaders( JavaScriptObject value ) {
        JsoHelper.setAttribute( jsObj, "headers", value );
        return this;
    }

    public HttpStorageOption setUrls( AnnotationStorageUrls value ) {
        JsoHelper.setAttribute( jsObj, "urls", value.getJsObj() );
        return this;
    }

    public native void onError( Function callback )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.onError = function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		};
    }-*/;

}
