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

public class Flat3Map_remove_840690279995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198708;
     Object term198817;
     Object term198818;

    public Flat3Map_remove_840690279995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198708 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term198708, term198708.getClass(), "delegateMap", null);
        setIntField(term198708, term198708.getClass(), "size", 1);
        setIntField(term198708, term198708.getClass(), "hash1", 0);
        setField(term198708, term198708.getClass(), "value1", null);
        term198817 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term198817, term198817.getClass(), "size", 1);
        setIntField(term198817, term198817.getClass(), "hash1", 0);
        setIntField(term198817, term198817.getClass(), "hash2", 0);
        setIntField(term198817, term198817.getClass(), "hash3", 0);
        setField(term198817, term198817.getClass(), "key1", null);
        setField(term198817, term198817.getClass(), "key2", null);
        setField(term198817, term198817.getClass(), "key3", null);
        setField(term198817, term198817.getClass(), "value1", null);
        setField(term198817, term198817.getClass(), "value2", null);
        setField(term198817, term198817.getClass(), "value3", null);
        setField(term198817, term198817.getClass(), "delegateMap", null);
        term198818 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term198818, term198818.getClass(), "size", 1);
        setIntField(term198818, term198818.getClass(), "hash1", 0);
        setIntField(term198818, term198818.getClass(), "hash2", 0);
        setIntField(term198818, term198818.getClass(), "hash3", 0);
        setField(term198818, term198818.getClass(), "key1", null);
        setField(term198818, term198818.getClass(), "key2", null);
        setField(term198818, term198818.getClass(), "key3", null);
        setField(term198818, term198818.getClass(), "value1", null);
        setField(term198818, term198818.getClass(), "value2", null);
        setField(term198818, term198818.getClass(), "value3", null);
        setField(term198818, term198818.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term198708;
        Object retValue = callMethod(klass, "remove", argTypes, term198708, args);
        assertTrue(recursiveEquals(term198708, term198817));
        assertTrue(recursiveEquals(term198708, term198818));
        assertTrue(recursiveEquals(retValue, null));
    }

};
