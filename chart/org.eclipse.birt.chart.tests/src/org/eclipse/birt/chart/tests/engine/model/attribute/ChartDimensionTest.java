/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.eclipse.birt.chart.tests.engine.model.attribute;

import junit.framework.TestCase;
import org.eclipse.birt.chart.model.attribute.ChartDimension;

public class ChartDimensionTest extends TestCase {
	
	public void testConstant() 
	{		
		assertEquals( ChartDimension.TWO_DIMENSIONAL, ChartDimension.TWO_DIMENSIONAL_LITERAL.getValue() );
		assertEquals( ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH, ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH_LITERAL.getValue() );	
		assertEquals( ChartDimension.THREE_DIMENSIONAL, ChartDimension.THREE_DIMENSIONAL_LITERAL.getValue() );
	}
	
	public void testGet() 
	{
		assertEquals( ChartDimension.TWO_DIMENSIONAL_LITERAL, ChartDimension.get(ChartDimension.TWO_DIMENSIONAL) );
		assertEquals( ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH_LITERAL, ChartDimension.get(ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH) );
		
		assertEquals( ChartDimension.TWO_DIMENSIONAL_LITERAL, ChartDimension.get("Two_Dimensional") ); //$NON-NLS-1$
		assertEquals( ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH_LITERAL, ChartDimension.get("Two_Dimensional_With_Depth") ); //$NON-NLS-1$
		assertEquals( ChartDimension.THREE_DIMENSIONAL_LITERAL, ChartDimension.get("Three_Dimensional") ); //$NON-NLS-1$
		
		assertNull(ChartDimension.get("No Match") ); //$NON-NLS-1$
	}
}
