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

public class BorderArrangement_arrangeFF_661503500248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92003;
     Object term92159;

    public BorderArrangement_arrangeFF_661503500248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92003 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term92071 = newInstance(Class.forName("org.jfree.chart.title.DateTitle"));
        setField(term92003, term92003.getClass(), "topBlock", null);
        setField(term92003, term92003.getClass(), "bottomBlock", null);
        setField(term92003, term92003.getClass(), "leftBlock", null);
        setField(term92003, term92003.getClass(), "rightBlock", term92071);
        term92159 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term92159, term92159.getClass(), "width", 1.0);
        setDoubleField(term92159, term92159.getClass(), "height", 0.0);
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
        args[2] = term92159;
        callMethod(klass, "arrangeFF", argTypes, term92003, args);
    }

};


