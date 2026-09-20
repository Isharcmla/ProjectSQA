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

public class Flat3Map_put_1944740725827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167622;
     Object term167766;
     Object term167833;
     Object term167835;

    public Flat3Map_put_1944740725827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167622 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term167622, term167622.getClass(), "delegateMap", null);
        setIntField(term167622, term167622.getClass(), "size", 1);
        term167766 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        term167833 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term167834 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setIntField(term167833, term167833.getClass(), "size", 2);
        setIntField(term167833, term167833.getClass(), "hash1", 0);
        setIntField(term167833, term167833.getClass(), "hash2", 592476020);
        setIntField(term167833, term167833.getClass(), "hash3", 0);
        setField(term167833, term167833.getClass(), "key1", null);
        setField(term167834, term167834.getClass(), "firstWaiter", null);
        setField(term167834, term167834.getClass(), "lastWaiter", null);
        setField(term167834, term167834.getClass(), "this$0", null);
        setField(term167833, term167833.getClass(), "key2", term167834);
        setField(term167833, term167833.getClass(), "key3", null);
        setField(term167833, term167833.getClass(), "value1", null);
        setField(term167833, term167833.getClass(), "value2", null);
        setField(term167833, term167833.getClass(), "value3", null);
        setField(term167833, term167833.getClass(), "delegateMap", null);
        term167835 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject"));
        setField(term167835, term167835.getClass(), "firstWaiter", null);
        setField(term167835, term167835.getClass(), "lastWaiter", null);
        setField(term167835, term167835.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term167766;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term167622, args);
        assertTrue(recursiveEquals(term167622, term167833));
        assertTrue(recursiveEquals(term167766, term167835));
        assertTrue(recursiveEquals(retValue, null));
    }

};
