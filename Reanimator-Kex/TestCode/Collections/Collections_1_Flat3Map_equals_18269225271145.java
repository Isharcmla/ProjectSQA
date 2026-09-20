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
import java.util.HashMap;
import java.lang.Object;

public class Flat3Map_equals_18269225271145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238483;
     Object term238825;
     Object term247301;
     Object term247306;

    public Flat3Map_equals_18269225271145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term238849 = new HashMap();
        term238483 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term238623 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term238733 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term238483, term238483.getClass(), "delegateMap", null);
        setIntField(term238483, term238483.getClass(), "size", 2);
        setField(term238483, term238483.getClass(), "key2", term238849);
        setField(term238483, term238483.getClass(), "value2", null);
        setField(term238483, term238483.getClass(), "key1", null);
        setField(term238623, term238623.getClass(), "delegateMap", term238733);
        setField(term238483, term238483.getClass(), "value1", term238623);
        term238825 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term238959 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term238825, term238825.getClass(), "delegateMap", null);
        setIntField(term238825, term238825.getClass(), "size", 2);
        setIntField(term238825, term238825.getClass(), "hash2", 0);
        setField(term238825, term238825.getClass(), "key2", term238849);
        setField(term238825, term238825.getClass(), "value2", null);
        setField(term238825, term238825.getClass(), "key1", null);
        setField(term238825, term238825.getClass(), "value1", term238959);
        HashMap term247302 = new HashMap();
        term247301 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247304 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247305 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term247301, term247301.getClass(), "size", 2);
        setIntField(term247301, term247301.getClass(), "hash1", 0);
        setIntField(term247301, term247301.getClass(), "hash2", 0);
        setIntField(term247301, term247301.getClass(), "hash3", 0);
        setField(term247301, term247301.getClass(), "key1", null);
        setField(term247301, term247301.getClass(), "key2", term247302);
        setField(term247301, term247301.getClass(), "key3", null);
        setIntField(term247304, term247304.getClass(), "size", 0);
        setIntField(term247304, term247304.getClass(), "hash1", 0);
        setIntField(term247304, term247304.getClass(), "hash2", 0);
        setIntField(term247304, term247304.getClass(), "hash3", 0);
        setField(term247304, term247304.getClass(), "key1", null);
        setField(term247304, term247304.getClass(), "key2", null);
        setField(term247304, term247304.getClass(), "key3", null);
        setField(term247304, term247304.getClass(), "value1", null);
        setField(term247304, term247304.getClass(), "value2", null);
        setField(term247304, term247304.getClass(), "value3", null);
        setFloatField(term247305, term247305.getClass(), "loadFactor", 0.0F);
        setIntField(term247305, term247305.getClass(), "size", 0);
        setField(term247305, term247305.getClass(), "data", null);
        setIntField(term247305, term247305.getClass(), "threshold", 0);
        setIntField(term247305, term247305.getClass(), "modCount", 0);
        setField(term247305, term247305.getClass(), "entrySet", null);
        setField(term247305, term247305.getClass(), "keySet", null);
        setField(term247305, term247305.getClass(), "values", null);
        setField(term247305, term247305.getClass(), "keySet", null);
        setField(term247305, term247305.getClass(), "values", null);
        setField(term247304, term247304.getClass(), "delegateMap", term247305);
        setField(term247301, term247301.getClass(), "value1", term247304);
        setField(term247301, term247301.getClass(), "value2", null);
        setField(term247301, term247301.getClass(), "value3", null);
        setField(term247301, term247301.getClass(), "delegateMap", null);
        HashMap term247307 = new HashMap();
        term247306 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247309 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term247306, term247306.getClass(), "size", 2);
        setIntField(term247306, term247306.getClass(), "hash1", 0);
        setIntField(term247306, term247306.getClass(), "hash2", 0);
        setIntField(term247306, term247306.getClass(), "hash3", 0);
        setField(term247306, term247306.getClass(), "key1", null);
        setField(term247306, term247306.getClass(), "key2", term247307);
        setField(term247306, term247306.getClass(), "key3", null);
        setFloatField(term247309, term247309.getClass(), "loadFactor", 0.0F);
        setIntField(term247309, term247309.getClass(), "size", 0);
        setField(term247309, term247309.getClass(), "data", null);
        setIntField(term247309, term247309.getClass(), "threshold", 0);
        setIntField(term247309, term247309.getClass(), "modCount", 0);
        setField(term247309, term247309.getClass(), "entrySet", null);
        setField(term247309, term247309.getClass(), "keySet", null);
        setField(term247309, term247309.getClass(), "values", null);
        setField(term247309, term247309.getClass(), "keySet", null);
        setField(term247309, term247309.getClass(), "values", null);
        setField(term247306, term247306.getClass(), "value1", term247309);
        setField(term247306, term247306.getClass(), "value2", null);
        setField(term247306, term247306.getClass(), "value3", null);
        setField(term247306, term247306.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term238825;
        Object retValue = callMethod(klass, "equals", argTypes, term238483, args);
        assertTrue(recursiveEquals(term238483, term247301));
        assertTrue(recursiveEquals(term238825, term247306));
        assertTrue(recursiveEquals(retValue, true));
    }

};
