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

public class CaseInsensitiveMap_init_50923775881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14775;

    public CaseInsensitiveMap_init_50923775881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13481 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term13481, term13481.getClass(), "loadFactor", 0.0F);
        term14775 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term14776 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 512);
        setFloatField(term14775, term14775.getClass(), "loadFactor", 0.75F);
        setIntField(term14775, term14775.getClass(), "size", 0);
        setField(term14775, term14775.getClass(), "data", term14776);
        setIntField(term14775, term14775.getClass(), "threshold", 384);
        setIntField(term14775, term14775.getClass(), "modCount", 0);
        setField(term14775, term14775.getClass(), "entrySet", null);
        setField(term14775, term14775.getClass(), "keySet", null);
        setField(term14775, term14775.getClass(), "values", null);
        setField(term14775, term14775.getClass(), "keySet", null);
        setField(term14775, term14775.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 384;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14775));
    }

};


