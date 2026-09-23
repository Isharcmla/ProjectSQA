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

public class OpenMapRealVector_subtract_103055726941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7592;
     Object term7699;

    public OpenMapRealVector_subtract_103055726941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7592 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term7593 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term7594 = (int[]) newIntArray(32);
        double[] term7627 = (double[]) newDoubleArray(32);
        byte[] term7660 = (byte[]) newByteArray(32);
        setField(term7593, term7593.getClass(), "keys", term7594);
        setField(term7593, term7593.getClass(), "values", term7627);
        setField(term7593, term7593.getClass(), "states", term7660);
        setDoubleField(term7593, term7593.getClass(), "missingEntries", 0.0);
        setIntField(term7593, term7593.getClass(), "size", 0);
        setIntField(term7593, term7593.getClass(), "mask", 31);
        setIntField(term7593, term7593.getClass(), "count", 0);
        setField(term7592, term7592.getClass(), "entries", term7593);
        setIntField(term7592, term7592.getClass(), "virtualSize", -14890619);
        setDoubleField(term7592, term7592.getClass(), "epsilon", 1.0E-12);
        term7699 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term7700 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term7701 = (int[]) newIntArray(32);
        double[] term7734 = (double[]) newDoubleArray(32);
        byte[] term7767 = (byte[]) newByteArray(32);
        setField(term7700, term7700.getClass(), "keys", term7701);
        setField(term7700, term7700.getClass(), "values", term7734);
        setField(term7700, term7700.getClass(), "states", term7767);
        setDoubleField(term7700, term7700.getClass(), "missingEntries", 0.0);
        setIntField(term7700, term7700.getClass(), "size", 0);
        setIntField(term7700, term7700.getClass(), "mask", 31);
        setIntField(term7700, term7700.getClass(), "count", 0);
        setField(term7699, term7699.getClass(), "entries", term7700);
        setIntField(term7699, term7699.getClass(), "virtualSize", 1632125673);
        setDoubleField(term7699, term7699.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term7699;
        callMethod(klass, "subtract", argTypes, term7592, args);
    }

};


