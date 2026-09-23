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

public class ExtendedProperties_getFloat_482167815541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471909;

    public ExtendedProperties_getFloat_482167815541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471909 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term472013 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term471909, term471909.getClass(), "defaults", term472013);
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
            callMethod(klass, "getFloat", argTypes, term471909, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


