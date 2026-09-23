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

public class Flat3Map_put_19447407251174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363078;
     Object term364744;
     Object term364751;

    public Flat3Map_put_19447407251174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363078 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term363124 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term363179 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term363198 = newInstance(Class.forName("java.lang.Object"));
        Object term363244 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term363078, term363078.getClass(), "delegateMap", null);
        setIntField(term363078, term363078.getClass(), "size", 3);
        setIntField(term363078, term363078.getClass(), "hash3", 0);
        setField(term363078, term363078.getClass(), "value3", null);
        setIntField(term363078, term363078.getClass(), "hash2", 0);
        setField(term363078, term363078.getClass(), "value2", null);
        setIntField(term363078, term363078.getClass(), "hash1", 0);
        setField(term363078, term363078.getClass(), "value1", null);
        setField(term363078, term363078.getClass(), "key3", null);
        setField(term363124, term363124.getClass(), "delegateMap", null);
        setIntField(term363124, term363124.getClass(), "size", 3);
        setIntField(term363179, term363179.getClass(), "size", 0);
        setField(term363124, term363124.getClass(), "key3", term363179);
        setField(term363124, term363124.getClass(), "key2", null);
        setField(term363124, term363124.getClass(), "value2", null);
        setIntField(term363124, term363124.getClass(), "hash3", 0);
        setIntField(term363124, term363124.getClass(), "hash2", 0);
        setIntField(term363124, term363124.getClass(), "hash1", 0);
        setField(term363124, term363124.getClass(), "key1", term363198);
        setField(term363078, term363078.getClass(), "key2", term363124);
        setField(term363244, term363244.getClass(), "delegateMap", null);
        setIntField(term363244, term363244.getClass(), "size", 2);
        setIntField(term363244, term363244.getClass(), "hash2", 0);
        setField(term363244, term363244.getClass(), "value2", null);
        setIntField(term363244, term363244.getClass(), "hash1", 0);
        setField(term363244, term363244.getClass(), "value1", null);
        setField(term363078, term363078.getClass(), "key1", term363244);
        term364744 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term364745 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term364746 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term364747 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term364748 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term364749 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term364750 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term364744, term364744.getClass(), "size", 0);
        setIntField(term364744, term364744.getClass(), "hash1", 0);
        setIntField(term364744, term364744.getClass(), "hash2", 0);
        setIntField(term364744, term364744.getClass(), "hash3", 0);
        setField(term364744, term364744.getClass(), "key1", null);
        setField(term364744, term364744.getClass(), "key2", null);
        setField(term364744, term364744.getClass(), "key3", null);
        setField(term364744, term364744.getClass(), "value1", null);
        setField(term364744, term364744.getClass(), "value2", null);
        setField(term364744, term364744.getClass(), "value3", null);
        setFloatField(term364745, term364745.getClass(), "loadFactor", 0.75F);
        setIntField(term364745, term364745.getClass(), "size", 4);
        setField(term364748, term364748.getClass(), "next", null);
        setField(term364748, term364748.getClass(), "key", null);
        setField(term364748, term364748.getClass(), "value", null);
        setField(term364747, term364747.getClass(), "next", term364748);
        setField(term364747, term364747.getClass(), "key", term364744);
        setField(term364747, term364747.getClass(), "value", null);
        setElement(term364746, 0, term364747);
        setField(term364749, term364749.getClass(), "next", null);
        setField(term364749, term364749.getClass(), "key", term364750);
        setField(term364749, term364749.getClass(), "value", null);
        setElement(term364746, 6, term364749);
        setField(term364745, term364745.getClass(), "data", term364746);
        setIntField(term364745, term364745.getClass(), "threshold", 12);
        setIntField(term364745, term364745.getClass(), "modCount", 4);
        setField(term364745, term364745.getClass(), "entrySet", null);
        setField(term364745, term364745.getClass(), "keySet", null);
        setField(term364745, term364745.getClass(), "values", null);
        setField(term364745, term364745.getClass(), "keySet", null);
        setField(term364745, term364745.getClass(), "values", null);
        setField(term364744, term364744.getClass(), "delegateMap", term364745);
        term364751 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term364752 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term364753 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term364754 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term364755 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term364756 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term364757 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term364751, term364751.getClass(), "size", 0);
        setIntField(term364751, term364751.getClass(), "hash1", 0);
        setIntField(term364751, term364751.getClass(), "hash2", 0);
        setIntField(term364751, term364751.getClass(), "hash3", 0);
        setField(term364751, term364751.getClass(), "key1", null);
        setField(term364751, term364751.getClass(), "key2", null);
        setField(term364751, term364751.getClass(), "key3", null);
        setField(term364751, term364751.getClass(), "value1", null);
        setField(term364751, term364751.getClass(), "value2", null);
        setField(term364751, term364751.getClass(), "value3", null);
        setFloatField(term364752, term364752.getClass(), "loadFactor", 0.75F);
        setIntField(term364752, term364752.getClass(), "size", 4);
        setField(term364755, term364755.getClass(), "next", null);
        setField(term364755, term364755.getClass(), "key", null);
        setField(term364755, term364755.getClass(), "value", null);
        setField(term364754, term364754.getClass(), "next", term364755);
        setField(term364754, term364754.getClass(), "key", term364751);
        setField(term364754, term364754.getClass(), "value", null);
        setElement(term364753, 0, term364754);
        setField(term364756, term364756.getClass(), "next", null);
        setField(term364756, term364756.getClass(), "key", term364757);
        setField(term364756, term364756.getClass(), "value", null);
        setElement(term364753, 6, term364756);
        setField(term364752, term364752.getClass(), "data", term364753);
        setIntField(term364752, term364752.getClass(), "threshold", 12);
        setIntField(term364752, term364752.getClass(), "modCount", 4);
        setField(term364752, term364752.getClass(), "entrySet", null);
        setField(term364752, term364752.getClass(), "keySet", null);
        setField(term364752, term364752.getClass(), "values", null);
        setField(term364752, term364752.getClass(), "keySet", null);
        setField(term364752, term364752.getClass(), "values", null);
        setField(term364751, term364751.getClass(), "delegateMap", term364752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term363078;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term363078, args);
        assertTrue(recursiveEquals(term363078, term364744));
        assertTrue(recursiveEquals(term363078, term364751));
        assertTrue(recursiveEquals(retValue, null));
    }

};


