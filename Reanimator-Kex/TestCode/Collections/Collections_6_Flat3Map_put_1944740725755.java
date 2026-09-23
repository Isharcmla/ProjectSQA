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

public class Flat3Map_put_1944740725755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185171;
     Object term190511;
     Object term190513;

    public Flat3Map_put_1944740725755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185171 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term185226 = newInstance(Class.forName("java.nio.channels.spi.AbstractInterruptibleChannel$1"));
        setField(term185171, term185171.getClass(), "delegateMap", null);
        setIntField(term185171, term185171.getClass(), "size", 2);
        setIntField(term185171, term185171.getClass(), "hash2", 0);
        setField(term185171, term185171.getClass(), "value2", null);
        setIntField(term185171, term185171.getClass(), "hash1", 0);
        setField(term185171, term185171.getClass(), "value1", term185226);
        term190511 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term190512 = newInstance(Class.forName("java.lang.Object"));
        setField(term190511, term190511.getClass(), "next", null);
        setField(term190511, term190511.getClass(), "key", term190512);
        setField(term190511, term190511.getClass(), "value", null);
        term190513 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term190514 = newInstance(Class.forName("java.lang.Object"));
        setField(term190513, term190513.getClass(), "next", null);
        setField(term190513, term190513.getClass(), "key", term190514);
        setField(term190513, term190513.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term185171;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term185171, args);
        assertTrue(recursiveEquals(term185171, term190511));
        assertTrue(recursiveEquals(term185171, term190513));
        assertTrue(recursiveEquals(retValue, null));
    }

};


