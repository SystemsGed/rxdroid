/**
 * Copyright (C) 2012 Joseph Lehner <joseph.c.lehner@gmail.com>
 *
 * This file is part of RxDroid.
 *
 * RxDroid is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RxDroid is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RxDroid.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package at.caspase.androidutils.otpm;

import at.caspase.androidutils.MyDialogPreference;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class MyDialogPreferenceHelper extends PreferenceHelper<MyDialogPreference, Object>
{
	@Override
	public void initPreference(MyDialogPreference preference, Object fieldValue)
	{
		preference.setValue(fieldValue);
		//preference.setSummary(fieldValue.toString());
	}
}
