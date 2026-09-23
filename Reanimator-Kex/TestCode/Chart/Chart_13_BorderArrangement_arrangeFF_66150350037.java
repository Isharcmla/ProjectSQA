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

public class BorderArrangement_arrangeFF_66150350037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12301;
     Object term12465;

    public BorderArrangement_arrangeFF_66150350037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12301 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term12377 = newInstance(Class.forName("org.jfree.chart.title.LegendGraphic"));
        setField(term12301, term12301.getClass(), "topBlock", null);
        setField(term12301, term12301.getClass(), "bottomBlock", null);
        setField(term12301, term12301.getClass(), "leftBlock", term12377);
        term12465 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term12465, term12465.getClass(), "width", 0.0);
        setDoubleField(term12465, term12465.getClass(), "height", 0.0);
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
        args[2] = term12465;
        try {
            callMethod(klass, "arrangeFF", argTypes, term12301, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


