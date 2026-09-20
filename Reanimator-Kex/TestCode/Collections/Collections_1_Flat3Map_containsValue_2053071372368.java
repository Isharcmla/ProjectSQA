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

public class Flat3Map_containsValue_2053071372368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66716;
     Object term66808;
     Object term67032;
     Object term67033;

    public Flat3Map_containsValue_2053071372368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66716 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term66716, term66716.getClass(), "delegateMap", null);
        setIntField(term66716, term66716.getClass(), "size", 0);
        setField(term66716, term66716.getClass(), "value2", term66716);
        term66808 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term66808, term66808.getClass(), "delegateMap", null);
        setIntField(term66808, term66808.getClass(), "size", 0);
        term67032 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term67032, term67032.getClass(), "size", 0);
        setIntField(term67032, term67032.getClass(), "hash1", 0);
        setIntField(term67032, term67032.getClass(), "hash2", 0);
        setIntField(term67032, term67032.getClass(), "hash3", 0);
        setField(term67032, term67032.getClass(), "key1", null);
        setField(term67032, term67032.getClass(), "key2", null);
        setField(term67032, term67032.getClass(), "key3", null);
        setField(term67032, term67032.getClass(), "value1", null);
        setField(term67032, term67032.getClass(), "value2", term67032);
        setField(term67032, term67032.getClass(), "value3", null);
        setField(term67032, term67032.getClass(), "delegateMap", null);
        term67033 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term67033, term67033.getClass(), "size", 0);
        setIntField(term67033, term67033.getClass(), "hash1", 0);
        setIntField(term67033, term67033.getClass(), "hash2", 0);
        setIntField(term67033, term67033.getClass(), "hash3", 0);
        setField(term67033, term67033.getClass(), "key1", null);
        setField(term67033, term67033.getClass(), "key2", null);
        setField(term67033, term67033.getClass(), "key3", null);
        setField(term67033, term67033.getClass(), "value1", null);
        setField(term67033, term67033.getClass(), "value2", null);
        setField(term67033, term67033.getClass(), "value3", null);
        setField(term67033, term67033.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term66808;
        callMethod(klass, "containsValue", argTypes, term66716, args);
        assertTrue(recursiveEquals(term66716, term67032));
        assertTrue(recursiveEquals(term66808, term67033));
    }

};
