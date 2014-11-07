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
 * このクラスは、Point情報を格納したクラスです。
 * 
 * @since 1.1.0
 * @version 1.1.0 2014/06/15
 * @author Kawakicchi
 */
public final class Point {

	/** X座標 */
	private float x;

	/** Y座標 */
	private float y;

	/**
	 * コンストラクタ
	 */
	public Point() {
		x = 0.f;
		y = 0.f;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aPoint Point情報
	 */
	public Point(final Point aPoint) {
		x = aPoint.x;
		y = aPoint.y;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aX X座標
	 * @param aY Y座標
	 */
	public Point(final int aX, final int aY) {
		x = aX;
		y = aY;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aX X座標
	 * @param aY Y座標
	 */
	public Point(final float aX, final float aY) {
		x = aX;
		y = aY;
	}

	/**
	 * 位置を指定する。
	 * 
	 * @param aX X座標
	 * @param aY Y座標
	 */
	public void set(final int aX, final int aY) {
		x = aX;
		y = aY;
	}

	/**
	 * 位置を指定する。
	 * 
	 * @param aX X座標
	 * @param aY Y座標
	 */
	public void set(final float aX, final float aY) {
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
	 * 位置に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void add(final int aValue) {
		x += aValue;
		y += aValue;
	}

	/**
	 * 位置に値を加算する。
	 * 
	 * @param aValue 加算する値
	 */
	public void add(final float aValue) {
		x += aValue;
		y += aValue;
	}

	/**
	 * 位置に値を加算する。
	 * 
	 * @param aX X座標に加算する値
	 * @param aY Y座標に加算する値
	 */
	public void add(final int aX, final int aY) {
		x += aX;
		y += aY;
	}

	/**
	 * 位置に値を加算する。
	 * 
	 * @param aX X座標に加算する値
	 * @param aY Y座標に加算する値
	 */
	public void add(final float aX, final float aY) {
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
	public void subtract(final int aValue) {
		x += aValue;
		y += aValue;
	}

	/**
	 * 位置に値を減算する。
	 * 
	 * @param aValue 減算する値
	 */
	public void subtract(final float aValue) {
		x += aValue;
		y += aValue;
	}

	/**
	 * 位置に値を減算する。
	 * 
	 * @param aX X座標に減算する値
	 * @param aY Y座標に減算する値
	 */
	public void subtract(final int aX, final int aY) {
		x += aX;
		y += aY;
	}

	/**
	 * 位置に値を減算する。
	 * 
	 * @param aX X座標に減算する値
	 * @param aY Y座標に減算する値
	 */
	public void subtract(final float aX, final float aY) {
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
	public void multiply(final int aValue) {
		x *= aValue;
		y *= aValue;
	}

	/**
	 * 位置に値を乗算する。
	 * 
	 * @param aValue 乗算する値
	 */
	public void multiply(final float aValue) {
		x *= aValue;
		y *= aValue;
	}

	/**
	 * 位置に値を乗算する。
	 * 
	 * @param aX X座標に乗算する値
	 * @param aY Y座標に乗算する値
	 */
	public void multiply(final int aX, final int aY) {
		x *= aX;
		y *= aY;
	}

	/**
	 * 位置に値を乗算する。
	 * 
	 * @param aX X座標に乗算する値
	 * @param aY Y座標に乗算する値
	 */
	public void multiply(final float aX, final float aY) {
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
	public void divide(final int aValue) {
		x /= aValue;
		y /= aValue;
	}

	/**
	 * 位置に値を除算する。
	 * 
	 * @param aValue 除算する値
	 */
	public void divide(final float aValue) {
		x /= aValue;
		y /= aValue;
	}

	/**
	 * 位置に値を除算する。
	 * 
	 * @param aX X座標に除算する値
	 * @param aY Y座標に除算する値
	 */
	public void divide(final int aX, final int aY) {
		x /= aX;
		y /= aY;
	}

	/**
	 * 位置に値を除算する。
	 * 
	 * @param aX X座標に除算する値
	 * @param aY Y座標に除算する値
	 */
	public void divide(final float aX, final float aY) {
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
}
