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
