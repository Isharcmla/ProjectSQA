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

public class OpenMapRealVector_isInfinite_1028053869110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177944;

    public OpenMapRealVector_isInfinite_1028053869110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177944 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term178054 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term177164 = (byte[]) newByteArray(31);
        setIntField(term178054, term178054.getClass(), "count", 0);
        setByteElement(term177164, 16, (byte) 1);
        setByteElement(term177164, 17, (byte) 1);
        setByteElement(term177164, 18, (byte) 1);
        setByteElement(term177164, 19, (byte) 1);
        setByteElement(term177164, 20, (byte) 1);
        setByteElement(term177164, 21, (byte) 1);
        setByteElement(term177164, 22, (byte) 1);
        setByteElement(term177164, 23, (byte) 1);
        setByteElement(term177164, 24, (byte) 1);
        setByteElement(term177164, 25, (byte) 1);
        setByteElement(term177164, 26, (byte) 1);
        setByteElement(term177164, 27, (byte) 1);
        setByteElement(term177164, 28, (byte) 1);
        setByteElement(term177164, 29, (byte) 1);
        setByteElement(term177164, 30, (byte) 1);
        setField(term178054, term178054.getClass(), "states", term177164);
        setField(term177944, term177944.getClass(), "entries", term178054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInfinite", argTypes, term177944, args);
    }

};


