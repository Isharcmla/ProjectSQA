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

public class OpenMapRealVector_getL1Distance_162419452197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216118;
     Object term216328;

    public OpenMapRealVector_getL1Distance_162419452197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216118 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term216226 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term214562 = (byte[]) newByteArray(32);
        setIntField(term216226, term216226.getClass(), "count", 0);
        setByteElement(term214562, 0, (byte) -128);
        setByteElement(term214562, 2, (byte) -128);
        setByteElement(term214562, 6, (byte) -128);
        setByteElement(term214562, 7, (byte) -128);
        setByteElement(term214562, 8, (byte) -128);
        setByteElement(term214562, 10, (byte) -128);
        setByteElement(term214562, 20, (byte) -128);
        setByteElement(term214562, 27, (byte) -128);
        setByteElement(term214562, 28, (byte) -128);
        setByteElement(term214562, 31, (byte) -128);
        setField(term216226, term216226.getClass(), "states", term214562);
        setField(term216118, term216118.getClass(), "entries", term216226);
        term216328 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term216436 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term215661 = (byte[]) newByteArray(6);
        setIntField(term216436, term216436.getClass(), "count", 0);
        setByteElement(term215661, 2, (byte) -128);
        setByteElement(term215661, 3, (byte) -128);
        setByteElement(term215661, 4, (byte) -128);
        setField(term216436, term216436.getClass(), "states", term215661);
        setField(term216328, term216328.getClass(), "entries", term216436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term216328;
        callMethod(klass, "getL1Distance", argTypes, term216118, args);
    }

};


