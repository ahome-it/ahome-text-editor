/**
 *  This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.ait.toolkit.editors.ckeditor.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface InstanceReadyHandler extends EventHandler {
	
	/**
	 * Fired when the CKEDITOR instance is completely created, fully initialized and ready for interaction.
	 * @param event event that contains info about the editor that triggered the event
	 */
	void onInstanceReady(InstanceReadyEvent event);

}
