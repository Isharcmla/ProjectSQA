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

public class Flat3Map_remove_8406902791021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204603;
     Object term204686;
     Object term204688;

    public Flat3Map_remove_8406902791021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204603 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term204649 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term204603, term204603.getClass(), "delegateMap", null);
        setIntField(term204603, term204603.getClass(), "size", 1);
        setIntField(term204603, term204603.getClass(), "hash1", 0);
        setField(term204603, term204603.getClass(), "value1", null);
        setField(term204603, term204603.getClass(), "key1", term204649);
        term204686 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term204687 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term204686, term204686.getClass(), "size", 1);
        setIntField(term204686, term204686.getClass(), "hash1", 0);
        setIntField(term204686, term204686.getClass(), "hash2", 0);
        setIntField(term204686, term204686.getClass(), "hash3", 0);
        setIntField(term204687, term204687.getClass(), "size", 0);
        setIntField(term204687, term204687.getClass(), "hash1", 0);
        setIntField(term204687, term204687.getClass(), "hash2", 0);
        setIntField(term204687, term204687.getClass(), "hash3", 0);
        setField(term204687, term204687.getClass(), "key1", null);
        setField(term204687, term204687.getClass(), "key2", null);
        setField(term204687, term204687.getClass(), "key3", null);
        setField(term204687, term204687.getClass(), "value1", null);
        setField(term204687, term204687.getClass(), "value2", null);
        setField(term204687, term204687.getClass(), "value3", null);
        setField(term204687, term204687.getClass(), "delegateMap", null);
        setField(term204686, term204686.getClass(), "key1", term204687);
        setField(term204686, term204686.getClass(), "key2", null);
        setField(term204686, term204686.getClass(), "key3", null);
        setField(term204686, term204686.getClass(), "value1", null);
        setField(term204686, term204686.getClass(), "value2", null);
        setField(term204686, term204686.getClass(), "value3", null);
        setField(term204686, term204686.getClass(), "delegateMap", null);
        term204688 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term204689 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term204688, term204688.getClass(), "size", 1);
        setIntField(term204688, term204688.getClass(), "hash1", 0);
        setIntField(term204688, term204688.getClass(), "hash2", 0);
        setIntField(term204688, term204688.getClass(), "hash3", 0);
        setIntField(term204689, term204689.getClass(), "size", 0);
        setIntField(term204689, term204689.getClass(), "hash1", 0);
        setIntField(term204689, term204689.getClass(), "hash2", 0);
        setIntField(term204689, term204689.getClass(), "hash3", 0);
        setField(term204689, term204689.getClass(), "key1", null);
        setField(term204689, term204689.getClass(), "key2", null);
        setField(term204689, term204689.getClass(), "key3", null);
        setField(term204689, term204689.getClass(), "value1", null);
        setField(term204689, term204689.getClass(), "value2", null);
        setField(term204689, term204689.getClass(), "value3", null);
        setField(term204689, term204689.getClass(), "delegateMap", null);
        setField(term204688, term204688.getClass(), "key1", term204689);
        setField(term204688, term204688.getClass(), "key2", null);
        setField(term204688, term204688.getClass(), "key3", null);
        setField(term204688, term204688.getClass(), "value1", null);
        setField(term204688, term204688.getClass(), "value2", null);
        setField(term204688, term204688.getClass(), "value3", null);
        setField(term204688, term204688.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term204603;
        Object retValue = callMethod(klass, "remove", argTypes, term204603, args);
        assertTrue(recursiveEquals(term204603, term204686));
        assertTrue(recursiveEquals(term204603, term204688));
        assertTrue(recursiveEquals(retValue, null));
    }

};
