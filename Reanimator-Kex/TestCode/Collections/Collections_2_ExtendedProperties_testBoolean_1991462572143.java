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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;

public class ExtendedProperties_testBoolean_1991462572143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54395;
     Object term54707;

    public ExtendedProperties_testBoolean_1991462572143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54395 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term54707 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term54707, term54707.getClass(), "defaults", null);
        setField(term54707, term54707.getClass(), "file", null);
        setField(term54707, term54707.getClass(), "basePath", null);
        setField(term54707, term54707.getClass(), "fileSeparator", null);
        setBooleanField(term54707, term54707.getClass(), "isInitialized", false);
        setField(term54707, term54707.getClass(), "keysAsListed", null);
        setField(term54707, term54707.getClass(), "table", null);
        setIntField(term54707, term54707.getClass(), "count", 0);
        setIntField(term54707, term54707.getClass(), "threshold", 0);
        setFloatField(term54707, term54707.getClass(), "loadFactor", 0.0F);
        setIntField(term54707, term54707.getClass(), "modCount", 0);
        setField(term54707, term54707.getClass(), "keySet", null);
        setField(term54707, term54707.getClass(), "entrySet", null);
        setField(term54707, term54707.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "true";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term54395, args);
        assertTrue(recursiveEquals(term54395, term54707));
        assertTrue(recursiveEquals(retValue, "true"));
    }

};


