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

public class ExtendedProperties_getInclude_1778893229414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186267;
     Object term186410;

    public ExtendedProperties_getInclude_1778893229414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186267 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term186267, term186267.getClass(), "includePropertyName", null);
        term186410 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term186410, term186410.getClass(), "defaults", null);
        setField(term186410, term186410.getClass(), "file", null);
        setField(term186410, term186410.getClass(), "basePath", null);
        setField(term186410, term186410.getClass(), "fileSeparator", null);
        setBooleanField(term186410, term186410.getClass(), "isInitialized", false);
        setField(term186410, term186410.getClass(), "includePropertyName", null);
        setField(term186410, term186410.getClass(), "keysAsListed", null);
        setField(term186410, term186410.getClass(), "table", null);
        setIntField(term186410, term186410.getClass(), "count", 0);
        setIntField(term186410, term186410.getClass(), "threshold", 0);
        setFloatField(term186410, term186410.getClass(), "loadFactor", 0.0F);
        setIntField(term186410, term186410.getClass(), "modCount", 0);
        setField(term186410, term186410.getClass(), "keySet", null);
        setField(term186410, term186410.getClass(), "entrySet", null);
        setField(term186410, term186410.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInclude", argTypes, term186267, args);
        assertTrue(recursiveEquals(term186267, term186410));
        assertTrue(recursiveEquals(retValue, "include"));
    }

};


