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
 * このクラスは、Padding情報を格納したクラスです。
 * 
 * @since 1.1.0
 * @version 1.1.0 2014/06/26
 * @author Kawakicchi
 */
public class Padding {

	/**
	 * 上部パディング値
	 */
	private float top;

	/**
	 * 下部パディング値
	 */
	private float bottom;

	/**
	 * 左部パディング値
	 */
	private float left;

	/**
	 * 右部パディング値
	 */
	private float right;

	/**
	 * コンストラクタ
	 */
	public Padding() {
		top = 0.f;
		bottom = 0.f;
		left = 0.f;
		right = 0.f;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aTop 上部パディング値
	 * @param aBottom 下部パディング値
	 * @param aLeft 左部パディング値
	 * @param aRight 右部パディング値
	 */
	public Padding(final float aTop, final float aBottom, final float aLeft, final float aRight) {
		top = aTop;
		bottom = aBottom;
		left = aLeft;
		right = aRight;
	}

	/**
	 * 上部パディング値を設定する。
	 * 
	 * @param aTop パディング値
	 */
	public void setTop(final float aTop) {
		top = aTop;
	}

	/**
	 * 上部パディング値を取得する。
	 * 
	 * @return パディング値
	 */
	public float getTop() {
		return top;
	}

	/**
	 * 下部パディング値を設定する。
	 * 
	 * @param aBottom パディング値
	 */
	public void setBottom(final float aBottom) {
		bottom = aBottom;
	}

	/**
	 * 下部パディング値を取得する。
	 * 
	 * @return パディング値
	 */
	public float getBottom() {
		return bottom;
	}

	/**
	 * 左部パディング値を設定する。
	 * 
	 * @param aLeft パディング値
	 */
	public void setLeft(final float aLeft) {
		left = aLeft;
	}

	/**
	 * 左部パディング値を取得する。
	 * 
	 * @return パディング値
	 */
	public float getLeft() {
		return left;
	}

	/**
	 * 右部パディング値を設定する。
	 * 
	 * @param aRight パディング値
	 */
	public void setRight(final float aRight) {
		right = aRight;
	}

	/**
	 * 右部パディング値を取得する。
	 * 
	 * @return パディング値
	 */
	public float getRight() {
		return right;
	}

	/**
	 * 上部パディング値に値を加算する。
	 * 
	 * @param aValue 加算値
	 */
	public void addTop(final float aValue) {
		top += aValue;
	}

	/**
	 * 下部パディング値に値を加算する。
	 * 
	 * @param aValue 加算値
	 */
	public void addBottom(final float aValue) {
		bottom += aValue;
	}

	/**
	 * 左部パディング値に値を加算する。
	 * 
	 * @param aValue 加算値
	 */
	public void addLeft(final float aValue) {
		left += aValue;
	}

	/**
	 * 右部パディング値に値を加算する。
	 * 
	 * @param aValue 加算値
	 */
	public void addRight(final float aValue) {
		right += aValue;
	}
	
	/**
	 * 上部パディング値に値を除算する。
	 * 
	 * @param aValue 除算値
	 */
	public void subtractTop(final float aValue) {
		top -= aValue;
	}

	/**
	 * 下部パディング値に値を除算する。
	 * 
	 * @param aValue 除算値
	 */
	public void subtractBottom(final float aValue) {
		bottom -= aValue;
	}

	/**
	 * 左部パディング値に値を除算する。
	 * 
	 * @param aValue 除算値
	 */
	public void subtractLeft(final float aValue) {
		left -= aValue;
	}

	/**
	 * 右部パディング値に値を除算する。
	 * 
	 * @param aValue 除算値
	 */
	public void subtractRight(final float aValue) {
		right -= aValue;
	}

	/**
	 * 上下パディング値の合計を取得する。
	 * 
	 * @return 上下パディング値合計
	 */
	public float getVerticalSize() {
		return top + bottom;
	}

	/**
	 * 左右パディング値の合計を取得する。
	 * 
	 * @return 左右パディング値合計
	 */
	public float getHorizontalSize() {
		return left + right;
	}
}
