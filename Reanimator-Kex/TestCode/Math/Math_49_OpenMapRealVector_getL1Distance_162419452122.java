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

public class OpenMapRealVector_getL1Distance_162419452122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116089;
     Object term116299;

    public OpenMapRealVector_getL1Distance_162419452122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116089 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term116197 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term109383 = (byte[]) newByteArray(32);
        setIntField(term116197, term116197.getClass(), "count", 0);
        setByteElement(term109383, 6, (byte) -128);
        setByteElement(term109383, 7, (byte) -128);
        setByteElement(term109383, 8, (byte) -128);
        setByteElement(term109383, 10, (byte) -128);
        setByteElement(term109383, 23, (byte) -128);
        setByteElement(term109383, 24, (byte) -128);
        setByteElement(term109383, 25, (byte) -128);
        setByteElement(term109383, 26, (byte) -128);
        setByteElement(term109383, 27, (byte) -128);
        setByteElement(term109383, 28, (byte) -128);
        setByteElement(term109383, 29, (byte) -128);
        setField(term116197, term116197.getClass(), "states", term109383);
        setField(term116089, term116089.getClass(), "entries", term116197);
        term116299 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term116407 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term110482 = (byte[]) newByteArray(512);
        setIntField(term116407, term116407.getClass(), "count", 0);
        setByteElement(term110482, 4, (byte) -128);
        setByteElement(term110482, 9, (byte) 1);
        setField(term116407, term116407.getClass(), "states", term110482);
        setField(term116299, term116299.getClass(), "entries", term116407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term116299;
        callMethod(klass, "getL1Distance", argTypes, term116089, args);
    }

};


