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

public class Flat3Map_put_1944740725836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168835;
     Object term169011;
     Object term169217;
     Object term169220;

    public Flat3Map_put_1944740725836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168835 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term168873 = newInstance(Class.forName("java.lang.Object"));
        term169011 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term168835, term168835.getClass(), "delegateMap", null);
        setIntField(term168835, term168835.getClass(), "size", 2);
        setIntField(term168835, term168835.getClass(), "hash2", 0);
        setField(term168835, term168835.getClass(), "key2", term168873);
        setIntField(term168835, term168835.getClass(), "hash1", 0);
        setField(term169011, term169011.getClass(), "delegateMap", null);
        setIntField(term169011, term169011.getClass(), "size", 2);
        setIntField(term169011, term169011.getClass(), "hash2", 0);
        setField(term169011, term169011.getClass(), "value2", null);
        setIntField(term169011, term169011.getClass(), "hash1", 0);
        setField(term169011, term169011.getClass(), "value1", null);
        setField(term168835, term168835.getClass(), "key1", term169011);
        term169217 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term169218 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term169219 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term169217, term169217.getClass(), "size", 2);
        setIntField(term169217, term169217.getClass(), "hash1", 0);
        setIntField(term169217, term169217.getClass(), "hash2", 0);
        setIntField(term169217, term169217.getClass(), "hash3", 0);
        setIntField(term169218, term169218.getClass(), "size", 2);
        setIntField(term169218, term169218.getClass(), "hash1", 0);
        setIntField(term169218, term169218.getClass(), "hash2", 0);
        setIntField(term169218, term169218.getClass(), "hash3", 0);
        setField(term169218, term169218.getClass(), "key1", null);
        setField(term169218, term169218.getClass(), "key2", null);
        setField(term169218, term169218.getClass(), "key3", null);
        setField(term169218, term169218.getClass(), "value1", null);
        setField(term169218, term169218.getClass(), "value2", null);
        setField(term169218, term169218.getClass(), "value3", null);
        setField(term169218, term169218.getClass(), "delegateMap", null);
        setField(term169217, term169217.getClass(), "key1", term169218);
        setField(term169217, term169217.getClass(), "key2", term169219);
        setField(term169217, term169217.getClass(), "key3", null);
        setField(term169217, term169217.getClass(), "value1", null);
        setField(term169217, term169217.getClass(), "value2", null);
        setField(term169217, term169217.getClass(), "value3", null);
        setField(term169217, term169217.getClass(), "delegateMap", null);
        term169220 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term169220, term169220.getClass(), "size", 2);
        setIntField(term169220, term169220.getClass(), "hash1", 0);
        setIntField(term169220, term169220.getClass(), "hash2", 0);
        setIntField(term169220, term169220.getClass(), "hash3", 0);
        setField(term169220, term169220.getClass(), "key1", null);
        setField(term169220, term169220.getClass(), "key2", null);
        setField(term169220, term169220.getClass(), "key3", null);
        setField(term169220, term169220.getClass(), "value1", null);
        setField(term169220, term169220.getClass(), "value2", null);
        setField(term169220, term169220.getClass(), "value3", null);
        setField(term169220, term169220.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term169011;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term168835, args);
        assertTrue(recursiveEquals(term168835, term169217));
        assertTrue(recursiveEquals(term169011, term169220));
        assertTrue(recursiveEquals(retValue, null));
    }

};
