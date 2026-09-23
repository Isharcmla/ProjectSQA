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
import java.lang.Double;

public class OpenMapRealVector_set_187370622150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9506;
     Object term9613;

    public OpenMapRealVector_set_187370622150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9506 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term9507 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9508 = (int[]) newIntArray(32);
        double[] term9541 = (double[]) newDoubleArray(32);
        byte[] term9574 = (byte[]) newByteArray(32);
        setField(term9507, term9507.getClass(), "keys", term9508);
        setField(term9507, term9507.getClass(), "values", term9541);
        setField(term9507, term9507.getClass(), "states", term9574);
        setDoubleField(term9507, term9507.getClass(), "missingEntries", 0.0);
        setIntField(term9507, term9507.getClass(), "size", 0);
        setIntField(term9507, term9507.getClass(), "mask", 31);
        setIntField(term9507, term9507.getClass(), "count", 0);
        setField(term9506, term9506.getClass(), "entries", term9507);
        setIntField(term9506, term9506.getClass(), "virtualSize", 1328271830);
        setDoubleField(term9506, term9506.getClass(), "epsilon", 1.0E-12);
        term9613 = new Double(0.20737514139742264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9613;
        callMethod(klass, "set", argTypes, term9506, args);
    }

};


