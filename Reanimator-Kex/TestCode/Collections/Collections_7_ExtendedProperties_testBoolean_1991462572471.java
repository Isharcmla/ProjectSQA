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

public class ExtendedProperties_testBoolean_1991462572471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125496;
     Object term126064;

    public ExtendedProperties_testBoolean_1991462572471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125496 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term126064 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term126064, term126064.getClass(), "defaults", null);
        setField(term126064, term126064.getClass(), "file", null);
        setField(term126064, term126064.getClass(), "basePath", null);
        setField(term126064, term126064.getClass(), "fileSeparator", null);
        setBooleanField(term126064, term126064.getClass(), "isInitialized", false);
        setField(term126064, term126064.getClass(), "includePropertyName", null);
        setField(term126064, term126064.getClass(), "keysAsListed", null);
        setField(term126064, term126064.getClass(), "table", null);
        setIntField(term126064, term126064.getClass(), "count", 0);
        setIntField(term126064, term126064.getClass(), "threshold", 0);
        setFloatField(term126064, term126064.getClass(), "loadFactor", 0.0F);
        setIntField(term126064, term126064.getClass(), "modCount", 0);
        setField(term126064, term126064.getClass(), "keySet", null);
        setField(term126064, term126064.getClass(), "entrySet", null);
        setField(term126064, term126064.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "false";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term125496, args);
        assertTrue(recursiveEquals(term125496, term126064));
        assertTrue(recursiveEquals(retValue, "false"));
    }

};


