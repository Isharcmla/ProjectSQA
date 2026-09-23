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
import org.apache.commons.math3.exception.OutOfRangeException;
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class OpenMapRealVector_getSubVector_73583531674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3514;
     Object term3621;
     Object term3623;

    public OpenMapRealVector_getSubVector_73583531674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3514 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term3515 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term3516 = (int[]) newIntArray(32);
        double[] term3549 = (double[]) newDoubleArray(32);
        byte[] term3582 = (byte[]) newByteArray(32);
        setField(term3515, term3515.getClass(), "keys", term3516);
        setField(term3515, term3515.getClass(), "values", term3549);
        setField(term3515, term3515.getClass(), "states", term3582);
        setDoubleField(term3515, term3515.getClass(), "missingEntries", 0.0);
        setIntField(term3515, term3515.getClass(), "size", 0);
        setIntField(term3515, term3515.getClass(), "mask", 31);
        setIntField(term3515, term3515.getClass(), "count", 0);
        setField(term3514, term3514.getClass(), "entries", term3515);
        setIntField(term3514, term3514.getClass(), "virtualSize", -1007160944);
        setDoubleField(term3514, term3514.getClass(), "epsilon", 1.0E-12);
        term3621 = new Integer(1135664017);
        term3623 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3621;
        args[1] = term3623;
        try {
            callMethod(klass, "getSubVector", argTypes, term3514, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


