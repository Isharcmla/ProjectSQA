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
import java.util.ArrayList;

public class ExtendedProperties_interpolateHelper_838657399127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80837;
     Object term80927;
     Object term80945;
     Object term80948;

    public ExtendedProperties_interpolateHelper_838657399127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80837 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term80927 = new ArrayList();
        term80945 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term80945, term80945.getClass(), "defaults", null);
        setField(term80945, term80945.getClass(), "file", null);
        setField(term80945, term80945.getClass(), "basePath", null);
        setField(term80945, term80945.getClass(), "fileSeparator", null);
        setBooleanField(term80945, term80945.getClass(), "isInitialized", false);
        setField(term80945, term80945.getClass(), "includePropertyName", null);
        setField(term80945, term80945.getClass(), "keysAsListed", null);
        setField(term80945, term80945.getClass(), "table", null);
        setIntField(term80945, term80945.getClass(), "count", 0);
        setIntField(term80945, term80945.getClass(), "threshold", 0);
        setFloatField(term80945, term80945.getClass(), "loadFactor", 0.0F);
        setIntField(term80945, term80945.getClass(), "modCount", 0);
        setField(term80945, term80945.getClass(), "keySet", null);
        setField(term80945, term80945.getClass(), "entrySet", null);
        setField(term80945, term80945.getClass(), "values", null);
        term80948 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term80927;
        Object retValue = callMethod(klass, "interpolateHelper", argTypes, term80837, args);
        assertTrue(recursiveEquals(term80837, term80945));
        assertTrue(recursiveEquals(term80927, term80948));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


