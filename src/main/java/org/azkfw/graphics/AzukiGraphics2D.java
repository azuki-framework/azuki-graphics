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

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;

/**
 * このクラスは、グラフィクス機能を実装する為の基底クラスです。
 * 
 * @since 1.0.0
 * @version 1.0.0 2013/06/13
 * @author Kawakicchi
 */
public class AzukiGraphics2D implements Graphics {

	/** Graphics2D */
	private Graphics2D graphics;

	/**
	 * コンストラクタ
	 * 
	 * @param aGraphics Graphics2D
	 */
	public AzukiGraphics2D(final Graphics2D aGraphics) {
		graphics = aGraphics;
	}

	/**
	 * グラフィックスを取得する。
	 * 
	 * @return グラフィックスを取得する。
	 */
	protected final Graphics2D getGraphics() {
		return graphics;
	}

	public FontMetrics getFontMetrics(final Font aFont) {
		return graphics.getFontMetrics(aFont);
	}

	public void setColor(final Color aColor) {
		graphics.setColor(aColor);
	}

	public void setFont(final Font aFont) {
		graphics.setFont(aFont);
	}

	public void setFont(final Font aFont, final Color aColor) {
		graphics.setFont(aFont);
		graphics.setColor(aColor);
	}

	public void setStroke(final Stroke aStroke) {
		graphics.setStroke(aStroke);
	}

	public void setStroke(final Stroke aStroke, final Color aColor) {
		graphics.setStroke(aStroke);
		graphics.setColor(aColor);
	}

	public void setClip(final Shape aShape) {
		graphics.setClip(aShape);
	}

	public void setClip(final float aX, final float aY, final float aWidth, final float aHeight) {
		graphics.setClip((int) aX, (int) aY, (int) aWidth, (int) aHeight);
	}

	public void clearClip() {
		graphics.setClip(null);
	}

	public void drawString(final String aString, final float aX, final float aY) {
		graphics.drawString(aString, (int) aX, (int) aY);
	}

	public void drawStringA(final String aString, final float aX, final float aY) {
		FontMetrics fm = graphics.getFontMetrics();
		graphics.drawString(aString, (int) aX, (int) (aY + fm.getMaxAscent()));
	}

	public void drawLine(final float aX1, final float aY1, final float aX2, final float aY2) {
		graphics.drawLine((int) aX1, (int) aY1, (int) aX2, (int) aY2);
	}

	public void drawRect(final float aX, final float aY, final float aWidth, final float aHeight) {
		graphics.drawRect((int) aX, (int) aY, (int) aWidth, (int) aHeight);
	}

	public void fillRect(final float aX, final float aY, final float aWidth, final float aHeight) {
		graphics.fillRect((int) aX, (int) aY, (int) aWidth, (int) aHeight);
	}

	public void drawArc(final float aX, final float aY, final float aWidth, final float aHeight, final float aStartAngle, final float aArcAngle) {
		graphics.drawArc((int) aX, (int) aY, (int) aWidth, (int) aHeight, (int) aStartAngle, (int) aArcAngle);
	}

	public void fillArc(final float aX, final float aY, final float aWidth, final float aHeight, final float aStartAngle, final float aArcAngle) {
		graphics.fillArc((int) aX, (int) aY, (int) aWidth, (int) aHeight, (int) aStartAngle, (int) aArcAngle);
	}

	public void drawPolygon(final float[] aXPoints, final float[] aYPoints, final int aNPoints) {
		int[] xPoints = new int[aNPoints];
		int[] yPoints = new int[aNPoints];
		for (int i = 0; i < aNPoints; i++) {
			xPoints[i] = (int) aXPoints[i];
			yPoints[i] = (int) aYPoints[i];
		}
		graphics.drawPolygon(xPoints, yPoints, aNPoints);
	}

	public void fillPolygon(final Polygon aPolygon) {
		graphics.fillPolygon(aPolygon);
	}

	public void fillPolygon(final int[] aXPoints, final int[] aYPoints, final int aNPoints) {
		graphics.fillPolygon(aXPoints, aYPoints, aNPoints);
	}

	public void fillPolygon(final float[] aXPoints, final float[] aYPoints, final int aNPoints) {
		int[] xPoints = new int[aNPoints];
		int[] yPoints = new int[aNPoints];
		for (int i = 0; i < aNPoints; i++) {
			xPoints[i] = (int) aXPoints[i];
			yPoints[i] = (int) aYPoints[i];
		}
		graphics.fillPolygon(xPoints, yPoints, aNPoints);
	}

	public void drawPolyline(final int[] aXPoints, final int[] aYPoints, final int aNPoints) {
		graphics.drawPolyline(aXPoints, aYPoints, aNPoints);
	}

	public void drawPolyline(final float[] aXPoints, final float[] aYPoints, final int aNPoints) {
		int[] xPoints = new int[aNPoints];
		int[] yPoints = new int[aNPoints];
		for (int i = 0; i < aNPoints; i++) {
			xPoints[i] = (int) aXPoints[i];
			yPoints[i] = (int) aYPoints[i];
		}
		graphics.drawPolyline(xPoints, yPoints, aNPoints);
	}

	public void setPaint(final GradientPaint aPaint) {
		graphics.setPaint(aPaint);
	}

}
