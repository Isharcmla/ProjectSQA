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

public class Flat3Map_convertToMap_122991281132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147;
     Object term7259;

    public Flat3Map_convertToMap_122991281132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term152 = newInstance(Class.forName("java.lang.Object"));
        Object term153 = newInstance(Class.forName("java.lang.Object"));
        Object term154 = newInstance(Class.forName("java.lang.Object"));
        Object term155 = newInstance(Class.forName("java.lang.Object"));
        Object term156 = newInstance(Class.forName("java.lang.Object"));
        Object term157 = newInstance(Class.forName("java.lang.Object"));
        Object term158 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term147, term147.getClass(), "size", -1022990421);
        setIntField(term147, term147.getClass(), "hash1", 1045547089);
        setIntField(term147, term147.getClass(), "hash2", -1122880881);
        setIntField(term147, term147.getClass(), "hash3", -542712742);
        setField(term147, term147.getClass(), "key1", term152);
        setField(term147, term147.getClass(), "key2", term153);
        setField(term147, term147.getClass(), "key3", term154);
        setField(term147, term147.getClass(), "value1", term155);
        setField(term147, term147.getClass(), "value2", term156);
        setField(term147, term147.getClass(), "value3", term157);
        setFloatField(term158, term158.getClass(), "loadFactor", 0.0F);
        setIntField(term158, term158.getClass(), "size", 0);
        setField(term158, term158.getClass(), "data", null);
        setIntField(term158, term158.getClass(), "threshold", 0);
        setIntField(term158, term158.getClass(), "modCount", 0);
        setField(term158, term158.getClass(), "entrySet", null);
        setField(term158, term158.getClass(), "keySet", null);
        setField(term158, term158.getClass(), "values", null);
        setField(term158, term158.getClass(), "keySet", null);
        setField(term158, term158.getClass(), "values", null);
        setField(term147, term147.getClass(), "delegateMap", term158);
        term7259 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7260 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term7261 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setIntField(term7259, term7259.getClass(), "size", 0);
        setIntField(term7259, term7259.getClass(), "hash1", 0);
        setIntField(term7259, term7259.getClass(), "hash2", 0);
        setIntField(term7259, term7259.getClass(), "hash3", 0);
        setField(term7259, term7259.getClass(), "key1", null);
        setField(term7259, term7259.getClass(), "key2", null);
        setField(term7259, term7259.getClass(), "key3", null);
        setField(term7259, term7259.getClass(), "value1", null);
        setField(term7259, term7259.getClass(), "value2", null);
        setField(term7259, term7259.getClass(), "value3", null);
        setFloatField(term7260, term7260.getClass(), "loadFactor", 0.75F);
        setIntField(term7260, term7260.getClass(), "size", 0);
        setField(term7260, term7260.getClass(), "data", term7261);
        setIntField(term7260, term7260.getClass(), "threshold", 12);
        setIntField(term7260, term7260.getClass(), "modCount", 0);
        setField(term7260, term7260.getClass(), "entrySet", null);
        setField(term7260, term7260.getClass(), "keySet", null);
        setField(term7260, term7260.getClass(), "values", null);
        setField(term7260, term7260.getClass(), "keySet", null);
        setField(term7260, term7260.getClass(), "values", null);
        setField(term7259, term7259.getClass(), "delegateMap", term7260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term147, args);
        assertTrue(recursiveEquals(term147, term7259));
    }

};


