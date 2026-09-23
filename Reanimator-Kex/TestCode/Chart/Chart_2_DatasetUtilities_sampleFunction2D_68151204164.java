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

public class DatasetUtilities_sampleFunction2D_68151204164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174;
     Object term176;
     Object term178;

    public DatasetUtilities_sampleFunction2D_68151204164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174 = new Double(0.6805867182029153);
        term176 = new Double(0.2852810965221698);
        term178 = new Integer(391863371);
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
        args[1] = term174;
        args[2] = term176;
        args[3] = term178;
        args[4] = null;
        try {
            callMethod(klass, "sampleFunction2D", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


