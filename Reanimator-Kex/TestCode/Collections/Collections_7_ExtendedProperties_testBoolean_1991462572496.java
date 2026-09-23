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

public class ExtendedProperties_testBoolean_1991462572496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130403;
     Object term131555;

    public ExtendedProperties_testBoolean_1991462572496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130403 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term131555 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term131555, term131555.getClass(), "defaults", null);
        setField(term131555, term131555.getClass(), "file", null);
        setField(term131555, term131555.getClass(), "basePath", null);
        setField(term131555, term131555.getClass(), "fileSeparator", null);
        setBooleanField(term131555, term131555.getClass(), "isInitialized", false);
        setField(term131555, term131555.getClass(), "includePropertyName", null);
        setField(term131555, term131555.getClass(), "keysAsListed", null);
        setField(term131555, term131555.getClass(), "table", null);
        setIntField(term131555, term131555.getClass(), "count", 0);
        setIntField(term131555, term131555.getClass(), "threshold", 0);
        setFloatField(term131555, term131555.getClass(), "loadFactor", 0.0F);
        setIntField(term131555, term131555.getClass(), "modCount", 0);
        setField(term131555, term131555.getClass(), "keySet", null);
        setField(term131555, term131555.getClass(), "entrySet", null);
        setField(term131555, term131555.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "true";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term130403, args);
        assertTrue(recursiveEquals(term130403, term131555));
        assertTrue(recursiveEquals(retValue, "true"));
    }

};


