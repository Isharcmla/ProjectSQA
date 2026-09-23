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

public class BorderArrangement_arrangeRR_1759471585302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113310;
     Object term113454;

    public BorderArrangement_arrangeRR_1759471585302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113310 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term113408 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term113310, term113310.getClass(), "topBlock", null);
        setField(term113310, term113310.getClass(), "bottomBlock", term113408);
        term113454 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term113454, term113454.getClass(), "lower", -2.3035912094000087E18);
        setDoubleField(term113454, term113454.getClass(), "upper", 0.0);
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
        args[1] = null;
        args[2] = term113454;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term113310, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


