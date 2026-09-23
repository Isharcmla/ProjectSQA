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

public class ExtendedProperties_testBoolean_1991462572253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77074;
     Object term77377;

    public ExtendedProperties_testBoolean_1991462572253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77074 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term77377 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term77377, term77377.getClass(), "defaults", null);
        setField(term77377, term77377.getClass(), "file", null);
        setField(term77377, term77377.getClass(), "basePath", null);
        setField(term77377, term77377.getClass(), "fileSeparator", null);
        setBooleanField(term77377, term77377.getClass(), "isInitialized", false);
        setField(term77377, term77377.getClass(), "keysAsListed", null);
        setField(term77377, term77377.getClass(), "table", null);
        setIntField(term77377, term77377.getClass(), "count", 0);
        setIntField(term77377, term77377.getClass(), "threshold", 0);
        setFloatField(term77377, term77377.getClass(), "loadFactor", 0.0F);
        setIntField(term77377, term77377.getClass(), "modCount", 0);
        setField(term77377, term77377.getClass(), "keySet", null);
        setField(term77377, term77377.getClass(), "entrySet", null);
        setField(term77377, term77377.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term77074, args);
        assertTrue(recursiveEquals(term77074, term77377));
        assertTrue(recursiveEquals(retValue, null));
    }

};


