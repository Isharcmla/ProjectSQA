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

public class Flat3Map_put_1944740725554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109569;
     Object term109661;
     Object term110494;
     Object term110496;

    public Flat3Map_put_1944740725554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109569 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term109569, term109569.getClass(), "delegateMap", null);
        setIntField(term109569, term109569.getClass(), "size", 1);
        setIntField(term109569, term109569.getClass(), "hash1", 0);
        setField(term109569, term109569.getClass(), "key1", term109569);
        term109661 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term109661, term109661.getClass(), "delegateMap", null);
        setIntField(term109661, term109661.getClass(), "size", 1);
        setIntField(term109661, term109661.getClass(), "hash1", 0);
        setField(term109661, term109661.getClass(), "value1", null);
        term110494 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term110495 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term110494, term110494.getClass(), "size", 2);
        setIntField(term110494, term110494.getClass(), "hash1", 0);
        setIntField(term110494, term110494.getClass(), "hash2", 0);
        setIntField(term110494, term110494.getClass(), "hash3", 0);
        setField(term110494, term110494.getClass(), "key1", term110494);
        setIntField(term110495, term110495.getClass(), "size", 1);
        setIntField(term110495, term110495.getClass(), "hash1", 0);
        setIntField(term110495, term110495.getClass(), "hash2", 0);
        setIntField(term110495, term110495.getClass(), "hash3", 0);
        setField(term110495, term110495.getClass(), "key1", null);
        setField(term110495, term110495.getClass(), "key2", null);
        setField(term110495, term110495.getClass(), "key3", null);
        setField(term110495, term110495.getClass(), "value1", null);
        setField(term110495, term110495.getClass(), "value2", null);
        setField(term110495, term110495.getClass(), "value3", null);
        setField(term110495, term110495.getClass(), "delegateMap", null);
        setField(term110494, term110494.getClass(), "key2", term110495);
        setField(term110494, term110494.getClass(), "key3", null);
        setField(term110494, term110494.getClass(), "value1", null);
        setField(term110494, term110494.getClass(), "value2", null);
        setField(term110494, term110494.getClass(), "value3", null);
        setField(term110494, term110494.getClass(), "delegateMap", null);
        term110496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term110496, term110496.getClass(), "size", 1);
        setIntField(term110496, term110496.getClass(), "hash1", 0);
        setIntField(term110496, term110496.getClass(), "hash2", 0);
        setIntField(term110496, term110496.getClass(), "hash3", 0);
        setField(term110496, term110496.getClass(), "key1", null);
        setField(term110496, term110496.getClass(), "key2", null);
        setField(term110496, term110496.getClass(), "key3", null);
        setField(term110496, term110496.getClass(), "value1", null);
        setField(term110496, term110496.getClass(), "value2", null);
        setField(term110496, term110496.getClass(), "value3", null);
        setField(term110496, term110496.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term109661;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term109569, args);
        assertTrue(recursiveEquals(term109569, term110494));
        assertTrue(recursiveEquals(term109661, term110496));
        assertTrue(recursiveEquals(retValue, null));
    }

};


