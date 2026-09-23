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

public class BorderArrangement_arrangeFR_66151503285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30683;
     Object term30869;

    public BorderArrangement_arrangeFR_66151503285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30683 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term30781 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term30683, term30683.getClass(), "topBlock", null);
        setField(term30683, term30683.getClass(), "bottomBlock", null);
        setField(term30683, term30683.getClass(), "leftBlock", null);
        setField(term30683, term30683.getClass(), "rightBlock", term30781);
        term30869 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term30869, term30869.getClass(), "width", 7.205786891583488E16);
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
        args[2] = term30869;
        try {
            callMethod(klass, "arrangeFR", argTypes, term30683, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


