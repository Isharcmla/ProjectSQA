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

public class BorderArrangement_arrangeRR_1759471585249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91569;
     Object term91683;

    public BorderArrangement_arrangeRR_1759471585249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91569 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term91637 = newInstance(Class.forName("org.jfree.chart.title.DateTitle"));
        setField(term91569, term91569.getClass(), "topBlock", null);
        setField(term91569, term91569.getClass(), "bottomBlock", term91637);
        term91683 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term91683, term91683.getClass(), "lower", 1.8021407930909044E16);
        setDoubleField(term91683, term91683.getClass(), "upper", 4.6116979069002056E18);
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
        args[2] = term91683;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term91569, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


