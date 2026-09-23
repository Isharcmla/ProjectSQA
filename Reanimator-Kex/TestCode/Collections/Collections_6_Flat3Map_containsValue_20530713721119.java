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

public class Flat3Map_containsValue_20530713721119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334719;
     Object term334999;
     Object term335178;
     Object term335181;

    public Flat3Map_containsValue_20530713721119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334719 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term334813 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term334907 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term334719, term334719.getClass(), "delegateMap", null);
        setIntField(term334719, term334719.getClass(), "size", 2);
        setIntField(term334813, term334813.getClass(), "size", -1);
        setField(term334719, term334719.getClass(), "value2", term334813);
        setField(term334719, term334719.getClass(), "value1", term334907);
        term334999 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term335093 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term335093, term335093.getClass(), "size", 0);
        setField(term334999, term334999.getClass(), "delegateMap", term335093);
        term335178 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term335179 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term335180 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term335178, term335178.getClass(), "size", 2);
        setIntField(term335178, term335178.getClass(), "hash1", 0);
        setIntField(term335178, term335178.getClass(), "hash2", 0);
        setIntField(term335178, term335178.getClass(), "hash3", 0);
        setField(term335178, term335178.getClass(), "key1", null);
        setField(term335178, term335178.getClass(), "key2", null);
        setField(term335178, term335178.getClass(), "key3", null);
        setField(term335179, term335179.getClass(), "header", null);
        setFloatField(term335179, term335179.getClass(), "loadFactor", 0.0F);
        setIntField(term335179, term335179.getClass(), "size", 0);
        setField(term335179, term335179.getClass(), "data", null);
        setIntField(term335179, term335179.getClass(), "threshold", 0);
        setIntField(term335179, term335179.getClass(), "modCount", 0);
        setField(term335179, term335179.getClass(), "entrySet", null);
        setField(term335179, term335179.getClass(), "keySet", null);
        setField(term335179, term335179.getClass(), "values", null);
        setField(term335179, term335179.getClass(), "keySet", null);
        setField(term335179, term335179.getClass(), "values", null);
        setField(term335178, term335178.getClass(), "value1", term335179);
        setField(term335180, term335180.getClass(), "header", null);
        setFloatField(term335180, term335180.getClass(), "loadFactor", 0.0F);
        setIntField(term335180, term335180.getClass(), "size", -1);
        setField(term335180, term335180.getClass(), "data", null);
        setIntField(term335180, term335180.getClass(), "threshold", 0);
        setIntField(term335180, term335180.getClass(), "modCount", 0);
        setField(term335180, term335180.getClass(), "entrySet", null);
        setField(term335180, term335180.getClass(), "keySet", null);
        setField(term335180, term335180.getClass(), "values", null);
        setField(term335180, term335180.getClass(), "keySet", null);
        setField(term335180, term335180.getClass(), "values", null);
        setField(term335178, term335178.getClass(), "value2", term335180);
        setField(term335178, term335178.getClass(), "value3", null);
        setField(term335178, term335178.getClass(), "delegateMap", null);
        term335181 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term335182 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term335181, term335181.getClass(), "size", 0);
        setIntField(term335181, term335181.getClass(), "hash1", 0);
        setIntField(term335181, term335181.getClass(), "hash2", 0);
        setIntField(term335181, term335181.getClass(), "hash3", 0);
        setField(term335181, term335181.getClass(), "key1", null);
        setField(term335181, term335181.getClass(), "key2", null);
        setField(term335181, term335181.getClass(), "key3", null);
        setField(term335181, term335181.getClass(), "value1", null);
        setField(term335181, term335181.getClass(), "value2", null);
        setField(term335181, term335181.getClass(), "value3", null);
        setField(term335182, term335182.getClass(), "header", null);
        setFloatField(term335182, term335182.getClass(), "loadFactor", 0.0F);
        setIntField(term335182, term335182.getClass(), "size", 0);
        setField(term335182, term335182.getClass(), "data", null);
        setIntField(term335182, term335182.getClass(), "threshold", 0);
        setIntField(term335182, term335182.getClass(), "modCount", 0);
        setField(term335182, term335182.getClass(), "entrySet", null);
        setField(term335182, term335182.getClass(), "keySet", null);
        setField(term335182, term335182.getClass(), "values", null);
        setField(term335182, term335182.getClass(), "keySet", null);
        setField(term335182, term335182.getClass(), "values", null);
        setField(term335181, term335181.getClass(), "delegateMap", term335182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term334999;
        callMethod(klass, "containsValue", argTypes, term334719, args);
        assertTrue(recursiveEquals(term334719, term335178));
        assertTrue(recursiveEquals(term334999, term335181));
    }

};


