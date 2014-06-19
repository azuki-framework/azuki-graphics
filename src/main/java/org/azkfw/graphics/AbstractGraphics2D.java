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

import java.awt.Graphics2D;

/**
 * このクラスは、グラフィクス機能を実装する為の基底クラスです。
 * 
 * @since 1.0.0
 * @version 1.0.0 2013/06/13
 * @author Kawakicchi
 */
public abstract class AbstractGraphics2D implements Graphics {

	/** Graphics2D */
	private Graphics2D graphics;

	/**
	 * コンストラクタ
	 * 
	 * @param aGraphics Graphics2D
	 */
	public AbstractGraphics2D(final Graphics2D aGraphics) {
		graphics = aGraphics;
	}

	protected final Graphics2D getGraphics() {
		return graphics;
	}

	@Override
	public void draw(final float x, final float y) {
		doDraw(x, y);
	}

	/**
	 * 描画を行なう
	 * 
	 * @param x 描画するX座標
	 * @param y 描画するY座標
	 */
	protected abstract void doDraw(final float x, final float y);
}
