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

public class ExtendedProperties_getDouble_525058703213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95814;

    public ExtendedProperties_getDouble_525058703213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95814 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term95918 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term95918, term95918.getClass(), "defaults", term95918);
        setField(term95814, term95814.getClass(), "defaults", term95918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getDouble", argTypes, term95814, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


