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
