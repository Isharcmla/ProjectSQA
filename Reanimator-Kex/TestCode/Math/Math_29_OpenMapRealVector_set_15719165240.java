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
import java.lang.Double;

public class OpenMapRealVector_set_15719165240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7387;
     Object term7494;

    public OpenMapRealVector_set_15719165240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7387 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term7388 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term7389 = (int[]) newIntArray(32);
        double[] term7422 = (double[]) newDoubleArray(32);
        byte[] term7455 = (byte[]) newByteArray(32);
        setField(term7388, term7388.getClass(), "keys", term7389);
        setField(term7388, term7388.getClass(), "values", term7422);
        setField(term7388, term7388.getClass(), "states", term7455);
        setDoubleField(term7388, term7388.getClass(), "missingEntries", 0.0);
        setIntField(term7388, term7388.getClass(), "size", 0);
        setIntField(term7388, term7388.getClass(), "mask", 31);
        setIntField(term7388, term7388.getClass(), "count", 0);
        setField(term7387, term7387.getClass(), "entries", term7388);
        setIntField(term7387, term7387.getClass(), "virtualSize", 579005622);
        setDoubleField(term7387, term7387.getClass(), "epsilon", 1.0E-12);
        term7494 = new Double(0.6436713023569729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term7494;
        callMethod(klass, "set", argTypes, term7387, args);
    }

};


