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

public class ExtendedProperties_interpolateHelper_838657399588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151717;
     Object term151807;
     Object term151944;
     Object term151947;

    public ExtendedProperties_interpolateHelper_838657399588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151717 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term151807 = new ArrayList();
        term151944 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term151944, term151944.getClass(), "defaults", null);
        setField(term151944, term151944.getClass(), "file", null);
        setField(term151944, term151944.getClass(), "basePath", null);
        setField(term151944, term151944.getClass(), "fileSeparator", null);
        setBooleanField(term151944, term151944.getClass(), "isInitialized", false);
        setField(term151944, term151944.getClass(), "includePropertyName", null);
        setField(term151944, term151944.getClass(), "keysAsListed", null);
        setField(term151944, term151944.getClass(), "table", null);
        setIntField(term151944, term151944.getClass(), "count", 0);
        setIntField(term151944, term151944.getClass(), "threshold", 0);
        setFloatField(term151944, term151944.getClass(), "loadFactor", 0.0F);
        setIntField(term151944, term151944.getClass(), "modCount", 0);
        setField(term151944, term151944.getClass(), "keySet", null);
        setField(term151944, term151944.getClass(), "entrySet", null);
        setField(term151944, term151944.getClass(), "values", null);
        term151947 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term151807;
        Object retValue = callMethod(klass, "interpolateHelper", argTypes, term151717, args);
        assertTrue(recursiveEquals(term151717, term151944));
        assertTrue(recursiveEquals(term151807, term151947));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


