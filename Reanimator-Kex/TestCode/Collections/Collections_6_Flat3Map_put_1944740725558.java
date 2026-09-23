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

public class Flat3Map_put_1944740725558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110999;
     Object term111385;
     Object term112621;
     Object term112629;

    public Flat3Map_put_1944740725558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110999 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111091 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111183 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111293 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term110999, term110999.getClass(), "delegateMap", null);
        setIntField(term110999, term110999.getClass(), "size", 3);
        setIntField(term110999, term110999.getClass(), "hash3", 0);
        setField(term111091, term111091.getClass(), "delegateMap", null);
        setIntField(term111091, term111091.getClass(), "size", 3);
        setField(term111183, term111183.getClass(), "delegateMap", null);
        setIntField(term111183, term111183.getClass(), "size", 0);
        setField(term111091, term111091.getClass(), "key3", term111183);
        setField(term111091, term111091.getClass(), "key2", null);
        setField(term111091, term111091.getClass(), "value2", null);
        setIntField(term111091, term111091.getClass(), "hash3", 0);
        setField(term111091, term111091.getClass(), "value3", term111293);
        setField(term110999, term110999.getClass(), "key3", term111091);
        term111385 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111477 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term111385, term111385.getClass(), "delegateMap", null);
        setIntField(term111385, term111385.getClass(), "size", 3);
        setIntField(term111385, term111385.getClass(), "hash3", 0);
        setField(term111385, term111385.getClass(), "value3", null);
        setIntField(term111385, term111385.getClass(), "hash2", 0);
        setField(term111385, term111385.getClass(), "value2", null);
        setIntField(term111385, term111385.getClass(), "hash1", 0);
        setField(term111385, term111385.getClass(), "value1", null);
        setField(term111385, term111385.getClass(), "key3", null);
        setField(term111477, term111477.getClass(), "delegateMap", null);
        setIntField(term111477, term111477.getClass(), "size", 0);
        setField(term111385, term111385.getClass(), "key2", term111477);
        term112621 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term112622 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term112623 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term112624 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term112625 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term112626 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term112627 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term112628 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term112621, term112621.getClass(), "size", 0);
        setIntField(term112621, term112621.getClass(), "hash1", 0);
        setIntField(term112621, term112621.getClass(), "hash2", 0);
        setIntField(term112621, term112621.getClass(), "hash3", 0);
        setField(term112621, term112621.getClass(), "key1", null);
        setField(term112621, term112621.getClass(), "key2", null);
        setField(term112621, term112621.getClass(), "key3", null);
        setField(term112621, term112621.getClass(), "value1", null);
        setField(term112621, term112621.getClass(), "value2", null);
        setField(term112621, term112621.getClass(), "value3", null);
        setFloatField(term112622, term112622.getClass(), "loadFactor", 0.75F);
        setIntField(term112622, term112622.getClass(), "size", 3);
        setField(term112625, term112625.getClass(), "next", null);
        setField(term112625, term112625.getClass(), "key", null);
        setField(term112625, term112625.getClass(), "value", null);
        setField(term112624, term112624.getClass(), "next", term112625);
        setIntField(term112626, term112626.getClass(), "size", 3);
        setIntField(term112626, term112626.getClass(), "hash1", 0);
        setIntField(term112626, term112626.getClass(), "hash2", 0);
        setIntField(term112626, term112626.getClass(), "hash3", 0);
        setField(term112626, term112626.getClass(), "key1", null);
        setField(term112626, term112626.getClass(), "key2", null);
        setField(term112626, term112626.getClass(), "key3", null);
        setField(term112626, term112626.getClass(), "value1", null);
        setField(term112626, term112626.getClass(), "value2", null);
        setField(term112626, term112626.getClass(), "value3", null);
        setField(term112626, term112626.getClass(), "delegateMap", null);
        setField(term112624, term112624.getClass(), "key", term112626);
        setField(term112624, term112624.getClass(), "value", null);
        setElement(term112623, 0, term112624);
        setField(term112627, term112627.getClass(), "next", null);
        setField(term112627, term112627.getClass(), "key", term112628);
        setField(term112627, term112627.getClass(), "value", null);
        setElement(term112623, 5, term112627);
        setField(term112622, term112622.getClass(), "data", term112623);
        setIntField(term112622, term112622.getClass(), "threshold", 12);
        setIntField(term112622, term112622.getClass(), "modCount", 3);
        setField(term112622, term112622.getClass(), "entrySet", null);
        setField(term112622, term112622.getClass(), "keySet", null);
        setField(term112622, term112622.getClass(), "values", null);
        setField(term112622, term112622.getClass(), "keySet", null);
        setField(term112622, term112622.getClass(), "values", null);
        setField(term112621, term112621.getClass(), "delegateMap", term112622);
        term112629 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term112629, term112629.getClass(), "size", 3);
        setIntField(term112629, term112629.getClass(), "hash1", 0);
        setIntField(term112629, term112629.getClass(), "hash2", 0);
        setIntField(term112629, term112629.getClass(), "hash3", 0);
        setField(term112629, term112629.getClass(), "key1", null);
        setField(term112629, term112629.getClass(), "key2", null);
        setField(term112629, term112629.getClass(), "key3", null);
        setField(term112629, term112629.getClass(), "value1", null);
        setField(term112629, term112629.getClass(), "value2", null);
        setField(term112629, term112629.getClass(), "value3", null);
        setField(term112629, term112629.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term111385;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term110999, args);
        assertTrue(recursiveEquals(term110999, term112621));
        assertTrue(recursiveEquals(term111385, term112629));
        assertTrue(recursiveEquals(retValue, null));
    }

};


