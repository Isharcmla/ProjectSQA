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

public class Flat3Map_toString_1508598404215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35751;
     Object term35940;

    public Flat3Map_toString_1508598404215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35751 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term35751, term35751.getClass(), "delegateMap", null);
        setIntField(term35751, term35751.getClass(), "size", 2);
        setField(term35751, term35751.getClass(), "key2", "");
        setField(term35751, term35751.getClass(), "value2", "");
        setField(term35751, term35751.getClass(), "key1", "");
        setField(term35751, term35751.getClass(), "value1", term35751);
        term35940 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term35940, term35940.getClass(), "size", 2);
        setIntField(term35940, term35940.getClass(), "hash1", 0);
        setIntField(term35940, term35940.getClass(), "hash2", 0);
        setIntField(term35940, term35940.getClass(), "hash3", 0);
        setField(term35940, term35940.getClass(), "key1", "");
        setField(term35940, term35940.getClass(), "key2", "");
        setField(term35940, term35940.getClass(), "key3", null);
        setField(term35940, term35940.getClass(), "value1", term35940);
        setField(term35940, term35940.getClass(), "value2", "");
        setField(term35940, term35940.getClass(), "value3", null);
        setField(term35940, term35940.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term35751, args);
        assertTrue(recursiveEquals(term35751, term35940));
        assertTrue(recursiveEquals(retValue, "{=,=(this Map)}"));
    }

};


