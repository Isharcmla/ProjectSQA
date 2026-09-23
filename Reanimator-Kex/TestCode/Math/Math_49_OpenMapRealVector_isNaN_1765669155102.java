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

public class OpenMapRealVector_isNaN_1765669155102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7632;
     Object term86953;

    public OpenMapRealVector_isNaN_1765669155102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7632 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term7633 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term7634 = (int[]) newIntArray(32);
        double[] term7667 = (double[]) newDoubleArray(32);
        byte[] term7700 = (byte[]) newByteArray(32);
        setField(term7633, term7633.getClass(), "keys", term7634);
        setField(term7633, term7633.getClass(), "values", term7667);
        setField(term7633, term7633.getClass(), "states", term7700);
        setDoubleField(term7633, term7633.getClass(), "missingEntries", 0.0);
        setIntField(term7633, term7633.getClass(), "size", 0);
        setIntField(term7633, term7633.getClass(), "mask", 31);
        setIntField(term7633, term7633.getClass(), "count", 0);
        setField(term7632, term7632.getClass(), "entries", term7633);
        setIntField(term7632, term7632.getClass(), "virtualSize", -1968847291);
        setDoubleField(term7632, term7632.getClass(), "epsilon", 1.0E-12);
        term86953 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term86954 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term86955 = (int[]) newIntArray(32);
        double[] term86956 = (double[]) newDoubleArray(32);
        byte[] term86957 = (byte[]) newByteArray(32);
        setField(term86954, term86954.getClass(), "keys", term86955);
        setField(term86954, term86954.getClass(), "values", term86956);
        setField(term86954, term86954.getClass(), "states", term86957);
        setDoubleField(term86954, term86954.getClass(), "missingEntries", 0.0);
        setIntField(term86954, term86954.getClass(), "size", 0);
        setIntField(term86954, term86954.getClass(), "mask", 31);
        setIntField(term86954, term86954.getClass(), "count", 0);
        setField(term86953, term86953.getClass(), "entries", term86954);
        setIntField(term86953, term86953.getClass(), "virtualSize", -1968847291);
        setDoubleField(term86953, term86953.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNaN", argTypes, term7632, args);
        assertTrue(recursiveEquals(term7632, term86953));
        assertTrue(recursiveEquals(retValue, false));
    }

};


