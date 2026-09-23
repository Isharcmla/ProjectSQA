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

public class OpenMapRealVector_getL1Distance_162419452178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182590;
     Object term182800;

    public OpenMapRealVector_getL1Distance_162419452178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182590 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term182698 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term178303 = (byte[]) newByteArray(32);
        setIntField(term182698, term182698.getClass(), "count", 0);
        setByteElement(term178303, 0, (byte) -128);
        setByteElement(term178303, 1, (byte) -128);
        setByteElement(term178303, 3, (byte) -128);
        setByteElement(term178303, 4, (byte) -128);
        setByteElement(term178303, 5, (byte) -128);
        setByteElement(term178303, 7, (byte) -128);
        setByteElement(term178303, 8, (byte) -128);
        setByteElement(term178303, 13, (byte) -128);
        setByteElement(term178303, 16, (byte) -128);
        setByteElement(term178303, 20, (byte) -128);
        setByteElement(term178303, 23, (byte) -128);
        setByteElement(term178303, 27, (byte) -128);
        setByteElement(term178303, 31, (byte) -128);
        setField(term182698, term182698.getClass(), "states", term178303);
        setField(term182590, term182590.getClass(), "entries", term182698);
        term182800 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term182908 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term179402 = (byte[]) newByteArray(249);
        setIntField(term182908, term182908.getClass(), "count", 0);
        setByteElement(term179402, 5, (byte) -128);
        setByteElement(term179402, 7, (byte) -128);
        setByteElement(term179402, 9, (byte) -128);
        setByteElement(term179402, 10, (byte) 1);
        setField(term182908, term182908.getClass(), "states", term179402);
        setField(term182800, term182800.getClass(), "entries", term182908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term182800;
        callMethod(klass, "getL1Distance", argTypes, term182590, args);
    }

};


