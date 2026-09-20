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

public class Flat3Map_remove_8406902791085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215257;
     Object term215840;
     Object term215842;

    public Flat3Map_remove_8406902791085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215257 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term215309 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJChar$Merger"));
        setField(term215257, term215257.getClass(), "delegateMap", null);
        setIntField(term215257, term215257.getClass(), "size", 3);
        setIntField(term215257, term215257.getClass(), "hash3", 0);
        setField(term215257, term215257.getClass(), "value3", term215309);
        term215840 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term215841 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJChar$Merger"));
        setIntField(term215840, term215840.getClass(), "size", 3);
        setIntField(term215840, term215840.getClass(), "hash1", 0);
        setIntField(term215840, term215840.getClass(), "hash2", 0);
        setIntField(term215840, term215840.getClass(), "hash3", 0);
        setField(term215840, term215840.getClass(), "key1", null);
        setField(term215840, term215840.getClass(), "key2", null);
        setField(term215840, term215840.getClass(), "key3", null);
        setField(term215840, term215840.getClass(), "value1", null);
        setField(term215840, term215840.getClass(), "value2", null);
        setField(term215841, term215841.getClass(), "a", null);
        setField(term215841, term215841.getClass(), "w", null);
        setIntField(term215841, term215841.getClass(), "lbase", 0);
        setIntField(term215841, term215841.getClass(), "lsize", 0);
        setIntField(term215841, term215841.getClass(), "rbase", 0);
        setIntField(term215841, term215841.getClass(), "rsize", 0);
        setIntField(term215841, term215841.getClass(), "wbase", 0);
        setIntField(term215841, term215841.getClass(), "gran", 0);
        setField(term215841, term215841.getClass(), "completer", null);
        setIntField(term215841, term215841.getClass(), "pending", 0);
        setIntField(term215841, term215841.getClass(), "status", 0);
        setField(term215840, term215840.getClass(), "value3", term215841);
        setField(term215840, term215840.getClass(), "delegateMap", null);
        term215842 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term215843 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJChar$Merger"));
        setIntField(term215842, term215842.getClass(), "size", 3);
        setIntField(term215842, term215842.getClass(), "hash1", 0);
        setIntField(term215842, term215842.getClass(), "hash2", 0);
        setIntField(term215842, term215842.getClass(), "hash3", 0);
        setField(term215842, term215842.getClass(), "key1", null);
        setField(term215842, term215842.getClass(), "key2", null);
        setField(term215842, term215842.getClass(), "key3", null);
        setField(term215842, term215842.getClass(), "value1", null);
        setField(term215842, term215842.getClass(), "value2", null);
        setField(term215843, term215843.getClass(), "a", null);
        setField(term215843, term215843.getClass(), "w", null);
        setIntField(term215843, term215843.getClass(), "lbase", 0);
        setIntField(term215843, term215843.getClass(), "lsize", 0);
        setIntField(term215843, term215843.getClass(), "rbase", 0);
        setIntField(term215843, term215843.getClass(), "rsize", 0);
        setIntField(term215843, term215843.getClass(), "wbase", 0);
        setIntField(term215843, term215843.getClass(), "gran", 0);
        setField(term215843, term215843.getClass(), "completer", null);
        setIntField(term215843, term215843.getClass(), "pending", 0);
        setIntField(term215843, term215843.getClass(), "status", 0);
        setField(term215842, term215842.getClass(), "value3", term215843);
        setField(term215842, term215842.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term215257;
        Object retValue = callMethod(klass, "remove", argTypes, term215257, args);
        assertTrue(recursiveEquals(term215257, term215840));
        assertTrue(recursiveEquals(term215257, term215842));
        assertTrue(recursiveEquals(retValue, null));
    }

};
