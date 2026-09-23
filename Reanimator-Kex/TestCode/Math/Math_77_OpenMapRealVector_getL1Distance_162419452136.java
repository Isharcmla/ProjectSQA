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

public class OpenMapRealVector_getL1Distance_162419452136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115459;
     Object term115669;

    public OpenMapRealVector_getL1Distance_162419452136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115459 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term115567 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term113874 = (byte[]) newByteArray(32);
        setIntField(term115567, term115567.getClass(), "count", 0);
        setByteElement(term113874, 0, (byte) -128);
        setByteElement(term113874, 2, (byte) -128);
        setByteElement(term113874, 8, (byte) -128);
        setByteElement(term113874, 9, (byte) -128);
        setByteElement(term113874, 10, (byte) -128);
        setByteElement(term113874, 13, (byte) -128);
        setByteElement(term113874, 14, (byte) -128);
        setByteElement(term113874, 16, (byte) -128);
        setByteElement(term113874, 19, (byte) -128);
        setByteElement(term113874, 22, (byte) -128);
        setByteElement(term113874, 28, (byte) -128);
        setByteElement(term113874, 31, (byte) -128);
        setField(term115567, term115567.getClass(), "states", term113874);
        setField(term115459, term115459.getClass(), "entries", term115567);
        term115669 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term115777 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term114972 = (byte[]) newByteArray(13);
        setIntField(term115777, term115777.getClass(), "count", 0);
        setByteElement(term114972, 2, (byte) -128);
        setByteElement(term114972, 5, (byte) 1);
        setField(term115777, term115777.getClass(), "states", term114972);
        setField(term115669, term115669.getClass(), "entries", term115777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term115669;
        callMethod(klass, "getL1Distance", argTypes, term115459, args);
    }

};


