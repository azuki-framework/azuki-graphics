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

import java.awt.Rectangle;

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
	 * @param aRect Rect情報
	 */
	public Rect(final Rectangle aRect) {
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
	public Rect(final int aX, final int aY, final int aWidth, final int aHeight) {
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
	public Rect(final float aX, final float aY, final float aWidth, final float aHeight) {
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
	public void setPosition(final int aX, final int aY) {
		x = aX;
		y = aY;
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
	 * X座標を設定する。
	 * 
	 * @param aX X座標
	 */
	public void setX(final int aX) {
		x = aX;
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
	public void setY(final int aY) {
		y = aY;
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
	 * 位置を取得する。
	 * 
	 * @return 位置
	 */
	public Point getPosition() {
		return new Point(x, y);
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
	 * サイズを指定する。
	 * 
	 * @param aWidth 横幅
	 * @param aHeight 縦幅
	 */
	public void setSize(final int aWidth, final int aHeight) {
		width = aWidth;
		height = aHeight;
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
	 * サイズを取得する。
	 * 
	 * @return サイズ
	 */
	public Size getSize() {
		return new Size(width, height);
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
	 * 位置に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addPosition(final int aValue) {
		x += aValue;
		y += aValue;
	}

	/**
	 * 位置に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addPosition(final float aValue) {
		x += aValue;
		y += aValue;
	}

	/**
	 * 位置に値を加算する。
	 * 
	 * @param aX X座標に加算する値
	 * @param aY Y座標に加算する値
	 */
	public void addPosition(final int aX, final int aY) {
		x += aX;
		y += aY;
	}

	/**
	 * 位置に値を加算する。
	 * 
	 * @param aX X座標に加算する値
	 * @param aY Y座標に加算する値
	 */
	public void addPosition(final float aX, final float aY) {
		x += aX;
		y += aY;
	}

	/**
	 * X座標に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addX(final int aValue) {
		x += aValue;
	}

	/**
	 * X座標に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addX(final float aValue) {
		x += aValue;
	}

	/**
	 * Y座標に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addY(final int aValue) {
		y += aValue;
	}

	/**
	 * Y座標に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addY(final float aValue) {
		y += aValue;
	}

	/**
	 * 位置に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractPosition(final int aValue) {
		x += aValue;
		y += aValue;
	}

	/**
	 * 位置に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractPosition(final float aValue) {
		x += aValue;
		y += aValue;
	}

	/**
	 * 位置に値を減算する。
	 * 
	 * @param aX X座標に減算する値
	 * @param aY Y座標に減算する値
	 */
	public void subtractPosition(final int aX, final int aY) {
		x += aX;
		y += aY;
	}

	/**
	 * 位置に値を減算する。
	 * 
	 * @param aX X座標に減算する値
	 * @param aY Y座標に減算する値
	 */
	public void subtractPosition(final float aX, final float aY) {
		x += aX;
		y += aY;
	}

	/**
	 * X座標に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractX(final int aValue) {
		x -= aValue;
	}

	/**
	 * X座標に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractX(final float aValue) {
		x -= aValue;
	}

	/**
	 * Y座標に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractY(final int aValue) {
		y -= aValue;
	}

	/**
	 * Y座標に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractY(final float aValue) {
		y -= aValue;
	}

	/**
	 * 位置に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplyPosition(final int aValue) {
		x *= aValue;
		y *= aValue;
	}

	/**
	 * 位置に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplyPosition(final float aValue) {
		x *= aValue;
		y *= aValue;
	}

	/**
	 * 位置に値を乗算する。
	 * 
	 * @param aX X座標に乗算する値
	 * @param aY Y座標に乗算する値
	 */
	public void multiplyPosition(final int aX, final int aY) {
		x *= aX;
		y *= aY;
	}

	/**
	 * 位置に値を乗算する。
	 * 
	 * @param aX X座標に乗算する値
	 * @param aY Y座標に乗算する値
	 */
	public void multiplyPosition(final float aX, final float aY) {
		x *= aX;
		y *= aY;
	}

	/**
	 * X座標に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplyX(final int aValue) {
		x *= aValue;
	}

	/**
	 * X座標に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplyX(final float aValue) {
		x *= aValue;
	}

	/**
	 * Y座標に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplyY(final int aValue) {
		y *= aValue;
	}

	/**
	 * Y座標に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplyY(final float aValue) {
		y *= aValue;
	}

	/**
	 * 位置に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void dividePosition(final int aValue) {
		x /= aValue;
		y /= aValue;
	}

	/**
	 * 位置に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void dividePosition(final float aValue) {
		x /= aValue;
		y /= aValue;
	}

	/**
	 * 位置に値を除算する。
	 * 
	 * @param aX X座標に除算する値
	 * @param aY Y座標に除算する値
	 */
	public void dividePosition(final int aX, final int aY) {
		x /= aX;
		y /= aY;
	}

	/**
	 * 位置に値を除算する。
	 * 
	 * @param aX X座標に除算する値
	 * @param aY Y座標に除算する値
	 */
	public void dividePosition(final float aX, final float aY) {
		x /= aX;
		y /= aY;
	}

	/**
	 * X座標に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divideX(final int aValue) {
		x /= aValue;
	}

	/**
	 * X座標に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divideX(final float aValue) {
		x /= aValue;
	}

	/**
	 * Y座標に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divideY(final int aValue) {
		y /= aValue;
	}

	/**
	 * Y座標に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divideY(final float aValue) {
		y /= aValue;
	}

	/**
	 * サイズに値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addSize(final int aValue) {
		width += aValue;
		height += aValue;
	}

	/**
	 * サイズに値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void addSize(final float aValue) {
		width += aValue;
		height += aValue;
	}

	/**
	 * サイズに値を加算する。
	 * 
	 * @param aWidth 横幅に加算する値
	 * @param aHeight 縦幅に加算する値
	 */
	public void addSize(final int aWidth, final int aHeight) {
		width += aWidth;
		height += aHeight;
	}

	/**
	 * サイズに値を加算する。
	 * 
	 * @param aWidth 横幅に加算する値
	 * @param aHeight 縦幅に加算する値
	 */
	public void addSize(final float aWidth, final float aHeight) {
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
	public void subtractSize(final int aValue) {
		width -= aValue;
		height -= aValue;
	}

	/**
	 * サイズに値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtractSize(final float aValue) {
		width -= aValue;
		height -= aValue;
	}

	/**
	 * サイズに値を減算する。
	 * 
	 * @param aWidth 横幅に減算する値
	 * @param aHeight 縦幅に減算する値
	 */
	public void subtractSize(final int aWidth, final int aHeight) {
		width -= aWidth;
		height -= aHeight;
	}

	/**
	 * サイズに値を減算する。
	 * 
	 * @param aWidth 横幅に減算する値
	 * @param aHeight 縦幅に減算する値
	 */
	public void subtractSize(final float aWidth, final float aHeight) {
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
	public void multiplySize(final int aValue) {
		width *= aValue;
		height *= aValue;
	}

	/**
	 * サイズに値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiplySize(final float aValue) {
		width *= aValue;
		height *= aValue;
	}

	/**
	 * サイズに値を乗算する。
	 * 
	 * @param aWidth 横幅に乗算する値
	 * @param aHeight 縦幅に乗算する値
	 */
	public void multiplySize(final int aWidth, final int aHeight) {
		width *= aWidth;
		height *= aHeight;
	}

	/**
	 * サイズに値を乗算する。
	 * 
	 * @param aWidth 横幅に乗算する値
	 * @param aHeight 縦幅に乗算する値
	 */
	public void multiplySize(final float aWidth, final float aHeight) {
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
	public void divideSize(final int aValue) {
		width /= aValue;
		height /= aValue;
	}

	/**
	 * サイズに値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divideSize(final float aValue) {
		width /= aValue;
		height /= aValue;
	}

	/**
	 * サイズに値を除算する。
	 * 
	 * @param aWidth 横幅に除算する値
	 * @param aHeight 縦幅に除算する値
	 */
	public void divideSize(final int aWidth, final int aHeight) {
		width /= aWidth;
		height /= aHeight;
	}

	/**
	 * サイズに値を除算する。
	 * 
	 * @param aWidth 横幅に除算する値
	 * @param aHeight 縦幅に除算する値
	 */
	public void divideSize(final float aWidth, final float aHeight) {
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
