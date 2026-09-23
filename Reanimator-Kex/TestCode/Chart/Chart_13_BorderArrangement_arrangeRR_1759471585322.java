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
import static org.jfree.chart.block.EqualityUtils.*;

public class BorderArrangement_arrangeRR_1759471585322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118100;
     Object term118146;
     Object term118192;
     Object term135894;
     Object term135895;
     Object term135896;
     Object term135888;

    public BorderArrangement_arrangeRR_1759471585322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118100 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term118100, term118100.getClass(), "topBlock", null);
        setField(term118100, term118100.getClass(), "bottomBlock", null);
        setField(term118100, term118100.getClass(), "leftBlock", null);
        term118146 = newInstance(Class.forName("org.jfree.data.Range"));
        term118192 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term118192, term118192.getClass(), "lower", -9.223372036854776E18);
        setDoubleField(term118192, term118192.getClass(), "upper", 0.0);
        term135894 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term135894, term135894.getClass(), "centerBlock", null);
        setField(term135894, term135894.getClass(), "topBlock", null);
        setField(term135894, term135894.getClass(), "bottomBlock", null);
        setField(term135894, term135894.getClass(), "leftBlock", null);
        setField(term135894, term135894.getClass(), "rightBlock", null);
        term135895 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term135895, term135895.getClass(), "lower", -9.223372036854776E18);
        setDoubleField(term135895, term135895.getClass(), "upper", 0.0);
        term135896 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term135896, term135896.getClass(), "lower", 0.0);
        setDoubleField(term135896, term135896.getClass(), "upper", 0.0);
        term135888 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term135888, term135888.getClass(), "width", 0.0);
        setDoubleField(term135888, term135888.getClass(), "height", 0.0);
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
        args[1] = term118146;
        args[2] = term118192;
        args[3] = null;
        Object retValue = callMethod(klass, "arrangeRR", argTypes, term118100, args);
        assertTrue(recursiveEquals(term118100, term135894));
        assertTrue(recursiveEquals(term118146, term135896));
        assertTrue(recursiveEquals(term118192, null));
        assertTrue(recursiveEquals(retValue, term135888));
    }

};


