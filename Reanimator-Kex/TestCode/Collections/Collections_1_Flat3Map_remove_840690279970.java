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

public class Flat3Map_remove_840690279970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194519;
     Object term194695;
     Object term195124;
     Object term195126;

    public Flat3Map_remove_840690279970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194519 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term194557 = newInstance(Class.forName("java.lang.Object"));
        term194695 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term194519, term194519.getClass(), "delegateMap", null);
        setIntField(term194519, term194519.getClass(), "size", 3);
        setIntField(term194519, term194519.getClass(), "hash3", 0);
        setField(term194519, term194519.getClass(), "key3", term194557);
        setIntField(term194519, term194519.getClass(), "hash2", 0);
        setField(term194695, term194695.getClass(), "delegateMap", null);
        setIntField(term194695, term194695.getClass(), "size", 3);
        setIntField(term194695, term194695.getClass(), "hash3", 0);
        setField(term194695, term194695.getClass(), "value3", null);
        setIntField(term194695, term194695.getClass(), "hash2", 0);
        setField(term194695, term194695.getClass(), "value2", null);
        setIntField(term194695, term194695.getClass(), "hash1", 0);
        setField(term194695, term194695.getClass(), "value1", null);
        setField(term194519, term194519.getClass(), "key2", term194695);
        term195124 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195125 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term195124, term195124.getClass(), "size", 2);
        setIntField(term195124, term195124.getClass(), "hash1", 0);
        setIntField(term195124, term195124.getClass(), "hash2", 0);
        setIntField(term195124, term195124.getClass(), "hash3", 0);
        setField(term195124, term195124.getClass(), "key1", null);
        setField(term195124, term195124.getClass(), "key2", term195125);
        setField(term195124, term195124.getClass(), "key3", null);
        setField(term195124, term195124.getClass(), "value1", null);
        setField(term195124, term195124.getClass(), "value2", null);
        setField(term195124, term195124.getClass(), "value3", null);
        setField(term195124, term195124.getClass(), "delegateMap", null);
        term195126 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term195126, term195126.getClass(), "size", 3);
        setIntField(term195126, term195126.getClass(), "hash1", 0);
        setIntField(term195126, term195126.getClass(), "hash2", 0);
        setIntField(term195126, term195126.getClass(), "hash3", 0);
        setField(term195126, term195126.getClass(), "key1", null);
        setField(term195126, term195126.getClass(), "key2", null);
        setField(term195126, term195126.getClass(), "key3", null);
        setField(term195126, term195126.getClass(), "value1", null);
        setField(term195126, term195126.getClass(), "value2", null);
        setField(term195126, term195126.getClass(), "value3", null);
        setField(term195126, term195126.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term194695;
        Object retValue = callMethod(klass, "remove", argTypes, term194519, args);
        assertTrue(recursiveEquals(term194519, term195124));
        assertTrue(recursiveEquals(term194695, term195126));
        assertTrue(recursiveEquals(retValue, null));
    }

};
