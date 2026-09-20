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

public class Flat3Map_equals_1826922527238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41116;
     Object term41248;
     Object term41980;
     Object term41982;

    public Flat3Map_equals_1826922527238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41116 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term41210 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term41116, term41116.getClass(), "delegateMap", term41210);
        term41248 = newInstance(Class.forName("java.lang.Object"));
        term41980 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term41981 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term41980, term41980.getClass(), "size", 0);
        setIntField(term41980, term41980.getClass(), "hash1", 0);
        setIntField(term41980, term41980.getClass(), "hash2", 0);
        setIntField(term41980, term41980.getClass(), "hash3", 0);
        setField(term41980, term41980.getClass(), "key1", null);
        setField(term41980, term41980.getClass(), "key2", null);
        setField(term41980, term41980.getClass(), "key3", null);
        setField(term41980, term41980.getClass(), "value1", null);
        setField(term41980, term41980.getClass(), "value2", null);
        setField(term41980, term41980.getClass(), "value3", null);
        setFloatField(term41981, term41981.getClass(), "loadFactor", 0.0F);
        setIntField(term41981, term41981.getClass(), "size", 0);
        setField(term41981, term41981.getClass(), "data", null);
        setIntField(term41981, term41981.getClass(), "threshold", 0);
        setIntField(term41981, term41981.getClass(), "modCount", 0);
        setField(term41981, term41981.getClass(), "entrySet", null);
        setField(term41981, term41981.getClass(), "keySet", null);
        setField(term41981, term41981.getClass(), "values", null);
        setField(term41981, term41981.getClass(), "keySet", null);
        setField(term41981, term41981.getClass(), "values", null);
        setField(term41980, term41980.getClass(), "delegateMap", term41981);
        term41982 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term41248;
        Object retValue = callMethod(klass, "equals", argTypes, term41116, args);
        assertTrue(recursiveEquals(term41116, term41980));
        assertTrue(recursiveEquals(term41248, term41982));
        assertTrue(recursiveEquals(retValue, false));
    }

};
