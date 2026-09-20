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
import java.util.HashMap;

public class Flat3Map_equals_1826922527796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161895;
     Object term162035;
     Object term162483;
     Object term162486;

    public Flat3Map_equals_1826922527796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term161943 = new HashMap();
        term161895 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term161895, term161895.getClass(), "delegateMap", null);
        setIntField(term161895, term161895.getClass(), "size", 3);
        setField(term161895, term161895.getClass(), "key3", null);
        setField(term161895, term161895.getClass(), "value3", null);
        setField(term161895, term161895.getClass(), "key2", term161943);
        term162035 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term162035, term162035.getClass(), "delegateMap", null);
        setIntField(term162035, term162035.getClass(), "size", 3);
        setField(term162035, term162035.getClass(), "key3", null);
        setField(term162035, term162035.getClass(), "value3", null);
        setIntField(term162035, term162035.getClass(), "hash3", 0);
        setIntField(term162035, term162035.getClass(), "hash2", -1);
        setIntField(term162035, term162035.getClass(), "hash1", -1);
        HashMap term162484 = new HashMap();
        term162483 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term162483, term162483.getClass(), "size", 3);
        setIntField(term162483, term162483.getClass(), "hash1", 0);
        setIntField(term162483, term162483.getClass(), "hash2", 0);
        setIntField(term162483, term162483.getClass(), "hash3", 0);
        setField(term162483, term162483.getClass(), "key1", null);
        setField(term162483, term162483.getClass(), "key2", term162484);
        setField(term162483, term162483.getClass(), "key3", null);
        setField(term162483, term162483.getClass(), "value1", null);
        setField(term162483, term162483.getClass(), "value2", null);
        setField(term162483, term162483.getClass(), "value3", null);
        setField(term162483, term162483.getClass(), "delegateMap", null);
        term162486 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term162486, term162486.getClass(), "size", 3);
        setIntField(term162486, term162486.getClass(), "hash1", -1);
        setIntField(term162486, term162486.getClass(), "hash2", -1);
        setIntField(term162486, term162486.getClass(), "hash3", 0);
        setField(term162486, term162486.getClass(), "key1", null);
        setField(term162486, term162486.getClass(), "key2", null);
        setField(term162486, term162486.getClass(), "key3", null);
        setField(term162486, term162486.getClass(), "value1", null);
        setField(term162486, term162486.getClass(), "value2", null);
        setField(term162486, term162486.getClass(), "value3", null);
        setField(term162486, term162486.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term162035;
        Object retValue = callMethod(klass, "equals", argTypes, term161895, args);
        assertTrue(recursiveEquals(term161895, term162483));
        assertTrue(recursiveEquals(term162035, term162486));
        assertTrue(recursiveEquals(retValue, false));
    }

};
