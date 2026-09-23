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
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_append_839755087191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374;
     Object term376;
     Object term16813;
     Object term16815;
     Object term16795;

    public ArrayRealVector_append_839755087191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term375 = (double[]) newDoubleArray(0);
        setField(term374, term374.getClass(), "data", term375);
        term376 = (double[]) newDoubleArray(6);
        setDoubleElement(term376, 0, 0.36226058076369927);
        setDoubleElement(term376, 1, 0.03699061125289671);
        setDoubleElement(term376, 2, 0.6047137830113202);
        setDoubleElement(term376, 3, 0.6767213143579776);
        setDoubleElement(term376, 4, 0.48862955528902696);
        setDoubleElement(term376, 5, 0.426231085465289);
        term16813 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term16814 = (double[]) newDoubleArray(0);
        setField(term16813, term16813.getClass(), "data", term16814);
        term16815 = (double[]) newDoubleArray(6);
        setDoubleElement(term16815, 0, 0.36226058076369927);
        setDoubleElement(term16815, 1, 0.03699061125289671);
        setDoubleElement(term16815, 2, 0.6047137830113202);
        setDoubleElement(term16815, 3, 0.6767213143579776);
        setDoubleElement(term16815, 4, 0.48862955528902696);
        setDoubleElement(term16815, 5, 0.426231085465289);
        term16795 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term16796 = (double[]) newDoubleArray(6);
        setDoubleElement(term16796, 0, 0.36226058076369927);
        setDoubleElement(term16796, 1, 0.03699061125289671);
        setDoubleElement(term16796, 2, 0.6047137830113202);
        setDoubleElement(term16796, 3, 0.6767213143579776);
        setDoubleElement(term16796, 4, 0.48862955528902696);
        setDoubleElement(term16796, 5, 0.426231085465289);
        setField(term16795, term16795.getClass(), "data", term16796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term376;
        Object retValue = callMethod(klass, "append", argTypes, term374, args);
        assertTrue(recursiveEquals(term374, term16813));
        assertTrue(recursiveEquals(term376, term16815));
        assertTrue(recursiveEquals(retValue, term16795));
    }

};


