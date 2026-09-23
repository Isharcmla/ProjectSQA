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

public class ExtendedProperties_getInclude_1778893229622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466845;
     Object term466894;

    public ExtendedProperties_getInclude_1778893229622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466845 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term466845, term466845.getClass(), "includePropertyName", "");
        term466894 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term466894, term466894.getClass(), "defaults", null);
        setField(term466894, term466894.getClass(), "file", null);
        setField(term466894, term466894.getClass(), "basePath", null);
        setField(term466894, term466894.getClass(), "fileSeparator", null);
        setBooleanField(term466894, term466894.getClass(), "isInitialized", false);
        setField(term466894, term466894.getClass(), "includePropertyName", "");
        setField(term466894, term466894.getClass(), "keysAsListed", null);
        setField(term466894, term466894.getClass(), "table", null);
        setIntField(term466894, term466894.getClass(), "count", 0);
        setIntField(term466894, term466894.getClass(), "threshold", 0);
        setFloatField(term466894, term466894.getClass(), "loadFactor", 0.0F);
        setIntField(term466894, term466894.getClass(), "modCount", 0);
        setField(term466894, term466894.getClass(), "keySet", null);
        setField(term466894, term466894.getClass(), "entrySet", null);
        setField(term466894, term466894.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInclude", argTypes, term466845, args);
        assertTrue(recursiveEquals(term466845, term466894));
        assertTrue(recursiveEquals(retValue, null));
    }

};


