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

public class Flat3Map_put_1944740725315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52715;
     Object term52895;

    public Flat3Map_put_1944740725315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52715 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term52807 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term52715, term52715.getClass(), "delegateMap", null);
        setIntField(term52715, term52715.getClass(), "size", 2);
        setField(term52715, term52715.getClass(), "key2", term52807);
        term52895 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term52896 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term52895, term52895.getClass(), "size", 2);
        setIntField(term52895, term52895.getClass(), "hash1", 0);
        setIntField(term52895, term52895.getClass(), "hash2", 0);
        setIntField(term52895, term52895.getClass(), "hash3", 0);
        setField(term52895, term52895.getClass(), "key1", null);
        setIntField(term52896, term52896.getClass(), "size", 0);
        setIntField(term52896, term52896.getClass(), "hash1", 0);
        setIntField(term52896, term52896.getClass(), "hash2", 0);
        setIntField(term52896, term52896.getClass(), "hash3", 0);
        setField(term52896, term52896.getClass(), "key1", null);
        setField(term52896, term52896.getClass(), "key2", null);
        setField(term52896, term52896.getClass(), "key3", null);
        setField(term52896, term52896.getClass(), "value1", null);
        setField(term52896, term52896.getClass(), "value2", null);
        setField(term52896, term52896.getClass(), "value3", null);
        setField(term52896, term52896.getClass(), "delegateMap", null);
        setField(term52895, term52895.getClass(), "key2", term52896);
        setField(term52895, term52895.getClass(), "key3", null);
        setField(term52895, term52895.getClass(), "value1", null);
        setField(term52895, term52895.getClass(), "value2", null);
        setField(term52895, term52895.getClass(), "value3", null);
        setField(term52895, term52895.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term52715, args);
        assertTrue(recursiveEquals(term52715, term52895));
        assertTrue(recursiveEquals(retValue, null));
    }

};


