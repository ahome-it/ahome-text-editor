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
