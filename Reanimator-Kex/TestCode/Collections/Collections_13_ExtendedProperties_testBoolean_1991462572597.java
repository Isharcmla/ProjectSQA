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

public class ExtendedProperties_testBoolean_1991462572597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275388;
     Object term275441;

    public ExtendedProperties_testBoolean_1991462572597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275388 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term275441 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term275441, term275441.getClass(), "defaults", null);
        setField(term275441, term275441.getClass(), "file", null);
        setField(term275441, term275441.getClass(), "basePath", null);
        setField(term275441, term275441.getClass(), "fileSeparator", null);
        setBooleanField(term275441, term275441.getClass(), "isInitialized", false);
        setField(term275441, term275441.getClass(), "includePropertyName", null);
        setField(term275441, term275441.getClass(), "keysAsListed", null);
        setField(term275441, term275441.getClass(), "table", null);
        setIntField(term275441, term275441.getClass(), "count", 0);
        setIntField(term275441, term275441.getClass(), "threshold", 0);
        setFloatField(term275441, term275441.getClass(), "loadFactor", 0.0F);
        setIntField(term275441, term275441.getClass(), "modCount", 0);
        setField(term275441, term275441.getClass(), "keySet", null);
        setField(term275441, term275441.getClass(), "entrySet", null);
        setField(term275441, term275441.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term275388, args);
        assertTrue(recursiveEquals(term275388, term275441));
        assertTrue(recursiveEquals(retValue, null));
    }

};


