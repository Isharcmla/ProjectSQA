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

public class ExtendedProperties_getByte_1707879519690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6637667;

    public ExtendedProperties_getByte_1707879519690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6637667 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term6637771 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term6637667, term6637667.getClass(), "defaults", term6637771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = (byte) 0;
        try {
            callMethod(klass, "getByte", argTypes, term6637667, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


