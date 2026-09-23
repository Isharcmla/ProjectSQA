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

public class BorderArrangement_arrange_88261419642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14050;
     Object term14128;
     Object term14216;

    public BorderArrangement_arrange_88261419642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14050 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        term14128 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        term14216 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term14306 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        setDoubleField(term14216, term14216.getClass(), "width", 0.0);
        setField(term14216, term14216.getClass(), "widthRange", null);
        setField(term14306, term14306.getClass(), "name", "LengthConstraintType.NONE");
        setField(term14216, term14216.getClass(), "widthConstraintType", term14306);
        setDoubleField(term14216, term14216.getClass(), "height", 0.0);
        setField(term14216, term14216.getClass(), "heightRange", null);
        setField(term14216, term14216.getClass(), "heightConstraintType", term14306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("org.jfree.chart.block.RectangleConstraint");
        Object[] args = new Object[3];
        args[0] = term14128;
        args[1] = null;
        args[2] = term14216;
        try {
            callMethod(klass, "arrange", argTypes, term14050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


