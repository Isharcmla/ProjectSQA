package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class MultiValueMap_putAll_743377327112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23270;
     Object term24074;
     Object term24077;

    public MultiValueMap_putAll_743377327112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23270 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term23316 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap"));
        setField(term23270, term23270.getClass(), "map", term23316);
        term24074 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term24075 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap"));
        Object term24076 = newInstance(Class.forName("java.util.HashMap$EntrySet"));
        setField(term24074, term24074.getClass(), "collectionFactory", null);
        setField(term24074, term24074.getClass(), "valuesView", null);
        setField(term24075, term24075.getClass(), "values", null);
        setField(term24075, term24075.getClass(), "table", null);
        setField(term24076, term24076.getClass(), "this$0", term24075);
        setField(term24075, term24075.getClass(), "entrySet", term24076);
        setIntField(term24075, term24075.getClass(), "size", 0);
        setIntField(term24075, term24075.getClass(), "modCount", 0);
        setIntField(term24075, term24075.getClass(), "threshold", 0);
        setFloatField(term24075, term24075.getClass(), "loadFactor", 0.0F);
        setField(term24075, term24075.getClass(), "keySet", null);
        setField(term24074, term24074.getClass(), "map", term24075);
        term24077 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term24078 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap"));
        Object term24079 = newInstance(Class.forName("java.util.HashMap$EntrySet"));
        setField(term24077, term24077.getClass(), "collectionFactory", null);
        setField(term24077, term24077.getClass(), "valuesView", null);
        setField(term24078, term24078.getClass(), "values", null);
        setField(term24078, term24078.getClass(), "table", null);
        setField(term24079, term24079.getClass(), "this$0", term24078);
        setField(term24078, term24078.getClass(), "entrySet", term24079);
        setIntField(term24078, term24078.getClass(), "size", 0);
        setIntField(term24078, term24078.getClass(), "modCount", 0);
        setIntField(term24078, term24078.getClass(), "threshold", 0);
        setFloatField(term24078, term24078.getClass(), "loadFactor", 0.0F);
        setField(term24078, term24078.getClass(), "keySet", null);
        setField(term24077, term24077.getClass(), "map", term24078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term23270;
        callMethod(klass, "putAll", argTypes, term23270, args);
        assertTrue(recursiveEquals(term23270, term24074));
        assertTrue(recursiveEquals(term23270, term24077));
    }

};


