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

	/**
	 * 横幅を設定する。
	 * 
	 * @param aWidth 横幅
	 */
	public void setWidth(final float aWidth) {
		width = aWidth;
	}

	/**
	 * 横幅を取得する。
	 * 
	 * @return 横幅
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * 縦幅を設定する。
	 * 
	 * @param aHeight 縦幅
	 */
	public void setHeight(final float aHeight) {
		height = aHeight;
	}

	/**
	 * 縦幅を取得する。
	 * 
	 * @return 縦幅
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * 横幅に値を加算する。
	 * 
	 * @param aValue 加算値
	 */
	public void addWidth(final float aValue) {
		width += aValue;
	}

	/**
	 * 縦幅に値を加算する。
	 * 
	 * @param aValue 加算値
	 */
	public void addHeight(final float aValue) {
		height += aValue;
	}

	/**
	 * 横幅に値を除算する。
	 * 
	 * @param aValue 除算値
	 */
	public void subtractWidth(final float aValue) {
		width -= aValue;
	}

	/**
	 * 縦幅に値を除算する。
	 * 
	 * @param aValue 除算値
	 */
	public void subtractHeight(final float aValue) {
		height -= aValue;
	}
	
	/**
	 * 横幅、縦幅それぞれに値を加算する。
	 * 
	 * @param aWidth 横幅
	 * @param aHeight 縦幅
	 */
	public void add(final float aWidth, final float aHeight) {
		width += aWidth;
		height += aHeight;
	}
}
