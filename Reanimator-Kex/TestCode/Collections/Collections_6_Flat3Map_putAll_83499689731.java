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
import java.util.LinkedHashMap;

public class Flat3Map_putAll_83499689731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term141;
     Object term7230;
     Object term7238;

    public Flat3Map_putAll_83499689731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term130 = newInstance(Class.forName("java.lang.Object"));
        Object term131 = newInstance(Class.forName("java.lang.Object"));
        Object term132 = newInstance(Class.forName("java.lang.Object"));
        Object term133 = newInstance(Class.forName("java.lang.Object"));
        Object term134 = newInstance(Class.forName("java.lang.Object"));
        Object term135 = newInstance(Class.forName("java.lang.Object"));
        Object term136 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term125, term125.getClass(), "size", 548228925);
        setIntField(term125, term125.getClass(), "hash1", -749861210);
        setIntField(term125, term125.getClass(), "hash2", 1694224101);
        setIntField(term125, term125.getClass(), "hash3", 937859191);
        setField(term125, term125.getClass(), "key1", term130);
        setField(term125, term125.getClass(), "key2", term131);
        setField(term125, term125.getClass(), "key3", term132);
        setField(term125, term125.getClass(), "value1", term133);
        setField(term125, term125.getClass(), "value2", term134);
        setField(term125, term125.getClass(), "value3", term135);
        setFloatField(term136, term136.getClass(), "loadFactor", 0.0F);
        setIntField(term136, term136.getClass(), "size", 0);
        setField(term136, term136.getClass(), "data", null);
        setIntField(term136, term136.getClass(), "threshold", 0);
        setIntField(term136, term136.getClass(), "modCount", 0);
        setField(term136, term136.getClass(), "entrySet", null);
        setField(term136, term136.getClass(), "keySet", null);
        setField(term136, term136.getClass(), "values", null);
        setField(term136, term136.getClass(), "keySet", null);
        setField(term136, term136.getClass(), "values", null);
        setField(term125, term125.getClass(), "delegateMap", term136);
        term141 = new LinkedHashMap();
        term7230 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7231 = newInstance(Class.forName("java.lang.Object"));
        Object term7232 = newInstance(Class.forName("java.lang.Object"));
        Object term7233 = newInstance(Class.forName("java.lang.Object"));
        Object term7234 = newInstance(Class.forName("java.lang.Object"));
        Object term7235 = newInstance(Class.forName("java.lang.Object"));
        Object term7236 = newInstance(Class.forName("java.lang.Object"));
        Object term7237 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term7230, term7230.getClass(), "size", 548228925);
        setIntField(term7230, term7230.getClass(), "hash1", -749861210);
        setIntField(term7230, term7230.getClass(), "hash2", 1694224101);
        setIntField(term7230, term7230.getClass(), "hash3", 937859191);
        setField(term7230, term7230.getClass(), "key1", term7231);
        setField(term7230, term7230.getClass(), "key2", term7232);
        setField(term7230, term7230.getClass(), "key3", term7233);
        setField(term7230, term7230.getClass(), "value1", term7234);
        setField(term7230, term7230.getClass(), "value2", term7235);
        setField(term7230, term7230.getClass(), "value3", term7236);
        setFloatField(term7237, term7237.getClass(), "loadFactor", 0.0F);
        setIntField(term7237, term7237.getClass(), "size", 0);
        setField(term7237, term7237.getClass(), "data", null);
        setIntField(term7237, term7237.getClass(), "threshold", 0);
        setIntField(term7237, term7237.getClass(), "modCount", 0);
        setField(term7237, term7237.getClass(), "entrySet", null);
        setField(term7237, term7237.getClass(), "keySet", null);
        setField(term7237, term7237.getClass(), "values", null);
        setField(term7237, term7237.getClass(), "keySet", null);
        setField(term7237, term7237.getClass(), "values", null);
        setField(term7230, term7230.getClass(), "delegateMap", term7237);
        term7238 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term141;
        callMethod(klass, "putAll", argTypes, term125, args);
        assertTrue(recursiveEquals(term125, term7230));
        assertTrue(recursiveEquals(term141, term7238));
    }

};


