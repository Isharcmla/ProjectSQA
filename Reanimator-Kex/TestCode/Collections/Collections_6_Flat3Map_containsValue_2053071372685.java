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

public class Flat3Map_containsValue_2053071372685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159065;
     Object term159333;
     Object term159524;
     Object term159527;

    public Flat3Map_containsValue_2053071372685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159065 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term159153 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        Object term159241 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term159065, term159065.getClass(), "delegateMap", null);
        setIntField(term159065, term159065.getClass(), "size", 3);
        setIntField(term159153, term159153.getClass(), "size", -1);
        setField(term159065, term159065.getClass(), "value3", term159153);
        setField(term159065, term159065.getClass(), "value2", term159241);
        term159333 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term159421 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term159421, term159421.getClass(), "size", 0);
        setField(term159333, term159333.getClass(), "delegateMap", term159421);
        term159524 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term159525 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        Object term159526 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term159524, term159524.getClass(), "size", 3);
        setIntField(term159524, term159524.getClass(), "hash1", 0);
        setIntField(term159524, term159524.getClass(), "hash2", 0);
        setIntField(term159524, term159524.getClass(), "hash3", 0);
        setField(term159524, term159524.getClass(), "key1", null);
        setField(term159524, term159524.getClass(), "key2", null);
        setField(term159524, term159524.getClass(), "key3", null);
        setField(term159524, term159524.getClass(), "value1", null);
        setIntField(term159525, term159525.getClass(), "maxSize", 0);
        setBooleanField(term159525, term159525.getClass(), "scanUntilRemovable", false);
        setField(term159525, term159525.getClass(), "header", null);
        setFloatField(term159525, term159525.getClass(), "loadFactor", 0.0F);
        setIntField(term159525, term159525.getClass(), "size", 0);
        setField(term159525, term159525.getClass(), "data", null);
        setIntField(term159525, term159525.getClass(), "threshold", 0);
        setIntField(term159525, term159525.getClass(), "modCount", 0);
        setField(term159525, term159525.getClass(), "entrySet", null);
        setField(term159525, term159525.getClass(), "keySet", null);
        setField(term159525, term159525.getClass(), "values", null);
        setField(term159525, term159525.getClass(), "keySet", null);
        setField(term159525, term159525.getClass(), "values", null);
        setField(term159524, term159524.getClass(), "value2", term159525);
        setIntField(term159526, term159526.getClass(), "maxSize", 0);
        setBooleanField(term159526, term159526.getClass(), "scanUntilRemovable", false);
        setField(term159526, term159526.getClass(), "header", null);
        setFloatField(term159526, term159526.getClass(), "loadFactor", 0.0F);
        setIntField(term159526, term159526.getClass(), "size", -1);
        setField(term159526, term159526.getClass(), "data", null);
        setIntField(term159526, term159526.getClass(), "threshold", 0);
        setIntField(term159526, term159526.getClass(), "modCount", 0);
        setField(term159526, term159526.getClass(), "entrySet", null);
        setField(term159526, term159526.getClass(), "keySet", null);
        setField(term159526, term159526.getClass(), "values", null);
        setField(term159526, term159526.getClass(), "keySet", null);
        setField(term159526, term159526.getClass(), "values", null);
        setField(term159524, term159524.getClass(), "value3", term159526);
        setField(term159524, term159524.getClass(), "delegateMap", null);
        term159527 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term159528 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term159527, term159527.getClass(), "size", 0);
        setIntField(term159527, term159527.getClass(), "hash1", 0);
        setIntField(term159527, term159527.getClass(), "hash2", 0);
        setIntField(term159527, term159527.getClass(), "hash3", 0);
        setField(term159527, term159527.getClass(), "key1", null);
        setField(term159527, term159527.getClass(), "key2", null);
        setField(term159527, term159527.getClass(), "key3", null);
        setField(term159527, term159527.getClass(), "value1", null);
        setField(term159527, term159527.getClass(), "value2", null);
        setField(term159527, term159527.getClass(), "value3", null);
        setIntField(term159528, term159528.getClass(), "maxSize", 0);
        setBooleanField(term159528, term159528.getClass(), "scanUntilRemovable", false);
        setField(term159528, term159528.getClass(), "header", null);
        setFloatField(term159528, term159528.getClass(), "loadFactor", 0.0F);
        setIntField(term159528, term159528.getClass(), "size", 0);
        setField(term159528, term159528.getClass(), "data", null);
        setIntField(term159528, term159528.getClass(), "threshold", 0);
        setIntField(term159528, term159528.getClass(), "modCount", 0);
        setField(term159528, term159528.getClass(), "entrySet", null);
        setField(term159528, term159528.getClass(), "keySet", null);
        setField(term159528, term159528.getClass(), "values", null);
        setField(term159528, term159528.getClass(), "keySet", null);
        setField(term159528, term159528.getClass(), "values", null);
        setField(term159527, term159527.getClass(), "delegateMap", term159528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term159333;
        callMethod(klass, "containsValue", argTypes, term159065, args);
        assertTrue(recursiveEquals(term159065, term159524));
        assertTrue(recursiveEquals(term159333, term159527));
    }

};


