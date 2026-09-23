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
import java.lang.Object;

public class OpenMapRealVector_getLInfDistance_127006467099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7020;

    public OpenMapRealVector_getLInfDistance_127006467099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7020 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term7021 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term7022 = (int[]) newIntArray(32);
        double[] term7055 = (double[]) newDoubleArray(32);
        byte[] term7088 = (byte[]) newByteArray(32);
        setField(term7021, term7021.getClass(), "keys", term7022);
        setField(term7021, term7021.getClass(), "values", term7055);
        setField(term7021, term7021.getClass(), "states", term7088);
        setDoubleField(term7021, term7021.getClass(), "missingEntries", 0.0);
        setIntField(term7021, term7021.getClass(), "size", 0);
        setIntField(term7021, term7021.getClass(), "mask", 31);
        setIntField(term7021, term7021.getClass(), "count", 0);
        setField(term7020, term7020.getClass(), "entries", term7021);
        setIntField(term7020, term7020.getClass(), "virtualSize", 1876565163);
        setDoubleField(term7020, term7020.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLInfDistance", argTypes, term7020, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


