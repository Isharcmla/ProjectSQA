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

public class ExtendedProperties_testBoolean_1991462572411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185846;
     Object term186151;

    public ExtendedProperties_testBoolean_1991462572411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185846 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term186151 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term186151, term186151.getClass(), "defaults", null);
        setField(term186151, term186151.getClass(), "file", null);
        setField(term186151, term186151.getClass(), "basePath", null);
        setField(term186151, term186151.getClass(), "fileSeparator", null);
        setBooleanField(term186151, term186151.getClass(), "isInitialized", false);
        setField(term186151, term186151.getClass(), "includePropertyName", null);
        setField(term186151, term186151.getClass(), "keysAsListed", null);
        setField(term186151, term186151.getClass(), "table", null);
        setIntField(term186151, term186151.getClass(), "count", 0);
        setIntField(term186151, term186151.getClass(), "threshold", 0);
        setFloatField(term186151, term186151.getClass(), "loadFactor", 0.0F);
        setIntField(term186151, term186151.getClass(), "modCount", 0);
        setField(term186151, term186151.getClass(), "keySet", null);
        setField(term186151, term186151.getClass(), "entrySet", null);
        setField(term186151, term186151.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term185846, args);
        assertTrue(recursiveEquals(term185846, term186151));
        assertTrue(recursiveEquals(retValue, null));
    }

};


