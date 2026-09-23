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

public class Flat3Map_put_1944740725649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144478;
     Object term144570;
     Object term144779;
     Object term144784;

    public Flat3Map_put_1944740725649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144478 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term144478, term144478.getClass(), "delegateMap", null);
        setIntField(term144478, term144478.getClass(), "size", -4);
        setIntField(term144478, term144478.getClass(), "hash3", 0);
        setField(term144478, term144478.getClass(), "key3", null);
        setIntField(term144478, term144478.getClass(), "hash2", 0);
        setField(term144478, term144478.getClass(), "key2", null);
        setIntField(term144478, term144478.getClass(), "hash1", 0);
        setField(term144478, term144478.getClass(), "key1", term144478);
        term144570 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144664 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term144570, term144570.getClass(), "delegateMap", null);
        setIntField(term144570, term144570.getClass(), "size", 3);
        setIntField(term144570, term144570.getClass(), "hash3", 0);
        setField(term144570, term144570.getClass(), "value3", null);
        setIntField(term144570, term144570.getClass(), "hash2", 0);
        setField(term144570, term144570.getClass(), "value2", null);
        setIntField(term144570, term144570.getClass(), "hash1", 0);
        setIntField(term144664, term144664.getClass(), "size", 0);
        setField(term144570, term144570.getClass(), "value1", term144664);
        term144779 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144780 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term144781 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term144782 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term144783 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term144779, term144779.getClass(), "size", 0);
        setIntField(term144779, term144779.getClass(), "hash1", 0);
        setIntField(term144779, term144779.getClass(), "hash2", 0);
        setIntField(term144779, term144779.getClass(), "hash3", 0);
        setField(term144779, term144779.getClass(), "key1", null);
        setField(term144779, term144779.getClass(), "key2", null);
        setField(term144779, term144779.getClass(), "key3", null);
        setField(term144779, term144779.getClass(), "value1", null);
        setField(term144779, term144779.getClass(), "value2", null);
        setField(term144779, term144779.getClass(), "value3", null);
        setFloatField(term144780, term144780.getClass(), "loadFactor", 0.75F);
        setIntField(term144780, term144780.getClass(), "size", 1);
        setField(term144782, term144782.getClass(), "next", null);
        setIntField(term144783, term144783.getClass(), "size", 3);
        setIntField(term144783, term144783.getClass(), "hash1", 0);
        setIntField(term144783, term144783.getClass(), "hash2", 0);
        setIntField(term144783, term144783.getClass(), "hash3", 0);
        setField(term144783, term144783.getClass(), "key1", null);
        setField(term144783, term144783.getClass(), "key2", null);
        setField(term144783, term144783.getClass(), "key3", null);
        setField(term144783, term144783.getClass(), "value1", null);
        setField(term144783, term144783.getClass(), "value2", null);
        setField(term144783, term144783.getClass(), "value3", null);
        setField(term144783, term144783.getClass(), "delegateMap", null);
        setField(term144782, term144782.getClass(), "key", term144783);
        setField(term144782, term144782.getClass(), "value", null);
        setElement(term144781, 0, term144782);
        setField(term144780, term144780.getClass(), "data", term144781);
        setIntField(term144780, term144780.getClass(), "threshold", 12);
        setIntField(term144780, term144780.getClass(), "modCount", 1);
        setField(term144780, term144780.getClass(), "entrySet", null);
        setField(term144780, term144780.getClass(), "keySet", null);
        setField(term144780, term144780.getClass(), "values", null);
        setField(term144780, term144780.getClass(), "keySet", null);
        setField(term144780, term144780.getClass(), "values", null);
        setField(term144779, term144779.getClass(), "delegateMap", term144780);
        term144784 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term144784, term144784.getClass(), "size", 3);
        setIntField(term144784, term144784.getClass(), "hash1", 0);
        setIntField(term144784, term144784.getClass(), "hash2", 0);
        setIntField(term144784, term144784.getClass(), "hash3", 0);
        setField(term144784, term144784.getClass(), "key1", null);
        setField(term144784, term144784.getClass(), "key2", null);
        setField(term144784, term144784.getClass(), "key3", null);
        setField(term144784, term144784.getClass(), "value1", null);
        setField(term144784, term144784.getClass(), "value2", null);
        setField(term144784, term144784.getClass(), "value3", null);
        setField(term144784, term144784.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term144570;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term144478, args);
        assertTrue(recursiveEquals(term144478, term144779));
        assertTrue(recursiveEquals(term144570, term144784));
        assertTrue(recursiveEquals(retValue, null));
    }

};


