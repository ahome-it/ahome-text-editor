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
package com.ait.toolkit.editors.annotator.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.editors.annotator.client.core.Promise;
import com.ait.toolkit.editors.annotator.client.core.Registry;
import com.ait.toolkit.editors.annotator.client.modules.AnnotatorModule;
import com.ait.toolkit.editors.annotator.client.modules.HttpStorage;
import com.ait.toolkit.editors.annotator.client.modules.HttpStorageOption;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public final class Annotator extends JsObject {

    public Annotator() {
        jsObj = createPeer();
    }

    protected Annotator( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public native Promise start()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var p = peer.start();
		return @com.ait.toolkit.editors.annotator.client.core.Promise::new(Lcom/google/gwt/core/client/JavaScriptObject;)(p);
    }-*/;

    public native Promise destroy()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var p = peer.destroy();
		return @com.ait.toolkit.editors.annotator.client.core.Promise::new(Lcom/google/gwt/core/client/JavaScriptObject;)(p);
    }-*/;

    public native Annotator loadAnnotations()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.annotations().load();
		return this;
    }-*/;

    public native Annotator setIdentity( String identity )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.ident.identity = identity;
		return this;
    }-*/;

    public native Registry getRegistry()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var r = peer.registry;
		return @com.ait.toolkit.editors.annotator.client.core.Registry::new(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
    }-*/;

    public native Annotator include( AnnotatorModule module )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.include(module.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
    }-*/;

    public native Annotator include( HttpStorage module )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.include(module.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
    }-*/;

    public native Annotator include( HttpStorage module, HttpStorageOption options )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.include(
				module.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
    }-*/;

    public native void include( AnnotatorModule module, Element target )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.include(
				module.@com.ait.toolkit.core.client.JsObject::getJsObj()(), {
					element : target
				});
    }-*/;

    public native void include( AnnotatorModule module, JavaScriptObject target )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.include(
				module.@com.ait.toolkit.core.client.JsObject::getJsObj()(), {
					element : target
				});
    }-*/;

    private native JavaScriptObject createPeer()/*-{
		return new $wnd.annotator.App();
    }-*/;

}
