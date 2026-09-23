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

public class Flat3Map_put_19447407251171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361343;
     Object term361527;
     Object term362444;
     Object term362453;

    public Flat3Map_put_19447407251171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361343 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term361435 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term361343, term361343.getClass(), "delegateMap", null);
        setIntField(term361343, term361343.getClass(), "size", 3);
        setIntField(term361343, term361343.getClass(), "hash3", 0);
        setField(term361343, term361343.getClass(), "key3", null);
        setIntField(term361343, term361343.getClass(), "hash2", 0);
        setField(term361435, term361435.getClass(), "delegateMap", null);
        setIntField(term361435, term361435.getClass(), "size", 3);
        setField(term361435, term361435.getClass(), "key3", null);
        setField(term361435, term361435.getClass(), "value3", null);
        setIntField(term361435, term361435.getClass(), "hash3", -1);
        setIntField(term361435, term361435.getClass(), "hash2", -1);
        setIntField(term361435, term361435.getClass(), "hash1", -1);
        setField(term361343, term361343.getClass(), "key2", term361435);
        setIntField(term361343, term361343.getClass(), "hash1", 0);
        setField(term361343, term361343.getClass(), "key1", term361435);
        term361527 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term361621 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term361749 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term361527, term361527.getClass(), "delegateMap", null);
        setIntField(term361527, term361527.getClass(), "size", 3);
        setIntField(term361527, term361527.getClass(), "hash3", 0);
        setField(term361527, term361527.getClass(), "value3", null);
        setIntField(term361527, term361527.getClass(), "hash2", 0);
        setField(term361527, term361527.getClass(), "value2", null);
        setIntField(term361527, term361527.getClass(), "hash1", 0);
        setIntField(term361621, term361621.getClass(), "size", 0);
        setField(term361527, term361527.getClass(), "value1", term361621);
        setField(term361527, term361527.getClass(), "key3", null);
        setField(term361527, term361527.getClass(), "key2", null);
        setField(term361527, term361527.getClass(), "key1", term361749);
        term362444 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term362445 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term362446 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term362447 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term362448 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term362449 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term362450 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term362451 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term362452 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term362444, term362444.getClass(), "size", 0);
        setIntField(term362444, term362444.getClass(), "hash1", 0);
        setIntField(term362444, term362444.getClass(), "hash2", 0);
        setIntField(term362444, term362444.getClass(), "hash3", 0);
        setField(term362444, term362444.getClass(), "key1", null);
        setField(term362444, term362444.getClass(), "key2", null);
        setField(term362444, term362444.getClass(), "key3", null);
        setField(term362444, term362444.getClass(), "value1", null);
        setField(term362444, term362444.getClass(), "value2", null);
        setField(term362444, term362444.getClass(), "value3", null);
        setFloatField(term362445, term362445.getClass(), "loadFactor", 0.75F);
        setIntField(term362445, term362445.getClass(), "size", 3);
        setField(term362447, term362447.getClass(), "next", null);
        setIntField(term362448, term362448.getClass(), "size", 3);
        setIntField(term362448, term362448.getClass(), "hash1", 0);
        setIntField(term362448, term362448.getClass(), "hash2", 0);
        setIntField(term362448, term362448.getClass(), "hash3", 0);
        setField(term362448, term362448.getClass(), "key1", null);
        setField(term362448, term362448.getClass(), "key2", null);
        setField(term362448, term362448.getClass(), "key3", null);
        setField(term362448, term362448.getClass(), "value1", null);
        setField(term362448, term362448.getClass(), "value2", null);
        setField(term362448, term362448.getClass(), "value3", null);
        setField(term362448, term362448.getClass(), "delegateMap", null);
        setField(term362447, term362447.getClass(), "key", term362448);
        setField(term362447, term362447.getClass(), "value", null);
        setElement(term362446, 0, term362447);
        setField(term362449, term362449.getClass(), "next", null);
        setIntField(term362450, term362450.getClass(), "size", 3);
        setIntField(term362450, term362450.getClass(), "hash1", -1);
        setIntField(term362450, term362450.getClass(), "hash2", -1);
        setIntField(term362450, term362450.getClass(), "hash3", -1);
        setField(term362450, term362450.getClass(), "key1", null);
        setField(term362450, term362450.getClass(), "key2", null);
        setField(term362450, term362450.getClass(), "key3", null);
        setField(term362450, term362450.getClass(), "value1", null);
        setField(term362450, term362450.getClass(), "value2", null);
        setField(term362450, term362450.getClass(), "value3", null);
        setField(term362450, term362450.getClass(), "delegateMap", null);
        setField(term362449, term362449.getClass(), "key", term362450);
        setField(term362449, term362449.getClass(), "value", null);
        setElement(term362446, 5, term362449);
        setField(term362451, term362451.getClass(), "next", null);
        setField(term362451, term362451.getClass(), "key", term362452);
        setField(term362451, term362451.getClass(), "value", null);
        setElement(term362446, 6, term362451);
        setField(term362445, term362445.getClass(), "data", term362446);
        setIntField(term362445, term362445.getClass(), "threshold", 12);
        setIntField(term362445, term362445.getClass(), "modCount", 3);
        setField(term362445, term362445.getClass(), "entrySet", null);
        setField(term362445, term362445.getClass(), "keySet", null);
        setField(term362445, term362445.getClass(), "values", null);
        setField(term362445, term362445.getClass(), "keySet", null);
        setField(term362445, term362445.getClass(), "values", null);
        setField(term362444, term362444.getClass(), "delegateMap", term362445);
        term362453 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term362453, term362453.getClass(), "size", 3);
        setIntField(term362453, term362453.getClass(), "hash1", 0);
        setIntField(term362453, term362453.getClass(), "hash2", 0);
        setIntField(term362453, term362453.getClass(), "hash3", 0);
        setField(term362453, term362453.getClass(), "key1", null);
        setField(term362453, term362453.getClass(), "key2", null);
        setField(term362453, term362453.getClass(), "key3", null);
        setField(term362453, term362453.getClass(), "value1", null);
        setField(term362453, term362453.getClass(), "value2", null);
        setField(term362453, term362453.getClass(), "value3", null);
        setField(term362453, term362453.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term361527;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term361343, args);
        assertTrue(recursiveEquals(term361343, term362444));
        assertTrue(recursiveEquals(term361527, term362453));
        assertTrue(recursiveEquals(retValue, null));
    }

};


