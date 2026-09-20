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

public class Flat3Map_equals_1826922527278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49499;
     Object term49591;
     Object term49904;
     Object term49905;

    public Flat3Map_equals_1826922527278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49499 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term49499, term49499.getClass(), "delegateMap", null);
        setIntField(term49499, term49499.getClass(), "size", 0);
        term49591 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49685 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term49591, term49591.getClass(), "delegateMap", term49685);
        term49904 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term49904, term49904.getClass(), "size", 0);
        setIntField(term49904, term49904.getClass(), "hash1", 0);
        setIntField(term49904, term49904.getClass(), "hash2", 0);
        setIntField(term49904, term49904.getClass(), "hash3", 0);
        setField(term49904, term49904.getClass(), "key1", null);
        setField(term49904, term49904.getClass(), "key2", null);
        setField(term49904, term49904.getClass(), "key3", null);
        setField(term49904, term49904.getClass(), "value1", null);
        setField(term49904, term49904.getClass(), "value2", null);
        setField(term49904, term49904.getClass(), "value3", null);
        setField(term49904, term49904.getClass(), "delegateMap", null);
        term49905 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49906 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term49905, term49905.getClass(), "size", 0);
        setIntField(term49905, term49905.getClass(), "hash1", 0);
        setIntField(term49905, term49905.getClass(), "hash2", 0);
        setIntField(term49905, term49905.getClass(), "hash3", 0);
        setField(term49905, term49905.getClass(), "key1", null);
        setField(term49905, term49905.getClass(), "key2", null);
        setField(term49905, term49905.getClass(), "key3", null);
        setField(term49905, term49905.getClass(), "value1", null);
        setField(term49905, term49905.getClass(), "value2", null);
        setField(term49905, term49905.getClass(), "value3", null);
        setFloatField(term49906, term49906.getClass(), "loadFactor", 0.0F);
        setIntField(term49906, term49906.getClass(), "size", 0);
        setField(term49906, term49906.getClass(), "data", null);
        setIntField(term49906, term49906.getClass(), "threshold", 0);
        setIntField(term49906, term49906.getClass(), "modCount", 0);
        setField(term49906, term49906.getClass(), "entrySet", null);
        setField(term49906, term49906.getClass(), "keySet", null);
        setField(term49906, term49906.getClass(), "values", null);
        setField(term49906, term49906.getClass(), "keySet", null);
        setField(term49906, term49906.getClass(), "values", null);
        setField(term49905, term49905.getClass(), "delegateMap", term49906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term49591;
        Object retValue = callMethod(klass, "equals", argTypes, term49499, args);
        assertTrue(recursiveEquals(term49499, term49904));
        assertTrue(recursiveEquals(term49591, term49905));
        assertTrue(recursiveEquals(retValue, true));
    }

};
