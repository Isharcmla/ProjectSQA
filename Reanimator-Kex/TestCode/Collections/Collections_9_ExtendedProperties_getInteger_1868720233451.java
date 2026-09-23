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

public class ExtendedProperties_getInteger_1868720233451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194169;

    public ExtendedProperties_getInteger_1868720233451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194169 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term194169, term194169.getClass(), "defaults", term194169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = 0;
        try {
            callMethod(klass, "getInteger", argTypes, term194169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


