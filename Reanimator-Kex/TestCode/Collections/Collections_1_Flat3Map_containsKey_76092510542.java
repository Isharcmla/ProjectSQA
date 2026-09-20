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

public class Flat3Map_containsKey_76092510542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102888;
     Object term103441;
     Object term103442;

    public Flat3Map_containsKey_76092510542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102888 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term102888, term102888.getClass(), "delegateMap", null);
        setIntField(term102888, term102888.getClass(), "size", 0);
        term103441 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term103441, term103441.getClass(), "size", 0);
        setIntField(term103441, term103441.getClass(), "hash1", 0);
        setIntField(term103441, term103441.getClass(), "hash2", 0);
        setIntField(term103441, term103441.getClass(), "hash3", 0);
        setField(term103441, term103441.getClass(), "key1", null);
        setField(term103441, term103441.getClass(), "key2", null);
        setField(term103441, term103441.getClass(), "key3", null);
        setField(term103441, term103441.getClass(), "value1", null);
        setField(term103441, term103441.getClass(), "value2", null);
        setField(term103441, term103441.getClass(), "value3", null);
        setField(term103441, term103441.getClass(), "delegateMap", null);
        term103442 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term103442, term103442.getClass(), "size", 0);
        setIntField(term103442, term103442.getClass(), "hash1", 0);
        setIntField(term103442, term103442.getClass(), "hash2", 0);
        setIntField(term103442, term103442.getClass(), "hash3", 0);
        setField(term103442, term103442.getClass(), "key1", null);
        setField(term103442, term103442.getClass(), "key2", null);
        setField(term103442, term103442.getClass(), "key3", null);
        setField(term103442, term103442.getClass(), "value1", null);
        setField(term103442, term103442.getClass(), "value2", null);
        setField(term103442, term103442.getClass(), "value3", null);
        setField(term103442, term103442.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term102888;
        callMethod(klass, "containsKey", argTypes, term102888, args);
        assertTrue(recursiveEquals(term102888, term103441));
        assertTrue(recursiveEquals(term102888, term103442));
    }

};
