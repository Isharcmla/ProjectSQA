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

public class Flat3Map_containsValue_2053071372192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32404;
     Object term32496;
     Object term32625;
     Object term32626;

    public Flat3Map_containsValue_2053071372192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32404 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term32404, term32404.getClass(), "delegateMap", null);
        setIntField(term32404, term32404.getClass(), "size", 2);
        term32496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term32625 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term32625, term32625.getClass(), "size", 2);
        setIntField(term32625, term32625.getClass(), "hash1", 0);
        setIntField(term32625, term32625.getClass(), "hash2", 0);
        setIntField(term32625, term32625.getClass(), "hash3", 0);
        setField(term32625, term32625.getClass(), "key1", null);
        setField(term32625, term32625.getClass(), "key2", null);
        setField(term32625, term32625.getClass(), "key3", null);
        setField(term32625, term32625.getClass(), "value1", null);
        setField(term32625, term32625.getClass(), "value2", null);
        setField(term32625, term32625.getClass(), "value3", null);
        setField(term32625, term32625.getClass(), "delegateMap", null);
        term32626 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term32626, term32626.getClass(), "size", 0);
        setIntField(term32626, term32626.getClass(), "hash1", 0);
        setIntField(term32626, term32626.getClass(), "hash2", 0);
        setIntField(term32626, term32626.getClass(), "hash3", 0);
        setField(term32626, term32626.getClass(), "key1", null);
        setField(term32626, term32626.getClass(), "key2", null);
        setField(term32626, term32626.getClass(), "key3", null);
        setField(term32626, term32626.getClass(), "value1", null);
        setField(term32626, term32626.getClass(), "value2", null);
        setField(term32626, term32626.getClass(), "value3", null);
        setField(term32626, term32626.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term32496;
        callMethod(klass, "containsValue", argTypes, term32404, args);
        assertTrue(recursiveEquals(term32404, term32625));
        assertTrue(recursiveEquals(term32496, term32626));
    }

};
