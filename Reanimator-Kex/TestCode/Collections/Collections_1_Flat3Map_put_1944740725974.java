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

public class Flat3Map_put_1944740725974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195308;
     Object term195602;
     Object term195992;
     Object term195997;

    public Flat3Map_put_1944740725974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195308 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195346 = newInstance(Class.forName("java.lang.Object"));
        Object term195384 = newInstance(Class.forName("java.lang.Object"));
        Object term195422 = newInstance(Class.forName("java.lang.Object"));
        Object[] term195178 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term195460 = newInstance(Class.forName("java.lang.Object"));
        Object term195498 = newInstance(Class.forName("java.lang.Object"));
        setField(term195308, term195308.getClass(), "delegateMap", null);
        setIntField(term195308, term195308.getClass(), "size", -3);
        setIntField(term195308, term195308.getClass(), "hash3", 0);
        setIntField(term195308, term195308.getClass(), "hash2", 0);
        setIntField(term195308, term195308.getClass(), "hash1", 0);
        setField(term195308, term195308.getClass(), "key3", term195346);
        setField(term195308, term195308.getClass(), "key2", term195384);
        setField(term195308, term195308.getClass(), "key1", term195422);
        setField(term195308, term195308.getClass(), "value3", term195178);
        setField(term195308, term195308.getClass(), "value2", term195460);
        setField(term195308, term195308.getClass(), "value1", term195498);
        term195602 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJChar$Merger"));
        term195992 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195993 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term195994 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term195995 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term195996 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJChar$Merger"));
        setIntField(term195992, term195992.getClass(), "size", 0);
        setIntField(term195992, term195992.getClass(), "hash1", 0);
        setIntField(term195992, term195992.getClass(), "hash2", 0);
        setIntField(term195992, term195992.getClass(), "hash3", 0);
        setField(term195992, term195992.getClass(), "key1", null);
        setField(term195992, term195992.getClass(), "key2", null);
        setField(term195992, term195992.getClass(), "key3", null);
        setField(term195992, term195992.getClass(), "value1", null);
        setField(term195992, term195992.getClass(), "value2", null);
        setField(term195992, term195992.getClass(), "value3", null);
        setFloatField(term195993, term195993.getClass(), "loadFactor", 0.75F);
        setIntField(term195993, term195993.getClass(), "size", 1);
        setField(term195995, term195995.getClass(), "next", null);
        setField(term195996, term195996.getClass(), "a", null);
        setField(term195996, term195996.getClass(), "w", null);
        setIntField(term195996, term195996.getClass(), "lbase", 0);
        setIntField(term195996, term195996.getClass(), "lsize", 0);
        setIntField(term195996, term195996.getClass(), "rbase", 0);
        setIntField(term195996, term195996.getClass(), "rsize", 0);
        setIntField(term195996, term195996.getClass(), "wbase", 0);
        setIntField(term195996, term195996.getClass(), "gran", 0);
        setField(term195996, term195996.getClass(), "completer", null);
        setIntField(term195996, term195996.getClass(), "pending", 0);
        setIntField(term195996, term195996.getClass(), "status", 0);
        setField(term195995, term195995.getClass(), "key", term195996);
        setField(term195995, term195995.getClass(), "value", null);
        setElement(term195994, 11, term195995);
        setField(term195993, term195993.getClass(), "data", term195994);
        setIntField(term195993, term195993.getClass(), "threshold", 12);
        setIntField(term195993, term195993.getClass(), "modCount", 1);
        setField(term195993, term195993.getClass(), "entrySet", null);
        setField(term195993, term195993.getClass(), "keySet", null);
        setField(term195993, term195993.getClass(), "values", null);
        setField(term195993, term195993.getClass(), "keySet", null);
        setField(term195993, term195993.getClass(), "values", null);
        setField(term195992, term195992.getClass(), "delegateMap", term195993);
        term195997 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJChar$Merger"));
        setField(term195997, term195997.getClass(), "a", null);
        setField(term195997, term195997.getClass(), "w", null);
        setIntField(term195997, term195997.getClass(), "lbase", 0);
        setIntField(term195997, term195997.getClass(), "lsize", 0);
        setIntField(term195997, term195997.getClass(), "rbase", 0);
        setIntField(term195997, term195997.getClass(), "rsize", 0);
        setIntField(term195997, term195997.getClass(), "wbase", 0);
        setIntField(term195997, term195997.getClass(), "gran", 0);
        setField(term195997, term195997.getClass(), "completer", null);
        setIntField(term195997, term195997.getClass(), "pending", 0);
        setIntField(term195997, term195997.getClass(), "status", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term195602;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term195308, args);
        assertTrue(recursiveEquals(term195308, term195992));
        assertTrue(recursiveEquals(term195602, term195997));
        assertTrue(recursiveEquals(retValue, null));
    }

};
