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
import java.lang.IllegalArgumentException;
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BorderArrangement_arrangeRR_1759471585346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145378;
     Object term145492;
     Object term145538;

    public BorderArrangement_arrangeRR_1759471585346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145378 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term145446 = newInstance(Class.forName("org.jfree.chart.title.DateTitle"));
        setField(term145378, term145378.getClass(), "topBlock", null);
        setField(term145378, term145378.getClass(), "bottomBlock", null);
        setField(term145378, term145378.getClass(), "leftBlock", null);
        setField(term145378, term145378.getClass(), "rightBlock", term145446);
        term145492 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term145492, term145492.getClass(), "lower", 9.2188684372274053E18);
        setDoubleField(term145492, term145492.getClass(), "upper", 4.6118267559157432E18);
        term145538 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term145538, term145538.getClass(), "lower", 64.0);
        setDoubleField(term145538, term145538.getClass(), "upper", 64.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("org.jfree.data.Range");
        argTypes[2] = Class.forName("org.jfree.data.Range");
        argTypes[3] = Class.forName("java.awt.Graphics2D");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term145492;
        args[2] = term145538;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term145378, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


