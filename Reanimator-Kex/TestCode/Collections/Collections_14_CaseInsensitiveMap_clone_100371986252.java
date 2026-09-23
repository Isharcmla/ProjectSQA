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

public class CaseInsensitiveMap_clone_100371986252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10428;
     Object term10790;
     Object term10784;

    public CaseInsensitiveMap_clone_100371986252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10428 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term10297 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 489);
        setField(term10428, term10428.getClass(), "data", term10297);
        term10790 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term10791 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 489);
        setFloatField(term10790, term10790.getClass(), "loadFactor", 0.0F);
        setIntField(term10790, term10790.getClass(), "size", 0);
        setField(term10790, term10790.getClass(), "data", term10791);
        setIntField(term10790, term10790.getClass(), "threshold", 0);
        setIntField(term10790, term10790.getClass(), "modCount", 0);
        setField(term10790, term10790.getClass(), "entrySet", null);
        setField(term10790, term10790.getClass(), "keySet", null);
        setField(term10790, term10790.getClass(), "values", null);
        setField(term10790, term10790.getClass(), "keySet", null);
        setField(term10790, term10790.getClass(), "values", null);
        term10784 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term10787 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 489);
        setFloatField(term10784, term10784.getClass(), "loadFactor", 0.0F);
        setIntField(term10784, term10784.getClass(), "size", 0);
        setField(term10784, term10784.getClass(), "data", term10787);
        setIntField(term10784, term10784.getClass(), "threshold", 0);
        setIntField(term10784, term10784.getClass(), "modCount", 0);
        setField(term10784, term10784.getClass(), "entrySet", null);
        setField(term10784, term10784.getClass(), "keySet", null);
        setField(term10784, term10784.getClass(), "values", null);
        setField(term10784, term10784.getClass(), "keySet", null);
        setField(term10784, term10784.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term10428, args);
        assertTrue(recursiveEquals(term10428, term10790));
        assertTrue(recursiveEquals(retValue, term10784));
    }

};


