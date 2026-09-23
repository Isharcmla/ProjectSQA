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

public class Flat3Map_put_1944740725998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281740;
     Object term281962;

    public Flat3Map_put_1944740725998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281740 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term281832 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term282091 = newInstance(Class.forName("java.lang.Object"));
        setField(term281740, term281740.getClass(), "delegateMap", null);
        setIntField(term281740, term281740.getClass(), "size", 3);
        setIntField(term281740, term281740.getClass(), "hash3", 0);
        setField(term281740, term281740.getClass(), "key3", null);
        setIntField(term281740, term281740.getClass(), "hash2", 0);
        setField(term281832, term281832.getClass(), "delegateMap", null);
        setIntField(term281832, term281832.getClass(), "size", 3);
        setField(term281832, term281832.getClass(), "key3", term282091);
        setField(term281832, term281832.getClass(), "key2", term282091);
        setField(term281832, term281832.getClass(), "key1", null);
        setField(term281832, term281832.getClass(), "value1", null);
        setIntField(term281832, term281832.getClass(), "hash3", -1);
        setIntField(term281832, term281832.getClass(), "hash2", -1);
        setIntField(term281832, term281832.getClass(), "hash1", -1);
        setField(term281740, term281740.getClass(), "key2", term281832);
        setIntField(term281740, term281740.getClass(), "hash1", 0);
        setField(term281740, term281740.getClass(), "key1", term281832);
        term281962 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term282072 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term281962, term281962.getClass(), "delegateMap", null);
        setIntField(term281962, term281962.getClass(), "size", 3);
        setIntField(term281962, term281962.getClass(), "hash3", 0);
        setField(term281962, term281962.getClass(), "value3", null);
        setIntField(term281962, term281962.getClass(), "hash2", 0);
        setIntField(term282072, term282072.getClass(), "size", 0);
        setField(term281962, term281962.getClass(), "value2", term282072);
        setIntField(term281962, term281962.getClass(), "hash1", 0);
        setField(term281962, term281962.getClass(), "value1", null);
        setField(term281962, term281962.getClass(), "key3", null);
        setField(term281962, term281962.getClass(), "key2", term282091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term281962;
        args[1] = null;
        callMethod(klass, "put", argTypes, term281740, args);
    }

};


