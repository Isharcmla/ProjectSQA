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

public class Flat3Map_hashCode_2019358094162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27572;
     Object term28111;

    public Flat3Map_hashCode_2019358094162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27572 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term27664 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term27572, term27572.getClass(), "delegateMap", null);
        setIntField(term27572, term27572.getClass(), "size", 3);
        setIntField(term27572, term27572.getClass(), "hash3", 0);
        setField(term27572, term27572.getClass(), "value3", null);
        setIntField(term27572, term27572.getClass(), "hash2", 0);
        setField(term27572, term27572.getClass(), "value2", term27664);
        term28111 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term28112 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28111, term28111.getClass(), "size", 3);
        setIntField(term28111, term28111.getClass(), "hash1", 0);
        setIntField(term28111, term28111.getClass(), "hash2", 0);
        setIntField(term28111, term28111.getClass(), "hash3", 0);
        setField(term28111, term28111.getClass(), "key1", null);
        setField(term28111, term28111.getClass(), "key2", null);
        setField(term28111, term28111.getClass(), "key3", null);
        setField(term28111, term28111.getClass(), "value1", null);
        setIntField(term28112, term28112.getClass(), "size", 0);
        setIntField(term28112, term28112.getClass(), "hash1", 0);
        setIntField(term28112, term28112.getClass(), "hash2", 0);
        setIntField(term28112, term28112.getClass(), "hash3", 0);
        setField(term28112, term28112.getClass(), "key1", null);
        setField(term28112, term28112.getClass(), "key2", null);
        setField(term28112, term28112.getClass(), "key3", null);
        setField(term28112, term28112.getClass(), "value1", null);
        setField(term28112, term28112.getClass(), "value2", null);
        setField(term28112, term28112.getClass(), "value3", null);
        setField(term28112, term28112.getClass(), "delegateMap", null);
        setField(term28111, term28111.getClass(), "value2", term28112);
        setField(term28111, term28111.getClass(), "value3", null);
        setField(term28111, term28111.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term27572, args);
        assertTrue(recursiveEquals(term27572, term28111));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
