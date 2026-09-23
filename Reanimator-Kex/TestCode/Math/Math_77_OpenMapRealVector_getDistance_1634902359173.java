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

public class OpenMapRealVector_getDistance_1634902359173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176380;
     Object term176590;

    public OpenMapRealVector_getDistance_1634902359173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176380 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term176488 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term173835 = (byte[]) newByteArray(32);
        setIntField(term176488, term176488.getClass(), "count", 0);
        setByteElement(term173835, 0, (byte) -128);
        setByteElement(term173835, 1, (byte) -128);
        setByteElement(term173835, 2, (byte) -128);
        setByteElement(term173835, 11, (byte) -128);
        setByteElement(term173835, 14, (byte) -128);
        setByteElement(term173835, 20, (byte) -128);
        setByteElement(term173835, 26, (byte) -128);
        setByteElement(term173835, 27, (byte) -128);
        setField(term176488, term176488.getClass(), "states", term173835);
        setField(term176380, term176380.getClass(), "entries", term176488);
        term176590 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term176698 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term174934 = (byte[]) newByteArray(29);
        setIntField(term176698, term176698.getClass(), "count", 0);
        setByteElement(term174934, 5, (byte) -128);
        setByteElement(term174934, 7, (byte) -128);
        setByteElement(term174934, 16, (byte) -128);
        setByteElement(term174934, 18, (byte) -128);
        setByteElement(term174934, 22, (byte) -128);
        setByteElement(term174934, 23, (byte) -128);
        setByteElement(term174934, 27, (byte) -128);
        setByteElement(term174934, 28, (byte) -128);
        setField(term176698, term176698.getClass(), "states", term174934);
        setField(term176590, term176590.getClass(), "entries", term176698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term176590;
        callMethod(klass, "getDistance", argTypes, term176380, args);
    }

};


