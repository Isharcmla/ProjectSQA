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

public class CaseInsensitiveMap_init_50923775894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16575;

    public CaseInsensitiveMap_init_50923775894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16315 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term16315, term16315.getClass(), "loadFactor", 0.0F);
        term16575 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term16576 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 2097152);
        setFloatField(term16575, term16575.getClass(), "loadFactor", 0.75F);
        setIntField(term16575, term16575.getClass(), "size", 0);
        setField(term16575, term16575.getClass(), "data", term16576);
        setIntField(term16575, term16575.getClass(), "threshold", 1572864);
        setIntField(term16575, term16575.getClass(), "modCount", 0);
        setField(term16575, term16575.getClass(), "entrySet", null);
        setField(term16575, term16575.getClass(), "keySet", null);
        setField(term16575, term16575.getClass(), "values", null);
        setField(term16575, term16575.getClass(), "keySet", null);
        setField(term16575, term16575.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2097151;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16575));
    }

};


