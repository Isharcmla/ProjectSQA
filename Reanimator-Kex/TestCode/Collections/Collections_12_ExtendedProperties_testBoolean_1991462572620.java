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

public class ExtendedProperties_testBoolean_1991462572620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466658;
     Object term466711;

    public ExtendedProperties_testBoolean_1991462572620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466658 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term466711 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term466711, term466711.getClass(), "defaults", null);
        setField(term466711, term466711.getClass(), "file", null);
        setField(term466711, term466711.getClass(), "basePath", null);
        setField(term466711, term466711.getClass(), "fileSeparator", null);
        setBooleanField(term466711, term466711.getClass(), "isInitialized", false);
        setField(term466711, term466711.getClass(), "includePropertyName", null);
        setField(term466711, term466711.getClass(), "keysAsListed", null);
        setField(term466711, term466711.getClass(), "table", null);
        setIntField(term466711, term466711.getClass(), "count", 0);
        setIntField(term466711, term466711.getClass(), "threshold", 0);
        setFloatField(term466711, term466711.getClass(), "loadFactor", 0.0F);
        setIntField(term466711, term466711.getClass(), "modCount", 0);
        setField(term466711, term466711.getClass(), "keySet", null);
        setField(term466711, term466711.getClass(), "entrySet", null);
        setField(term466711, term466711.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term466658, args);
        assertTrue(recursiveEquals(term466658, term466711));
        assertTrue(recursiveEquals(retValue, null));
    }

};


