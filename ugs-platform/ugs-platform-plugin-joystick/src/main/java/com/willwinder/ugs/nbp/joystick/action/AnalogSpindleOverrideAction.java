/*
    Copyright 2024 Will Winder

    This file is part of Universal Gcode Sender (UGS).

    UGS is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    UGS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with UGS.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.willwinder.ugs.nbp.joystick.action;

import com.willwinder.universalgcodesender.i18n.Localization;
import com.willwinder.universalgcodesender.listeners.OverrideType;

/**
 * An action for setting the analog spindle override
 *
 * @author Joacim Breiler
 */
public class AnalogSpindleOverrideAction extends AnalogOverrideAction {
    public AnalogSpindleOverrideAction() {
        super(OverrideType.SPINDLE_SPEED);
        this.putValue(NAME, Localization.getString("platform.plugin.joystick.action.analogSpindle"));
    }
}
