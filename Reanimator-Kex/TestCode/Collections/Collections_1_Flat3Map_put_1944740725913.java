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

public class Flat3Map_put_1944740725913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183898;
     Object term184420;
     Object term184422;

    public Flat3Map_put_1944740725913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183898 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183947 = newInstance(Class.forName("java.util.concurrent.CompletableFuture$Delayer"));
        setField(term183898, term183898.getClass(), "delegateMap", null);
        setIntField(term183898, term183898.getClass(), "size", 1);
        setIntField(term183898, term183898.getClass(), "hash1", 0);
        setField(term183898, term183898.getClass(), "value1", term183947);
        term184420 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term184421 = newInstance(Class.forName("java.util.concurrent.CompletableFuture$Delayer"));
        setIntField(term184420, term184420.getClass(), "size", 2);
        setIntField(term184420, term184420.getClass(), "hash1", 0);
        setIntField(term184420, term184420.getClass(), "hash2", 326824888);
        setIntField(term184420, term184420.getClass(), "hash3", 0);
        setField(term184420, term184420.getClass(), "key1", null);
        setField(term184420, term184420.getClass(), "key2", term184420);
        setField(term184420, term184420.getClass(), "key3", null);
        setField(term184420, term184420.getClass(), "value1", term184421);
        setField(term184420, term184420.getClass(), "value2", null);
        setField(term184420, term184420.getClass(), "value3", null);
        setField(term184420, term184420.getClass(), "delegateMap", null);
        term184422 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term184423 = newInstance(Class.forName("java.util.concurrent.CompletableFuture$Delayer"));
        setIntField(term184422, term184422.getClass(), "size", 2);
        setIntField(term184422, term184422.getClass(), "hash1", 0);
        setIntField(term184422, term184422.getClass(), "hash2", 326824888);
        setIntField(term184422, term184422.getClass(), "hash3", 0);
        setField(term184422, term184422.getClass(), "key1", null);
        setField(term184422, term184422.getClass(), "key2", term184422);
        setField(term184422, term184422.getClass(), "key3", null);
        setField(term184422, term184422.getClass(), "value1", term184423);
        setField(term184422, term184422.getClass(), "value2", null);
        setField(term184422, term184422.getClass(), "value3", null);
        setField(term184422, term184422.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term183898;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term183898, args);
        assertTrue(recursiveEquals(term183898, term184420));
        assertTrue(recursiveEquals(term183898, term184422));
        assertTrue(recursiveEquals(retValue, null));
    }

};
