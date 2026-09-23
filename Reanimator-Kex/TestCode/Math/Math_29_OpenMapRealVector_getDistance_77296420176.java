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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.linear.EqualityUtils.*;
import java.lang.Object;

public class OpenMapRealVector_getDistance_77296420176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3924;
     Object term4031;
     Object term40958;
     Object term40963;

    public OpenMapRealVector_getDistance_77296420176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3924 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term3925 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term3926 = (int[]) newIntArray(32);
        double[] term3959 = (double[]) newDoubleArray(32);
        byte[] term3992 = (byte[]) newByteArray(32);
        setField(term3925, term3925.getClass(), "keys", term3926);
        setField(term3925, term3925.getClass(), "values", term3959);
        setField(term3925, term3925.getClass(), "states", term3992);
        setDoubleField(term3925, term3925.getClass(), "missingEntries", 0.0);
        setIntField(term3925, term3925.getClass(), "size", 0);
        setIntField(term3925, term3925.getClass(), "mask", 31);
        setIntField(term3925, term3925.getClass(), "count", 0);
        setField(term3924, term3924.getClass(), "entries", term3925);
        setIntField(term3924, term3924.getClass(), "virtualSize", -1275173084);
        setDoubleField(term3924, term3924.getClass(), "epsilon", 1.0E-12);
        term4031 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term4032 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term4033 = (int[]) newIntArray(32);
        double[] term4066 = (double[]) newDoubleArray(32);
        byte[] term4099 = (byte[]) newByteArray(32);
        setField(term4032, term4032.getClass(), "keys", term4033);
        setField(term4032, term4032.getClass(), "values", term4066);
        setField(term4032, term4032.getClass(), "states", term4099);
        setDoubleField(term4032, term4032.getClass(), "missingEntries", 0.0);
        setIntField(term4032, term4032.getClass(), "size", 0);
        setIntField(term4032, term4032.getClass(), "mask", 31);
        setIntField(term4032, term4032.getClass(), "count", 0);
        setField(term4031, term4031.getClass(), "entries", term4032);
        setIntField(term4031, term4031.getClass(), "virtualSize", -244121226);
        setDoubleField(term4031, term4031.getClass(), "epsilon", 1.0E-12);
        term40958 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term40959 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term40960 = (int[]) newIntArray(32);
        double[] term40961 = (double[]) newDoubleArray(32);
        byte[] term40962 = (byte[]) newByteArray(32);
        setField(term40959, term40959.getClass(), "keys", term40960);
        setField(term40959, term40959.getClass(), "values", term40961);
        setField(term40959, term40959.getClass(), "states", term40962);
        setDoubleField(term40959, term40959.getClass(), "missingEntries", 0.0);
        setIntField(term40959, term40959.getClass(), "size", 0);
        setIntField(term40959, term40959.getClass(), "mask", 31);
        setIntField(term40959, term40959.getClass(), "count", 0);
        setField(term40958, term40958.getClass(), "entries", term40959);
        setIntField(term40958, term40958.getClass(), "virtualSize", -1275173084);
        setDoubleField(term40958, term40958.getClass(), "epsilon", 1.0E-12);
        term40963 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term40964 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term40965 = (int[]) newIntArray(32);
        double[] term40966 = (double[]) newDoubleArray(32);
        byte[] term40967 = (byte[]) newByteArray(32);
        setField(term40964, term40964.getClass(), "keys", term40965);
        setField(term40964, term40964.getClass(), "values", term40966);
        setField(term40964, term40964.getClass(), "states", term40967);
        setDoubleField(term40964, term40964.getClass(), "missingEntries", 0.0);
        setIntField(term40964, term40964.getClass(), "size", 0);
        setIntField(term40964, term40964.getClass(), "mask", 31);
        setIntField(term40964, term40964.getClass(), "count", 0);
        setField(term40963, term40963.getClass(), "entries", term40964);
        setIntField(term40963, term40963.getClass(), "virtualSize", -244121226);
        setDoubleField(term40963, term40963.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term4031;
        Object retValue = callMethod(klass, "getDistance", argTypes, term3924, args);
        assertTrue(recursiveEquals(term3924, term40958));
        assertTrue(recursiveEquals(term4031, term40963));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


