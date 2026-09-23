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

public class BorderArrangement_arrangeRR_1759471585223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81685;
     Object term81829;
     Object term81875;

    public BorderArrangement_arrangeRR_1759471585223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81685 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term81783 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term81685, term81685.getClass(), "topBlock", null);
        setField(term81685, term81685.getClass(), "bottomBlock", null);
        setField(term81685, term81685.getClass(), "leftBlock", null);
        setField(term81685, term81685.getClass(), "rightBlock", null);
        setField(term81685, term81685.getClass(), "centerBlock", term81783);
        term81829 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term81829, term81829.getClass(), "lower", -9.2233720368547717E18);
        setDoubleField(term81829, term81829.getClass(), "upper", 0.0);
        term81875 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term81875, term81875.getClass(), "lower", 3.41292634223336E15);
        setDoubleField(term81875, term81875.getClass(), "upper", 3.41292634223336E15);
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
        args[1] = term81829;
        args[2] = term81875;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term81685, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


