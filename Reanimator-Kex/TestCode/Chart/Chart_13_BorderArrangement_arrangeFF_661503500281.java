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

public class BorderArrangement_arrangeFF_661503500281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103747;
     Object term103987;

    public BorderArrangement_arrangeFF_661503500281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103747 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term103817 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        Object term103899 = newInstance(Class.forName("org.jfree.chart.title.PaintScaleLegend"));
        setField(term103747, term103747.getClass(), "topBlock", term103817);
        setField(term103747, term103747.getClass(), "bottomBlock", null);
        setField(term103747, term103747.getClass(), "leftBlock", null);
        setField(term103747, term103747.getClass(), "rightBlock", null);
        setField(term103747, term103747.getClass(), "centerBlock", term103899);
        term103987 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term103987, term103987.getClass(), "width", 103.0);
        setDoubleField(term103987, term103987.getClass(), "height", 3.8280596832649216E16);
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
        args[2] = term103987;
        try {
            callMethod(klass, "arrangeFF", argTypes, term103747, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


