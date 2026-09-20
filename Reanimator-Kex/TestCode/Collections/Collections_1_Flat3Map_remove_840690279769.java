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

public class Flat3Map_remove_840690279769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155816;
     Object term156532;
     Object term156533;

    public Flat3Map_remove_840690279769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155816 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term155816, term155816.getClass(), "delegateMap", null);
        setIntField(term155816, term155816.getClass(), "size", 0);
        term156532 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term156532, term156532.getClass(), "size", 0);
        setIntField(term156532, term156532.getClass(), "hash1", 0);
        setIntField(term156532, term156532.getClass(), "hash2", 0);
        setIntField(term156532, term156532.getClass(), "hash3", 0);
        setField(term156532, term156532.getClass(), "key1", null);
        setField(term156532, term156532.getClass(), "key2", null);
        setField(term156532, term156532.getClass(), "key3", null);
        setField(term156532, term156532.getClass(), "value1", null);
        setField(term156532, term156532.getClass(), "value2", null);
        setField(term156532, term156532.getClass(), "value3", null);
        setField(term156532, term156532.getClass(), "delegateMap", null);
        term156533 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term156533, term156533.getClass(), "size", 0);
        setIntField(term156533, term156533.getClass(), "hash1", 0);
        setIntField(term156533, term156533.getClass(), "hash2", 0);
        setIntField(term156533, term156533.getClass(), "hash3", 0);
        setField(term156533, term156533.getClass(), "key1", null);
        setField(term156533, term156533.getClass(), "key2", null);
        setField(term156533, term156533.getClass(), "key3", null);
        setField(term156533, term156533.getClass(), "value1", null);
        setField(term156533, term156533.getClass(), "value2", null);
        setField(term156533, term156533.getClass(), "value3", null);
        setField(term156533, term156533.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term155816;
        Object retValue = callMethod(klass, "remove", argTypes, term155816, args);
        assertTrue(recursiveEquals(term155816, term156532));
        assertTrue(recursiveEquals(term155816, term156533));
        assertTrue(recursiveEquals(retValue, null));
    }

};
