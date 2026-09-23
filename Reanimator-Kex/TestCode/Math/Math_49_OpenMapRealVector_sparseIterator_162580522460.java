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

public class OpenMapRealVector_sparseIterator_162580522460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11747;

    public OpenMapRealVector_sparseIterator_162580522460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11747 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term11748 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term11749 = (int[]) newIntArray(32);
        double[] term11782 = (double[]) newDoubleArray(32);
        byte[] term11815 = (byte[]) newByteArray(32);
        setField(term11748, term11748.getClass(), "keys", term11749);
        setField(term11748, term11748.getClass(), "values", term11782);
        setField(term11748, term11748.getClass(), "states", term11815);
        setDoubleField(term11748, term11748.getClass(), "missingEntries", 0.0);
        setIntField(term11748, term11748.getClass(), "size", 0);
        setIntField(term11748, term11748.getClass(), "mask", 31);
        setIntField(term11748, term11748.getClass(), "count", 0);
        setField(term11747, term11747.getClass(), "entries", term11748);
        setIntField(term11747, term11747.getClass(), "virtualSize", 287287233);
        setDoubleField(term11747, term11747.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sparseIterator", argTypes, term11747, args);
    }

};


