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

public class ExtendedProperties_interpolateHelper_838657399226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71994;
     Object term72084;
     Object term72362;
     Object term72365;

    public ExtendedProperties_interpolateHelper_838657399226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71994 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term72084 = new ArrayList();
        term72362 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term72362, term72362.getClass(), "defaults", null);
        setField(term72362, term72362.getClass(), "file", null);
        setField(term72362, term72362.getClass(), "basePath", null);
        setField(term72362, term72362.getClass(), "fileSeparator", null);
        setBooleanField(term72362, term72362.getClass(), "isInitialized", false);
        setField(term72362, term72362.getClass(), "keysAsListed", null);
        setField(term72362, term72362.getClass(), "table", null);
        setIntField(term72362, term72362.getClass(), "count", 0);
        setIntField(term72362, term72362.getClass(), "threshold", 0);
        setFloatField(term72362, term72362.getClass(), "loadFactor", 0.0F);
        setIntField(term72362, term72362.getClass(), "modCount", 0);
        setField(term72362, term72362.getClass(), "keySet", null);
        setField(term72362, term72362.getClass(), "entrySet", null);
        setField(term72362, term72362.getClass(), "values", null);
        term72365 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term72084;
        Object retValue = callMethod(klass, "interpolateHelper", argTypes, term71994, args);
        assertTrue(recursiveEquals(term71994, term72362));
        assertTrue(recursiveEquals(term72084, term72365));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


