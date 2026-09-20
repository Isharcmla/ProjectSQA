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

public class Flat3Map_remove_8406902791057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210522;
     Object term210554;
     Object term211041;
     Object term211042;

    public Flat3Map_remove_8406902791057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210522 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term210522, term210522.getClass(), "delegateMap", null);
        setIntField(term210522, term210522.getClass(), "size", 3);
        setIntField(term210522, term210522.getClass(), "hash3", -1);
        setIntField(term210522, term210522.getClass(), "hash2", -1);
        setIntField(term210522, term210522.getClass(), "hash1", 0);
        term210554 = newInstance(Class.forName("java.nio.Bits"));
        term211041 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term211041, term211041.getClass(), "size", 3);
        setIntField(term211041, term211041.getClass(), "hash1", 0);
        setIntField(term211041, term211041.getClass(), "hash2", -1);
        setIntField(term211041, term211041.getClass(), "hash3", -1);
        setField(term211041, term211041.getClass(), "key1", null);
        setField(term211041, term211041.getClass(), "key2", null);
        setField(term211041, term211041.getClass(), "key3", null);
        setField(term211041, term211041.getClass(), "value1", null);
        setField(term211041, term211041.getClass(), "value2", null);
        setField(term211041, term211041.getClass(), "value3", null);
        setField(term211041, term211041.getClass(), "delegateMap", null);
        term211042 = newInstance(Class.forName("java.nio.Bits"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term210554;
        Object retValue = callMethod(klass, "remove", argTypes, term210522, args);
        assertTrue(recursiveEquals(term210522, term211041));
        assertTrue(recursiveEquals(term210554, term211042));
        assertTrue(recursiveEquals(retValue, null));
    }

};
