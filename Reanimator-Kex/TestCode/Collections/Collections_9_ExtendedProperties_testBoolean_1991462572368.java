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

public class ExtendedProperties_testBoolean_1991462572368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152786;
     Object term152969;

    public ExtendedProperties_testBoolean_1991462572368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152786 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term152969 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term152969, term152969.getClass(), "defaults", null);
        setField(term152969, term152969.getClass(), "file", null);
        setField(term152969, term152969.getClass(), "basePath", null);
        setField(term152969, term152969.getClass(), "fileSeparator", null);
        setBooleanField(term152969, term152969.getClass(), "isInitialized", false);
        setField(term152969, term152969.getClass(), "includePropertyName", null);
        setField(term152969, term152969.getClass(), "keysAsListed", null);
        setField(term152969, term152969.getClass(), "table", null);
        setIntField(term152969, term152969.getClass(), "count", 0);
        setIntField(term152969, term152969.getClass(), "threshold", 0);
        setFloatField(term152969, term152969.getClass(), "loadFactor", 0.0F);
        setIntField(term152969, term152969.getClass(), "modCount", 0);
        setField(term152969, term152969.getClass(), "keySet", null);
        setField(term152969, term152969.getClass(), "entrySet", null);
        setField(term152969, term152969.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "true";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term152786, args);
        assertTrue(recursiveEquals(term152786, term152969));
        assertTrue(recursiveEquals(retValue, "true"));
    }

};


