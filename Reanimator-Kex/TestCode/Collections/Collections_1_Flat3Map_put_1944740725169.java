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

public class Flat3Map_put_1944740725169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28867;
     Object term28876;

    public Flat3Map_put_1944740725169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28867 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term28867, term28867.getClass(), "delegateMap", null);
        setIntField(term28867, term28867.getClass(), "size", 2);
        term28876 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28876, term28876.getClass(), "size", 2);
        setIntField(term28876, term28876.getClass(), "hash1", 0);
        setIntField(term28876, term28876.getClass(), "hash2", 0);
        setIntField(term28876, term28876.getClass(), "hash3", 0);
        setField(term28876, term28876.getClass(), "key1", null);
        setField(term28876, term28876.getClass(), "key2", null);
        setField(term28876, term28876.getClass(), "key3", null);
        setField(term28876, term28876.getClass(), "value1", null);
        setField(term28876, term28876.getClass(), "value2", null);
        setField(term28876, term28876.getClass(), "value3", null);
        setField(term28876, term28876.getClass(), "delegateMap", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term28867, args);
        assertTrue(recursiveEquals(term28867, term28876));
        assertTrue(recursiveEquals(retValue, null));
    }

};
