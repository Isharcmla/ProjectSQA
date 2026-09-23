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

public class BorderArrangement_arrangeRR_1759471585323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118400;
     Object term118524;
     Object term118570;

    public BorderArrangement_arrangeRR_1759471585323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118400 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term118478 = newInstance(Class.forName("org.jfree.chart.title.CompositeTitle"));
        setField(term118400, term118400.getClass(), "topBlock", null);
        setField(term118400, term118400.getClass(), "bottomBlock", null);
        setField(term118400, term118400.getClass(), "leftBlock", null);
        setField(term118400, term118400.getClass(), "rightBlock", term118478);
        term118524 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term118524, term118524.getClass(), "lower", 0.0);
        setDoubleField(term118524, term118524.getClass(), "upper", 9.2211202371081994E18);
        term118570 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term118570, term118570.getClass(), "lower", 4.503599627371017E15);
        setDoubleField(term118570, term118570.getClass(), "upper", 1.8014398509482244E16);
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
        args[1] = term118524;
        args[2] = term118570;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term118400, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


