package org.jfree.chart.plot;

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
import java.lang.NoClassDefFoundError;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class XYPlot_drawRangeGridlines_963868845379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term826;

    public XYPlot_drawRangeGridlines_963868845379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term829 = newInstance(Class.forName("java.lang.Object"));
        Object term831 = newInstance(Class.forName("java.lang.Object"));
        Object term833 = newInstance(Class.forName("java.lang.Object"));
        term826 = new LinkedList();
        ((LinkedList) term826).add(term829);
        ((LinkedList) term826).add(term831);
        ((LinkedList) term826).add(term833);
        ((LinkedList) term826).add((Object)null);
        ((LinkedList) term826).add((Object)null);
        ((LinkedList) term826).add((Object)null);
        ((LinkedList) term826).add((Object)null);
        ((LinkedList) term826).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term826;
        try {
            callMethod(klass, "drawRangeGridlines", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


