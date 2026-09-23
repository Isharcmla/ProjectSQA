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

public class BorderArrangement_arrangeRR_1759471585308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115590;
     Object term115636;
     Object term115682;

    public BorderArrangement_arrangeRR_1759471585308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115590 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term115590, term115590.getClass(), "topBlock", null);
        setField(term115590, term115590.getClass(), "bottomBlock", null);
        setField(term115590, term115590.getClass(), "leftBlock", null);
        term115636 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term115636, term115636.getClass(), "lower", 4.6139378182410732E18);
        setDoubleField(term115636, term115636.getClass(), "upper", -9.2166166374137201E18);
        term115682 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term115682, term115682.getClass(), "lower", 4.50359962737056E15);
        setDoubleField(term115682, term115682.getClass(), "upper", 1.15292150460684698E18);
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
        args[1] = term115636;
        args[2] = term115682;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term115590, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


