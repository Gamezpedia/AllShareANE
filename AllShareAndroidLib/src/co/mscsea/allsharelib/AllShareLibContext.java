/*
 * Copyright 2013 Samsung Developer Relations Team (MSCSEA)
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

package co.mscsea.allsharelib;

import java.util.HashMap;
import java.util.Map;

import android.util.Log;

import co.mscsea.allsharelib.functions.InitFunction;
import co.mscsea.allsharelib.functions.StartScreenShare;
import co.mscsea.allsharelib.functions.StopScreenShare;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class AllShareLibContext extends FREContext {

	@Override
	public void dispose() {
		Log.d(AllShareLib.TAG, "AllShareLibContext dispose()");
	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		Map<String, FREFunction> functions = new HashMap<String, FREFunction>();
		functions.put("init", new InitFunction());
		functions.put("startScreenShare", new StartScreenShare());
		functions.put("stopScreenShare", new StopScreenShare());
		return functions;
	}
}
