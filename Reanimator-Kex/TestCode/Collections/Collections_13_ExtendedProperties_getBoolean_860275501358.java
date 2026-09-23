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

public class ExtendedProperties_getBoolean_860275501358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126227;

    public ExtendedProperties_getBoolean_860275501358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126227 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term126331 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term126331, term126331.getClass(), "defaults", term126331);
        setField(term126227, term126227.getClass(), "defaults", term126331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = true;
        try {
            callMethod(klass, "getBoolean", argTypes, term126227, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


