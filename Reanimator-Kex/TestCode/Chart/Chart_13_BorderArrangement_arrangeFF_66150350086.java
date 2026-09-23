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
import java.lang.Object;

public class BorderArrangement_arrangeFF_66150350086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31645;
     Object term31801;

    public BorderArrangement_arrangeFF_66150350086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31645 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term31713 = newInstance(Class.forName("org.jfree.chart.title.DateTitle"));
        setField(term31645, term31645.getClass(), "topBlock", null);
        setField(term31645, term31645.getClass(), "bottomBlock", null);
        setField(term31645, term31645.getClass(), "leftBlock", term31713);
        term31801 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term31801, term31801.getClass(), "width", 4.503599627370497E15);
        setDoubleField(term31801, term31801.getClass(), "height", 0.0);
        setField(null, Class.forName("org.jfree.chart.block.LengthConstraintType"), "name", "LengthConstraintType.FIXED");
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
        args[2] = term31801;
        callMethod(klass, "arrangeFF", argTypes, term31645, args);
    }

};


