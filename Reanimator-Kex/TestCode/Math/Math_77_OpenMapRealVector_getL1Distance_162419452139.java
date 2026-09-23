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

public class OpenMapRealVector_getL1Distance_162419452139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141424;
     Object term141634;

    public OpenMapRealVector_getL1Distance_162419452139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141424 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term141532 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term139179 = (byte[]) newByteArray(32);
        setIntField(term141532, term141532.getClass(), "count", 0);
        setByteElement(term139179, 4, (byte) -128);
        setByteElement(term139179, 9, (byte) -128);
        setByteElement(term139179, 12, (byte) -128);
        setByteElement(term139179, 13, (byte) -128);
        setByteElement(term139179, 14, (byte) -128);
        setByteElement(term139179, 15, (byte) -128);
        setByteElement(term139179, 19, (byte) -128);
        setByteElement(term139179, 24, (byte) -128);
        setByteElement(term139179, 25, (byte) -128);
        setByteElement(term139179, 27, (byte) -128);
        setByteElement(term139179, 30, (byte) -128);
        setField(term141532, term141532.getClass(), "states", term139179);
        setField(term141424, term141424.getClass(), "entries", term141532);
        term141634 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term141742 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term140279 = (byte[]) newByteArray(24);
        setIntField(term141742, term141742.getClass(), "count", 0);
        setByteElement(term140279, 10, (byte) -128);
        setByteElement(term140279, 11, (byte) -128);
        setByteElement(term140279, 18, (byte) -128);
        setByteElement(term140279, 23, (byte) -128);
        setField(term141742, term141742.getClass(), "states", term140279);
        setField(term141634, term141634.getClass(), "entries", term141742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term141634;
        callMethod(klass, "getL1Distance", argTypes, term141424, args);
    }

};


