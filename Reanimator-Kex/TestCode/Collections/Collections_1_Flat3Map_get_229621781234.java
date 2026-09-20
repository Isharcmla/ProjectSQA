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

public class Flat3Map_get_229621781234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40631;
     Object term40955;
     Object term40957;

    public Flat3Map_get_229621781234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40631 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term40686 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term40631, term40631.getClass(), "delegateMap", null);
        setIntField(term40631, term40631.getClass(), "size", 2);
        setIntField(term40631, term40631.getClass(), "hash2", 0);
        setField(term40631, term40631.getClass(), "value2", null);
        setIntField(term40631, term40631.getClass(), "hash1", 0);
        setField(term40631, term40631.getClass(), "value1", term40686);
        term40955 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term40956 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term40955, term40955.getClass(), "size", 2);
        setIntField(term40955, term40955.getClass(), "hash1", 0);
        setIntField(term40955, term40955.getClass(), "hash2", 0);
        setIntField(term40955, term40955.getClass(), "hash3", 0);
        setField(term40955, term40955.getClass(), "key1", null);
        setField(term40955, term40955.getClass(), "key2", null);
        setField(term40955, term40955.getClass(), "key3", null);
        setFloatField(term40956, term40956.getClass(), "loadFactor", 0.0F);
        setIntField(term40956, term40956.getClass(), "size", 0);
        setField(term40956, term40956.getClass(), "data", null);
        setIntField(term40956, term40956.getClass(), "threshold", 0);
        setIntField(term40956, term40956.getClass(), "modCount", 0);
        setField(term40956, term40956.getClass(), "entrySet", null);
        setField(term40956, term40956.getClass(), "keySet", null);
        setField(term40956, term40956.getClass(), "values", null);
        setField(term40956, term40956.getClass(), "keySet", null);
        setField(term40956, term40956.getClass(), "values", null);
        setField(term40955, term40955.getClass(), "value1", term40956);
        setField(term40955, term40955.getClass(), "value2", null);
        setField(term40955, term40955.getClass(), "value3", null);
        setField(term40955, term40955.getClass(), "delegateMap", null);
        term40957 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term40958 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term40957, term40957.getClass(), "size", 2);
        setIntField(term40957, term40957.getClass(), "hash1", 0);
        setIntField(term40957, term40957.getClass(), "hash2", 0);
        setIntField(term40957, term40957.getClass(), "hash3", 0);
        setField(term40957, term40957.getClass(), "key1", null);
        setField(term40957, term40957.getClass(), "key2", null);
        setField(term40957, term40957.getClass(), "key3", null);
        setFloatField(term40958, term40958.getClass(), "loadFactor", 0.0F);
        setIntField(term40958, term40958.getClass(), "size", 0);
        setField(term40958, term40958.getClass(), "data", null);
        setIntField(term40958, term40958.getClass(), "threshold", 0);
        setIntField(term40958, term40958.getClass(), "modCount", 0);
        setField(term40958, term40958.getClass(), "entrySet", null);
        setField(term40958, term40958.getClass(), "keySet", null);
        setField(term40958, term40958.getClass(), "values", null);
        setField(term40958, term40958.getClass(), "keySet", null);
        setField(term40958, term40958.getClass(), "values", null);
        setField(term40957, term40957.getClass(), "value1", term40958);
        setField(term40957, term40957.getClass(), "value2", null);
        setField(term40957, term40957.getClass(), "value3", null);
        setField(term40957, term40957.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term40631;
        Object retValue = callMethod(klass, "get", argTypes, term40631, args);
        assertTrue(recursiveEquals(term40631, term40955));
        assertTrue(recursiveEquals(term40631, term40957));
        assertTrue(recursiveEquals(retValue, null));
    }

};
