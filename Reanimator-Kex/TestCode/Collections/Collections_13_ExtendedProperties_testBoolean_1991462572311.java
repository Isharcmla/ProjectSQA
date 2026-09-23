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

public class ExtendedProperties_testBoolean_1991462572311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116950;
     Object term117013;

    public ExtendedProperties_testBoolean_1991462572311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116950 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term117013 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term117013, term117013.getClass(), "defaults", null);
        setField(term117013, term117013.getClass(), "file", null);
        setField(term117013, term117013.getClass(), "basePath", null);
        setField(term117013, term117013.getClass(), "fileSeparator", null);
        setBooleanField(term117013, term117013.getClass(), "isInitialized", false);
        setField(term117013, term117013.getClass(), "includePropertyName", null);
        setField(term117013, term117013.getClass(), "keysAsListed", null);
        setField(term117013, term117013.getClass(), "table", null);
        setIntField(term117013, term117013.getClass(), "count", 0);
        setIntField(term117013, term117013.getClass(), "threshold", 0);
        setFloatField(term117013, term117013.getClass(), "loadFactor", 0.0F);
        setIntField(term117013, term117013.getClass(), "modCount", 0);
        setField(term117013, term117013.getClass(), "keySet", null);
        setField(term117013, term117013.getClass(), "entrySet", null);
        setField(term117013, term117013.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term116950, args);
        assertTrue(recursiveEquals(term116950, term117013));
        assertTrue(recursiveEquals(retValue, null));
    }

};


