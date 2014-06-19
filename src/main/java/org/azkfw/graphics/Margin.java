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

	private float top;
	private float bottom;
	private float left;
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

	public void setTop(final float aTop) {
		top = aTop;
	}

	public float getTop() {
		return top;
	}

	public void setBottom(final float aBottom) {
		bottom = aBottom;
	}

	public float getBottom() {
		return bottom;
	}

	public void setLeft(final float aLeft) {
		left = aLeft;
	}

	public float getLeft() {
		return left;
	}

	public void setRight(final float aRight) {
		right = aRight;
	}

	public float getRight() {
		return right;
	}

}
