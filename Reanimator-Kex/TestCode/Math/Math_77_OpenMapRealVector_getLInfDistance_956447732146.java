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

public class OpenMapRealVector_getLInfDistance_956447732146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161558;
     Object term161768;

    public OpenMapRealVector_getLInfDistance_956447732146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161558 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term161666 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term160002 = (byte[]) newByteArray(32);
        setIntField(term161666, term161666.getClass(), "count", 0);
        setByteElement(term160002, 0, (byte) -128);
        setByteElement(term160002, 2, (byte) -128);
        setByteElement(term160002, 6, (byte) -128);
        setByteElement(term160002, 7, (byte) -128);
        setByteElement(term160002, 8, (byte) -128);
        setByteElement(term160002, 10, (byte) -128);
        setByteElement(term160002, 20, (byte) -128);
        setByteElement(term160002, 27, (byte) -128);
        setByteElement(term160002, 28, (byte) -128);
        setByteElement(term160002, 31, (byte) -128);
        setField(term161666, term161666.getClass(), "states", term160002);
        setField(term161558, term161558.getClass(), "entries", term161666);
        term161768 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term161876 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term161101 = (byte[]) newByteArray(6);
        setIntField(term161876, term161876.getClass(), "count", 0);
        setByteElement(term161101, 2, (byte) -128);
        setByteElement(term161101, 3, (byte) -128);
        setByteElement(term161101, 4, (byte) -128);
        setField(term161876, term161876.getClass(), "states", term161101);
        setField(term161768, term161768.getClass(), "entries", term161876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term161768;
        callMethod(klass, "getLInfDistance", argTypes, term161558, args);
    }

};


