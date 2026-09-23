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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;

public class OpenMapRealVector_setEntry_600867553152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9081;
     Object term9188;
     Object term9190;

    public OpenMapRealVector_setEntry_600867553152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9081 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term9082 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9083 = (int[]) newIntArray(32);
        double[] term9116 = (double[]) newDoubleArray(32);
        byte[] term9149 = (byte[]) newByteArray(32);
        setField(term9082, term9082.getClass(), "keys", term9083);
        setField(term9082, term9082.getClass(), "values", term9116);
        setField(term9082, term9082.getClass(), "states", term9149);
        setDoubleField(term9082, term9082.getClass(), "missingEntries", 0.0);
        setIntField(term9082, term9082.getClass(), "size", 0);
        setIntField(term9082, term9082.getClass(), "mask", 31);
        setIntField(term9082, term9082.getClass(), "count", 0);
        setField(term9081, term9081.getClass(), "entries", term9082);
        setIntField(term9081, term9081.getClass(), "virtualSize", -1048298087);
        setDoubleField(term9081, term9081.getClass(), "epsilon", 1.0E-12);
        term9188 = new Integer(292681826);
        term9190 = new Double(0.15917839663695388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term9188;
        args[1] = term9190;
        try {
            callMethod(klass, "setEntry", argTypes, term9081, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


