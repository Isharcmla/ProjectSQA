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

public class OpenMapRealVector_unitVector_75163631454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10528;

    public OpenMapRealVector_unitVector_75163631454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10528 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term10529 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term10530 = (int[]) newIntArray(32);
        double[] term10563 = (double[]) newDoubleArray(32);
        byte[] term10596 = (byte[]) newByteArray(32);
        setField(term10529, term10529.getClass(), "keys", term10530);
        setField(term10529, term10529.getClass(), "values", term10563);
        setField(term10529, term10529.getClass(), "states", term10596);
        setDoubleField(term10529, term10529.getClass(), "missingEntries", 0.0);
        setIntField(term10529, term10529.getClass(), "size", 0);
        setIntField(term10529, term10529.getClass(), "mask", 31);
        setIntField(term10529, term10529.getClass(), "count", 0);
        setField(term10528, term10528.getClass(), "entries", term10529);
        setIntField(term10528, term10528.getClass(), "virtualSize", 1225272962);
        setDoubleField(term10528, term10528.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unitVector", argTypes, term10528, args);
    }

};


