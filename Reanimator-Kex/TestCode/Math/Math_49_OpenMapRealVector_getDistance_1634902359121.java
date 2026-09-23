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

public class OpenMapRealVector_getDistance_1634902359121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109019;
     Object term109229;

    public OpenMapRealVector_getDistance_1634902359121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109019 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term109127 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term107461 = (byte[]) newByteArray(32);
        setIntField(term109127, term109127.getClass(), "count", 0);
        setByteElement(term107461, 2, (byte) -128);
        setByteElement(term107461, 4, (byte) -128);
        setByteElement(term107461, 5, (byte) -128);
        setByteElement(term107461, 9, (byte) -128);
        setByteElement(term107461, 13, (byte) -128);
        setByteElement(term107461, 19, (byte) -128);
        setByteElement(term107461, 21, (byte) -128);
        setByteElement(term107461, 22, (byte) -128);
        setByteElement(term107461, 23, (byte) -128);
        setByteElement(term107461, 29, (byte) -128);
        setField(term109127, term109127.getClass(), "states", term107461);
        setField(term109019, term109019.getClass(), "entries", term109127);
        term109229 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term109337 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term108559 = (byte[]) newByteArray(4);
        setIntField(term109337, term109337.getClass(), "count", 0);
        setByteElement(term108559, 3, (byte) -128);
        setField(term109337, term109337.getClass(), "states", term108559);
        setField(term109229, term109229.getClass(), "entries", term109337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term109229;
        callMethod(klass, "getDistance", argTypes, term109019, args);
    }

};


