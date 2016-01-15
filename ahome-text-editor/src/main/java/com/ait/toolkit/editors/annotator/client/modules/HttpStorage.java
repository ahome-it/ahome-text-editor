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

import com.google.gwt.core.client.JavaScriptObject;

/*
 * A storage component that can be used to print details of the annotation persistence processes to the console when
 * developing other parts of Annotator.
 */
public class HttpStorage extends AnnotatorModule {

    protected HttpStorage( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public static HttpStorage get() {
        return new HttpStorage( createPeer() );
    }

    private static native JavaScriptObject createPeer()/*-{
		return $wnd.annotator.storage.http;
    }-*/;
}
