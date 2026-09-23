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

public class Flat3Map_put_1944740725432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77302;
     Object term77486;
     Object term78314;
     Object term78317;

    public Flat3Map_put_1944740725432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77302 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term77394 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term77302, term77302.getClass(), "delegateMap", null);
        setIntField(term77302, term77302.getClass(), "size", 2);
        setIntField(term77302, term77302.getClass(), "hash2", 0);
        setField(term77394, term77394.getClass(), "delegateMap", null);
        setIntField(term77394, term77394.getClass(), "size", -3);
        setField(term77302, term77302.getClass(), "key2", term77394);
        setIntField(term77302, term77302.getClass(), "hash1", 0);
        setField(term77302, term77302.getClass(), "key1", term77302);
        term77486 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term77486, term77486.getClass(), "delegateMap", null);
        setIntField(term77486, term77486.getClass(), "size", 2);
        setIntField(term77486, term77486.getClass(), "hash2", 0);
        setField(term77486, term77486.getClass(), "value2", null);
        setIntField(term77486, term77486.getClass(), "hash1", 0);
        setField(term77486, term77486.getClass(), "value1", null);
        term78314 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78315 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78316 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term78314, term78314.getClass(), "size", 3);
        setIntField(term78314, term78314.getClass(), "hash1", 0);
        setIntField(term78314, term78314.getClass(), "hash2", 0);
        setIntField(term78314, term78314.getClass(), "hash3", 0);
        setField(term78314, term78314.getClass(), "key1", term78314);
        setIntField(term78315, term78315.getClass(), "size", -3);
        setIntField(term78315, term78315.getClass(), "hash1", 0);
        setIntField(term78315, term78315.getClass(), "hash2", 0);
        setIntField(term78315, term78315.getClass(), "hash3", 0);
        setField(term78315, term78315.getClass(), "key1", null);
        setField(term78315, term78315.getClass(), "key2", null);
        setField(term78315, term78315.getClass(), "key3", null);
        setField(term78315, term78315.getClass(), "value1", null);
        setField(term78315, term78315.getClass(), "value2", null);
        setField(term78315, term78315.getClass(), "value3", null);
        setField(term78315, term78315.getClass(), "delegateMap", null);
        setField(term78314, term78314.getClass(), "key2", term78315);
        setIntField(term78316, term78316.getClass(), "size", 2);
        setIntField(term78316, term78316.getClass(), "hash1", 0);
        setIntField(term78316, term78316.getClass(), "hash2", 0);
        setIntField(term78316, term78316.getClass(), "hash3", 0);
        setField(term78316, term78316.getClass(), "key1", null);
        setField(term78316, term78316.getClass(), "key2", null);
        setField(term78316, term78316.getClass(), "key3", null);
        setField(term78316, term78316.getClass(), "value1", null);
        setField(term78316, term78316.getClass(), "value2", null);
        setField(term78316, term78316.getClass(), "value3", null);
        setField(term78316, term78316.getClass(), "delegateMap", null);
        setField(term78314, term78314.getClass(), "key3", term78316);
        setField(term78314, term78314.getClass(), "value1", null);
        setField(term78314, term78314.getClass(), "value2", null);
        setField(term78314, term78314.getClass(), "value3", null);
        setField(term78314, term78314.getClass(), "delegateMap", null);
        term78317 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term78317, term78317.getClass(), "size", 2);
        setIntField(term78317, term78317.getClass(), "hash1", 0);
        setIntField(term78317, term78317.getClass(), "hash2", 0);
        setIntField(term78317, term78317.getClass(), "hash3", 0);
        setField(term78317, term78317.getClass(), "key1", null);
        setField(term78317, term78317.getClass(), "key2", null);
        setField(term78317, term78317.getClass(), "key3", null);
        setField(term78317, term78317.getClass(), "value1", null);
        setField(term78317, term78317.getClass(), "value2", null);
        setField(term78317, term78317.getClass(), "value3", null);
        setField(term78317, term78317.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term77486;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term77302, args);
        assertTrue(recursiveEquals(term77302, term78314));
        assertTrue(recursiveEquals(term77486, term78317));
        assertTrue(recursiveEquals(retValue, null));
    }

};


