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

public class CaseInsensitiveMap_init_509237758123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22209;

    public CaseInsensitiveMap_init_509237758123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22180 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term22180, term22180.getClass(), "loadFactor", 0.0F);
        term22209 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term22210 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 1024);
        setFloatField(term22209, term22209.getClass(), "loadFactor", 0.75F);
        setIntField(term22209, term22209.getClass(), "size", 0);
        setField(term22209, term22209.getClass(), "data", term22210);
        setIntField(term22209, term22209.getClass(), "threshold", 768);
        setIntField(term22209, term22209.getClass(), "modCount", 0);
        setField(term22209, term22209.getClass(), "entrySet", null);
        setField(term22209, term22209.getClass(), "keySet", null);
        setField(term22209, term22209.getClass(), "values", null);
        setField(term22209, term22209.getClass(), "keySet", null);
        setField(term22209, term22209.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1023;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22209));
    }

};


