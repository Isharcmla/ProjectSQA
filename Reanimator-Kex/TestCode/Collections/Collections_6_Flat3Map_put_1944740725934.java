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

public class Flat3Map_put_1944740725934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250825;
     Object term251119;
     Object term252132;

    public Flat3Map_put_1944740725934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250825 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250917 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term251027 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term250825, term250825.getClass(), "delegateMap", null);
        setIntField(term250825, term250825.getClass(), "size", 3);
        setIntField(term250825, term250825.getClass(), "hash3", 0);
        setField(term250917, term250917.getClass(), "delegateMap", null);
        setIntField(term250917, term250917.getClass(), "size", 3);
        setField(term250917, term250917.getClass(), "key3", term251027);
        setField(term250917, term250917.getClass(), "key2", null);
        setField(term250917, term250917.getClass(), "value2", null);
        setIntField(term250917, term250917.getClass(), "hash3", -1);
        setIntField(term250917, term250917.getClass(), "hash2", -1);
        setField(term250825, term250825.getClass(), "key3", term250917);
        term251119 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term251211 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term251119, term251119.getClass(), "delegateMap", null);
        setIntField(term251119, term251119.getClass(), "size", 3);
        setIntField(term251119, term251119.getClass(), "hash3", 0);
        setField(term251119, term251119.getClass(), "value3", null);
        setIntField(term251119, term251119.getClass(), "hash2", 0);
        setField(term251119, term251119.getClass(), "value2", null);
        setIntField(term251119, term251119.getClass(), "hash1", 0);
        setField(term251119, term251119.getClass(), "value1", null);
        setField(term251119, term251119.getClass(), "key3", null);
        setField(term251211, term251211.getClass(), "delegateMap", null);
        setIntField(term251211, term251211.getClass(), "size", 0);
        setField(term251119, term251119.getClass(), "key2", term251211);
        term252132 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term252132, term252132.getClass(), "size", 3);
        setIntField(term252132, term252132.getClass(), "hash1", 0);
        setIntField(term252132, term252132.getClass(), "hash2", 0);
        setIntField(term252132, term252132.getClass(), "hash3", 0);
        setField(term252132, term252132.getClass(), "key1", null);
        setField(term252132, term252132.getClass(), "key2", null);
        setField(term252132, term252132.getClass(), "key3", null);
        setField(term252132, term252132.getClass(), "value1", null);
        setField(term252132, term252132.getClass(), "value2", null);
        setField(term252132, term252132.getClass(), "value3", null);
        setField(term252132, term252132.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term251119;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term250825, args);
        assertTrue(recursiveEquals(term251119, term252132));
        assertTrue(recursiveEquals(retValue, null));
    }

};


