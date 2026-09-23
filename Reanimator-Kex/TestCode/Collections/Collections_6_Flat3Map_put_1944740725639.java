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

public class Flat3Map_put_1944740725639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140876;
     Object term141262;
     Object term142018;
     Object term142026;

    public Flat3Map_put_1944740725639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140876 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140968 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141060 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141170 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term140876, term140876.getClass(), "delegateMap", null);
        setIntField(term140876, term140876.getClass(), "size", 3);
        setIntField(term140876, term140876.getClass(), "hash3", 0);
        setField(term140968, term140968.getClass(), "delegateMap", null);
        setIntField(term140968, term140968.getClass(), "size", 3);
        setField(term141060, term141060.getClass(), "delegateMap", null);
        setIntField(term141060, term141060.getClass(), "size", 0);
        setField(term140968, term140968.getClass(), "key3", term141060);
        setField(term140968, term140968.getClass(), "key2", null);
        setField(term140968, term140968.getClass(), "value2", null);
        setIntField(term140968, term140968.getClass(), "hash3", 0);
        setField(term140968, term140968.getClass(), "value3", term141170);
        setField(term140876, term140876.getClass(), "key3", term140968);
        setIntField(term140876, term140876.getClass(), "hash2", -1);
        term141262 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141354 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term141262, term141262.getClass(), "delegateMap", null);
        setIntField(term141262, term141262.getClass(), "size", 3);
        setIntField(term141262, term141262.getClass(), "hash3", 0);
        setField(term141262, term141262.getClass(), "value3", null);
        setIntField(term141262, term141262.getClass(), "hash2", 0);
        setField(term141262, term141262.getClass(), "value2", null);
        setIntField(term141262, term141262.getClass(), "hash1", 0);
        setField(term141262, term141262.getClass(), "value1", null);
        setField(term141262, term141262.getClass(), "key3", null);
        setField(term141354, term141354.getClass(), "delegateMap", null);
        setIntField(term141354, term141354.getClass(), "size", 0);
        setField(term141262, term141262.getClass(), "key2", term141354);
        term142018 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142019 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term142020 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term142021 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term142022 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term142023 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142024 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term142025 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term142018, term142018.getClass(), "size", 0);
        setIntField(term142018, term142018.getClass(), "hash1", 0);
        setIntField(term142018, term142018.getClass(), "hash2", 0);
        setIntField(term142018, term142018.getClass(), "hash3", 0);
        setField(term142018, term142018.getClass(), "key1", null);
        setField(term142018, term142018.getClass(), "key2", null);
        setField(term142018, term142018.getClass(), "key3", null);
        setField(term142018, term142018.getClass(), "value1", null);
        setField(term142018, term142018.getClass(), "value2", null);
        setField(term142018, term142018.getClass(), "value3", null);
        setFloatField(term142019, term142019.getClass(), "loadFactor", 0.75F);
        setIntField(term142019, term142019.getClass(), "size", 3);
        setField(term142022, term142022.getClass(), "next", null);
        setField(term142022, term142022.getClass(), "key", null);
        setField(term142022, term142022.getClass(), "value", null);
        setField(term142021, term142021.getClass(), "next", term142022);
        setIntField(term142023, term142023.getClass(), "size", 3);
        setIntField(term142023, term142023.getClass(), "hash1", 0);
        setIntField(term142023, term142023.getClass(), "hash2", 0);
        setIntField(term142023, term142023.getClass(), "hash3", 0);
        setField(term142023, term142023.getClass(), "key1", null);
        setField(term142023, term142023.getClass(), "key2", null);
        setField(term142023, term142023.getClass(), "key3", null);
        setField(term142023, term142023.getClass(), "value1", null);
        setField(term142023, term142023.getClass(), "value2", null);
        setField(term142023, term142023.getClass(), "value3", null);
        setField(term142023, term142023.getClass(), "delegateMap", null);
        setField(term142021, term142021.getClass(), "key", term142023);
        setField(term142021, term142021.getClass(), "value", null);
        setElement(term142020, 0, term142021);
        setField(term142024, term142024.getClass(), "next", null);
        setField(term142024, term142024.getClass(), "key", term142025);
        setField(term142024, term142024.getClass(), "value", null);
        setElement(term142020, 5, term142024);
        setField(term142019, term142019.getClass(), "data", term142020);
        setIntField(term142019, term142019.getClass(), "threshold", 12);
        setIntField(term142019, term142019.getClass(), "modCount", 3);
        setField(term142019, term142019.getClass(), "entrySet", null);
        setField(term142019, term142019.getClass(), "keySet", null);
        setField(term142019, term142019.getClass(), "values", null);
        setField(term142019, term142019.getClass(), "keySet", null);
        setField(term142019, term142019.getClass(), "values", null);
        setField(term142018, term142018.getClass(), "delegateMap", term142019);
        term142026 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term142026, term142026.getClass(), "size", 3);
        setIntField(term142026, term142026.getClass(), "hash1", 0);
        setIntField(term142026, term142026.getClass(), "hash2", 0);
        setIntField(term142026, term142026.getClass(), "hash3", 0);
        setField(term142026, term142026.getClass(), "key1", null);
        setField(term142026, term142026.getClass(), "key2", null);
        setField(term142026, term142026.getClass(), "key3", null);
        setField(term142026, term142026.getClass(), "value1", null);
        setField(term142026, term142026.getClass(), "value2", null);
        setField(term142026, term142026.getClass(), "value3", null);
        setField(term142026, term142026.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term141262;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term140876, args);
        assertTrue(recursiveEquals(term140876, term142018));
        assertTrue(recursiveEquals(term141262, term142026));
        assertTrue(recursiveEquals(retValue, null));
    }

};


