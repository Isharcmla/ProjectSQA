package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ArrayRealVector_setSubVector_779868761194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401;
     Object term403;

    public ArrayRealVector_setSubVector_779868761194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term402 = (double[]) newDoubleArray(0);
        setField(term401, term401.getClass(), "data", term402);
        term403 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[2];
        args[0] = term403;
        args[1] = null;
        try {
            callMethod(klass, "setSubVector", argTypes, term401, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


