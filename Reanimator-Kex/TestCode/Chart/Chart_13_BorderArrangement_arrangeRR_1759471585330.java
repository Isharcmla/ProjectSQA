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

public class BorderArrangement_arrangeRR_1759471585330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138449;
     Object term138593;
     Object term138639;

    public BorderArrangement_arrangeRR_1759471585330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138449 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term138547 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term138449, term138449.getClass(), "topBlock", null);
        setField(term138449, term138449.getClass(), "bottomBlock", null);
        setField(term138449, term138449.getClass(), "leftBlock", null);
        setField(term138449, term138449.getClass(), "rightBlock", null);
        setField(term138449, term138449.getClass(), "centerBlock", term138547);
        term138593 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term138593, term138593.getClass(), "lower", 7.0076010201884918E18);
        setDoubleField(term138593, term138593.getClass(), "upper", 8.1109829288942633E18);
        term138639 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term138639, term138639.getClass(), "lower", 4.6116860184462787E18);
        setDoubleField(term138639, term138639.getClass(), "upper", 4.616189618132353E18);
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
        args[1] = term138593;
        args[2] = term138639;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term138449, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


