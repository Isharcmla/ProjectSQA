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

public class Flat3Map_put_1944740725664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150469;
     Object term150813;
     Object term151556;
     Object term151566;

    public Flat3Map_put_1944740725664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150469 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term150561 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term150038 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term150721 = newInstance(Class.forName("org.apache.commons.collections.bidimap.DualTreeBidiMap$BidiOrderedMapIterator"));
        setField(term150469, term150469.getClass(), "delegateMap", null);
        setIntField(term150469, term150469.getClass(), "size", 3);
        setIntField(term150469, term150469.getClass(), "hash3", -188486016);
        setField(term150469, term150469.getClass(), "key3", null);
        setIntField(term150469, term150469.getClass(), "hash2", -188486016);
        setField(term150469, term150469.getClass(), "key2", null);
        setIntField(term150469, term150469.getClass(), "hash1", -188486016);
        setField(term150561, term150561.getClass(), "delegateMap", null);
        setIntField(term150561, term150561.getClass(), "size", 3);
        setField(term150561, term150561.getClass(), "key3", null);
        setField(term150561, term150561.getClass(), "value3", null);
        setIntField(term150561, term150561.getClass(), "hash3", -1207869437);
        setIntField(term150561, term150561.getClass(), "hash2", 1342996756);
        setField(term150561, term150561.getClass(), "value2", null);
        setIntField(term150561, term150561.getClass(), "hash1", -805164800);
        setField(term150561, term150561.getClass(), "value1", null);
        setField(term150469, term150469.getClass(), "key1", term150561);
        setField(term150469, term150469.getClass(), "value3", term150038);
        setField(term150469, term150469.getClass(), "value2", term150721);
        setField(term150469, term150469.getClass(), "value1", null);
        term150813 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term150907 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term150813, term150813.getClass(), "delegateMap", null);
        setIntField(term150813, term150813.getClass(), "size", 3);
        setIntField(term150813, term150813.getClass(), "hash3", 1736110080);
        setField(term150813, term150813.getClass(), "value3", null);
        setIntField(term150813, term150813.getClass(), "hash2", -2012146688);
        setField(term150813, term150813.getClass(), "value2", null);
        setIntField(term150813, term150813.getClass(), "hash1", 87550592);
        setIntField(term150907, term150907.getClass(), "size", 0);
        setField(term150813, term150813.getClass(), "value1", term150907);
        setField(term150813, term150813.getClass(), "key3", null);
        setField(term150813, term150813.getClass(), "key2", null);
        setField(term150813, term150813.getClass(), "key1", null);
        term151556 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term151557 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term151558 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term151559 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term151560 = newInstance(Class.forName("java.lang.Object"));
        Object term151561 = newInstance(Class.forName("org.apache.commons.collections.bidimap.DualTreeBidiMap$BidiOrderedMapIterator"));
        Object term151562 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term151563 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term151564 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term151565 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term151556, term151556.getClass(), "size", 0);
        setIntField(term151556, term151556.getClass(), "hash1", 0);
        setIntField(term151556, term151556.getClass(), "hash2", 0);
        setIntField(term151556, term151556.getClass(), "hash3", 0);
        setField(term151556, term151556.getClass(), "key1", null);
        setField(term151556, term151556.getClass(), "key2", null);
        setField(term151556, term151556.getClass(), "key3", null);
        setField(term151556, term151556.getClass(), "value1", null);
        setField(term151556, term151556.getClass(), "value2", null);
        setField(term151556, term151556.getClass(), "value3", null);
        setFloatField(term151557, term151557.getClass(), "loadFactor", 0.75F);
        setIntField(term151557, term151557.getClass(), "size", 3);
        setField(term151559, term151559.getClass(), "next", null);
        setField(term151559, term151559.getClass(), "key", term151560);
        setField(term151561, term151561.getClass(), "parent", null);
        setField(term151561, term151561.getClass(), "iterator", null);
        setField(term151561, term151561.getClass(), "last", null);
        setField(term151559, term151559.getClass(), "value", term151561);
        setElement(term151558, 5, term151559);
        setField(term151562, term151562.getClass(), "next", null);
        setIntField(term151563, term151563.getClass(), "size", 3);
        setIntField(term151563, term151563.getClass(), "hash1", -805164800);
        setIntField(term151563, term151563.getClass(), "hash2", 1342996756);
        setIntField(term151563, term151563.getClass(), "hash3", -1207869437);
        setField(term151563, term151563.getClass(), "key1", null);
        setField(term151563, term151563.getClass(), "key2", null);
        setField(term151563, term151563.getClass(), "key3", null);
        setField(term151563, term151563.getClass(), "value1", null);
        setField(term151563, term151563.getClass(), "value2", null);
        setField(term151563, term151563.getClass(), "value3", null);
        setField(term151563, term151563.getClass(), "delegateMap", null);
        setField(term151562, term151562.getClass(), "key", term151563);
        setField(term151562, term151562.getClass(), "value", null);
        setElement(term151558, 9, term151562);
        setField(term151564, term151564.getClass(), "next", null);
        setIntField(term151565, term151565.getClass(), "size", 3);
        setIntField(term151565, term151565.getClass(), "hash1", 87550592);
        setIntField(term151565, term151565.getClass(), "hash2", -2012146688);
        setIntField(term151565, term151565.getClass(), "hash3", 1736110080);
        setField(term151565, term151565.getClass(), "key1", null);
        setField(term151565, term151565.getClass(), "key2", null);
        setField(term151565, term151565.getClass(), "key3", null);
        setField(term151565, term151565.getClass(), "value1", null);
        setField(term151565, term151565.getClass(), "value2", null);
        setField(term151565, term151565.getClass(), "value3", null);
        setField(term151565, term151565.getClass(), "delegateMap", null);
        setField(term151564, term151564.getClass(), "key", term151565);
        setField(term151564, term151564.getClass(), "value", null);
        setElement(term151558, 11, term151564);
        setField(term151557, term151557.getClass(), "data", term151558);
        setIntField(term151557, term151557.getClass(), "threshold", 12);
        setIntField(term151557, term151557.getClass(), "modCount", 3);
        setField(term151557, term151557.getClass(), "entrySet", null);
        setField(term151557, term151557.getClass(), "keySet", null);
        setField(term151557, term151557.getClass(), "values", null);
        setField(term151557, term151557.getClass(), "keySet", null);
        setField(term151557, term151557.getClass(), "values", null);
        setField(term151556, term151556.getClass(), "delegateMap", term151557);
        term151566 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term151566, term151566.getClass(), "size", 3);
        setIntField(term151566, term151566.getClass(), "hash1", 87550592);
        setIntField(term151566, term151566.getClass(), "hash2", -2012146688);
        setIntField(term151566, term151566.getClass(), "hash3", 1736110080);
        setField(term151566, term151566.getClass(), "key1", null);
        setField(term151566, term151566.getClass(), "key2", null);
        setField(term151566, term151566.getClass(), "key3", null);
        setField(term151566, term151566.getClass(), "value1", null);
        setField(term151566, term151566.getClass(), "value2", null);
        setField(term151566, term151566.getClass(), "value3", null);
        setField(term151566, term151566.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term150813;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term150469, args);
        assertTrue(recursiveEquals(term150469, term151556));
        assertTrue(recursiveEquals(term150813, term151566));
        assertTrue(recursiveEquals(retValue, null));
    }

};


