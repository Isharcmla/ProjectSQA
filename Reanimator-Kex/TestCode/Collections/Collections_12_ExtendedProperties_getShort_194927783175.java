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

public class ExtendedProperties_getShort_194927783175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108643;

    public ExtendedProperties_getShort_194927783175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108643 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term108747 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term108747, term108747.getClass(), "defaults", term108747);
        setField(term108643, term108643.getClass(), "defaults", term108747);
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
            callMethod(klass, "getShort", argTypes, term108643, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


