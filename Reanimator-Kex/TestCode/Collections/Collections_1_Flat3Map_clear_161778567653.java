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

public class Flat3Map_clear_161778567653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14022;
     Object term14273;

    public Flat3Map_clear_161778567653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14022 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term14022, term14022.getClass(), "delegateMap", null);
        term14273 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14273, term14273.getClass(), "size", 0);
        setIntField(term14273, term14273.getClass(), "hash1", 0);
        setIntField(term14273, term14273.getClass(), "hash2", 0);
        setIntField(term14273, term14273.getClass(), "hash3", 0);
        setField(term14273, term14273.getClass(), "key1", null);
        setField(term14273, term14273.getClass(), "key2", null);
        setField(term14273, term14273.getClass(), "key3", null);
        setField(term14273, term14273.getClass(), "value1", null);
        setField(term14273, term14273.getClass(), "value2", null);
        setField(term14273, term14273.getClass(), "value3", null);
        setField(term14273, term14273.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term14022, args);
        assertTrue(recursiveEquals(term14022, term14273));
    }

};
