/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.azkfw.graphics;

/**
 * このクラスは、Size情報を格納したクラスです。
 * 
 * @since 1.1.0
 * @version 1.1.0 2014/06/15
 * @author Kawakicchi
 */
public final class Size {

	private float width;
	private float height;

	/**
	 * コンストラクタ
	 */
	public Size() {

	}

	/**
	 * コンストラクタ
	 * 
	 * @param aWidth width
	 * @param aHeight height
	 */
	public Size(final float aWidth, final float aHeight) {
		width = aWidth;
		height = aHeight;
	}

	public void setWidth(final float aWidth) {
		width = aWidth;
	}

	public float getWidth() {
		return width;
	}

	public void setHeight(final float aHeight) {
		height = aHeight;
	}

	public float getHeight() {
		return height;
	}

}
