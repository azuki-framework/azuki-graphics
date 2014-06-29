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
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;

/**
 * このインターフェースは、グラフィクス機能を表現するインターフェースです。
 * 
 * @since 1.0.0
 * @version 1.0.0 2013/06/13
 * @author Kawakicchi
 */
public interface Graphics {

	public FontMetrics getFontMetrics(final Font aFont);

	public void setColor(final Color aColor);

	public void setFont(final Font aFont);

	public void setFont(final Font aFont, final Color aColor);

	public void setStroke(final Stroke aStroke);

	public void setStroke(final Stroke aStroke, final Color aColor);

	public void setClip(final Shape aShape);

	public void setClip(final float aX, final float aY, final float aWidth, final float aHeight);

	public void clearClip();

	public void drawString(final String aString, final float aX, final float aY);

	public void drawStringA(final String aString, final float aX, final float aY);

	public void drawLine(final float aX1, final float aY1, final float aX2, final float aY2);

	public void drawRect(final Rect aRect);

	public void drawRect(final float aX, final float aY, final float aWidth, final float aHeight);

	public void fillRect(final Rect aRect);

	public void fillRect(final float aX, final float aY, final float aWidth, final float aHeight);

	public void drawArc(final float aX, final float aY, final float aWidth, final float aHeight, final float aStartAngle, final float aArcAngle);

	public void fillArc(final float aX, final float aY, final float aWidth, final float aHeight, final float aStartAngle, final float aArcAngle);

	public void drawPolygon(final float[] aXPoints, final float[] aYPoints, final int aNPoints);

	public void fillPolygon(final Polygon aPolygon);

	public void fillPolygon(final int[] aXPoints, final int[] aYPoints, final int aNPoints);

	public void fillPolygon(final float[] aXPoints, final float[] aYPoints, final int aNPoints);

	public void drawPolyline(final int[] aXPoints, final int[] aYPoints, final int aNPoints);

	public void drawPolyline(final float[] aXPoints, final float[] aYPoints, final int aNPoints);

	public void setPaint(final GradientPaint aPaint);

}
