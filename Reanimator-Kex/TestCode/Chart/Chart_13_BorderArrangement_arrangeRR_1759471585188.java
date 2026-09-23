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

public class BorderArrangement_arrangeRR_1759471585188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69282;
     Object term69404;
     Object term69450;

    public BorderArrangement_arrangeRR_1759471585188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69282 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term69358 = newInstance(Class.forName("org.jfree.chart.title.LegendGraphic"));
        setField(term69282, term69282.getClass(), "topBlock", null);
        setField(term69282, term69282.getClass(), "bottomBlock", null);
        setField(term69282, term69282.getClass(), "leftBlock", null);
        setField(term69282, term69282.getClass(), "rightBlock", null);
        setField(term69282, term69282.getClass(), "centerBlock", term69358);
        term69404 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term69404, term69404.getClass(), "lower", -9.2233720368547717E18);
        setDoubleField(term69404, term69404.getClass(), "upper", 0.0);
        term69450 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term69450, term69450.getClass(), "lower", 3.41292634223336E15);
        setDoubleField(term69450, term69450.getClass(), "upper", 3.41292634223336E15);
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
        args[1] = term69404;
        args[2] = term69450;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term69282, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


