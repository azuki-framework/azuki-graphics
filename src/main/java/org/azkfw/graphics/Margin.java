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
 * このクラスは、Margin情報を格納したクラスです。
 * 
 * @since 1.1.0
 * @version 1.1.0 2014/06/15
 * @author Kawakicchi
 */
public class Margin {

	/**
	 * 上部マージン値
	 */
	private float top;

	/**
	 * 下部マージン値
	 */
	private float bottom;

	/**
	 * 左部マージン値
	 */
	private float left;

	/**
	 * 右部マージン値
	 */
	private float right;

	/**
	 * コンストラクタ
	 */
	public Margin() {
		top = 0.f;
		bottom = 0.f;
		left = 0.f;
		right = 0.f;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param aTop top
	 * @param aBottom bottom
	 * @param aLeft left
	 * @param aRight right
	 */
	public Margin(final float aTop, final float aBottom, final float aLeft, final float aRight) {
		top = aTop;
		bottom = aBottom;
		left = aLeft;
		right = aRight;
	}

	/**
	 * 上部マージン値を設定する。
	 * 
	 * @param aTop マージン値
	 */
	public void setTop(final float aTop) {
		top = aTop;
	}

	/**
	 * 上部マージン値を取得する。
	 * 
	 * @return マージン値
	 */
	public float getTop() {
		return top;
	}

	/**
	 * 下部マージン値を設定する。
	 * 
	 * @param aBottom マージン値
	 */
	public void setBottom(final float aBottom) {
		bottom = aBottom;
	}

	/**
	 * 下部マージン値を取得する。
	 * 
	 * @return マージン値
	 */
	public float getBottom() {
		return bottom;
	}

	/**
	 * 左部マージン値を設定する。
	 * 
	 * @param aLeft マージン値
	 */
	public void setLeft(final float aLeft) {
		left = aLeft;
	}

	/**
	 * 左部マージン値を取得する。
	 * 
	 * @return マージン値
	 */
	public float getLeft() {
		return left;
	}

	/**
	 * 右部マージン値を設定する。
	 * 
	 * @param aRight マージン値
	 */
	public void setRight(final float aRight) {
		right = aRight;
	}

	/**
	 * 右部マージン値を取得する。
	 * 
	 * @return マージン値
	 */
	public float getRight() {
		return right;
	}

}
