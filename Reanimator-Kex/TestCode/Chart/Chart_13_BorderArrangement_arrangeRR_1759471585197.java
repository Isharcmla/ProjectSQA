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

public class BorderArrangement_arrangeRR_1759471585197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72662;
     Object term72786;

    public BorderArrangement_arrangeRR_1759471585197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72662 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term72740 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        setField(term72662, term72662.getClass(), "topBlock", null);
        setField(term72662, term72662.getClass(), "bottomBlock", term72740);
        term72786 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term72786, term72786.getClass(), "lower", 2.251799813685248E15);
        setDoubleField(term72786, term72786.getClass(), "upper", 9.2188684372274053E18);
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
        args[2] = term72786;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term72662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


