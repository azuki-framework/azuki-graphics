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

	private float x;
	private float y;
	private float width;
	private float height;

	/**
	 * コンストラクタ
	 */
	public Rect() {

	}

	/**
	 * コンストラクタ
	 * 
	 * @param aX x
	 * @param aY y
	 * @param aWidth width
	 * @param aHeight height
	 */
	public Rect(final float aX, final float aY, final float aWidth, final float aHeight) {
		x = aX;
		y = aY;
		width = aWidth;
		height = aHeight;
	}

	public void setPosition(final float aX, final float aY) {
		x = aX;
		y = aY;
	}

	public void setSize(final float aWidth, final float aHeight) {
		width = aWidth;
		height = aHeight;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public void setX(final float aX) {
		x = aX;
	}

	public void setY(final float aY) {
		y = aY;
	}

	public void setWidth(final float aWidth) {
		width = aWidth;
	}

	public void setHeight(final float aHeight) {
		height = aHeight;
	}

	public void addX(final float aValue) {
		x += aValue;
	}

	public void subtractX(final float aValue) {
		x -= aValue;
	}

	public void addY(final float aValue) {
		y += aValue;
	}

	public void subtractY(final float aValue) {
		y -= aValue;
	}

	public void addWidth(final float aValue) {
		width += aValue;
	}

	public void subtractWidth(final float aValue) {
		width -= aValue;
	}

	public void addHeight(final float aValue) {
		height += aValue;
	}

	public void subtractHeight(final float aValue) {
		height -= aValue;
	}

	public void addSize(final float aWidth, final float aHeight) {
		width += aWidth;
		height += aHeight;
	}

	public void subtractSize(final float aWidth, final float aHeight) {
		width -= aWidth;
		height -= aHeight;
	}
}
