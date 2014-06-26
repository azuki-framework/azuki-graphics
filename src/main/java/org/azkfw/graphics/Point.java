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

	/**
	 * X値
	 */
	private float x;

	/**
	 * Y値
	 */
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
	 * @param aX X値
	 * @param aY Y値
	 */
	public Point(final float aX, final float aY) {
		x = aX;
		y = aY;
	}

	/**
	 * X値を設定する。
	 * 
	 * @param aX X値
	 */
	public void setX(final float aX) {
		x = aX;
	}

	/**
	 * X値を取得する。
	 * 
	 * @return Y値
	 */
	public float getX() {
		return x;
	}

	/**
	 * Y値を設定する。
	 * 
	 * @param aY Y値
	 */
	public void setY(final float aY) {
		y = aY;
	}

	/**
	 * Y値を取得する。
	 * 
	 * @return Y値
	 */
	public float getY() {
		return y;
	}

	/**
	 * X値に値を加算する。
	 * 
	 * @param aValue 加算値
	 */
	public void addX(final float aValue) {
		x += aValue;
	}

	/**
	 * Y値に値を加算する。
	 * 
	 * @param aValue 加算値
	 */
	public void addY(final float aValue) {
		y += aValue;
	}

	/**
	 * X値に値を除算する。
	 * 
	 * @param aValue 除算値
	 */
	public void subtractX(final float aValue) {
		x -= aValue;
	}

	/**
	 * Y値に値を除算する。
	 * 
	 * @param aValue 除算値
	 */
	public void subtractY(final float aValue) {
		y -= aValue;
	}

	/**
	 * X値、Y値それぞれに値を加算する。
	 * 
	 * @param aX X値
	 * @param aY Y値
	 */
	public void add(final float aX, final float aY) {
		x += aX;
		y += aY;
	}

}
