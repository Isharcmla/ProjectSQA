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

public class ExtendedProperties_putAll_841024344893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14177771;
     Object term14177824;
     Object term14177827;

    public ExtendedProperties_putAll_841024344893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14177797 = new ArrayList();
        term14177771 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term14177771, term14177771.getClass(), "keysAsListed", term14177797);
        ArrayList term14177825 = new ArrayList();
        term14177824 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term14177824, term14177824.getClass(), "defaults", null);
        setField(term14177824, term14177824.getClass(), "file", null);
        setField(term14177824, term14177824.getClass(), "basePath", null);
        setField(term14177824, term14177824.getClass(), "fileSeparator", null);
        setBooleanField(term14177824, term14177824.getClass(), "isInitialized", false);
        setField(term14177824, term14177824.getClass(), "includePropertyName", null);
        setField(term14177824, term14177824.getClass(), "keysAsListed", term14177825);
        setField(term14177824, term14177824.getClass(), "table", null);
        setIntField(term14177824, term14177824.getClass(), "count", 0);
        setIntField(term14177824, term14177824.getClass(), "threshold", 0);
        setFloatField(term14177824, term14177824.getClass(), "loadFactor", 0.0F);
        setIntField(term14177824, term14177824.getClass(), "modCount", 0);
        setField(term14177824, term14177824.getClass(), "keySet", null);
        setField(term14177824, term14177824.getClass(), "entrySet", null);
        setField(term14177824, term14177824.getClass(), "values", null);
        ArrayList term14177828 = new ArrayList();
        term14177827 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term14177827, term14177827.getClass(), "defaults", null);
        setField(term14177827, term14177827.getClass(), "file", null);
        setField(term14177827, term14177827.getClass(), "basePath", null);
        setField(term14177827, term14177827.getClass(), "fileSeparator", null);
        setBooleanField(term14177827, term14177827.getClass(), "isInitialized", false);
        setField(term14177827, term14177827.getClass(), "includePropertyName", null);
        setField(term14177827, term14177827.getClass(), "keysAsListed", term14177828);
        setField(term14177827, term14177827.getClass(), "table", null);
        setIntField(term14177827, term14177827.getClass(), "count", 0);
        setIntField(term14177827, term14177827.getClass(), "threshold", 0);
        setFloatField(term14177827, term14177827.getClass(), "loadFactor", 0.0F);
        setIntField(term14177827, term14177827.getClass(), "modCount", 0);
        setField(term14177827, term14177827.getClass(), "keySet", null);
        setField(term14177827, term14177827.getClass(), "entrySet", null);
        setField(term14177827, term14177827.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term14177771;
        callMethod(klass, "putAll", argTypes, term14177771, args);
        assertTrue(recursiveEquals(term14177771, term14177824));
        assertTrue(recursiveEquals(term14177771, term14177827));
    }

};


