package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_getDistance_157767565777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4330;

    public OpenMapRealVector_getDistance_157767565777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4330 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term4331 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term4332 = (int[]) newIntArray(32);
        double[] term4365 = (double[]) newDoubleArray(32);
        byte[] term4398 = (byte[]) newByteArray(32);
        setField(term4331, term4331.getClass(), "keys", term4332);
        setField(term4331, term4331.getClass(), "values", term4365);
        setField(term4331, term4331.getClass(), "states", term4398);
        setDoubleField(term4331, term4331.getClass(), "missingEntries", 0.0);
        setIntField(term4331, term4331.getClass(), "size", 0);
        setIntField(term4331, term4331.getClass(), "mask", 31);
        setIntField(term4331, term4331.getClass(), "count", 0);
        setField(term4330, term4330.getClass(), "entries", term4331);
        setIntField(term4330, term4330.getClass(), "virtualSize", -203030934);
        setDoubleField(term4330, term4330.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getDistance", argTypes, term4330, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


