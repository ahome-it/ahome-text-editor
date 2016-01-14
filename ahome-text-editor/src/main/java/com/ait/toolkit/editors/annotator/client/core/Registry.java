package com.ait.toolkit.editors.annotator.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Registry extends JsObject {

    protected Registry( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public native Registry registerUtility( String name, RegistryConfig config )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerUtility(
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				name);

    }-*/;

    public Registry registerAuthorizationPolicy( AuthorizationPolicy policy ) {
        return registerUtility( "authorizationPolicy", policy );
    }

}
