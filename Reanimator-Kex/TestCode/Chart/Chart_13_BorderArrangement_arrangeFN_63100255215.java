package org.jfree.chart.block;

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
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.block.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Double;

public class BorderArrangement_arrangeFN_63100255215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359;
     Object term360;
     Object term414;
     Object term5261;
     Object term5262;
     Object term5258;

    public BorderArrangement_arrangeFN_63100255215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term359, term359.getClass(), "centerBlock", null);
        setField(term359, term359.getClass(), "topBlock", null);
        setField(term359, term359.getClass(), "bottomBlock", null);
        setField(term359, term359.getClass(), "leftBlock", null);
        setField(term359, term359.getClass(), "rightBlock", null);
        ArrayList term361 = new ArrayList();
        term360 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        Object term365 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term378 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term379 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term403 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term404 = newInstance(Class.forName("java.awt.Color"));
        Object term409 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        setField(term360, term360.getClass(), "blocks", term361);
        setField(term365, term365.getClass(), "centerBlock", null);
        setField(term365, term365.getClass(), "topBlock", null);
        setField(term365, term365.getClass(), "bottomBlock", null);
        setField(term365, term365.getClass(), "leftBlock", null);
        setField(term365, term365.getClass(), "rightBlock", null);
        setField(term360, term360.getClass(), "arrangement", term365);
        setField(term360, term360.getClass(), "id", "MjGYSRKTNF");
        setField(term379, term379.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term378, term378.getClass(), "unitType", term379);
        setDoubleField(term378, term378.getClass(), "top", 0.0);
        setDoubleField(term378, term378.getClass(), "left", 0.0);
        setDoubleField(term378, term378.getClass(), "bottom", 0.0);
        setDoubleField(term378, term378.getClass(), "right", 0.0);
        setField(term360, term360.getClass(), "margin", term378);
        setField(term403, term403.getClass(), "insets", term378);
        setIntField(term404, term404.getClass(), "value", -1);
        setField(term404, term404.getClass(), "frgbvalue", null);
        setField(term404, term404.getClass(), "fvalue", null);
        setFloatField(term404, term404.getClass(), "falpha", 0.0F);
        setField(term404, term404.getClass(), "cs", null);
        setField(term403, term403.getClass(), "paint", term404);
        setField(term360, term360.getClass(), "frame", term403);
        setField(term360, term360.getClass(), "padding", term378);
        setDoubleField(term360, term360.getClass(), "width", 0.6436713023569729);
        setDoubleField(term360, term360.getClass(), "height", 0.7332741045694002);
        setFloatField(term409, term409.getClass(), "x", 0.0F);
        setFloatField(term409, term409.getClass(), "y", 0.0F);
        setFloatField(term409, term409.getClass(), "width", 0.0F);
        setFloatField(term409, term409.getClass(), "height", 0.0F);
        setField(term360, term360.getClass(), "bounds", term409);
        term414 = new Double(0.4569171842750229);
        term5261 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term5261, term5261.getClass(), "centerBlock", null);
        setField(term5261, term5261.getClass(), "topBlock", null);
        setField(term5261, term5261.getClass(), "bottomBlock", null);
        setField(term5261, term5261.getClass(), "leftBlock", null);
        setField(term5261, term5261.getClass(), "rightBlock", null);
        ArrayList term5263 = new ArrayList();
        term5262 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        Object term5265 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term5268 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term5269 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term5272 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term5273 = newInstance(Class.forName("java.awt.Color"));
        Object term5274 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        setField(term5262, term5262.getClass(), "blocks", term5263);
        setField(term5265, term5265.getClass(), "centerBlock", null);
        setField(term5265, term5265.getClass(), "topBlock", null);
        setField(term5265, term5265.getClass(), "bottomBlock", null);
        setField(term5265, term5265.getClass(), "leftBlock", null);
        setField(term5265, term5265.getClass(), "rightBlock", null);
        setField(term5262, term5262.getClass(), "arrangement", term5265);
        setField(term5262, term5262.getClass(), "id", "MjGYSRKTNF");
        setField(term5269, term5269.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term5268, term5268.getClass(), "unitType", term5269);
        setDoubleField(term5268, term5268.getClass(), "top", 0.0);
        setDoubleField(term5268, term5268.getClass(), "left", 0.0);
        setDoubleField(term5268, term5268.getClass(), "bottom", 0.0);
        setDoubleField(term5268, term5268.getClass(), "right", 0.0);
        setField(term5262, term5262.getClass(), "margin", term5268);
        setField(term5272, term5272.getClass(), "insets", term5268);
        setIntField(term5273, term5273.getClass(), "value", -1);
        setField(term5273, term5273.getClass(), "frgbvalue", null);
        setField(term5273, term5273.getClass(), "fvalue", null);
        setFloatField(term5273, term5273.getClass(), "falpha", 0.0F);
        setField(term5273, term5273.getClass(), "cs", null);
        setField(term5272, term5272.getClass(), "paint", term5273);
        setField(term5262, term5262.getClass(), "frame", term5272);
        setField(term5262, term5262.getClass(), "padding", term5268);
        setDoubleField(term5262, term5262.getClass(), "width", 0.6436713023569729);
        setDoubleField(term5262, term5262.getClass(), "height", 0.7332741045694002);
        setFloatField(term5274, term5274.getClass(), "x", 0.0F);
        setFloatField(term5274, term5274.getClass(), "y", 0.0F);
        setFloatField(term5274, term5274.getClass(), "width", 0.0F);
        setFloatField(term5274, term5274.getClass(), "height", 0.0F);
        setField(term5262, term5262.getClass(), "bounds", term5274);
        term5258 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term5258, term5258.getClass(), "width", 0.4569171842750229);
        setDoubleField(term5258, term5258.getClass(), "height", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term360;
        args[1] = null;
        args[2] = term414;
        Object retValue = callMethod(klass, "arrangeFN", argTypes, term359, args);
        assertTrue(recursiveEquals(term359, term5261));
        assertTrue(recursiveEquals(term360, 0.4569171842750229));
        assertTrue(recursiveEquals(term414, null));
        assertTrue(recursiveEquals(retValue, term5258));
    }

};


