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

public class Flat3Map_get_229621781402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69708;
     Object term69900;
     Object term69901;

    public Flat3Map_get_229621781402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69708 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term69708, term69708.getClass(), "delegateMap", null);
        setIntField(term69708, term69708.getClass(), "size", 1);
        setIntField(term69708, term69708.getClass(), "hash1", 0);
        setField(term69708, term69708.getClass(), "value1", null);
        term69900 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term69900, term69900.getClass(), "size", 1);
        setIntField(term69900, term69900.getClass(), "hash1", 0);
        setIntField(term69900, term69900.getClass(), "hash2", 0);
        setIntField(term69900, term69900.getClass(), "hash3", 0);
        setField(term69900, term69900.getClass(), "key1", null);
        setField(term69900, term69900.getClass(), "key2", null);
        setField(term69900, term69900.getClass(), "key3", null);
        setField(term69900, term69900.getClass(), "value1", null);
        setField(term69900, term69900.getClass(), "value2", null);
        setField(term69900, term69900.getClass(), "value3", null);
        setField(term69900, term69900.getClass(), "delegateMap", null);
        term69901 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term69901, term69901.getClass(), "size", 1);
        setIntField(term69901, term69901.getClass(), "hash1", 0);
        setIntField(term69901, term69901.getClass(), "hash2", 0);
        setIntField(term69901, term69901.getClass(), "hash3", 0);
        setField(term69901, term69901.getClass(), "key1", null);
        setField(term69901, term69901.getClass(), "key2", null);
        setField(term69901, term69901.getClass(), "key3", null);
        setField(term69901, term69901.getClass(), "value1", null);
        setField(term69901, term69901.getClass(), "value2", null);
        setField(term69901, term69901.getClass(), "value3", null);
        setField(term69901, term69901.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term69708;
        Object retValue = callMethod(klass, "get", argTypes, term69708, args);
        assertTrue(recursiveEquals(term69708, term69900));
        assertTrue(recursiveEquals(term69708, term69901));
        assertTrue(recursiveEquals(retValue, null));
    }

};


