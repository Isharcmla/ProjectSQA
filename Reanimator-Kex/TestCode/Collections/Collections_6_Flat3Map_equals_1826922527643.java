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

public class Flat3Map_equals_1826922527643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142152;
     Object term142324;
     Object term143220;
     Object term143222;

    public Flat3Map_equals_1826922527643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142152 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142232 = newInstance(Class.forName("java.nio.file.StandardWatchEventKinds"));
        setField(term142152, term142152.getClass(), "delegateMap", null);
        setIntField(term142152, term142152.getClass(), "size", 3);
        setField(term142152, term142152.getClass(), "key3", term142232);
        term142324 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term142324, term142324.getClass(), "delegateMap", null);
        setIntField(term142324, term142324.getClass(), "size", 3);
        term143220 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143221 = newInstance(Class.forName("java.nio.file.StandardWatchEventKinds"));
        setIntField(term143220, term143220.getClass(), "size", 3);
        setIntField(term143220, term143220.getClass(), "hash1", 0);
        setIntField(term143220, term143220.getClass(), "hash2", 0);
        setIntField(term143220, term143220.getClass(), "hash3", 0);
        setField(term143220, term143220.getClass(), "key1", null);
        setField(term143220, term143220.getClass(), "key2", null);
        setField(term143220, term143220.getClass(), "key3", term143221);
        setField(term143220, term143220.getClass(), "value1", null);
        setField(term143220, term143220.getClass(), "value2", null);
        setField(term143220, term143220.getClass(), "value3", null);
        setField(term143220, term143220.getClass(), "delegateMap", null);
        term143222 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term143222, term143222.getClass(), "size", 3);
        setIntField(term143222, term143222.getClass(), "hash1", 0);
        setIntField(term143222, term143222.getClass(), "hash2", 0);
        setIntField(term143222, term143222.getClass(), "hash3", 0);
        setField(term143222, term143222.getClass(), "key1", null);
        setField(term143222, term143222.getClass(), "key2", null);
        setField(term143222, term143222.getClass(), "key3", null);
        setField(term143222, term143222.getClass(), "value1", null);
        setField(term143222, term143222.getClass(), "value2", null);
        setField(term143222, term143222.getClass(), "value3", null);
        setField(term143222, term143222.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term142324;
        Object retValue = callMethod(klass, "equals", argTypes, term142152, args);
        assertTrue(recursiveEquals(term142152, term143220));
        assertTrue(recursiveEquals(term142324, term143222));
        assertTrue(recursiveEquals(retValue, false));
    }

};


