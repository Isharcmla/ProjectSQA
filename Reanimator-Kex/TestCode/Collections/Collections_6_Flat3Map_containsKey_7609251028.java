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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_containsKey_7609251028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term89;

    public Flat3Map_containsKey_7609251028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78 = newInstance(Class.forName("java.lang.Object"));
        Object term79 = newInstance(Class.forName("java.lang.Object"));
        Object term80 = newInstance(Class.forName("java.lang.Object"));
        Object term81 = newInstance(Class.forName("java.lang.Object"));
        Object term82 = newInstance(Class.forName("java.lang.Object"));
        Object term83 = newInstance(Class.forName("java.lang.Object"));
        Object term84 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term73, term73.getClass(), "size", -893623680);
        setIntField(term73, term73.getClass(), "hash1", -1963434938);
        setIntField(term73, term73.getClass(), "hash2", 906181092);
        setIntField(term73, term73.getClass(), "hash3", 1045657203);
        setField(term73, term73.getClass(), "key1", term78);
        setField(term73, term73.getClass(), "key2", term79);
        setField(term73, term73.getClass(), "key3", term80);
        setField(term73, term73.getClass(), "value1", term81);
        setField(term73, term73.getClass(), "value2", term82);
        setField(term73, term73.getClass(), "value3", term83);
        setFloatField(term84, term84.getClass(), "loadFactor", 0.0F);
        setIntField(term84, term84.getClass(), "size", 0);
        setField(term84, term84.getClass(), "data", null);
        setIntField(term84, term84.getClass(), "threshold", 0);
        setIntField(term84, term84.getClass(), "modCount", 0);
        setField(term84, term84.getClass(), "entrySet", null);
        setField(term84, term84.getClass(), "keySet", null);
        setField(term84, term84.getClass(), "values", null);
        setField(term84, term84.getClass(), "keySet", null);
        setField(term84, term84.getClass(), "values", null);
        setField(term73, term73.getClass(), "delegateMap", term84);
        term89 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term89;
        try {
            callMethod(klass, "containsKey", argTypes, term73, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


