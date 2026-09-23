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

public class Flat3Map_put_19447407251059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306169;
     Object term306752;
     Object term306759;

    public Flat3Map_put_19447407251059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306169 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term306224 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term306270 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term306335 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term306169, term306169.getClass(), "delegateMap", null);
        setIntField(term306169, term306169.getClass(), "size", 3);
        setIntField(term306169, term306169.getClass(), "hash3", -1180979584);
        setField(term306169, term306169.getClass(), "value3", term306224);
        setIntField(term306169, term306169.getClass(), "hash2", -1180979584);
        setField(term306169, term306169.getClass(), "value2", term306270);
        setIntField(term306169, term306169.getClass(), "hash1", -1180979584);
        setField(term306169, term306169.getClass(), "value1", term306335);
        setField(term306169, term306169.getClass(), "key3", null);
        setField(term306169, term306169.getClass(), "key2", null);
        setField(term306169, term306169.getClass(), "key1", null);
        term306752 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term306753 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term306754 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term306755 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term306756 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term306757 = newInstance(Class.forName("java.lang.Object"));
        Object term306758 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term306752, term306752.getClass(), "size", 0);
        setIntField(term306752, term306752.getClass(), "hash1", 0);
        setIntField(term306752, term306752.getClass(), "hash2", 0);
        setIntField(term306752, term306752.getClass(), "hash3", 0);
        setField(term306752, term306752.getClass(), "key1", null);
        setField(term306752, term306752.getClass(), "key2", null);
        setField(term306752, term306752.getClass(), "key3", null);
        setField(term306752, term306752.getClass(), "value1", null);
        setField(term306752, term306752.getClass(), "value2", null);
        setField(term306752, term306752.getClass(), "value3", null);
        setFloatField(term306753, term306753.getClass(), "loadFactor", 0.75F);
        setIntField(term306753, term306753.getClass(), "size", 2);
        setField(term306755, term306755.getClass(), "next", null);
        setField(term306755, term306755.getClass(), "key", term306752);
        setField(term306755, term306755.getClass(), "value", null);
        setElement(term306754, 0, term306755);
        setField(term306756, term306756.getClass(), "next", null);
        setField(term306756, term306756.getClass(), "key", term306757);
        setField(term306758, term306758.getClass(), "next", null);
        setField(term306758, term306758.getClass(), "key", null);
        setField(term306758, term306758.getClass(), "value", null);
        setField(term306756, term306756.getClass(), "value", term306758);
        setElement(term306754, 6, term306756);
        setField(term306753, term306753.getClass(), "data", term306754);
        setIntField(term306753, term306753.getClass(), "threshold", 12);
        setIntField(term306753, term306753.getClass(), "modCount", 2);
        setField(term306753, term306753.getClass(), "entrySet", null);
        setField(term306753, term306753.getClass(), "keySet", null);
        setField(term306753, term306753.getClass(), "values", null);
        setField(term306753, term306753.getClass(), "keySet", null);
        setField(term306753, term306753.getClass(), "values", null);
        setField(term306752, term306752.getClass(), "delegateMap", term306753);
        term306759 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term306760 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term306761 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term306762 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term306763 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term306764 = newInstance(Class.forName("java.lang.Object"));
        Object term306765 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term306759, term306759.getClass(), "size", 0);
        setIntField(term306759, term306759.getClass(), "hash1", 0);
        setIntField(term306759, term306759.getClass(), "hash2", 0);
        setIntField(term306759, term306759.getClass(), "hash3", 0);
        setField(term306759, term306759.getClass(), "key1", null);
        setField(term306759, term306759.getClass(), "key2", null);
        setField(term306759, term306759.getClass(), "key3", null);
        setField(term306759, term306759.getClass(), "value1", null);
        setField(term306759, term306759.getClass(), "value2", null);
        setField(term306759, term306759.getClass(), "value3", null);
        setFloatField(term306760, term306760.getClass(), "loadFactor", 0.75F);
        setIntField(term306760, term306760.getClass(), "size", 2);
        setField(term306762, term306762.getClass(), "next", null);
        setField(term306762, term306762.getClass(), "key", term306759);
        setField(term306762, term306762.getClass(), "value", null);
        setElement(term306761, 0, term306762);
        setField(term306763, term306763.getClass(), "next", null);
        setField(term306763, term306763.getClass(), "key", term306764);
        setField(term306765, term306765.getClass(), "next", null);
        setField(term306765, term306765.getClass(), "key", null);
        setField(term306765, term306765.getClass(), "value", null);
        setField(term306763, term306763.getClass(), "value", term306765);
        setElement(term306761, 6, term306763);
        setField(term306760, term306760.getClass(), "data", term306761);
        setIntField(term306760, term306760.getClass(), "threshold", 12);
        setIntField(term306760, term306760.getClass(), "modCount", 2);
        setField(term306760, term306760.getClass(), "entrySet", null);
        setField(term306760, term306760.getClass(), "keySet", null);
        setField(term306760, term306760.getClass(), "values", null);
        setField(term306760, term306760.getClass(), "keySet", null);
        setField(term306760, term306760.getClass(), "values", null);
        setField(term306759, term306759.getClass(), "delegateMap", term306760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term306169;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term306169, args);
        assertTrue(recursiveEquals(term306169, term306752));
        assertTrue(recursiveEquals(term306169, term306759));
        assertTrue(recursiveEquals(retValue, null));
    }

};


