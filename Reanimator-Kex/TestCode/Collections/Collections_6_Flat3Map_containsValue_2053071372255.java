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

public class Flat3Map_containsValue_2053071372255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42026;
     Object term42067;
     Object term42068;

    public Flat3Map_containsValue_2053071372255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42026 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term42026, term42026.getClass(), "delegateMap", null);
        setIntField(term42026, term42026.getClass(), "size", 2);
        setField(term42026, term42026.getClass(), "value2", term42026);
        term42067 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term42067, term42067.getClass(), "size", 2);
        setIntField(term42067, term42067.getClass(), "hash1", 0);
        setIntField(term42067, term42067.getClass(), "hash2", 0);
        setIntField(term42067, term42067.getClass(), "hash3", 0);
        setField(term42067, term42067.getClass(), "key1", null);
        setField(term42067, term42067.getClass(), "key2", null);
        setField(term42067, term42067.getClass(), "key3", null);
        setField(term42067, term42067.getClass(), "value1", null);
        setField(term42067, term42067.getClass(), "value2", term42067);
        setField(term42067, term42067.getClass(), "value3", null);
        setField(term42067, term42067.getClass(), "delegateMap", null);
        term42068 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term42068, term42068.getClass(), "size", 2);
        setIntField(term42068, term42068.getClass(), "hash1", 0);
        setIntField(term42068, term42068.getClass(), "hash2", 0);
        setIntField(term42068, term42068.getClass(), "hash3", 0);
        setField(term42068, term42068.getClass(), "key1", null);
        setField(term42068, term42068.getClass(), "key2", null);
        setField(term42068, term42068.getClass(), "key3", null);
        setField(term42068, term42068.getClass(), "value1", null);
        setField(term42068, term42068.getClass(), "value2", term42068);
        setField(term42068, term42068.getClass(), "value3", null);
        setField(term42068, term42068.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42026;
        callMethod(klass, "containsValue", argTypes, term42026, args);
        assertTrue(recursiveEquals(term42026, term42067));
        assertTrue(recursiveEquals(term42026, term42068));
    }

};


