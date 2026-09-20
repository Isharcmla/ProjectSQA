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

public class Flat3Map_equals_1826922527577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110216;
     Object term110440;
     Object term110555;
     Object term110557;

    public Flat3Map_equals_1826922527577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110216 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term110328 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setIntField(term110328, term110328.getClass(), "size", 0);
        setField(term110216, term110216.getClass(), "delegateMap", term110328);
        term110440 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setIntField(term110440, term110440.getClass(), "size", -1);
        term110555 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term110556 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setIntField(term110555, term110555.getClass(), "size", 0);
        setIntField(term110555, term110555.getClass(), "hash1", 0);
        setIntField(term110555, term110555.getClass(), "hash2", 0);
        setIntField(term110555, term110555.getClass(), "hash3", 0);
        setField(term110555, term110555.getClass(), "key1", null);
        setField(term110555, term110555.getClass(), "key2", null);
        setField(term110555, term110555.getClass(), "key3", null);
        setField(term110555, term110555.getClass(), "value1", null);
        setField(term110555, term110555.getClass(), "value2", null);
        setField(term110555, term110555.getClass(), "value3", null);
        setFloatField(term110556, term110556.getClass(), "loadFactor", 0.0F);
        setIntField(term110556, term110556.getClass(), "size", 0);
        setField(term110556, term110556.getClass(), "data", null);
        setIntField(term110556, term110556.getClass(), "threshold", 0);
        setIntField(term110556, term110556.getClass(), "modCount", 0);
        setField(term110556, term110556.getClass(), "entrySet", null);
        setField(term110556, term110556.getClass(), "keySet", null);
        setField(term110556, term110556.getClass(), "values", null);
        setField(term110556, term110556.getClass(), "keySet", null);
        setField(term110556, term110556.getClass(), "values", null);
        setField(term110555, term110555.getClass(), "delegateMap", term110556);
        term110557 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term110557, term110557.getClass(), "loadFactor", 0.0F);
        setIntField(term110557, term110557.getClass(), "size", -1);
        setField(term110557, term110557.getClass(), "data", null);
        setIntField(term110557, term110557.getClass(), "threshold", 0);
        setIntField(term110557, term110557.getClass(), "modCount", 0);
        setField(term110557, term110557.getClass(), "entrySet", null);
        setField(term110557, term110557.getClass(), "keySet", null);
        setField(term110557, term110557.getClass(), "values", null);
        setField(term110557, term110557.getClass(), "keySet", null);
        setField(term110557, term110557.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term110440;
        Object retValue = callMethod(klass, "equals", argTypes, term110216, args);
        assertTrue(recursiveEquals(term110216, term110555));
        assertTrue(recursiveEquals(term110440, term110557));
        assertTrue(recursiveEquals(retValue, false));
    }

};
