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

public class ExtendedProperties_getDouble_1047284872362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101365;

    public ExtendedProperties_getDouble_1047284872362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101365 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term101469 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term101365, term101365.getClass(), "defaults", term101469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = 0.0;
        try {
            callMethod(klass, "getDouble", argTypes, term101365, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


