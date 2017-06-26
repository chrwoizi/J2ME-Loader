/*
 * Copyright 2012 Kulikov Dmitriy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.microedition.util.param;

public interface DataEditor {
	public DataEditor clear();

	public DataEditor remove(String key);

	public DataEditor putBoolean(String key, boolean value);

	public DataEditor putFloat(String key, float value);

	public DataEditor putInt(String key, int value);

	public DataEditor putLong(String key, long value);

	public DataEditor putString(String key, String value);

	public void apply();

	public boolean commit();

	public void close();
}