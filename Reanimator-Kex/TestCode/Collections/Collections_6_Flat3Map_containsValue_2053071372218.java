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

public class Flat3Map_containsValue_2053071372218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36114;
     Object term36331;
     Object term36332;

    public Flat3Map_containsValue_2053071372218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36114 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term36114, term36114.getClass(), "delegateMap", null);
        setIntField(term36114, term36114.getClass(), "size", 1);
        setField(term36114, term36114.getClass(), "value1", term36114);
        term36331 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term36331, term36331.getClass(), "size", 1);
        setIntField(term36331, term36331.getClass(), "hash1", 0);
        setIntField(term36331, term36331.getClass(), "hash2", 0);
        setIntField(term36331, term36331.getClass(), "hash3", 0);
        setField(term36331, term36331.getClass(), "key1", null);
        setField(term36331, term36331.getClass(), "key2", null);
        setField(term36331, term36331.getClass(), "key3", null);
        setField(term36331, term36331.getClass(), "value1", term36331);
        setField(term36331, term36331.getClass(), "value2", null);
        setField(term36331, term36331.getClass(), "value3", null);
        setField(term36331, term36331.getClass(), "delegateMap", null);
        term36332 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term36332, term36332.getClass(), "size", 1);
        setIntField(term36332, term36332.getClass(), "hash1", 0);
        setIntField(term36332, term36332.getClass(), "hash2", 0);
        setIntField(term36332, term36332.getClass(), "hash3", 0);
        setField(term36332, term36332.getClass(), "key1", null);
        setField(term36332, term36332.getClass(), "key2", null);
        setField(term36332, term36332.getClass(), "key3", null);
        setField(term36332, term36332.getClass(), "value1", term36332);
        setField(term36332, term36332.getClass(), "value2", null);
        setField(term36332, term36332.getClass(), "value3", null);
        setField(term36332, term36332.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36114;
        callMethod(klass, "containsValue", argTypes, term36114, args);
        assertTrue(recursiveEquals(term36114, term36331));
        assertTrue(recursiveEquals(term36114, term36332));
    }

};


