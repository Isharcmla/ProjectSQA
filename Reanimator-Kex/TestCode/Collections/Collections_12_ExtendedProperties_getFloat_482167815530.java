package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExtendedProperties_getFloat_482167815530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433219;

    public ExtendedProperties_getFloat_482167815530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433219 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term433323 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term433219, term433219.getClass(), "defaults", term433323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = 0.0F;
        try {
            callMethod(klass, "getFloat", argTypes, term433219, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


