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
import java.lang.Object;

public class OpenMapRealVector_sparseIterator_95264750349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9420;

    public OpenMapRealVector_sparseIterator_95264750349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9420 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term9421 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term9422 = (int[]) newIntArray(32);
        double[] term9455 = (double[]) newDoubleArray(32);
        byte[] term9488 = (byte[]) newByteArray(32);
        setField(term9421, term9421.getClass(), "keys", term9422);
        setField(term9421, term9421.getClass(), "values", term9455);
        setField(term9421, term9421.getClass(), "states", term9488);
        setDoubleField(term9421, term9421.getClass(), "missingEntries", 0.0);
        setIntField(term9421, term9421.getClass(), "size", 0);
        setIntField(term9421, term9421.getClass(), "mask", 31);
        setIntField(term9421, term9421.getClass(), "count", 0);
        setField(term9420, term9420.getClass(), "entries", term9421);
        setIntField(term9420, term9420.getClass(), "virtualSize", 493620644);
        setDoubleField(term9420, term9420.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sparseIterator", argTypes, term9420, args);
    }

};


