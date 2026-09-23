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

public class CaseInsensitiveMap_clone_100371986263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11854;
     Object term12006;
     Object term12000;

    public CaseInsensitiveMap_clone_100371986263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11854 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term11711 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 1);
        Object term11978 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$Values"));
        setField(term11854, term11854.getClass(), "data", term11711);
        setField(term11854, term11854.getClass(), "entrySet", null);
        setField(term11854, term11854.getClass(), "keySet", null);
        setField(term11854, term11854.getClass(), "values", term11978);
        setIntField(term11854, term11854.getClass(), "modCount", 0);
        setIntField(term11854, term11854.getClass(), "size", 0);
        term12006 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term12007 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 1);
        Object term12008 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$Values"));
        setFloatField(term12006, term12006.getClass(), "loadFactor", 0.0F);
        setIntField(term12006, term12006.getClass(), "size", 0);
        setField(term12006, term12006.getClass(), "data", term12007);
        setIntField(term12006, term12006.getClass(), "threshold", 0);
        setIntField(term12006, term12006.getClass(), "modCount", 0);
        setField(term12006, term12006.getClass(), "entrySet", null);
        setField(term12006, term12006.getClass(), "keySet", null);
        setField(term12008, term12008.getClass(), "parent", null);
        setField(term12006, term12006.getClass(), "values", term12008);
        setField(term12006, term12006.getClass(), "keySet", null);
        setField(term12006, term12006.getClass(), "values", null);
        term12000 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term12003 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 1);
        setFloatField(term12000, term12000.getClass(), "loadFactor", 0.0F);
        setIntField(term12000, term12000.getClass(), "size", 0);
        setField(term12000, term12000.getClass(), "data", term12003);
        setIntField(term12000, term12000.getClass(), "threshold", 0);
        setIntField(term12000, term12000.getClass(), "modCount", 0);
        setField(term12000, term12000.getClass(), "entrySet", null);
        setField(term12000, term12000.getClass(), "keySet", null);
        setField(term12000, term12000.getClass(), "values", null);
        setField(term12000, term12000.getClass(), "keySet", null);
        setField(term12000, term12000.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term11854, args);
        assertTrue(recursiveEquals(term11854, term12006));
        assertTrue(recursiveEquals(retValue, term12000));
    }

};


