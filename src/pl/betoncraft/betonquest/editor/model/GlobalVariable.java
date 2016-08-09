/**
 * BetonQuest Editor - advanced quest creating tool for BetonQuest
 * Copyright (C) 2015  Jakub "Co0sh" Sapalski
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pl.betoncraft.betonquest.editor.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pl.betoncraft.betonquest.editor.data.Instruction;

/**
 * Represents a variable defined in main.yml file.
 *
 * @author Jakub Sapalski
 */
public class GlobalVariable implements Instruction {
	
	private StringProperty id;
	private int index = -1;
	private StringProperty value = new SimpleStringProperty();
	
	public GlobalVariable(String id, String value) {
		this(id);
		this.value.set(value);
	}
	
	public GlobalVariable(String id) {
		this.id = new SimpleStringProperty(id);
	}

	public StringProperty getId() {
		return id;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}

	public StringProperty getInstruction() {
		return value;
	}

	@Override
	public void edit() {
		// TODO edit a global variable
	}
	
}
