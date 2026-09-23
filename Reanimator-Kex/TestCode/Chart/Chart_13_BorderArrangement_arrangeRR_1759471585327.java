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

public class BorderArrangement_arrangeRR_1759471585327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119888;
     Object term119934;
     Object term119980;

    public BorderArrangement_arrangeRR_1759471585327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119888 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term119888, term119888.getClass(), "topBlock", null);
        setField(term119888, term119888.getClass(), "bottomBlock", null);
        setField(term119888, term119888.getClass(), "leftBlock", null);
        term119934 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term119934, term119934.getClass(), "lower", 0.0);
        setDoubleField(term119934, term119934.getClass(), "upper", -9.2166166374137201E18);
        term119980 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term119980, term119980.getClass(), "lower", 4.1863777452294216E18);
        setDoubleField(term119980, term119980.getClass(), "upper", 7.6766674607365304E18);
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
        args[1] = term119934;
        args[2] = term119980;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term119888, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


