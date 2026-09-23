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

public class ExtendedProperties_testBoolean_1991462572465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197959;
     Object term198279;

    public ExtendedProperties_testBoolean_1991462572465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197959 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term198279 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term198279, term198279.getClass(), "defaults", null);
        setField(term198279, term198279.getClass(), "file", null);
        setField(term198279, term198279.getClass(), "basePath", null);
        setField(term198279, term198279.getClass(), "fileSeparator", null);
        setBooleanField(term198279, term198279.getClass(), "isInitialized", false);
        setField(term198279, term198279.getClass(), "includePropertyName", null);
        setField(term198279, term198279.getClass(), "keysAsListed", null);
        setField(term198279, term198279.getClass(), "table", null);
        setIntField(term198279, term198279.getClass(), "count", 0);
        setIntField(term198279, term198279.getClass(), "threshold", 0);
        setFloatField(term198279, term198279.getClass(), "loadFactor", 0.0F);
        setIntField(term198279, term198279.getClass(), "modCount", 0);
        setField(term198279, term198279.getClass(), "keySet", null);
        setField(term198279, term198279.getClass(), "entrySet", null);
        setField(term198279, term198279.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "false";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term197959, args);
        assertTrue(recursiveEquals(term197959, term198279));
        assertTrue(recursiveEquals(retValue, "false"));
    }

};


