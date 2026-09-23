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

public class BorderArrangement_arrangeNN_68919536113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;
     Object term141;
     Object term2124;
     Object term2125;
     Object term2064;

    public BorderArrangement_arrangeNN_68919536113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term140, term140.getClass(), "centerBlock", null);
        setField(term140, term140.getClass(), "topBlock", null);
        setField(term140, term140.getClass(), "bottomBlock", null);
        setField(term140, term140.getClass(), "leftBlock", null);
        setField(term140, term140.getClass(), "rightBlock", null);
        ArrayList term142 = new ArrayList();
        term141 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        Object term146 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term159 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term160 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term184 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term185 = newInstance(Class.forName("java.awt.Color"));
        Object term190 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        setField(term141, term141.getClass(), "blocks", term142);
        setField(term146, term146.getClass(), "centerBlock", null);
        setField(term146, term146.getClass(), "topBlock", null);
        setField(term146, term146.getClass(), "bottomBlock", null);
        setField(term146, term146.getClass(), "leftBlock", null);
        setField(term146, term146.getClass(), "rightBlock", null);
        setField(term141, term141.getClass(), "arrangement", term146);
        setField(term141, term141.getClass(), "id", "xxtlPwDYFs");
        setField(term160, term160.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term159, term159.getClass(), "unitType", term160);
        setDoubleField(term159, term159.getClass(), "top", 0.0);
        setDoubleField(term159, term159.getClass(), "left", 0.0);
        setDoubleField(term159, term159.getClass(), "bottom", 0.0);
        setDoubleField(term159, term159.getClass(), "right", 0.0);
        setField(term141, term141.getClass(), "margin", term159);
        setField(term184, term184.getClass(), "insets", term159);
        setIntField(term185, term185.getClass(), "value", -1);
        setField(term185, term185.getClass(), "frgbvalue", null);
        setField(term185, term185.getClass(), "fvalue", null);
        setFloatField(term185, term185.getClass(), "falpha", 0.0F);
        setField(term185, term185.getClass(), "cs", null);
        setField(term184, term184.getClass(), "paint", term185);
        setField(term141, term141.getClass(), "frame", term184);
        setField(term141, term141.getClass(), "padding", term159);
        setDoubleField(term141, term141.getClass(), "width", 0.6076495596892013);
        setDoubleField(term141, term141.getClass(), "height", 0.37773193782763337);
        setFloatField(term190, term190.getClass(), "x", 0.0F);
        setFloatField(term190, term190.getClass(), "y", 0.0F);
        setFloatField(term190, term190.getClass(), "width", 0.0F);
        setFloatField(term190, term190.getClass(), "height", 0.0F);
        setField(term141, term141.getClass(), "bounds", term190);
        term2124 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term2124, term2124.getClass(), "centerBlock", null);
        setField(term2124, term2124.getClass(), "topBlock", null);
        setField(term2124, term2124.getClass(), "bottomBlock", null);
        setField(term2124, term2124.getClass(), "leftBlock", null);
        setField(term2124, term2124.getClass(), "rightBlock", null);
        ArrayList term2126 = new ArrayList();
        term2125 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        Object term2128 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term2131 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2132 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term2135 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term2136 = newInstance(Class.forName("java.awt.Color"));
        Object term2137 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        setField(term2125, term2125.getClass(), "blocks", term2126);
        setField(term2128, term2128.getClass(), "centerBlock", null);
        setField(term2128, term2128.getClass(), "topBlock", null);
        setField(term2128, term2128.getClass(), "bottomBlock", null);
        setField(term2128, term2128.getClass(), "leftBlock", null);
        setField(term2128, term2128.getClass(), "rightBlock", null);
        setField(term2125, term2125.getClass(), "arrangement", term2128);
        setField(term2125, term2125.getClass(), "id", "xxtlPwDYFs");
        setField(term2132, term2132.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term2131, term2131.getClass(), "unitType", term2132);
        setDoubleField(term2131, term2131.getClass(), "top", 0.0);
        setDoubleField(term2131, term2131.getClass(), "left", 0.0);
        setDoubleField(term2131, term2131.getClass(), "bottom", 0.0);
        setDoubleField(term2131, term2131.getClass(), "right", 0.0);
        setField(term2125, term2125.getClass(), "margin", term2131);
        setField(term2135, term2135.getClass(), "insets", term2131);
        setIntField(term2136, term2136.getClass(), "value", -1);
        setField(term2136, term2136.getClass(), "frgbvalue", null);
        setField(term2136, term2136.getClass(), "fvalue", null);
        setFloatField(term2136, term2136.getClass(), "falpha", 0.0F);
        setField(term2136, term2136.getClass(), "cs", null);
        setField(term2135, term2135.getClass(), "paint", term2136);
        setField(term2125, term2125.getClass(), "frame", term2135);
        setField(term2125, term2125.getClass(), "padding", term2131);
        setDoubleField(term2125, term2125.getClass(), "width", 0.6076495596892013);
        setDoubleField(term2125, term2125.getClass(), "height", 0.37773193782763337);
        setFloatField(term2137, term2137.getClass(), "x", 0.0F);
        setFloatField(term2137, term2137.getClass(), "y", 0.0F);
        setFloatField(term2137, term2137.getClass(), "width", 0.0F);
        setFloatField(term2137, term2137.getClass(), "height", 0.0F);
        setField(term2125, term2125.getClass(), "bounds", term2137);
        term2064 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term2064, term2064.getClass(), "width", 0.0);
        setDoubleField(term2064, term2064.getClass(), "height", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        Object[] args = new Object[2];
        args[0] = term141;
        args[1] = null;
        Object retValue = callMethod(klass, "arrangeNN", argTypes, term140, args);
        assertTrue(recursiveEquals(term140, term2124));
        assertTrue(recursiveEquals(term141, term2125));
        assertTrue(recursiveEquals(retValue, term2064));
    }

};


