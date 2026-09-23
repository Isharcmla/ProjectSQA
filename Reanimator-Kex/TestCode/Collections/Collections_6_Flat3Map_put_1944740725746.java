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

public class Flat3Map_put_1944740725746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179317;
     Object term179611;

    public Flat3Map_put_1944740725746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179317 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term179409 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term179519 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term179317, term179317.getClass(), "delegateMap", null);
        setIntField(term179317, term179317.getClass(), "size", 3);
        setIntField(term179317, term179317.getClass(), "hash3", 0);
        setField(term179409, term179409.getClass(), "delegateMap", null);
        setIntField(term179409, term179409.getClass(), "size", 3);
        setField(term179409, term179409.getClass(), "key3", term179519);
        setField(term179409, term179409.getClass(), "key2", null);
        setField(term179409, term179409.getClass(), "value2", null);
        setIntField(term179409, term179409.getClass(), "hash3", -1);
        setField(term179317, term179317.getClass(), "key3", term179409);
        term179611 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term179703 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term179611, term179611.getClass(), "delegateMap", null);
        setIntField(term179611, term179611.getClass(), "size", 3);
        setIntField(term179611, term179611.getClass(), "hash3", 0);
        setField(term179611, term179611.getClass(), "value3", null);
        setIntField(term179611, term179611.getClass(), "hash2", 0);
        setField(term179611, term179611.getClass(), "value2", null);
        setIntField(term179611, term179611.getClass(), "hash1", 0);
        setField(term179611, term179611.getClass(), "value1", null);
        setField(term179611, term179611.getClass(), "key3", null);
        setField(term179703, term179703.getClass(), "delegateMap", null);
        setIntField(term179703, term179703.getClass(), "size", 2);
        setIntField(term179703, term179703.getClass(), "hash2", 0);
        setField(term179703, term179703.getClass(), "value2", null);
        setIntField(term179703, term179703.getClass(), "hash1", 0);
        setField(term179703, term179703.getClass(), "value1", null);
        setField(term179611, term179611.getClass(), "key2", term179703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term179611;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term179317, args);
        assertTrue(recursiveEquals(term179611, 34363745472L));
        assertTrue(recursiveEquals(retValue, null));
    }

};


