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

public class ExtendedProperties_testBoolean_1991462572182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62361;
     Object term62895;

    public ExtendedProperties_testBoolean_1991462572182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62361 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term62895 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term62895, term62895.getClass(), "defaults", null);
        setField(term62895, term62895.getClass(), "file", null);
        setField(term62895, term62895.getClass(), "basePath", null);
        setField(term62895, term62895.getClass(), "fileSeparator", null);
        setBooleanField(term62895, term62895.getClass(), "isInitialized", false);
        setField(term62895, term62895.getClass(), "keysAsListed", null);
        setField(term62895, term62895.getClass(), "table", null);
        setIntField(term62895, term62895.getClass(), "count", 0);
        setIntField(term62895, term62895.getClass(), "threshold", 0);
        setFloatField(term62895, term62895.getClass(), "loadFactor", 0.0F);
        setIntField(term62895, term62895.getClass(), "modCount", 0);
        setField(term62895, term62895.getClass(), "keySet", null);
        setField(term62895, term62895.getClass(), "entrySet", null);
        setField(term62895, term62895.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term62361, args);
        assertTrue(recursiveEquals(term62361, term62895));
        assertTrue(recursiveEquals(retValue, null));
    }

};


