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

public class BorderArrangement_arrangeRR_1759471585131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48034;
     Object term48150;
     Object term48196;

    public BorderArrangement_arrangeRR_1759471585131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48034 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term48104 = newInstance(Class.forName("org.jfree.chart.block.LabelBlock"));
        setField(term48034, term48034.getClass(), "topBlock", null);
        setField(term48034, term48034.getClass(), "bottomBlock", null);
        setField(term48034, term48034.getClass(), "leftBlock", null);
        setField(term48034, term48034.getClass(), "rightBlock", term48104);
        term48150 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term48150, term48150.getClass(), "lower", -9.223372036854776E18);
        setDoubleField(term48150, term48150.getClass(), "upper", 0.0);
        term48196 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term48196, term48196.getClass(), "lower", 3.459925598107861E18);
        setDoubleField(term48196, term48196.getClass(), "upper", 4.6162423948907643E18);
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
        args[1] = term48150;
        args[2] = term48196;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term48034, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


