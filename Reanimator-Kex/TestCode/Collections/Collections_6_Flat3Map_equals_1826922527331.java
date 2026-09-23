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

public class Flat3Map_equals_1826922527331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54903;
     Object term55105;
     Object term55455;
     Object term55457;

    public Flat3Map_equals_1826922527331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54903 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55013 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term54903, term54903.getClass(), "delegateMap", null);
        setIntField(term54903, term54903.getClass(), "size", 1);
        setField(term54903, term54903.getClass(), "key1", null);
        setField(term54903, term54903.getClass(), "value1", term55013);
        term55105 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55143 = newInstance(Class.forName("java.lang.Object"));
        setField(term55105, term55105.getClass(), "delegateMap", null);
        setIntField(term55105, term55105.getClass(), "size", 1);
        setField(term55105, term55105.getClass(), "key1", null);
        setField(term55105, term55105.getClass(), "value1", term55143);
        term55455 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55456 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term55455, term55455.getClass(), "size", 1);
        setIntField(term55455, term55455.getClass(), "hash1", 0);
        setIntField(term55455, term55455.getClass(), "hash2", 0);
        setIntField(term55455, term55455.getClass(), "hash3", 0);
        setField(term55455, term55455.getClass(), "key1", null);
        setField(term55455, term55455.getClass(), "key2", null);
        setField(term55455, term55455.getClass(), "key3", null);
        setFloatField(term55456, term55456.getClass(), "loadFactor", 0.0F);
        setIntField(term55456, term55456.getClass(), "size", 0);
        setField(term55456, term55456.getClass(), "data", null);
        setIntField(term55456, term55456.getClass(), "threshold", 0);
        setIntField(term55456, term55456.getClass(), "modCount", 0);
        setField(term55456, term55456.getClass(), "entrySet", null);
        setField(term55456, term55456.getClass(), "keySet", null);
        setField(term55456, term55456.getClass(), "values", null);
        setField(term55456, term55456.getClass(), "keySet", null);
        setField(term55456, term55456.getClass(), "values", null);
        setField(term55455, term55455.getClass(), "value1", term55456);
        setField(term55455, term55455.getClass(), "value2", null);
        setField(term55455, term55455.getClass(), "value3", null);
        setField(term55455, term55455.getClass(), "delegateMap", null);
        term55457 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55458 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term55457, term55457.getClass(), "size", 1);
        setIntField(term55457, term55457.getClass(), "hash1", 0);
        setIntField(term55457, term55457.getClass(), "hash2", 0);
        setIntField(term55457, term55457.getClass(), "hash3", 0);
        setField(term55457, term55457.getClass(), "key1", null);
        setField(term55457, term55457.getClass(), "key2", null);
        setField(term55457, term55457.getClass(), "key3", null);
        setField(term55457, term55457.getClass(), "value1", term55458);
        setField(term55457, term55457.getClass(), "value2", null);
        setField(term55457, term55457.getClass(), "value3", null);
        setField(term55457, term55457.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term55105;
        Object retValue = callMethod(klass, "equals", argTypes, term54903, args);
        assertTrue(recursiveEquals(term54903, term55455));
        assertTrue(recursiveEquals(term55105, term55457));
        assertTrue(recursiveEquals(retValue, false));
    }

};


