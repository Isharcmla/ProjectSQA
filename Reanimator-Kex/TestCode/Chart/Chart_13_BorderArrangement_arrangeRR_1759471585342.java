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

public class BorderArrangement_arrangeRR_1759471585342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143725;
     Object term143847;
     Object term143893;

    public BorderArrangement_arrangeRR_1759471585342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143725 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term143801 = newInstance(Class.forName("org.jfree.chart.title.LegendGraphic"));
        setField(term143725, term143725.getClass(), "topBlock", null);
        setField(term143725, term143725.getClass(), "bottomBlock", null);
        setField(term143725, term143725.getClass(), "leftBlock", null);
        setField(term143725, term143725.getClass(), "rightBlock", term143801);
        term143847 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term143847, term143847.getClass(), "lower", 9.2188684372274053E18);
        setDoubleField(term143847, term143847.getClass(), "upper", 4.6073231562883727E18);
        term143893 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term143893, term143893.getClass(), "lower", 9.4181527207385498E17);
        setDoubleField(term143893, term143893.getClass(), "upper", 2.09023317705333146E18);
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
        args[1] = term143847;
        args[2] = term143893;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term143725, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


