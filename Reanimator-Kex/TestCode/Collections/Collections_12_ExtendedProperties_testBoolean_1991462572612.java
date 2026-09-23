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

public class ExtendedProperties_testBoolean_1991462572612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464548;
     Object term464601;

    public ExtendedProperties_testBoolean_1991462572612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464548 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term464601 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term464601, term464601.getClass(), "defaults", null);
        setField(term464601, term464601.getClass(), "file", null);
        setField(term464601, term464601.getClass(), "basePath", null);
        setField(term464601, term464601.getClass(), "fileSeparator", null);
        setBooleanField(term464601, term464601.getClass(), "isInitialized", false);
        setField(term464601, term464601.getClass(), "includePropertyName", null);
        setField(term464601, term464601.getClass(), "keysAsListed", null);
        setField(term464601, term464601.getClass(), "table", null);
        setIntField(term464601, term464601.getClass(), "count", 0);
        setIntField(term464601, term464601.getClass(), "threshold", 0);
        setFloatField(term464601, term464601.getClass(), "loadFactor", 0.0F);
        setIntField(term464601, term464601.getClass(), "modCount", 0);
        setField(term464601, term464601.getClass(), "keySet", null);
        setField(term464601, term464601.getClass(), "entrySet", null);
        setField(term464601, term464601.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term464548, args);
        assertTrue(recursiveEquals(term464548, term464601));
        assertTrue(recursiveEquals(retValue, null));
    }

};


