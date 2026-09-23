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

public class OpenMapRealVector_isInfinite_102805386983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5956;
     Object term73336;

    public OpenMapRealVector_isInfinite_102805386983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5956 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term5957 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term5958 = (int[]) newIntArray(32);
        double[] term5991 = (double[]) newDoubleArray(32);
        byte[] term6024 = (byte[]) newByteArray(32);
        setField(term5957, term5957.getClass(), "keys", term5958);
        setField(term5957, term5957.getClass(), "values", term5991);
        setField(term5957, term5957.getClass(), "states", term6024);
        setDoubleField(term5957, term5957.getClass(), "missingEntries", 0.0);
        setIntField(term5957, term5957.getClass(), "size", 0);
        setIntField(term5957, term5957.getClass(), "mask", 31);
        setIntField(term5957, term5957.getClass(), "count", 0);
        setField(term5956, term5956.getClass(), "entries", term5957);
        setIntField(term5956, term5956.getClass(), "virtualSize", 679763016);
        setDoubleField(term5956, term5956.getClass(), "epsilon", 1.0E-12);
        term73336 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term73337 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term73338 = (int[]) newIntArray(32);
        double[] term73339 = (double[]) newDoubleArray(32);
        byte[] term73340 = (byte[]) newByteArray(32);
        setField(term73337, term73337.getClass(), "keys", term73338);
        setField(term73337, term73337.getClass(), "values", term73339);
        setField(term73337, term73337.getClass(), "states", term73340);
        setDoubleField(term73337, term73337.getClass(), "missingEntries", 0.0);
        setIntField(term73337, term73337.getClass(), "size", 0);
        setIntField(term73337, term73337.getClass(), "mask", 31);
        setIntField(term73337, term73337.getClass(), "count", 0);
        setField(term73336, term73336.getClass(), "entries", term73337);
        setIntField(term73336, term73336.getClass(), "virtualSize", 679763016);
        setDoubleField(term73336, term73336.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInfinite", argTypes, term5956, args);
        assertTrue(recursiveEquals(term5956, term73336));
        assertTrue(recursiveEquals(retValue, false));
    }

};


