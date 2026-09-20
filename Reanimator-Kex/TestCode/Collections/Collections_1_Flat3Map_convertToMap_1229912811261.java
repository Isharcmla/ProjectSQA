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

public class Flat3Map_convertToMap_1229912811261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45918;
     Object term46451;

    public Flat3Map_convertToMap_1229912811261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45918 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46028 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term46120 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46230 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term45918, term45918.getClass(), "delegateMap", term46028);
        setIntField(term45918, term45918.getClass(), "size", 2);
        setField(term46120, term46120.getClass(), "delegateMap", null);
        setIntField(term46120, term46120.getClass(), "size", 0);
        setField(term45918, term45918.getClass(), "key2", term46120);
        setField(term45918, term45918.getClass(), "value2", term46230);
        setField(term45918, term45918.getClass(), "key1", null);
        setField(term45918, term45918.getClass(), "value1", null);
        term46451 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46452 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term46453 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term46454 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term46455 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term46456 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term46451, term46451.getClass(), "size", 0);
        setIntField(term46451, term46451.getClass(), "hash1", 0);
        setIntField(term46451, term46451.getClass(), "hash2", 0);
        setIntField(term46451, term46451.getClass(), "hash3", 0);
        setField(term46451, term46451.getClass(), "key1", null);
        setField(term46451, term46451.getClass(), "key2", null);
        setField(term46451, term46451.getClass(), "key3", null);
        setField(term46451, term46451.getClass(), "value1", null);
        setField(term46451, term46451.getClass(), "value2", null);
        setField(term46451, term46451.getClass(), "value3", null);
        setFloatField(term46452, term46452.getClass(), "loadFactor", 0.75F);
        setIntField(term46452, term46452.getClass(), "size", 2);
        setField(term46455, term46455.getClass(), "next", null);
        setField(term46455, term46455.getClass(), "key", null);
        setField(term46455, term46455.getClass(), "value", null);
        setField(term46454, term46454.getClass(), "next", term46455);
        setField(term46454, term46454.getClass(), "key", term46456);
        setField(term46454, term46454.getClass(), "value", null);
        setElement(term46453, 0, term46454);
        setField(term46452, term46452.getClass(), "data", term46453);
        setIntField(term46452, term46452.getClass(), "threshold", 12);
        setIntField(term46452, term46452.getClass(), "modCount", 2);
        setField(term46452, term46452.getClass(), "entrySet", null);
        setField(term46452, term46452.getClass(), "keySet", null);
        setField(term46452, term46452.getClass(), "values", null);
        setField(term46452, term46452.getClass(), "keySet", null);
        setField(term46452, term46452.getClass(), "values", null);
        setField(term46451, term46451.getClass(), "delegateMap", term46452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term45918, args);
        assertTrue(recursiveEquals(term45918, term46451));
    }

};
