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

public class BorderArrangement_arrangeRR_1759471585125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45767;
     Object term45891;

    public BorderArrangement_arrangeRR_1759471585125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45767 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term45845 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        setField(term45767, term45767.getClass(), "topBlock", null);
        setField(term45767, term45767.getClass(), "bottomBlock", term45845);
        term45891 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term45891, term45891.getClass(), "lower", 7.0076010204569272E18);
        setDoubleField(term45891, term45891.getClass(), "upper", 8.1109829291626988E18);
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
        args[2] = term45891;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term45767, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


