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

public class Flat3Map_put_1944740725858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172941;
     Object term173079;
     Object term173421;
     Object term173423;

    public Flat3Map_put_1944740725858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172941 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term172941, term172941.getClass(), "delegateMap", null);
        setIntField(term172941, term172941.getClass(), "size", 1);
        term173079 = newInstance(Class.forName("org.apache.commons.collections.bidimap.TreeBidiMap$ViewMapIterator"));
        term173421 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term173422 = newInstance(Class.forName("org.apache.commons.collections.bidimap.TreeBidiMap$ViewMapIterator"));
        setIntField(term173421, term173421.getClass(), "size", 2);
        setIntField(term173421, term173421.getClass(), "hash1", 0);
        setIntField(term173421, term173421.getClass(), "hash2", 1104226120);
        setIntField(term173421, term173421.getClass(), "hash3", 0);
        setField(term173421, term173421.getClass(), "key1", null);
        setIntField(term173422, term173422.getClass(), "oppositeType", 0);
        setField(term173422, term173422.getClass(), "main", null);
        setIntField(term173422, term173422.getClass(), "orderType", 0);
        setIntField(term173422, term173422.getClass(), "dataType", 0);
        setField(term173422, term173422.getClass(), "lastReturnedNode", null);
        setField(term173422, term173422.getClass(), "nextNode", null);
        setField(term173422, term173422.getClass(), "previousNode", null);
        setIntField(term173422, term173422.getClass(), "expectedModifications", 0);
        setField(term173421, term173421.getClass(), "key2", term173422);
        setField(term173421, term173421.getClass(), "key3", null);
        setField(term173421, term173421.getClass(), "value1", null);
        setField(term173421, term173421.getClass(), "value2", null);
        setField(term173421, term173421.getClass(), "value3", null);
        setField(term173421, term173421.getClass(), "delegateMap", null);
        term173423 = newInstance(Class.forName("org.apache.commons.collections.bidimap.TreeBidiMap$ViewMapIterator"));
        setIntField(term173423, term173423.getClass(), "oppositeType", 0);
        setField(term173423, term173423.getClass(), "main", null);
        setIntField(term173423, term173423.getClass(), "orderType", 0);
        setIntField(term173423, term173423.getClass(), "dataType", 0);
        setField(term173423, term173423.getClass(), "lastReturnedNode", null);
        setField(term173423, term173423.getClass(), "nextNode", null);
        setField(term173423, term173423.getClass(), "previousNode", null);
        setIntField(term173423, term173423.getClass(), "expectedModifications", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term173079;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term172941, args);
        assertTrue(recursiveEquals(term172941, term173421));
        assertTrue(recursiveEquals(term173079, term173423));
        assertTrue(recursiveEquals(retValue, null));
    }

};
