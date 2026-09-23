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

public class ExtendedProperties_interpolate_134704223330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390336;
     Object term390390;

    public ExtendedProperties_interpolate_134704223330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390336 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term390390 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term390390, term390390.getClass(), "defaults", null);
        setField(term390390, term390390.getClass(), "file", null);
        setField(term390390, term390390.getClass(), "basePath", null);
        setField(term390390, term390390.getClass(), "fileSeparator", null);
        setBooleanField(term390390, term390390.getClass(), "isInitialized", false);
        setField(term390390, term390390.getClass(), "includePropertyName", null);
        setField(term390390, term390390.getClass(), "keysAsListed", null);
        setField(term390390, term390390.getClass(), "table", null);
        setIntField(term390390, term390390.getClass(), "count", 0);
        setIntField(term390390, term390390.getClass(), "threshold", 0);
        setFloatField(term390390, term390390.getClass(), "loadFactor", 0.0F);
        setIntField(term390390, term390390.getClass(), "modCount", 0);
        setField(term390390, term390390.getClass(), "keySet", null);
        setField(term390390, term390390.getClass(), "entrySet", null);
        setField(term390390, term390390.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "interpolate", argTypes, term390336, args);
        assertTrue(recursiveEquals(term390336, term390390));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


