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

public class Flat3Map_remove_8406902791039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208244;
     Object term208267;
     Object term208268;

    public Flat3Map_remove_8406902791039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208244 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term208244, term208244.getClass(), "delegateMap", null);
        setIntField(term208244, term208244.getClass(), "size", 3);
        setIntField(term208244, term208244.getClass(), "hash3", -1);
        setField(term208244, term208244.getClass(), "value3", null);
        setIntField(term208244, term208244.getClass(), "hash2", 0);
        setField(term208244, term208244.getClass(), "value2", null);
        setIntField(term208244, term208244.getClass(), "hash1", 0);
        setField(term208244, term208244.getClass(), "value1", null);
        term208267 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term208267, term208267.getClass(), "size", 3);
        setIntField(term208267, term208267.getClass(), "hash1", 0);
        setIntField(term208267, term208267.getClass(), "hash2", 0);
        setIntField(term208267, term208267.getClass(), "hash3", -1);
        setField(term208267, term208267.getClass(), "key1", null);
        setField(term208267, term208267.getClass(), "key2", null);
        setField(term208267, term208267.getClass(), "key3", null);
        setField(term208267, term208267.getClass(), "value1", null);
        setField(term208267, term208267.getClass(), "value2", null);
        setField(term208267, term208267.getClass(), "value3", null);
        setField(term208267, term208267.getClass(), "delegateMap", null);
        term208268 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term208268, term208268.getClass(), "size", 3);
        setIntField(term208268, term208268.getClass(), "hash1", 0);
        setIntField(term208268, term208268.getClass(), "hash2", 0);
        setIntField(term208268, term208268.getClass(), "hash3", -1);
        setField(term208268, term208268.getClass(), "key1", null);
        setField(term208268, term208268.getClass(), "key2", null);
        setField(term208268, term208268.getClass(), "key3", null);
        setField(term208268, term208268.getClass(), "value1", null);
        setField(term208268, term208268.getClass(), "value2", null);
        setField(term208268, term208268.getClass(), "value3", null);
        setField(term208268, term208268.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term208244;
        Object retValue = callMethod(klass, "remove", argTypes, term208244, args);
        assertTrue(recursiveEquals(term208244, term208267));
        assertTrue(recursiveEquals(term208244, term208268));
        assertTrue(recursiveEquals(retValue, null));
    }

};
