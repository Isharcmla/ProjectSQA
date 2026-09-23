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

public class OpenMapRealVector_unitVector_75163631455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10731;

    public OpenMapRealVector_unitVector_75163631455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10731 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term10732 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term10733 = (int[]) newIntArray(32);
        double[] term10766 = (double[]) newDoubleArray(32);
        byte[] term10799 = (byte[]) newByteArray(32);
        setField(term10732, term10732.getClass(), "keys", term10733);
        setField(term10732, term10732.getClass(), "values", term10766);
        setField(term10732, term10732.getClass(), "states", term10799);
        setDoubleField(term10732, term10732.getClass(), "missingEntries", 0.0);
        setIntField(term10732, term10732.getClass(), "size", 0);
        setIntField(term10732, term10732.getClass(), "mask", 31);
        setIntField(term10732, term10732.getClass(), "count", 0);
        setField(term10731, term10731.getClass(), "entries", term10732);
        setIntField(term10731, term10731.getClass(), "virtualSize", 1324040357);
        setDoubleField(term10731, term10731.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unitVector", argTypes, term10731, args);
    }

};


