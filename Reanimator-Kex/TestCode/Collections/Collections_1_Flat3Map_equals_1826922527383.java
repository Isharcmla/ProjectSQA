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

public class Flat3Map_equals_1826922527383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70376;
     Object term70578;
     Object term70779;
     Object term70781;

    public Flat3Map_equals_1826922527383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70376 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term70486 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term70376, term70376.getClass(), "delegateMap", null);
        setIntField(term70376, term70376.getClass(), "size", 2);
        setField(term70376, term70376.getClass(), "key2", null);
        setField(term70376, term70376.getClass(), "value2", term70486);
        term70578 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term70688 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term70578, term70578.getClass(), "delegateMap", null);
        setIntField(term70578, term70578.getClass(), "size", 2);
        setField(term70578, term70578.getClass(), "key2", null);
        setField(term70578, term70578.getClass(), "value2", term70688);
        term70779 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term70780 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term70779, term70779.getClass(), "size", 2);
        setIntField(term70779, term70779.getClass(), "hash1", 0);
        setIntField(term70779, term70779.getClass(), "hash2", 0);
        setIntField(term70779, term70779.getClass(), "hash3", 0);
        setField(term70779, term70779.getClass(), "key1", null);
        setField(term70779, term70779.getClass(), "key2", null);
        setField(term70779, term70779.getClass(), "key3", null);
        setField(term70779, term70779.getClass(), "value1", null);
        setFloatField(term70780, term70780.getClass(), "loadFactor", 0.0F);
        setIntField(term70780, term70780.getClass(), "size", 0);
        setField(term70780, term70780.getClass(), "data", null);
        setIntField(term70780, term70780.getClass(), "threshold", 0);
        setIntField(term70780, term70780.getClass(), "modCount", 0);
        setField(term70780, term70780.getClass(), "entrySet", null);
        setField(term70780, term70780.getClass(), "keySet", null);
        setField(term70780, term70780.getClass(), "values", null);
        setField(term70780, term70780.getClass(), "keySet", null);
        setField(term70780, term70780.getClass(), "values", null);
        setField(term70779, term70779.getClass(), "value2", term70780);
        setField(term70779, term70779.getClass(), "value3", null);
        setField(term70779, term70779.getClass(), "delegateMap", null);
        term70781 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term70782 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term70781, term70781.getClass(), "size", 2);
        setIntField(term70781, term70781.getClass(), "hash1", 0);
        setIntField(term70781, term70781.getClass(), "hash2", 0);
        setIntField(term70781, term70781.getClass(), "hash3", 0);
        setField(term70781, term70781.getClass(), "key1", null);
        setField(term70781, term70781.getClass(), "key2", null);
        setField(term70781, term70781.getClass(), "key3", null);
        setField(term70781, term70781.getClass(), "value1", null);
        setFloatField(term70782, term70782.getClass(), "loadFactor", 0.0F);
        setIntField(term70782, term70782.getClass(), "size", 0);
        setField(term70782, term70782.getClass(), "data", null);
        setIntField(term70782, term70782.getClass(), "threshold", 0);
        setIntField(term70782, term70782.getClass(), "modCount", 0);
        setField(term70782, term70782.getClass(), "entrySet", null);
        setField(term70782, term70782.getClass(), "keySet", null);
        setField(term70782, term70782.getClass(), "values", null);
        setField(term70782, term70782.getClass(), "keySet", null);
        setField(term70782, term70782.getClass(), "values", null);
        setField(term70781, term70781.getClass(), "value2", term70782);
        setField(term70781, term70781.getClass(), "value3", null);
        setField(term70781, term70781.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term70578;
        Object retValue = callMethod(klass, "equals", argTypes, term70376, args);
        assertTrue(recursiveEquals(term70376, term70779));
        assertTrue(recursiveEquals(term70578, term70781));
        assertTrue(recursiveEquals(retValue, false));
    }

};
