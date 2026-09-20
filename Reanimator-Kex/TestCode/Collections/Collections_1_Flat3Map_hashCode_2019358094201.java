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

public class Flat3Map_hashCode_2019358094201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34137;
     Object term34350;

    public Flat3Map_hashCode_2019358094201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34137 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34229 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term34137, term34137.getClass(), "delegateMap", null);
        setIntField(term34137, term34137.getClass(), "size", 2);
        setIntField(term34137, term34137.getClass(), "hash2", 0);
        setField(term34137, term34137.getClass(), "value2", null);
        setIntField(term34137, term34137.getClass(), "hash1", 0);
        setField(term34137, term34137.getClass(), "value1", term34229);
        term34350 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34351 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term34350, term34350.getClass(), "size", 2);
        setIntField(term34350, term34350.getClass(), "hash1", 0);
        setIntField(term34350, term34350.getClass(), "hash2", 0);
        setIntField(term34350, term34350.getClass(), "hash3", 0);
        setField(term34350, term34350.getClass(), "key1", null);
        setField(term34350, term34350.getClass(), "key2", null);
        setField(term34350, term34350.getClass(), "key3", null);
        setIntField(term34351, term34351.getClass(), "size", 0);
        setIntField(term34351, term34351.getClass(), "hash1", 0);
        setIntField(term34351, term34351.getClass(), "hash2", 0);
        setIntField(term34351, term34351.getClass(), "hash3", 0);
        setField(term34351, term34351.getClass(), "key1", null);
        setField(term34351, term34351.getClass(), "key2", null);
        setField(term34351, term34351.getClass(), "key3", null);
        setField(term34351, term34351.getClass(), "value1", null);
        setField(term34351, term34351.getClass(), "value2", null);
        setField(term34351, term34351.getClass(), "value3", null);
        setField(term34351, term34351.getClass(), "delegateMap", null);
        setField(term34350, term34350.getClass(), "value1", term34351);
        setField(term34350, term34350.getClass(), "value2", null);
        setField(term34350, term34350.getClass(), "value3", null);
        setField(term34350, term34350.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term34137, args);
        assertTrue(recursiveEquals(term34137, term34350));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
