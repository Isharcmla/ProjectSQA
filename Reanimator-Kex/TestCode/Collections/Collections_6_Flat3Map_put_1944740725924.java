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

public class Flat3Map_put_1944740725924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247222;
     Object term247444;
     Object term248221;
     Object term248224;

    public Flat3Map_put_1944740725924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247222 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247314 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247573 = newInstance(Class.forName("java.lang.Object"));
        setField(term247222, term247222.getClass(), "delegateMap", null);
        setIntField(term247222, term247222.getClass(), "size", 3);
        setIntField(term247222, term247222.getClass(), "hash3", 0);
        setField(term247222, term247222.getClass(), "key3", null);
        setIntField(term247222, term247222.getClass(), "hash2", 0);
        setField(term247314, term247314.getClass(), "delegateMap", null);
        setIntField(term247314, term247314.getClass(), "size", 3);
        setField(term247314, term247314.getClass(), "key3", term247573);
        setField(term247314, term247314.getClass(), "key2", term247573);
        setField(term247314, term247314.getClass(), "key1", null);
        setField(term247314, term247314.getClass(), "value1", null);
        setField(term247222, term247222.getClass(), "key2", term247314);
        term247444 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term247554 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term247444, term247444.getClass(), "delegateMap", null);
        setIntField(term247444, term247444.getClass(), "size", 3);
        setIntField(term247444, term247444.getClass(), "hash3", 0);
        setField(term247444, term247444.getClass(), "value3", null);
        setIntField(term247444, term247444.getClass(), "hash2", 0);
        setIntField(term247554, term247554.getClass(), "size", 0);
        setField(term247444, term247444.getClass(), "value2", term247554);
        setIntField(term247444, term247444.getClass(), "hash1", 0);
        setField(term247444, term247444.getClass(), "value1", null);
        setField(term247444, term247444.getClass(), "key3", null);
        setField(term247444, term247444.getClass(), "key2", term247573);
        term248221 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term248222 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term248223 = newInstance(Class.forName("java.lang.Object"));
        setField(term248222, term248222.getClass(), "next", null);
        setField(term248222, term248222.getClass(), "key", term248223);
        setField(term248222, term248222.getClass(), "value", null);
        setElement(term248221, 5, term248222);
        term248224 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term248224, term248224.getClass(), "size", 3);
        setIntField(term248224, term248224.getClass(), "hash1", 0);
        setIntField(term248224, term248224.getClass(), "hash2", 0);
        setIntField(term248224, term248224.getClass(), "hash3", 0);
        setField(term248224, term248224.getClass(), "key1", null);
        setField(term248224, term248224.getClass(), "key2", null);
        setField(term248224, term248224.getClass(), "key3", null);
        setField(term248224, term248224.getClass(), "value1", null);
        setField(term248224, term248224.getClass(), "value2", null);
        setField(term248224, term248224.getClass(), "value3", null);
        setField(term248224, term248224.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term247444;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term247222, args);
        assertTrue(recursiveEquals(term247222, term248221));
        assertTrue(recursiveEquals(term247444, term248224));
        assertTrue(recursiveEquals(retValue, null));
    }

};


