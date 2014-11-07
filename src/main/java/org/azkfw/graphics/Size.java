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

	/** 横幅 */
	private float width;

	/** 縦幅 */
	private float height;

	/**
	 * コンストラクタ
	 */
	public Size() {
		width = 0.f;
		height = 0.f;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aSize Size情報
	 */
	public Size(final Size aSize) {
		width = aSize.width;
		height = aSize.height;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aWidth 横幅
	 * @param aHeight 縦幅
	 */
	public Size(final int aWidth, final int aHeight) {
		width = aWidth;
		height = aHeight;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aWidth 横幅
	 * @param aHeight 縦幅
	 */
	public Size(final float aWidth, final float aHeight) {
		width = aWidth;
		height = aHeight;
	}

	/**
	 * サイズを指定する。
	 * 
	 * @param aWidth 横幅
	 * @param aHeight 縦幅
	 */
	public void set(final int aWidth, final int aHeight) {
		width = aWidth;
		height = aHeight;
	}

	/**
	 * サイズを指定する。
	 * 
	 * @param aWidth 横幅
	 * @param aHeight 縦幅
	 */
	public void set(final float aWidth, final float aHeight) {
		width = aWidth;
		height = aHeight;
	}

	/**
	 * 横幅を設定する。
	 * 
	 * @param aWidth 横幅
	 */
	public void setWidth(final int aWidth) {
		width = aWidth;
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
	public void setHeight(final int aHeight) {
		height = aHeight;
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
	 * サイズに値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void add(final int aValue) {
		width += aValue;
		height += aValue;
	}

	/**
	 * サイズに値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void add(final float aValue) {
		width += aValue;
		height += aValue;
	}

	/**
	 * サイズに値を加算する。
	 * 
	 * @param aWidth 横幅に加算する値
	 * @param aHeight 縦幅に加算する値
	 */
	public void add(final int aWidth, final int aHeight) {
		width += aWidth;
		height += aHeight;
	}

	/**
	 * サイズに値を加算する。
	 * 
	 * @param aWidth 横幅に加算する値
	 * @param aHeight 縦幅に加算する値
	 */
	public void add(final float aWidth, final float aHeight) {
		width += aWidth;
		height += aHeight;
	}

	/**
	 * 横幅に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addWidth(final int aValue) {
		width += aValue;
	}

	/**
	 * 横幅に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addWidth(final float aValue) {
		width += aValue;
	}

	/**
	 * 縦幅に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addHeight(final int aValue) {
		height += aValue;
	}

	/**
	 * 縦幅に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addHeight(final float aValue) {
		height += aValue;
	}

	/**
	 * サイズに値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtract(final int aValue) {
		width -= aValue;
		height -= aValue;
	}

	/**
	 * サイズに値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtract(final float aValue) {
		width -= aValue;
		height -= aValue;
	}

	/**
	 * サイズに値を減算する。
	 * 
	 * @param aWidth 横幅に減算する値
	 * @param aHeight 縦幅に減算する値
	 */
	public void subtract(final int aWidth, final int aHeight) {
		width -= aWidth;
		height -= aHeight;
	}

	/**
	 * サイズに値を減算する。
	 * 
	 * @param aWidth 横幅に減算する値
	 * @param aHeight 縦幅に減算する値
	 */
	public void subtract(final float aWidth, final float aHeight) {
		width -= aWidth;
		height -= aHeight;
	}

	/**
	 * 横幅に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractWidth(final int aValue) {
		width -= aValue;
	}

	/**
	 * 横幅に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractWidth(final float aValue) {
		width -= aValue;
	}

	/**
	 * 縦幅に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractHeight(final int aValue) {
		height -= aValue;
	}

	/**
	 * 縦幅に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractHeight(final float aValue) {
		height -= aValue;
	}

	/**
	 * サイズに値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiply(final int aValue) {
		width *= aValue;
		height *= aValue;
	}

	/**
	 * サイズに値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiply(final float aValue) {
		width *= aValue;
		height *= aValue;
	}

	/**
	 * サイズに値を乗算する。
	 * 
	 * @param aWidth 横幅に乗算する値
	 * @param aHeight 縦幅に乗算する値
	 */
	public void multiply(final int aWidth, final int aHeight) {
		width *= aWidth;
		height *= aHeight;
	}

	/**
	 * サイズに値を乗算する。
	 * 
	 * @param aWidth 横幅に乗算する値
	 * @param aHeight 縦幅に乗算する値
	 */
	public void multiply(final float aWidth, final float aHeight) {
		width *= aWidth;
		height *= aHeight;
	}

	/**
	 * 横幅に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplyWidth(final int aValue) {
		width *= aValue;
	}

	/**
	 * 横幅に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplyWidth(final float aValue) {
		width *= aValue;
	}

	/**
	 * 縦幅に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplyHeight(final int aValue) {
		height *= aValue;
	}

	/**
	 * 縦幅に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplyHeight(final float aValue) {
		height *= aValue;
	}

	/**
	 * サイズに値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divide(final int aValue) {
		width /= aValue;
		height /= aValue;
	}

	/**
	 * サイズに値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divide(final float aValue) {
		width /= aValue;
		height /= aValue;
	}

	/**
	 * サイズに値を除算する。
	 * 
	 * @param aWidth 横幅に除算する値
	 * @param aHeight 縦幅に除算する値
	 */
	public void divide(final int aWidth, final int aHeight) {
		width /= aWidth;
		height /= aHeight;
	}

	/**
	 * サイズに値を除算する。
	 * 
	 * @param aWidth 横幅に除算する値
	 * @param aHeight 縦幅に除算する値
	 */
	public void divide(final float aWidth, final float aHeight) {
		width /= aWidth;
		height /= aHeight;
	}

	/**
	 * 横幅に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divideWidth(final int aValue) {
		width /= aValue;
	}

	/**
	 * 横幅に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divideWidth(final float aValue) {
		width /= aValue;
	}

	/**
	 * 縦幅に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divideHeight(final int aValue) {
		height /= aValue;
	}

	/**
	 * 縦幅に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divideHeight(final float aValue) {
		height /= aValue;
	}
}
