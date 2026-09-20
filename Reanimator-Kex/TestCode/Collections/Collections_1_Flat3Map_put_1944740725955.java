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

public class Flat3Map_put_1944740725955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191428;
     Object term191458;
     Object term191459;

    public Flat3Map_put_1944740725955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191428 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term191428, term191428.getClass(), "delegateMap", null);
        setIntField(term191428, term191428.getClass(), "size", 2);
        term191458 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term191458, term191458.getClass(), "size", 3);
        setIntField(term191458, term191458.getClass(), "hash1", 0);
        setIntField(term191458, term191458.getClass(), "hash2", 0);
        setIntField(term191458, term191458.getClass(), "hash3", 0);
        setField(term191458, term191458.getClass(), "key1", null);
        setField(term191458, term191458.getClass(), "key2", null);
        setField(term191458, term191458.getClass(), "key3", term191458);
        setField(term191458, term191458.getClass(), "value1", null);
        setField(term191458, term191458.getClass(), "value2", null);
        setField(term191458, term191458.getClass(), "value3", null);
        setField(term191458, term191458.getClass(), "delegateMap", null);
        term191459 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term191459, term191459.getClass(), "size", 3);
        setIntField(term191459, term191459.getClass(), "hash1", 0);
        setIntField(term191459, term191459.getClass(), "hash2", 0);
        setIntField(term191459, term191459.getClass(), "hash3", 0);
        setField(term191459, term191459.getClass(), "key1", null);
        setField(term191459, term191459.getClass(), "key2", null);
        setField(term191459, term191459.getClass(), "key3", term191459);
        setField(term191459, term191459.getClass(), "value1", null);
        setField(term191459, term191459.getClass(), "value2", null);
        setField(term191459, term191459.getClass(), "value3", null);
        setField(term191459, term191459.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term191428;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term191428, args);
        assertTrue(recursiveEquals(term191428, term191458));
        assertTrue(recursiveEquals(term191428, term191459));
        assertTrue(recursiveEquals(retValue, null));
    }

};
