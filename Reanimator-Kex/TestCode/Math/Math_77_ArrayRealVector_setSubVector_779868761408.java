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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArrayRealVector_setSubVector_779868761408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132001;
     Object term132099;

    public ArrayRealVector_setSubVector_779868761408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132001 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        term132099 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = term132099;
        try {
            callMethod(klass, "setSubVector", argTypes, term132001, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


