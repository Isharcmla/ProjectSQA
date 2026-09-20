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

public class Flat3Map_put_19447407251149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248350;
     Object term248648;
     Object term249443;
     Object term249449;

    public Flat3Map_put_19447407251149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248350 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term248442 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term248556 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        setField(term248350, term248350.getClass(), "delegateMap", null);
        setIntField(term248350, term248350.getClass(), "size", 3);
        setIntField(term248350, term248350.getClass(), "hash3", 0);
        setField(term248350, term248350.getClass(), "key3", null);
        setIntField(term248350, term248350.getClass(), "hash2", 0);
        setField(term248350, term248350.getClass(), "key2", null);
        setIntField(term248350, term248350.getClass(), "hash1", 0);
        setField(term248442, term248442.getClass(), "delegateMap", null);
        setIntField(term248442, term248442.getClass(), "size", 3);
        setField(term248442, term248442.getClass(), "key3", null);
        setField(term248442, term248442.getClass(), "value3", null);
        setField(term248350, term248350.getClass(), "key1", term248442);
        setField(term248350, term248350.getClass(), "value3", null);
        setField(term248350, term248350.getClass(), "value2", term248556);
        term248648 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term248760 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term248648, term248648.getClass(), "delegateMap", null);
        setIntField(term248648, term248648.getClass(), "size", 3);
        setIntField(term248648, term248648.getClass(), "hash3", 0);
        setField(term248648, term248648.getClass(), "value3", null);
        setIntField(term248648, term248648.getClass(), "hash2", 0);
        setIntField(term248760, term248760.getClass(), "size", 0);
        setField(term248648, term248648.getClass(), "value2", term248760);
        setIntField(term248648, term248648.getClass(), "hash1", 0);
        setField(term248648, term248648.getClass(), "value1", null);
        setField(term248648, term248648.getClass(), "key3", null);
        setField(term248648, term248648.getClass(), "key2", null);
        term249443 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term249444 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term249445 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term249446 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term249447 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term249448 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term249443, term249443.getClass(), "size", 0);
        setIntField(term249443, term249443.getClass(), "hash1", 0);
        setIntField(term249443, term249443.getClass(), "hash2", 0);
        setIntField(term249443, term249443.getClass(), "hash3", 0);
        setField(term249443, term249443.getClass(), "key1", null);
        setField(term249443, term249443.getClass(), "key2", null);
        setField(term249443, term249443.getClass(), "key3", null);
        setField(term249443, term249443.getClass(), "value1", null);
        setField(term249443, term249443.getClass(), "value2", null);
        setField(term249443, term249443.getClass(), "value3", null);
        setFloatField(term249444, term249444.getClass(), "loadFactor", 0.75F);
        setIntField(term249444, term249444.getClass(), "size", 3);
        setField(term249447, term249447.getClass(), "next", null);
        setField(term249447, term249447.getClass(), "key", null);
        setField(term249447, term249447.getClass(), "value", null);
        setField(term249446, term249446.getClass(), "next", term249447);
        setIntField(term249448, term249448.getClass(), "size", 3);
        setIntField(term249448, term249448.getClass(), "hash1", 0);
        setIntField(term249448, term249448.getClass(), "hash2", 0);
        setIntField(term249448, term249448.getClass(), "hash3", 0);
        setField(term249448, term249448.getClass(), "key1", null);
        setField(term249448, term249448.getClass(), "key2", null);
        setField(term249448, term249448.getClass(), "key3", null);
        setField(term249448, term249448.getClass(), "value1", null);
        setField(term249448, term249448.getClass(), "value2", null);
        setField(term249448, term249448.getClass(), "value3", null);
        setField(term249448, term249448.getClass(), "delegateMap", null);
        setField(term249446, term249446.getClass(), "key", term249448);
        setField(term249446, term249446.getClass(), "value", null);
        setElement(term249445, 0, term249446);
        setField(term249444, term249444.getClass(), "data", term249445);
        setIntField(term249444, term249444.getClass(), "threshold", 12);
        setIntField(term249444, term249444.getClass(), "modCount", 3);
        setField(term249444, term249444.getClass(), "entrySet", null);
        setField(term249444, term249444.getClass(), "keySet", null);
        setField(term249444, term249444.getClass(), "values", null);
        setField(term249444, term249444.getClass(), "keySet", null);
        setField(term249444, term249444.getClass(), "values", null);
        setField(term249443, term249443.getClass(), "delegateMap", term249444);
        term249449 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term249449, term249449.getClass(), "size", 3);
        setIntField(term249449, term249449.getClass(), "hash1", 0);
        setIntField(term249449, term249449.getClass(), "hash2", 0);
        setIntField(term249449, term249449.getClass(), "hash3", 0);
        setField(term249449, term249449.getClass(), "key1", null);
        setField(term249449, term249449.getClass(), "key2", null);
        setField(term249449, term249449.getClass(), "key3", null);
        setField(term249449, term249449.getClass(), "value1", null);
        setField(term249449, term249449.getClass(), "value2", null);
        setField(term249449, term249449.getClass(), "value3", null);
        setField(term249449, term249449.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term248648;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term248350, args);
        assertTrue(recursiveEquals(term248350, term249443));
        assertTrue(recursiveEquals(term248648, term249449));
        assertTrue(recursiveEquals(retValue, null));
    }

};
