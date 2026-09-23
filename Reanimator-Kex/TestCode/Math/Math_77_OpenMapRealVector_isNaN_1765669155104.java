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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class OpenMapRealVector_isNaN_1765669155104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7835;
     Object term93066;

    public OpenMapRealVector_isNaN_1765669155104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7835 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term7836 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term7837 = (int[]) newIntArray(32);
        double[] term7870 = (double[]) newDoubleArray(32);
        byte[] term7903 = (byte[]) newByteArray(32);
        setField(term7836, term7836.getClass(), "keys", term7837);
        setField(term7836, term7836.getClass(), "values", term7870);
        setField(term7836, term7836.getClass(), "states", term7903);
        setDoubleField(term7836, term7836.getClass(), "missingEntries", 0.0);
        setIntField(term7836, term7836.getClass(), "size", 0);
        setIntField(term7836, term7836.getClass(), "mask", 31);
        setIntField(term7836, term7836.getClass(), "count", 0);
        setField(term7835, term7835.getClass(), "entries", term7836);
        setIntField(term7835, term7835.getClass(), "virtualSize", 579005622);
        setDoubleField(term7835, term7835.getClass(), "epsilon", 1.0E-12);
        term93066 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term93067 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term93068 = (int[]) newIntArray(32);
        double[] term93069 = (double[]) newDoubleArray(32);
        byte[] term93070 = (byte[]) newByteArray(32);
        setField(term93067, term93067.getClass(), "keys", term93068);
        setField(term93067, term93067.getClass(), "values", term93069);
        setField(term93067, term93067.getClass(), "states", term93070);
        setDoubleField(term93067, term93067.getClass(), "missingEntries", 0.0);
        setIntField(term93067, term93067.getClass(), "size", 0);
        setIntField(term93067, term93067.getClass(), "mask", 31);
        setIntField(term93067, term93067.getClass(), "count", 0);
        setField(term93066, term93066.getClass(), "entries", term93067);
        setIntField(term93066, term93066.getClass(), "virtualSize", 579005622);
        setDoubleField(term93066, term93066.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNaN", argTypes, term7835, args);
        assertTrue(recursiveEquals(term7835, term93066));
        assertTrue(recursiveEquals(retValue, false));
    }

};


