/*
 *   Copyright (c) 2007 Mike Heath.  All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.adbcj.postgresql.mina;

import org.apache.mina.core.session.IoSession;
import org.adbcj.postgresql.mina.MinaConnection;

public class IoSessionUtil {

	private static final String CONNECTION_KEY = IoSessionUtil.class.getName() + ".connection";

	private IoSessionUtil() {
		// Make this class uninstantiable with a private constructor.
	}

	public static MinaConnection getConnection(IoSession session) {
		return (MinaConnection)session.getAttribute(CONNECTION_KEY);
	}

	public static void setConnection(IoSession session, MinaConnection connection) {
		session.setAttribute(CONNECTION_KEY, connection);
	}

}
