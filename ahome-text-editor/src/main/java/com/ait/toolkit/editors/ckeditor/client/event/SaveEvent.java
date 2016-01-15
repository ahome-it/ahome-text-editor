/*
 Copyright (c) 2015 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.editors.ckeditor.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;

public class SaveEvent<T> extends GwtEvent<SaveHandler<T>> {
	
	private static Type<SaveHandler<?>> TYPE;
	public static Type<SaveHandler<?>> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<SaveHandler<?>>());
	}
	
	public static <T> void fire(HasSaveHandlers<T> source, T target, String text) {
		if (TYPE != null) {
			SaveEvent<T> event = new SaveEvent<T>(target,text);
			source.fireEvent(event);
		}
	}

	protected void dispatch(SaveHandler<T> handler) {
		handler.onSave(this);
	}
	
	private final T target;
	
	private final String text;
	
	protected SaveEvent(T target, String text) {
		this.target = target;
		this.text = text;
	}
	
	/**
	 * The CKEditor which generates the SaveEvent
	 * @return The CKEditor which generates the SaveEvent
	 */
	public T getTarget() {
		return target;
	}
	
	/**
	 * The text (HTML) to save
	 * @return The text to save
	 */
	public String getText() {
		return text;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Type<SaveHandler<T>> getAssociatedType() {
		return (Type) TYPE;
	}
}
