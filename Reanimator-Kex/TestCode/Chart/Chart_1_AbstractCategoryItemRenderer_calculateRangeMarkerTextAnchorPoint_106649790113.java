package org.jfree.chart.renderer.category;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.jfree.chart.renderer.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AbstractCategoryItemRenderer_calculateRangeMarkerTextAnchorPoint_106649790113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term827;
     Object term840;
     Object term865;
     Object term878;

    public AbstractCategoryItemRenderer_calculateRangeMarkerTextAnchorPoint_106649790113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term827 = newInstance(Class.forName("org.jfree.chart.plot.PlotOrientation"));
        setField(term827, term827.getClass(), "name", "LQFpaHEwXR");
        term840 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term841 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        setField(term841, term841.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term840, term840.getClass(), "unitType", term841);
        setDoubleField(term840, term840.getClass(), "top", 1.0);
        setDoubleField(term840, term840.getClass(), "left", 1.0);
        setDoubleField(term840, term840.getClass(), "bottom", 1.0);
        setDoubleField(term840, term840.getClass(), "right", 1.0);
        term865 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term865, term865.getClass(), "name", "oVcInYnLWB");
        term878 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        setField(term878, term878.getClass(), "name", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotOrientation");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[4] = Class.forName("org.jfree.chart.util.RectangleInsets");
        argTypes[5] = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
        argTypes[6] = Class.forName("org.jfree.chart.util.RectangleAnchor");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term827;
        args[2] = null;
        args[3] = null;
        args[4] = term840;
        args[5] = term865;
        args[6] = term878;
        try {
            callMethod(klass, "calculateRangeMarkerTextAnchorPoint", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
