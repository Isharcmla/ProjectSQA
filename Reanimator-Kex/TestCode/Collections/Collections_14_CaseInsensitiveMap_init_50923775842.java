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

public class CaseInsensitiveMap_init_50923775842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9775;

    public CaseInsensitiveMap_init_50923775842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8421 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term8421, term8421.getClass(), "loadFactor", 0.0F);
        term9775 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term9776 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 268435456);
        setFloatField(term9775, term9775.getClass(), "loadFactor", 0.75F);
        setIntField(term9775, term9775.getClass(), "size", 0);
        setField(term9775, term9775.getClass(), "data", term9776);
        setIntField(term9775, term9775.getClass(), "threshold", 201326592);
        setIntField(term9775, term9775.getClass(), "modCount", 0);
        setField(term9775, term9775.getClass(), "entrySet", null);
        setField(term9775, term9775.getClass(), "keySet", null);
        setField(term9775, term9775.getClass(), "values", null);
        setField(term9775, term9775.getClass(), "keySet", null);
        setField(term9775, term9775.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 268435455;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9775));
    }

};


