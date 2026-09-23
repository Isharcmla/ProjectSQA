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

public class BorderArrangement_arrangeRR_1759471585133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48718;
     Object term48846;

    public BorderArrangement_arrangeRR_1759471585133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48718 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term48800 = newInstance(Class.forName("org.jfree.chart.title.PaintScaleLegend"));
        setField(term48718, term48718.getClass(), "topBlock", null);
        setField(term48718, term48718.getClass(), "bottomBlock", term48800);
        term48846 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term48846, term48846.getClass(), "lower", -9.2166166374137201E18);
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
        args[2] = term48846;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term48718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


