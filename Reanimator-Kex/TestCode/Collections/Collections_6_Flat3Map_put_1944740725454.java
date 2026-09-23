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

public class Flat3Map_put_1944740725454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82703;
     Object term83257;
     Object term83263;

    public Flat3Map_put_1944740725454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82703 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term82703, term82703.getClass(), "delegateMap", null);
        setIntField(term82703, term82703.getClass(), "size", 3);
        setIntField(term82703, term82703.getClass(), "hash3", 0);
        setField(term82703, term82703.getClass(), "value3", null);
        setIntField(term82703, term82703.getClass(), "hash2", 0);
        setField(term82703, term82703.getClass(), "value2", null);
        setIntField(term82703, term82703.getClass(), "hash1", 0);
        setField(term82703, term82703.getClass(), "value1", null);
        term83257 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term83258 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term83259 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term83260 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term83261 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term83262 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term83257, term83257.getClass(), "size", 0);
        setIntField(term83257, term83257.getClass(), "hash1", 0);
        setIntField(term83257, term83257.getClass(), "hash2", 0);
        setIntField(term83257, term83257.getClass(), "hash3", 0);
        setField(term83257, term83257.getClass(), "key1", null);
        setField(term83257, term83257.getClass(), "key2", null);
        setField(term83257, term83257.getClass(), "key3", null);
        setField(term83257, term83257.getClass(), "value1", null);
        setField(term83257, term83257.getClass(), "value2", null);
        setField(term83257, term83257.getClass(), "value3", null);
        setFloatField(term83258, term83258.getClass(), "loadFactor", 0.75F);
        setIntField(term83258, term83258.getClass(), "size", 2);
        setField(term83260, term83260.getClass(), "next", null);
        setField(term83260, term83260.getClass(), "key", term83257);
        setField(term83260, term83260.getClass(), "value", null);
        setElement(term83259, 0, term83260);
        setField(term83261, term83261.getClass(), "next", null);
        setField(term83261, term83261.getClass(), "key", term83262);
        setField(term83261, term83261.getClass(), "value", null);
        setElement(term83259, 5, term83261);
        setField(term83258, term83258.getClass(), "data", term83259);
        setIntField(term83258, term83258.getClass(), "threshold", 12);
        setIntField(term83258, term83258.getClass(), "modCount", 2);
        setField(term83258, term83258.getClass(), "entrySet", null);
        setField(term83258, term83258.getClass(), "keySet", null);
        setField(term83258, term83258.getClass(), "values", null);
        setField(term83258, term83258.getClass(), "keySet", null);
        setField(term83258, term83258.getClass(), "values", null);
        setField(term83257, term83257.getClass(), "delegateMap", term83258);
        term83263 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term83264 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term83265 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term83266 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term83267 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term83268 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term83263, term83263.getClass(), "size", 0);
        setIntField(term83263, term83263.getClass(), "hash1", 0);
        setIntField(term83263, term83263.getClass(), "hash2", 0);
        setIntField(term83263, term83263.getClass(), "hash3", 0);
        setField(term83263, term83263.getClass(), "key1", null);
        setField(term83263, term83263.getClass(), "key2", null);
        setField(term83263, term83263.getClass(), "key3", null);
        setField(term83263, term83263.getClass(), "value1", null);
        setField(term83263, term83263.getClass(), "value2", null);
        setField(term83263, term83263.getClass(), "value3", null);
        setFloatField(term83264, term83264.getClass(), "loadFactor", 0.75F);
        setIntField(term83264, term83264.getClass(), "size", 2);
        setField(term83266, term83266.getClass(), "next", null);
        setField(term83266, term83266.getClass(), "key", term83263);
        setField(term83266, term83266.getClass(), "value", null);
        setElement(term83265, 0, term83266);
        setField(term83267, term83267.getClass(), "next", null);
        setField(term83267, term83267.getClass(), "key", term83268);
        setField(term83267, term83267.getClass(), "value", null);
        setElement(term83265, 5, term83267);
        setField(term83264, term83264.getClass(), "data", term83265);
        setIntField(term83264, term83264.getClass(), "threshold", 12);
        setIntField(term83264, term83264.getClass(), "modCount", 2);
        setField(term83264, term83264.getClass(), "entrySet", null);
        setField(term83264, term83264.getClass(), "keySet", null);
        setField(term83264, term83264.getClass(), "values", null);
        setField(term83264, term83264.getClass(), "keySet", null);
        setField(term83264, term83264.getClass(), "values", null);
        setField(term83263, term83263.getClass(), "delegateMap", term83264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term82703;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term82703, args);
        assertTrue(recursiveEquals(term82703, term83257));
        assertTrue(recursiveEquals(term82703, term83263));
        assertTrue(recursiveEquals(retValue, null));
    }

};


