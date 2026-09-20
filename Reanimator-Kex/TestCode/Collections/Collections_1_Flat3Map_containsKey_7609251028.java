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
     Object term75;
     Object term91;

    public Flat3Map_containsKey_7609251028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term80 = newInstance(Class.forName("java.lang.Object"));
        Object term81 = newInstance(Class.forName("java.lang.Object"));
        Object term82 = newInstance(Class.forName("java.lang.Object"));
        Object term83 = newInstance(Class.forName("java.lang.Object"));
        Object term84 = newInstance(Class.forName("java.lang.Object"));
        Object term85 = newInstance(Class.forName("java.lang.Object"));
        Object term86 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term75, term75.getClass(), "size", -893623680);
        setIntField(term75, term75.getClass(), "hash1", -1963434938);
        setIntField(term75, term75.getClass(), "hash2", 906181092);
        setIntField(term75, term75.getClass(), "hash3", 1045657203);
        setField(term75, term75.getClass(), "key1", term80);
        setField(term75, term75.getClass(), "key2", term81);
        setField(term75, term75.getClass(), "key3", term82);
        setField(term75, term75.getClass(), "value1", term83);
        setField(term75, term75.getClass(), "value2", term84);
        setField(term75, term75.getClass(), "value3", term85);
        setFloatField(term86, term86.getClass(), "loadFactor", 0.0F);
        setIntField(term86, term86.getClass(), "size", 0);
        setField(term86, term86.getClass(), "data", null);
        setIntField(term86, term86.getClass(), "threshold", 0);
        setIntField(term86, term86.getClass(), "modCount", 0);
        setField(term86, term86.getClass(), "entrySet", null);
        setField(term86, term86.getClass(), "keySet", null);
        setField(term86, term86.getClass(), "values", null);
        setField(term86, term86.getClass(), "keySet", null);
        setField(term86, term86.getClass(), "values", null);
        setField(term75, term75.getClass(), "delegateMap", term86);
        term91 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term91;
        try {
            callMethod(klass, "containsKey", argTypes, term75, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
