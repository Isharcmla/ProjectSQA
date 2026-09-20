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

public class Flat3Map_containsValue_2053071372116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19775;
     Object term19867;
     Object term19995;
     Object term19996;

    public Flat3Map_containsValue_2053071372116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19775 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term19775, term19775.getClass(), "delegateMap", null);
        term19867 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term19995 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term19995, term19995.getClass(), "size", 0);
        setIntField(term19995, term19995.getClass(), "hash1", 0);
        setIntField(term19995, term19995.getClass(), "hash2", 0);
        setIntField(term19995, term19995.getClass(), "hash3", 0);
        setField(term19995, term19995.getClass(), "key1", null);
        setField(term19995, term19995.getClass(), "key2", null);
        setField(term19995, term19995.getClass(), "key3", null);
        setField(term19995, term19995.getClass(), "value1", null);
        setField(term19995, term19995.getClass(), "value2", null);
        setField(term19995, term19995.getClass(), "value3", null);
        setField(term19995, term19995.getClass(), "delegateMap", null);
        term19996 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term19996, term19996.getClass(), "size", 0);
        setIntField(term19996, term19996.getClass(), "hash1", 0);
        setIntField(term19996, term19996.getClass(), "hash2", 0);
        setIntField(term19996, term19996.getClass(), "hash3", 0);
        setField(term19996, term19996.getClass(), "key1", null);
        setField(term19996, term19996.getClass(), "key2", null);
        setField(term19996, term19996.getClass(), "key3", null);
        setField(term19996, term19996.getClass(), "value1", null);
        setField(term19996, term19996.getClass(), "value2", null);
        setField(term19996, term19996.getClass(), "value3", null);
        setField(term19996, term19996.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term19867;
        callMethod(klass, "containsValue", argTypes, term19775, args);
        assertTrue(recursiveEquals(term19775, term19995));
        assertTrue(recursiveEquals(term19867, term19996));
    }

};
