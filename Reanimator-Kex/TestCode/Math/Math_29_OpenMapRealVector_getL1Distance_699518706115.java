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

public class OpenMapRealVector_getL1Distance_699518706115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198460;
     Object term198674;

    public OpenMapRealVector_getL1Distance_699518706115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198460 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term198570 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term196281 = (byte[]) newByteArray(32);
        setIntField(term198570, term198570.getClass(), "count", 0);
        setByteElement(term196281, 0, (byte) -128);
        setByteElement(term196281, 1, (byte) -128);
        setByteElement(term196281, 2, (byte) -128);
        setByteElement(term196281, 3, (byte) -128);
        setByteElement(term196281, 4, (byte) -128);
        setByteElement(term196281, 5, (byte) -128);
        setByteElement(term196281, 6, (byte) -128);
        setByteElement(term196281, 7, (byte) -128);
        setByteElement(term196281, 10, (byte) -128);
        setByteElement(term196281, 11, (byte) -128);
        setByteElement(term196281, 12, (byte) -128);
        setByteElement(term196281, 14, (byte) -128);
        setByteElement(term196281, 15, (byte) -128);
        setByteElement(term196281, 16, (byte) -128);
        setByteElement(term196281, 17, (byte) -128);
        setByteElement(term196281, 18, (byte) -128);
        setByteElement(term196281, 19, (byte) -128);
        setByteElement(term196281, 20, (byte) -128);
        setByteElement(term196281, 21, (byte) -128);
        setByteElement(term196281, 22, (byte) -128);
        setByteElement(term196281, 23, (byte) -128);
        setByteElement(term196281, 24, (byte) -128);
        setByteElement(term196281, 25, (byte) -128);
        setByteElement(term196281, 26, (byte) -128);
        setByteElement(term196281, 27, (byte) -128);
        setByteElement(term196281, 28, (byte) -128);
        setByteElement(term196281, 29, (byte) -128);
        setByteElement(term196281, 30, (byte) -128);
        setByteElement(term196281, 31, (byte) -128);
        setField(term198570, term198570.getClass(), "states", term196281);
        setField(term198460, term198460.getClass(), "entries", term198570);
        term198674 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term198784 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term197378 = (byte[]) newByteArray(23);
        setIntField(term198784, term198784.getClass(), "count", 0);
        setByteElement(term197378, 0, (byte) -128);
        setByteElement(term197378, 1, (byte) -128);
        setByteElement(term197378, 2, (byte) -128);
        setByteElement(term197378, 3, (byte) -128);
        setByteElement(term197378, 4, (byte) -128);
        setByteElement(term197378, 5, (byte) -128);
        setByteElement(term197378, 6, (byte) -128);
        setByteElement(term197378, 7, (byte) -128);
        setByteElement(term197378, 8, (byte) -128);
        setByteElement(term197378, 9, (byte) -128);
        setByteElement(term197378, 10, (byte) -128);
        setByteElement(term197378, 11, (byte) -128);
        setByteElement(term197378, 12, (byte) -128);
        setByteElement(term197378, 13, (byte) -128);
        setByteElement(term197378, 14, (byte) -128);
        setByteElement(term197378, 15, (byte) -128);
        setByteElement(term197378, 16, (byte) -128);
        setByteElement(term197378, 18, (byte) -128);
        setByteElement(term197378, 19, (byte) -128);
        setField(term198784, term198784.getClass(), "states", term197378);
        setField(term198674, term198674.getClass(), "entries", term198784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term198674;
        callMethod(klass, "getL1Distance", argTypes, term198460, args);
    }

};


