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
import java.lang.Object;

public class Flat3Map_equals_1826922527582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111086;
     Object term111318;
     Object term111795;
     Object term111799;

    public Flat3Map_equals_1826922527582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term111342 = new HashMap();
        term111086 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111226 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term111086, term111086.getClass(), "delegateMap", null);
        setIntField(term111086, term111086.getClass(), "size", 2);
        setField(term111086, term111086.getClass(), "key2", term111342);
        setField(term111086, term111086.getClass(), "value2", term111226);
        term111318 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111380 = newInstance(Class.forName("java.lang.Object"));
        setField(term111318, term111318.getClass(), "delegateMap", null);
        setIntField(term111318, term111318.getClass(), "size", 2);
        setIntField(term111318, term111318.getClass(), "hash2", 0);
        setField(term111318, term111318.getClass(), "key2", term111342);
        setField(term111318, term111318.getClass(), "value2", term111380);
        HashMap term111796 = new HashMap();
        term111795 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111798 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term111795, term111795.getClass(), "size", 2);
        setIntField(term111795, term111795.getClass(), "hash1", 0);
        setIntField(term111795, term111795.getClass(), "hash2", 0);
        setIntField(term111795, term111795.getClass(), "hash3", 0);
        setField(term111795, term111795.getClass(), "key1", null);
        setField(term111795, term111795.getClass(), "key2", term111796);
        setField(term111795, term111795.getClass(), "key3", null);
        setField(term111795, term111795.getClass(), "value1", null);
        setIntField(term111798, term111798.getClass(), "size", 0);
        setIntField(term111798, term111798.getClass(), "hash1", 0);
        setIntField(term111798, term111798.getClass(), "hash2", 0);
        setIntField(term111798, term111798.getClass(), "hash3", 0);
        setField(term111798, term111798.getClass(), "key1", null);
        setField(term111798, term111798.getClass(), "key2", null);
        setField(term111798, term111798.getClass(), "key3", null);
        setField(term111798, term111798.getClass(), "value1", null);
        setField(term111798, term111798.getClass(), "value2", null);
        setField(term111798, term111798.getClass(), "value3", null);
        setField(term111798, term111798.getClass(), "delegateMap", null);
        setField(term111795, term111795.getClass(), "value2", term111798);
        setField(term111795, term111795.getClass(), "value3", null);
        setField(term111795, term111795.getClass(), "delegateMap", null);
        HashMap term111800 = new HashMap();
        term111799 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111802 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term111799, term111799.getClass(), "size", 2);
        setIntField(term111799, term111799.getClass(), "hash1", 0);
        setIntField(term111799, term111799.getClass(), "hash2", 0);
        setIntField(term111799, term111799.getClass(), "hash3", 0);
        setField(term111799, term111799.getClass(), "key1", null);
        setField(term111799, term111799.getClass(), "key2", term111800);
        setField(term111799, term111799.getClass(), "key3", null);
        setField(term111799, term111799.getClass(), "value1", null);
        setField(term111799, term111799.getClass(), "value2", term111802);
        setField(term111799, term111799.getClass(), "value3", null);
        setField(term111799, term111799.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term111318;
        Object retValue = callMethod(klass, "equals", argTypes, term111086, args);
        assertTrue(recursiveEquals(term111086, term111795));
        assertTrue(recursiveEquals(term111318, term111799));
        assertTrue(recursiveEquals(retValue, false));
    }

};
