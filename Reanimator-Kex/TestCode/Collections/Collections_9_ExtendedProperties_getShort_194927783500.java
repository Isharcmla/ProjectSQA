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

public class ExtendedProperties_getShort_194927783500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204728;

    public ExtendedProperties_getShort_194927783500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204728 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term204832 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term204728, term204728.getClass(), "defaults", term204832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = (short) 0;
        try {
            callMethod(klass, "getShort", argTypes, term204728, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


