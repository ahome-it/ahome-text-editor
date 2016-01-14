package com.ait.toolkit.editors.annotator.client.core;

import com.ait.toolkit.core.client.JsoHelper;

public class AuthorizationPolicy extends RegistryConfig {

    public AuthorizationPolicy() {
        jsObj = JsoHelper.createObject();
    }

    public native AuthorizationPolicy setPermitsChecker( PermitsChecker checker )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.permits = function() {
			return checker.@com.ait.toolkit.editors.annotator.client.core.PermitsChecker::isPermitted()();
		};
		return this;
    }-*/;

    public native AuthorizationPolicy setAuthorizedUserIdHandler( AuthorizedUserIdHandler checker )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.authorizedUserId = function(u) {
			$wnd.console.log(u);
			var user = @com.ait.toolkit.editors.annotator.client.core.AnnotatorUser::new(Lcom/google/gwt/core/client/JavaScriptObject;)(u);
			return checker.@com.ait.toolkit.editors.annotator.client.core.AuthorizedUserIdHandler::getUserId(Lcom/ait/toolkit/editors/annotator/client/core/AnnotatorUser;)(user);
		};
		return this;
    }-*/;
}
