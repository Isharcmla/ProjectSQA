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

public class Flat3Map_containsKey_76092510433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79797;
     Object term79981;
     Object term79983;

    public Flat3Map_containsKey_76092510433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79797 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79843 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term79797, term79797.getClass(), "delegateMap", null);
        setIntField(term79797, term79797.getClass(), "size", 2);
        setIntField(term79797, term79797.getClass(), "hash2", 0);
        setField(term79797, term79797.getClass(), "value2", null);
        setIntField(term79797, term79797.getClass(), "hash1", 0);
        setField(term79797, term79797.getClass(), "value1", null);
        setField(term79797, term79797.getClass(), "key2", term79843);
        term79981 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79982 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term79981, term79981.getClass(), "size", 2);
        setIntField(term79981, term79981.getClass(), "hash1", 0);
        setIntField(term79981, term79981.getClass(), "hash2", 0);
        setIntField(term79981, term79981.getClass(), "hash3", 0);
        setField(term79981, term79981.getClass(), "key1", null);
        setIntField(term79982, term79982.getClass(), "size", 0);
        setIntField(term79982, term79982.getClass(), "hash1", 0);
        setIntField(term79982, term79982.getClass(), "hash2", 0);
        setIntField(term79982, term79982.getClass(), "hash3", 0);
        setField(term79982, term79982.getClass(), "key1", null);
        setField(term79982, term79982.getClass(), "key2", null);
        setField(term79982, term79982.getClass(), "key3", null);
        setField(term79982, term79982.getClass(), "value1", null);
        setField(term79982, term79982.getClass(), "value2", null);
        setField(term79982, term79982.getClass(), "value3", null);
        setField(term79982, term79982.getClass(), "delegateMap", null);
        setField(term79981, term79981.getClass(), "key2", term79982);
        setField(term79981, term79981.getClass(), "key3", null);
        setField(term79981, term79981.getClass(), "value1", null);
        setField(term79981, term79981.getClass(), "value2", null);
        setField(term79981, term79981.getClass(), "value3", null);
        setField(term79981, term79981.getClass(), "delegateMap", null);
        term79983 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79984 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term79983, term79983.getClass(), "size", 2);
        setIntField(term79983, term79983.getClass(), "hash1", 0);
        setIntField(term79983, term79983.getClass(), "hash2", 0);
        setIntField(term79983, term79983.getClass(), "hash3", 0);
        setField(term79983, term79983.getClass(), "key1", null);
        setIntField(term79984, term79984.getClass(), "size", 0);
        setIntField(term79984, term79984.getClass(), "hash1", 0);
        setIntField(term79984, term79984.getClass(), "hash2", 0);
        setIntField(term79984, term79984.getClass(), "hash3", 0);
        setField(term79984, term79984.getClass(), "key1", null);
        setField(term79984, term79984.getClass(), "key2", null);
        setField(term79984, term79984.getClass(), "key3", null);
        setField(term79984, term79984.getClass(), "value1", null);
        setField(term79984, term79984.getClass(), "value2", null);
        setField(term79984, term79984.getClass(), "value3", null);
        setField(term79984, term79984.getClass(), "delegateMap", null);
        setField(term79983, term79983.getClass(), "key2", term79984);
        setField(term79983, term79983.getClass(), "key3", null);
        setField(term79983, term79983.getClass(), "value1", null);
        setField(term79983, term79983.getClass(), "value2", null);
        setField(term79983, term79983.getClass(), "value3", null);
        setField(term79983, term79983.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term79797;
        callMethod(klass, "containsKey", argTypes, term79797, args);
        assertTrue(recursiveEquals(term79797, term79981));
        assertTrue(recursiveEquals(term79797, term79983));
    }

};
