package org.jfree.data.general;

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
import static org.jfree.data.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.lang.Integer;

public class DatasetUtilities_sampleFunction2DToSeries_30508419665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180;
     Object term182;
     Object term184;

    public DatasetUtilities_sampleFunction2DToSeries_30508419665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180 = new Double(0.6300849762307866);
        term182 = new Double(0.9737083944266686);
        term184 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.jfree.data.function.Function2D");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term180;
        args[2] = term182;
        args[3] = term184;
        args[4] = null;
        try {
            callMethod(klass, "sampleFunction2DToSeries", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


