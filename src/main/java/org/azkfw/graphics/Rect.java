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
 * このクラスは、Rect情報を格納したクラスです。
 * 
 * @since 1.1.0
 * @version 1.1.0 2014/06/15
 * @author Kawakicchi
 */
public final class Rect {

	/** X座標 */
	private float x;

	/** Y座標 */
	private float y;

	/** 横幅 */
	private float width;

	/** 縦幅 */
	private float height;

	/**
	 * コンストラクタ
	 */
	public Rect() {
		x = 0.0f;
		y = 0.0f;
		width = 0.0f;
		height = 0.0f;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aRect Rect情報
	 */
	public Rect(final Rect aRect) {
		x = aRect.x;
		y = aRect.y;
		width = aRect.width;
		height = aRect.height;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aX X座標
	 * @param aY Y座標
	 * @param aWidth 横幅
	 * @param aHeight 縦幅
	 */
	public Rect(final float aX, final float aY, final float aWidth, final float aHeight) {
		x = aX;
		y = aY;
		width = aWidth;
		height = aHeight;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aX X座標
	 * @param aY Y座標
	 * @param aWidth 横幅
	 * @param aHeight 縦幅
	 */
	public Rect(final int aX, final int aY, final int aWidth, final int aHeight) {
		x = aX;
		y = aY;
		width = aWidth;
		height = aHeight;
	}

	/**
	 * 位置を指定する。
	 * 
	 * @param aX X座標
	 * @param aY Y座標
	 */
	public void setPosition(final float aX, final float aY) {
		x = aX;
		y = aY;
	}

	/**
	 * サイズを指定する。
	 * 
	 * @param aWidth 横幅
	 * @param aHeight 縦幅
	 */
	public void setSize(final float aWidth, final float aHeight) {
		width = aWidth;
		height = aHeight;
	}

	/**
	 * X座標を取得する。
	 * 
	 * @return X座標
	 */
	public float getX() {
		return x;
	}

	/**
	 * Y座標を取得する。
	 * 
	 * @return Y座標
	 */
	public float getY() {
		return y;
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
	 * 縦幅を取得する。
	 * 
	 * @return 縦幅
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * X座標を設定する。
	 * 
	 * @param aX X座標
	 */
	public void setX(final float aX) {
		x = aX;
	}

	/**
	 * Y座標を設定する。
	 * 
	 * @param aY Y座標
	 */
	public void setY(final float aY) {
		y = aY;
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
	 * 縦幅を設定する。
	 * 
	 * @param aHeight 縦幅
	 */
	public void setHeight(final float aHeight) {
		height = aHeight;
	}

	/**
	 * X座標に値を加算する。
	 * 
	 * @param aValue 値
	 */
	public void addX(final float aValue) {
		x += aValue;
	}

	/**
	 * X座標に値を除算する。
	 * 
	 * @param aValue 値
	 */
	public void subtractX(final float aValue) {
		x -= aValue;
	}

	/**
	 * Y座標に値を加算する。
	 * 
	 * @param aValue 値
	 */
	public void addY(final float aValue) {
		y += aValue;
	}

	/**
	 * Y座標に値を除算する。
	 * 
	 * @param aValue 値
	 */
	public void subtractY(final float aValue) {
		y -= aValue;
	}

	/**
	 * 横幅に値を加算する。
	 * 
	 * @param aValue 値
	 */
	public void addWidth(final float aValue) {
		width += aValue;
	}

	/**
	 * 横幅に値を除算する。
	 * 
	 * @param aValue 値
	 */
	public void subtractWidth(final float aValue) {
		width -= aValue;
	}

	/**
	 * 縦幅に値を加算する。
	 * 
	 * @param aValue 値
	 */
	public void addHeight(final float aValue) {
		height += aValue;
	}

	/**
	 * 縦幅に値を除算する。
	 * 
	 * @param aValue 値
	 */
	public void subtractHeight(final float aValue) {
		height -= aValue;
	}

	/**
	 * サイズに値を加算する。
	 * 
	 * @param aWidth 値
	 * @param aHeight 値
	 */
	public void addSize(final float aWidth, final float aHeight) {
		width += aWidth;
		height += aHeight;
	}

	/**
	 * サイズに値を除算する。
	 * 
	 * @param aWidth 値
	 * @param aHeight 値
	 */
	public void subtractSize(final float aWidth, final float aHeight) {
		width -= aWidth;
		height -= aHeight;
	}
}
