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

public class ExtendedProperties_interpolateHelper_838657399226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120456;
     Object term120879;

    public ExtendedProperties_interpolateHelper_838657399226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120456 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term120879 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term120879, term120879.getClass(), "defaults", null);
        setField(term120879, term120879.getClass(), "file", null);
        setField(term120879, term120879.getClass(), "basePath", null);
        setField(term120879, term120879.getClass(), "fileSeparator", null);
        setBooleanField(term120879, term120879.getClass(), "isInitialized", false);
        setField(term120879, term120879.getClass(), "includePropertyName", null);
        setField(term120879, term120879.getClass(), "keysAsListed", null);
        setField(term120879, term120879.getClass(), "table", null);
        setIntField(term120879, term120879.getClass(), "count", 0);
        setIntField(term120879, term120879.getClass(), "threshold", 0);
        setFloatField(term120879, term120879.getClass(), "loadFactor", 0.0F);
        setIntField(term120879, term120879.getClass(), "modCount", 0);
        setField(term120879, term120879.getClass(), "keySet", null);
        setField(term120879, term120879.getClass(), "entrySet", null);
        setField(term120879, term120879.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        Object retValue = callMethod(klass, "interpolateHelper", argTypes, term120456, args);
        assertTrue(recursiveEquals(term120456, term120879));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


