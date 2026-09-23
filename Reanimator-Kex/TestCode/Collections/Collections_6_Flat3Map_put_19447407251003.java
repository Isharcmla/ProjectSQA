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

public class Flat3Map_put_19447407251003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283614;
     Object term283948;

    public Flat3Map_put_19447407251003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283614 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term283706 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term283818 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term283236 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term283856 = newInstance(Class.forName("java.lang.Object"));
        setField(term283614, term283614.getClass(), "delegateMap", null);
        setIntField(term283614, term283614.getClass(), "size", 3);
        setIntField(term283614, term283614.getClass(), "hash3", -2086527727);
        setField(term283614, term283614.getClass(), "key3", null);
        setIntField(term283614, term283614.getClass(), "hash2", -2086527727);
        setField(term283614, term283614.getClass(), "key2", null);
        setIntField(term283614, term283614.getClass(), "hash1", -2086527727);
        setIntField(term283818, term283818.getClass(), "size", 0);
        setField(term283706, term283706.getClass(), "delegateMap", term283818);
        setField(term283614, term283614.getClass(), "key1", term283706);
        setField(term283614, term283614.getClass(), "value3", null);
        setField(term283614, term283614.getClass(), "value2", term283236);
        setField(term283614, term283614.getClass(), "value1", term283856);
        term283948 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term284058 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term283948, term283948.getClass(), "delegateMap", null);
        setIntField(term283948, term283948.getClass(), "size", 3);
        setIntField(term283948, term283948.getClass(), "hash3", 1480328192);
        setField(term283948, term283948.getClass(), "value3", null);
        setIntField(term283948, term283948.getClass(), "hash2", 188749953);
        setField(term283948, term283948.getClass(), "value2", null);
        setIntField(term283948, term283948.getClass(), "hash1", 539361424);
        setIntField(term284058, term284058.getClass(), "size", 0);
        setField(term283948, term283948.getClass(), "value1", term284058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term283948;
        args[1] = null;
        callMethod(klass, "put", argTypes, term283614, args);
    }

};


