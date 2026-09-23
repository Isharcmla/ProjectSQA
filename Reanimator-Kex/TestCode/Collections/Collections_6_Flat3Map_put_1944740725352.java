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

public class Flat3Map_put_1944740725352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58783;
     Object term59477;
     Object term59484;

    public Flat3Map_put_1944740725352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58783 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term58832 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$Worker"));
        setField(term58783, term58783.getClass(), "delegateMap", null);
        setIntField(term58783, term58783.getClass(), "size", 3);
        setIntField(term58783, term58783.getClass(), "hash3", 0);
        setField(term58783, term58783.getClass(), "value3", null);
        setIntField(term58783, term58783.getClass(), "hash2", 0);
        setField(term58783, term58783.getClass(), "value2", null);
        setIntField(term58783, term58783.getClass(), "hash1", 0);
        setField(term58783, term58783.getClass(), "value1", term58832);
        term59477 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term59478 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term59479 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term59480 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term59481 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term59482 = newInstance(Class.forName("java.lang.Object"));
        Object term59483 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$Worker"));
        setIntField(term59477, term59477.getClass(), "size", 0);
        setIntField(term59477, term59477.getClass(), "hash1", 0);
        setIntField(term59477, term59477.getClass(), "hash2", 0);
        setIntField(term59477, term59477.getClass(), "hash3", 0);
        setField(term59477, term59477.getClass(), "key1", null);
        setField(term59477, term59477.getClass(), "key2", null);
        setField(term59477, term59477.getClass(), "key3", null);
        setField(term59477, term59477.getClass(), "value1", null);
        setField(term59477, term59477.getClass(), "value2", null);
        setField(term59477, term59477.getClass(), "value3", null);
        setFloatField(term59478, term59478.getClass(), "loadFactor", 0.75F);
        setIntField(term59478, term59478.getClass(), "size", 2);
        setField(term59480, term59480.getClass(), "next", null);
        setField(term59480, term59480.getClass(), "key", term59477);
        setField(term59480, term59480.getClass(), "value", null);
        setElement(term59479, 0, term59480);
        setField(term59481, term59481.getClass(), "next", null);
        setField(term59481, term59481.getClass(), "key", term59482);
        setField(term59483, term59483.getClass(), "thread", null);
        setField(term59483, term59483.getClass(), "firstTask", null);
        setLongField(term59483, term59483.getClass(), "completedTasks", 0L);
        setField(term59483, term59483.getClass(), "this$0", null);
        setField(term59483, term59483.getClass(), "head", null);
        setField(term59483, term59483.getClass(), "tail", null);
        setIntField(term59483, term59483.getClass(), "state", 0);
        setField(term59483, term59483.getClass(), "exclusiveOwnerThread", null);
        setField(term59481, term59481.getClass(), "value", term59483);
        setElement(term59479, 5, term59481);
        setField(term59478, term59478.getClass(), "data", term59479);
        setIntField(term59478, term59478.getClass(), "threshold", 12);
        setIntField(term59478, term59478.getClass(), "modCount", 2);
        setField(term59478, term59478.getClass(), "entrySet", null);
        setField(term59478, term59478.getClass(), "keySet", null);
        setField(term59478, term59478.getClass(), "values", null);
        setField(term59478, term59478.getClass(), "keySet", null);
        setField(term59478, term59478.getClass(), "values", null);
        setField(term59477, term59477.getClass(), "delegateMap", term59478);
        term59484 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term59485 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term59486 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term59487 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term59488 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term59489 = newInstance(Class.forName("java.lang.Object"));
        Object term59490 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$Worker"));
        setIntField(term59484, term59484.getClass(), "size", 0);
        setIntField(term59484, term59484.getClass(), "hash1", 0);
        setIntField(term59484, term59484.getClass(), "hash2", 0);
        setIntField(term59484, term59484.getClass(), "hash3", 0);
        setField(term59484, term59484.getClass(), "key1", null);
        setField(term59484, term59484.getClass(), "key2", null);
        setField(term59484, term59484.getClass(), "key3", null);
        setField(term59484, term59484.getClass(), "value1", null);
        setField(term59484, term59484.getClass(), "value2", null);
        setField(term59484, term59484.getClass(), "value3", null);
        setFloatField(term59485, term59485.getClass(), "loadFactor", 0.75F);
        setIntField(term59485, term59485.getClass(), "size", 2);
        setField(term59487, term59487.getClass(), "next", null);
        setField(term59487, term59487.getClass(), "key", term59484);
        setField(term59487, term59487.getClass(), "value", null);
        setElement(term59486, 0, term59487);
        setField(term59488, term59488.getClass(), "next", null);
        setField(term59488, term59488.getClass(), "key", term59489);
        setField(term59490, term59490.getClass(), "thread", null);
        setField(term59490, term59490.getClass(), "firstTask", null);
        setLongField(term59490, term59490.getClass(), "completedTasks", 0L);
        setField(term59490, term59490.getClass(), "this$0", null);
        setField(term59490, term59490.getClass(), "head", null);
        setField(term59490, term59490.getClass(), "tail", null);
        setIntField(term59490, term59490.getClass(), "state", 0);
        setField(term59490, term59490.getClass(), "exclusiveOwnerThread", null);
        setField(term59488, term59488.getClass(), "value", term59490);
        setElement(term59486, 5, term59488);
        setField(term59485, term59485.getClass(), "data", term59486);
        setIntField(term59485, term59485.getClass(), "threshold", 12);
        setIntField(term59485, term59485.getClass(), "modCount", 2);
        setField(term59485, term59485.getClass(), "entrySet", null);
        setField(term59485, term59485.getClass(), "keySet", null);
        setField(term59485, term59485.getClass(), "values", null);
        setField(term59485, term59485.getClass(), "keySet", null);
        setField(term59485, term59485.getClass(), "values", null);
        setField(term59484, term59484.getClass(), "delegateMap", term59485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term58783;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term58783, args);
        assertTrue(recursiveEquals(term58783, term59477));
        assertTrue(recursiveEquals(term58783, term59484));
        assertTrue(recursiveEquals(retValue, null));
    }

};


