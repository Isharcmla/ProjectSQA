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

public class OpenMapRealVector_getDistance_1634902359145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159606;
     Object term159816;

    public OpenMapRealVector_getDistance_1634902359145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159606 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term159714 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term157766 = (byte[]) newByteArray(32);
        setIntField(term159714, term159714.getClass(), "count", 0);
        setByteElement(term157766, 1, (byte) -128);
        setByteElement(term157766, 2, (byte) -128);
        setByteElement(term157766, 3, (byte) -128);
        setByteElement(term157766, 5, (byte) -128);
        setByteElement(term157766, 13, (byte) -128);
        setByteElement(term157766, 14, (byte) -128);
        setByteElement(term157766, 20, (byte) -128);
        setByteElement(term157766, 31, (byte) -128);
        setField(term159714, term159714.getClass(), "states", term157766);
        setField(term159606, term159606.getClass(), "entries", term159714);
        term159816 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term159924 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term158867 = (byte[]) newByteArray(16);
        setIntField(term159924, term159924.getClass(), "count", 0);
        setByteElement(term158867, 0, (byte) -128);
        setByteElement(term158867, 4, (byte) -128);
        setByteElement(term158867, 5, (byte) -128);
        setByteElement(term158867, 6, (byte) -128);
        setByteElement(term158867, 7, (byte) -128);
        setByteElement(term158867, 8, (byte) -128);
        setByteElement(term158867, 13, (byte) -128);
        setByteElement(term158867, 15, (byte) 1);
        setField(term159924, term159924.getClass(), "states", term158867);
        setField(term159816, term159816.getClass(), "entries", term159924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term159816;
        callMethod(klass, "getDistance", argTypes, term159606, args);
    }

};


