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

public class ExtendedProperties_testBoolean_1991462572641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307288;
     Object term307341;

    public ExtendedProperties_testBoolean_1991462572641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307288 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term307341 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term307341, term307341.getClass(), "defaults", null);
        setField(term307341, term307341.getClass(), "file", null);
        setField(term307341, term307341.getClass(), "basePath", null);
        setField(term307341, term307341.getClass(), "fileSeparator", null);
        setBooleanField(term307341, term307341.getClass(), "isInitialized", false);
        setField(term307341, term307341.getClass(), "includePropertyName", null);
        setField(term307341, term307341.getClass(), "keysAsListed", null);
        setField(term307341, term307341.getClass(), "table", null);
        setIntField(term307341, term307341.getClass(), "count", 0);
        setIntField(term307341, term307341.getClass(), "threshold", 0);
        setFloatField(term307341, term307341.getClass(), "loadFactor", 0.0F);
        setIntField(term307341, term307341.getClass(), "modCount", 0);
        setField(term307341, term307341.getClass(), "keySet", null);
        setField(term307341, term307341.getClass(), "entrySet", null);
        setField(term307341, term307341.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term307288, args);
        assertTrue(recursiveEquals(term307288, term307341));
        assertTrue(recursiveEquals(retValue, null));
    }

};


