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
import java.lang.Object;

public class Flat3Map_put_19447407251201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380956;
     Object term381396;

    public Flat3Map_put_19447407251201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380956 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term381048 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term380514 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term381140 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term381212 = newInstance(Class.forName("java.util.stream.DoublePipeline$5"));
        Object term381304 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term380956, term380956.getClass(), "delegateMap", null);
        setIntField(term380956, term380956.getClass(), "size", 3);
        setIntField(term380956, term380956.getClass(), "hash3", 1422116357);
        setField(term381048, term381048.getClass(), "delegateMap", null);
        setIntField(term381048, term381048.getClass(), "size", 3);
        setField(term381048, term381048.getClass(), "key3", term380514);
        setField(term381048, term381048.getClass(), "key2", null);
        setField(term381048, term381048.getClass(), "value2", null);
        setIntField(term381048, term381048.getClass(), "hash3", -904003478);
        setIntField(term381048, term381048.getClass(), "hash2", -419409730);
        setIntField(term381048, term381048.getClass(), "hash1", 73596965);
        setField(term381048, term381048.getClass(), "value3", null);
        setField(term381048, term381048.getClass(), "value1", null);
        setField(term380956, term380956.getClass(), "key3", term381048);
        setIntField(term380956, term380956.getClass(), "hash2", 1422116357);
        setField(term380956, term380956.getClass(), "key2", null);
        setIntField(term380956, term380956.getClass(), "hash1", 1422116357);
        setField(term380956, term380956.getClass(), "key1", null);
        setField(term380956, term380956.getClass(), "value3", term381140);
        setField(term380956, term380956.getClass(), "value2", term381212);
        setField(term380956, term380956.getClass(), "value1", term381304);
        term381396 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term381468 = newInstance(Class.forName("java.util.stream.DoublePipeline$5"));
        setField(term381396, term381396.getClass(), "delegateMap", null);
        setIntField(term381396, term381396.getClass(), "size", 3);
        setIntField(term381396, term381396.getClass(), "hash3", -2069233664);
        setField(term381396, term381396.getClass(), "value3", null);
        setIntField(term381396, term381396.getClass(), "hash2", -937869307);
        setField(term381396, term381396.getClass(), "value2", null);
        setIntField(term381396, term381396.getClass(), "hash1", 134252032);
        setField(term381396, term381396.getClass(), "value1", null);
        setField(term381396, term381396.getClass(), "key3", null);
        setField(term381396, term381396.getClass(), "key2", null);
        setField(term381396, term381396.getClass(), "key1", term381468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term381396;
        args[1] = null;
        callMethod(klass, "put", argTypes, term380956, args);
    }

};


