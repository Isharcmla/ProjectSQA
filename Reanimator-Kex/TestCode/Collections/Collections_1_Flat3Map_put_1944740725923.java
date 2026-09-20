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

public class Flat3Map_put_1944740725923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185605;
     Object term185724;
     Object term185726;

    public Flat3Map_put_1944740725923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185605 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term185660 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term185605, term185605.getClass(), "delegateMap", null);
        setIntField(term185605, term185605.getClass(), "size", 2);
        setIntField(term185605, term185605.getClass(), "hash2", 0);
        setIntField(term185660, term185660.getClass(), "size", 0);
        setField(term185605, term185605.getClass(), "value2", term185660);
        setIntField(term185605, term185605.getClass(), "hash1", 0);
        setField(term185605, term185605.getClass(), "value1", null);
        setField(term185605, term185605.getClass(), "key2", null);
        setField(term185605, term185605.getClass(), "key1", term185605);
        term185724 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term185725 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term185724, term185724.getClass(), "size", 2);
        setIntField(term185724, term185724.getClass(), "hash1", 0);
        setIntField(term185724, term185724.getClass(), "hash2", 0);
        setIntField(term185724, term185724.getClass(), "hash3", 0);
        setField(term185724, term185724.getClass(), "key1", term185724);
        setField(term185724, term185724.getClass(), "key2", null);
        setField(term185724, term185724.getClass(), "key3", null);
        setField(term185724, term185724.getClass(), "value1", null);
        setFloatField(term185725, term185725.getClass(), "loadFactor", 0.0F);
        setIntField(term185725, term185725.getClass(), "size", 0);
        setField(term185725, term185725.getClass(), "data", null);
        setIntField(term185725, term185725.getClass(), "threshold", 0);
        setIntField(term185725, term185725.getClass(), "modCount", 0);
        setField(term185725, term185725.getClass(), "entrySet", null);
        setField(term185725, term185725.getClass(), "keySet", null);
        setField(term185725, term185725.getClass(), "values", null);
        setField(term185725, term185725.getClass(), "keySet", null);
        setField(term185725, term185725.getClass(), "values", null);
        setField(term185724, term185724.getClass(), "value2", term185725);
        setField(term185724, term185724.getClass(), "value3", null);
        setField(term185724, term185724.getClass(), "delegateMap", null);
        term185726 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term185727 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term185726, term185726.getClass(), "size", 2);
        setIntField(term185726, term185726.getClass(), "hash1", 0);
        setIntField(term185726, term185726.getClass(), "hash2", 0);
        setIntField(term185726, term185726.getClass(), "hash3", 0);
        setField(term185726, term185726.getClass(), "key1", term185726);
        setField(term185726, term185726.getClass(), "key2", null);
        setField(term185726, term185726.getClass(), "key3", null);
        setField(term185726, term185726.getClass(), "value1", null);
        setFloatField(term185727, term185727.getClass(), "loadFactor", 0.0F);
        setIntField(term185727, term185727.getClass(), "size", 0);
        setField(term185727, term185727.getClass(), "data", null);
        setIntField(term185727, term185727.getClass(), "threshold", 0);
        setIntField(term185727, term185727.getClass(), "modCount", 0);
        setField(term185727, term185727.getClass(), "entrySet", null);
        setField(term185727, term185727.getClass(), "keySet", null);
        setField(term185727, term185727.getClass(), "values", null);
        setField(term185727, term185727.getClass(), "keySet", null);
        setField(term185727, term185727.getClass(), "values", null);
        setField(term185726, term185726.getClass(), "value2", term185727);
        setField(term185726, term185726.getClass(), "value3", null);
        setField(term185726, term185726.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term185605;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term185605, args);
        assertTrue(recursiveEquals(term185605, term185724));
        assertTrue(recursiveEquals(term185605, term185726));
        assertTrue(recursiveEquals(retValue, null));
    }

};
