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

public class Flat3Map_put_19447407251026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291727;
     Object term292097;
     Object term293060;
     Object term293061;

    public Flat3Map_put_19447407251026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291727 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term291819 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term291911 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term292005 = newInstance(Class.forName("java.util.concurrent.CompletableFuture$AnyOf"));
        setField(term291727, term291727.getClass(), "delegateMap", null);
        setIntField(term291727, term291727.getClass(), "size", 3);
        setIntField(term291727, term291727.getClass(), "hash3", 0);
        setField(term291819, term291819.getClass(), "delegateMap", null);
        setIntField(term291819, term291819.getClass(), "size", 3);
        setField(term291819, term291819.getClass(), "key3", term291911);
        setField(term291819, term291819.getClass(), "key2", term292005);
        setField(term291819, term291819.getClass(), "key1", null);
        setField(term291819, term291819.getClass(), "value1", null);
        setField(term291727, term291727.getClass(), "key3", term291819);
        term292097 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term292191 = newInstance(Class.forName("java.util.concurrent.CompletableFuture$AnyOf"));
        setField(term292097, term292097.getClass(), "delegateMap", null);
        setIntField(term292097, term292097.getClass(), "size", 3);
        setIntField(term292097, term292097.getClass(), "hash3", 0);
        setField(term292097, term292097.getClass(), "value3", null);
        setIntField(term292097, term292097.getClass(), "hash2", 0);
        setField(term292097, term292097.getClass(), "value2", null);
        setIntField(term292097, term292097.getClass(), "hash1", 0);
        setField(term292097, term292097.getClass(), "value1", null);
        setField(term292097, term292097.getClass(), "key3", null);
        setField(term292097, term292097.getClass(), "key2", term292191);
        term293060 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term293060, term293060.getClass(), "size", 0);
        setIntField(term293060, term293060.getClass(), "hash1", 0);
        setIntField(term293060, term293060.getClass(), "hash2", 0);
        setIntField(term293060, term293060.getClass(), "hash3", 0);
        setField(term293060, term293060.getClass(), "key1", null);
        setField(term293060, term293060.getClass(), "key2", null);
        setField(term293060, term293060.getClass(), "key3", null);
        setField(term293060, term293060.getClass(), "value1", null);
        setField(term293060, term293060.getClass(), "value2", null);
        setField(term293060, term293060.getClass(), "value3", null);
        setField(term293060, term293060.getClass(), "delegateMap", -8130816);
        term293061 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term293062 = newInstance(Class.forName("java.io.Console$1"));
        setIntField(term293061, term293061.getClass(), "size", 3);
        setIntField(term293061, term293061.getClass(), "hash1", 0);
        setIntField(term293061, term293061.getClass(), "hash2", 0);
        setIntField(term293061, term293061.getClass(), "hash3", 0);
        setField(term293061, term293061.getClass(), "key1", null);
        setField(term293062, term293062.getClass(), "this$0", null);
        setField(term293061, term293061.getClass(), "key2", term293062);
        setField(term293061, term293061.getClass(), "key3", null);
        setField(term293061, term293061.getClass(), "value1", null);
        setField(term293061, term293061.getClass(), "value2", null);
        setField(term293061, term293061.getClass(), "value3", null);
        setField(term293061, term293061.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term292097;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term291727, args);
        assertTrue(recursiveEquals(term291727, term293060));
        assertTrue(recursiveEquals(term292097, term293061));
        assertTrue(recursiveEquals(retValue, null));
    }

};


