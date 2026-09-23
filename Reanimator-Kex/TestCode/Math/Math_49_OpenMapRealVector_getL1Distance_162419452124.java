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

public class OpenMapRealVector_getL1Distance_162419452124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118344;

    public OpenMapRealVector_getL1Distance_162419452124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118344 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term118452 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term117176 = (byte[]) newByteArray(31);
        setIntField(term118452, term118452.getClass(), "count", 0);
        setByteElement(term117176, 26, (byte) 1);
        setByteElement(term117176, 27, (byte) 1);
        setByteElement(term117176, 28, (byte) 1);
        setByteElement(term117176, 29, (byte) 1);
        setByteElement(term117176, 30, (byte) 1);
        setField(term118452, term118452.getClass(), "states", term117176);
        setField(term118344, term118344.getClass(), "entries", term118452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getL1Distance", argTypes, term118344, args);
    }

};


