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
import java.util.HashMap;

public class ExtendedProperties_putAll_841024344689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633616;
     Object term633664;
     Object term633731;
     Object term633732;

    public ExtendedProperties_putAll_841024344689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633616 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term633664 = new HashMap();
        term633731 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term633731, term633731.getClass(), "defaults", null);
        setField(term633731, term633731.getClass(), "file", null);
        setField(term633731, term633731.getClass(), "basePath", null);
        setField(term633731, term633731.getClass(), "fileSeparator", null);
        setBooleanField(term633731, term633731.getClass(), "isInitialized", false);
        setField(term633731, term633731.getClass(), "includePropertyName", null);
        setField(term633731, term633731.getClass(), "keysAsListed", null);
        setField(term633731, term633731.getClass(), "table", null);
        setIntField(term633731, term633731.getClass(), "count", 0);
        setIntField(term633731, term633731.getClass(), "threshold", 0);
        setFloatField(term633731, term633731.getClass(), "loadFactor", 0.0F);
        setIntField(term633731, term633731.getClass(), "modCount", 0);
        setField(term633731, term633731.getClass(), "keySet", null);
        setField(term633731, term633731.getClass(), "entrySet", null);
        setField(term633731, term633731.getClass(), "values", null);
        term633732 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term633664;
        callMethod(klass, "putAll", argTypes, term633616, args);
        assertTrue(recursiveEquals(term633616, term633731));
        assertTrue(recursiveEquals(term633664, term633732));
    }

};


