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

public class Flat3Map_put_19447407251091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320449;
     Object term321795;
     Object term321804;

    public Flat3Map_put_19447407251091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320449 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term320468 = newInstance(Class.forName("java.lang.Object"));
        Object term320523 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term320449, term320449.getClass(), "delegateMap", null);
        setIntField(term320449, term320449.getClass(), "size", 3);
        setIntField(term320449, term320449.getClass(), "hash3", 0);
        setField(term320449, term320449.getClass(), "value3", null);
        setIntField(term320449, term320449.getClass(), "hash2", 0);
        setField(term320449, term320449.getClass(), "value2", null);
        setIntField(term320449, term320449.getClass(), "hash1", 0);
        setField(term320449, term320449.getClass(), "value1", null);
        setField(term320449, term320449.getClass(), "key3", null);
        setField(term320449, term320449.getClass(), "key2", term320468);
        setField(term320449, term320449.getClass(), "key1", term320523);
        term321795 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term321796 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term321797 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term321798 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term321799 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term321800 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term321801 = newInstance(Class.forName("java.lang.Object"));
        Object term321802 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term321803 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term321795, term321795.getClass(), "size", 0);
        setIntField(term321795, term321795.getClass(), "hash1", 0);
        setIntField(term321795, term321795.getClass(), "hash2", 0);
        setIntField(term321795, term321795.getClass(), "hash3", 0);
        setField(term321795, term321795.getClass(), "key1", null);
        setField(term321795, term321795.getClass(), "key2", null);
        setField(term321795, term321795.getClass(), "key3", null);
        setField(term321795, term321795.getClass(), "value1", null);
        setField(term321795, term321795.getClass(), "value2", null);
        setField(term321795, term321795.getClass(), "value3", null);
        setFloatField(term321796, term321796.getClass(), "loadFactor", 0.75F);
        setIntField(term321796, term321796.getClass(), "size", 4);
        setField(term321798, term321798.getClass(), "next", null);
        setFloatField(term321799, term321799.getClass(), "loadFactor", 0.0F);
        setIntField(term321799, term321799.getClass(), "size", 0);
        setField(term321799, term321799.getClass(), "data", null);
        setIntField(term321799, term321799.getClass(), "threshold", 0);
        setIntField(term321799, term321799.getClass(), "modCount", 0);
        setField(term321799, term321799.getClass(), "entrySet", null);
        setField(term321799, term321799.getClass(), "keySet", null);
        setField(term321799, term321799.getClass(), "values", null);
        setField(term321799, term321799.getClass(), "keySet", null);
        setField(term321799, term321799.getClass(), "values", null);
        setField(term321798, term321798.getClass(), "key", term321799);
        setField(term321798, term321798.getClass(), "value", null);
        setElement(term321797, 0, term321798);
        setField(term321800, term321800.getClass(), "next", null);
        setField(term321800, term321800.getClass(), "key", term321801);
        setField(term321800, term321800.getClass(), "value", null);
        setElement(term321797, 6, term321800);
        setField(term321803, term321803.getClass(), "next", null);
        setField(term321803, term321803.getClass(), "key", null);
        setField(term321803, term321803.getClass(), "value", null);
        setField(term321802, term321802.getClass(), "next", term321803);
        setField(term321802, term321802.getClass(), "key", term321795);
        setField(term321802, term321802.getClass(), "value", null);
        setElement(term321797, 14, term321802);
        setField(term321796, term321796.getClass(), "data", term321797);
        setIntField(term321796, term321796.getClass(), "threshold", 12);
        setIntField(term321796, term321796.getClass(), "modCount", 4);
        setField(term321796, term321796.getClass(), "entrySet", null);
        setField(term321796, term321796.getClass(), "keySet", null);
        setField(term321796, term321796.getClass(), "values", null);
        setField(term321796, term321796.getClass(), "keySet", null);
        setField(term321796, term321796.getClass(), "values", null);
        setField(term321795, term321795.getClass(), "delegateMap", term321796);
        term321804 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term321805 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term321806 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term321807 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term321808 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term321809 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term321810 = newInstance(Class.forName("java.lang.Object"));
        Object term321811 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term321812 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term321804, term321804.getClass(), "size", 0);
        setIntField(term321804, term321804.getClass(), "hash1", 0);
        setIntField(term321804, term321804.getClass(), "hash2", 0);
        setIntField(term321804, term321804.getClass(), "hash3", 0);
        setField(term321804, term321804.getClass(), "key1", null);
        setField(term321804, term321804.getClass(), "key2", null);
        setField(term321804, term321804.getClass(), "key3", null);
        setField(term321804, term321804.getClass(), "value1", null);
        setField(term321804, term321804.getClass(), "value2", null);
        setField(term321804, term321804.getClass(), "value3", null);
        setFloatField(term321805, term321805.getClass(), "loadFactor", 0.75F);
        setIntField(term321805, term321805.getClass(), "size", 4);
        setField(term321807, term321807.getClass(), "next", null);
        setFloatField(term321808, term321808.getClass(), "loadFactor", 0.0F);
        setIntField(term321808, term321808.getClass(), "size", 0);
        setField(term321808, term321808.getClass(), "data", null);
        setIntField(term321808, term321808.getClass(), "threshold", 0);
        setIntField(term321808, term321808.getClass(), "modCount", 0);
        setField(term321808, term321808.getClass(), "entrySet", null);
        setField(term321808, term321808.getClass(), "keySet", null);
        setField(term321808, term321808.getClass(), "values", null);
        setField(term321808, term321808.getClass(), "keySet", null);
        setField(term321808, term321808.getClass(), "values", null);
        setField(term321807, term321807.getClass(), "key", term321808);
        setField(term321807, term321807.getClass(), "value", null);
        setElement(term321806, 0, term321807);
        setField(term321809, term321809.getClass(), "next", null);
        setField(term321809, term321809.getClass(), "key", term321810);
        setField(term321809, term321809.getClass(), "value", null);
        setElement(term321806, 6, term321809);
        setField(term321812, term321812.getClass(), "next", null);
        setField(term321812, term321812.getClass(), "key", null);
        setField(term321812, term321812.getClass(), "value", null);
        setField(term321811, term321811.getClass(), "next", term321812);
        setField(term321811, term321811.getClass(), "key", term321804);
        setField(term321811, term321811.getClass(), "value", null);
        setElement(term321806, 14, term321811);
        setField(term321805, term321805.getClass(), "data", term321806);
        setIntField(term321805, term321805.getClass(), "threshold", 12);
        setIntField(term321805, term321805.getClass(), "modCount", 4);
        setField(term321805, term321805.getClass(), "entrySet", null);
        setField(term321805, term321805.getClass(), "keySet", null);
        setField(term321805, term321805.getClass(), "values", null);
        setField(term321805, term321805.getClass(), "keySet", null);
        setField(term321805, term321805.getClass(), "values", null);
        setField(term321804, term321804.getClass(), "delegateMap", term321805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term320449;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term320449, args);
        assertTrue(recursiveEquals(term320449, term321795));
        assertTrue(recursiveEquals(term320449, term321804));
        assertTrue(recursiveEquals(retValue, null));
    }

};


