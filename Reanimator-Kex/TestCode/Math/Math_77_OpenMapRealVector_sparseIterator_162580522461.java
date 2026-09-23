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
import java.lang.Object;

public class OpenMapRealVector_sparseIterator_162580522461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11950;

    public OpenMapRealVector_sparseIterator_162580522461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11950 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term11951 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term11952 = (int[]) newIntArray(32);
        double[] term11985 = (double[]) newDoubleArray(32);
        byte[] term12018 = (byte[]) newByteArray(32);
        setField(term11951, term11951.getClass(), "keys", term11952);
        setField(term11951, term11951.getClass(), "values", term11985);
        setField(term11951, term11951.getClass(), "states", term12018);
        setDoubleField(term11951, term11951.getClass(), "missingEntries", 0.0);
        setIntField(term11951, term11951.getClass(), "size", 0);
        setIntField(term11951, term11951.getClass(), "mask", 31);
        setIntField(term11951, term11951.getClass(), "count", 0);
        setField(term11950, term11950.getClass(), "entries", term11951);
        setIntField(term11950, term11950.getClass(), "virtualSize", 962840079);
        setDoubleField(term11950, term11950.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sparseIterator", argTypes, term11950, args);
    }

};


