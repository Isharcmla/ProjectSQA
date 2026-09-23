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

public class Flat3Map_put_1944740725569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115169;
     Object term115191;
     Object term115192;

    public Flat3Map_put_1944740725569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115169 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term115169, term115169.getClass(), "delegateMap", null);
        setIntField(term115169, term115169.getClass(), "size", 1);
        setIntField(term115169, term115169.getClass(), "hash1", 0);
        setField(term115169, term115169.getClass(), "value1", null);
        term115191 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term115191, term115191.getClass(), "size", 2);
        setIntField(term115191, term115191.getClass(), "hash1", 0);
        setIntField(term115191, term115191.getClass(), "hash2", 0);
        setIntField(term115191, term115191.getClass(), "hash3", 0);
        setField(term115191, term115191.getClass(), "key1", null);
        setField(term115191, term115191.getClass(), "key2", term115191);
        setField(term115191, term115191.getClass(), "key3", null);
        setField(term115191, term115191.getClass(), "value1", null);
        setField(term115191, term115191.getClass(), "value2", null);
        setField(term115191, term115191.getClass(), "value3", null);
        setField(term115191, term115191.getClass(), "delegateMap", null);
        term115192 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term115192, term115192.getClass(), "size", 2);
        setIntField(term115192, term115192.getClass(), "hash1", 0);
        setIntField(term115192, term115192.getClass(), "hash2", 0);
        setIntField(term115192, term115192.getClass(), "hash3", 0);
        setField(term115192, term115192.getClass(), "key1", null);
        setField(term115192, term115192.getClass(), "key2", term115192);
        setField(term115192, term115192.getClass(), "key3", null);
        setField(term115192, term115192.getClass(), "value1", null);
        setField(term115192, term115192.getClass(), "value2", null);
        setField(term115192, term115192.getClass(), "value3", null);
        setField(term115192, term115192.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term115169;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term115169, args);
        assertTrue(recursiveEquals(term115169, term115191));
        assertTrue(recursiveEquals(term115169, term115192));
        assertTrue(recursiveEquals(retValue, null));
    }

};


