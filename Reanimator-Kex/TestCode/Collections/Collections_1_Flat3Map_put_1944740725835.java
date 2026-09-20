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

public class Flat3Map_put_1944740725835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168693;
     Object term169181;
     Object term169182;

    public Flat3Map_put_1944740725835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168693 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term168693, term168693.getClass(), "delegateMap", null);
        setIntField(term168693, term168693.getClass(), "size", 2);
        setIntField(term168693, term168693.getClass(), "hash2", -1);
        setField(term168693, term168693.getClass(), "value2", null);
        setIntField(term168693, term168693.getClass(), "hash1", 0);
        setField(term168693, term168693.getClass(), "value1", null);
        term169181 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term169181, term169181.getClass(), "size", 3);
        setIntField(term169181, term169181.getClass(), "hash1", 0);
        setIntField(term169181, term169181.getClass(), "hash2", -1);
        setIntField(term169181, term169181.getClass(), "hash3", -1);
        setField(term169181, term169181.getClass(), "key1", null);
        setField(term169181, term169181.getClass(), "key2", null);
        setField(term169181, term169181.getClass(), "key3", term169181);
        setField(term169181, term169181.getClass(), "value1", null);
        setField(term169181, term169181.getClass(), "value2", null);
        setField(term169181, term169181.getClass(), "value3", null);
        setField(term169181, term169181.getClass(), "delegateMap", null);
        term169182 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term169182, term169182.getClass(), "size", 3);
        setIntField(term169182, term169182.getClass(), "hash1", 0);
        setIntField(term169182, term169182.getClass(), "hash2", -1);
        setIntField(term169182, term169182.getClass(), "hash3", -1);
        setField(term169182, term169182.getClass(), "key1", null);
        setField(term169182, term169182.getClass(), "key2", null);
        setField(term169182, term169182.getClass(), "key3", term169182);
        setField(term169182, term169182.getClass(), "value1", null);
        setField(term169182, term169182.getClass(), "value2", null);
        setField(term169182, term169182.getClass(), "value3", null);
        setField(term169182, term169182.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term168693;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term168693, args);
        assertTrue(recursiveEquals(term168693, term169181));
        assertTrue(recursiveEquals(term168693, term169182));
        assertTrue(recursiveEquals(retValue, null));
    }

};
