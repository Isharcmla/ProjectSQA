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
import java.lang.NullPointerException;
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BorderArrangement_arrangeFR_66151503231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9348;
     Object term9518;

    public BorderArrangement_arrangeFR_66151503231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9348 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term9430 = newInstance(Class.forName("org.jfree.chart.title.PaintScaleLegend"));
        setField(term9348, term9348.getClass(), "topBlock", null);
        setField(term9348, term9348.getClass(), "bottomBlock", null);
        setField(term9348, term9348.getClass(), "leftBlock", null);
        setField(term9348, term9348.getClass(), "rightBlock", term9430);
        term9518 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term9518, term9518.getClass(), "width", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("org.jfree.chart.block.RectangleConstraint");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term9518;
        try {
            callMethod(klass, "arrangeFR", argTypes, term9348, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


