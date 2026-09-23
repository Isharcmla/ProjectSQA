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

public class CaseInsensitiveMap_init_509237758101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17969;

    public CaseInsensitiveMap_init_509237758101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17332 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term17332, term17332.getClass(), "loadFactor", 0.0F);
        term17969 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term17970 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 262144);
        setFloatField(term17969, term17969.getClass(), "loadFactor", 0.75F);
        setIntField(term17969, term17969.getClass(), "size", 0);
        setField(term17969, term17969.getClass(), "data", term17970);
        setIntField(term17969, term17969.getClass(), "threshold", 196608);
        setIntField(term17969, term17969.getClass(), "modCount", 0);
        setField(term17969, term17969.getClass(), "entrySet", null);
        setField(term17969, term17969.getClass(), "keySet", null);
        setField(term17969, term17969.getClass(), "values", null);
        setField(term17969, term17969.getClass(), "keySet", null);
        setField(term17969, term17969.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 262143;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17969));
    }

};


