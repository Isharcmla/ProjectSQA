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

public class Flat3Map_get_229621781204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34507;
     Object term34956;
     Object term34957;

    public Flat3Map_get_229621781204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34507 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term34507, term34507.getClass(), "delegateMap", null);
        setIntField(term34507, term34507.getClass(), "size", 3);
        term34956 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term34956, term34956.getClass(), "size", 3);
        setIntField(term34956, term34956.getClass(), "hash1", 0);
        setIntField(term34956, term34956.getClass(), "hash2", 0);
        setIntField(term34956, term34956.getClass(), "hash3", 0);
        setField(term34956, term34956.getClass(), "key1", null);
        setField(term34956, term34956.getClass(), "key2", null);
        setField(term34956, term34956.getClass(), "key3", null);
        setField(term34956, term34956.getClass(), "value1", null);
        setField(term34956, term34956.getClass(), "value2", null);
        setField(term34956, term34956.getClass(), "value3", null);
        setField(term34956, term34956.getClass(), "delegateMap", null);
        term34957 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term34957, term34957.getClass(), "size", 3);
        setIntField(term34957, term34957.getClass(), "hash1", 0);
        setIntField(term34957, term34957.getClass(), "hash2", 0);
        setIntField(term34957, term34957.getClass(), "hash3", 0);
        setField(term34957, term34957.getClass(), "key1", null);
        setField(term34957, term34957.getClass(), "key2", null);
        setField(term34957, term34957.getClass(), "key3", null);
        setField(term34957, term34957.getClass(), "value1", null);
        setField(term34957, term34957.getClass(), "value2", null);
        setField(term34957, term34957.getClass(), "value3", null);
        setField(term34957, term34957.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term34507;
        Object retValue = callMethod(klass, "get", argTypes, term34507, args);
        assertTrue(recursiveEquals(term34507, term34956));
        assertTrue(recursiveEquals(term34507, term34957));
        assertTrue(recursiveEquals(retValue, null));
    }

};
