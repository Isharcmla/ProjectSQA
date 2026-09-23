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

public class ExtendedProperties_interpolate_134704223383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105804;
     Object term106359;

    public ExtendedProperties_interpolate_134704223383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105804 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term106359 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term106359, term106359.getClass(), "defaults", null);
        setField(term106359, term106359.getClass(), "file", null);
        setField(term106359, term106359.getClass(), "basePath", null);
        setField(term106359, term106359.getClass(), "fileSeparator", null);
        setBooleanField(term106359, term106359.getClass(), "isInitialized", false);
        setField(term106359, term106359.getClass(), "keysAsListed", null);
        setField(term106359, term106359.getClass(), "table", null);
        setIntField(term106359, term106359.getClass(), "count", 0);
        setIntField(term106359, term106359.getClass(), "threshold", 0);
        setFloatField(term106359, term106359.getClass(), "loadFactor", 0.0F);
        setIntField(term106359, term106359.getClass(), "modCount", 0);
        setField(term106359, term106359.getClass(), "keySet", null);
        setField(term106359, term106359.getClass(), "entrySet", null);
        setField(term106359, term106359.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "interpolate", argTypes, term105804, args);
        assertTrue(recursiveEquals(term105804, term106359));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


