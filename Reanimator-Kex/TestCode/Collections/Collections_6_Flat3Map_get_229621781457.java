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

public class Flat3Map_get_229621781457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83380;
     Object term83436;
     Object term83467;
     Object term83468;

    public Flat3Map_get_229621781457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83380 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term83380, term83380.getClass(), "delegateMap", null);
        setIntField(term83380, term83380.getClass(), "size", 2);
        term83436 = newInstance(Class.forName("java.util.ServiceLoader$3"));
        term83467 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term83467, term83467.getClass(), "size", 2);
        setIntField(term83467, term83467.getClass(), "hash1", 0);
        setIntField(term83467, term83467.getClass(), "hash2", 0);
        setIntField(term83467, term83467.getClass(), "hash3", 0);
        setField(term83467, term83467.getClass(), "key1", null);
        setField(term83467, term83467.getClass(), "key2", null);
        setField(term83467, term83467.getClass(), "key3", null);
        setField(term83467, term83467.getClass(), "value1", null);
        setField(term83467, term83467.getClass(), "value2", null);
        setField(term83467, term83467.getClass(), "value3", null);
        setField(term83467, term83467.getClass(), "delegateMap", null);
        term83468 = newInstance(Class.forName("java.util.ServiceLoader$3"));
        setIntField(term83468, term83468.getClass(), "expectedReloadCount", 0);
        setIntField(term83468, term83468.getClass(), "index", 0);
        setField(term83468, term83468.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term83436;
        Object retValue = callMethod(klass, "get", argTypes, term83380, args);
        assertTrue(recursiveEquals(term83380, term83467));
        assertTrue(recursiveEquals(term83436, term83468));
        assertTrue(recursiveEquals(retValue, null));
    }

};


