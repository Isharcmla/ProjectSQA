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

public class Flat3Map_get_22962178164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14862;
     Object term14969;

    public Flat3Map_get_22962178164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14862 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term14862, term14862.getClass(), "delegateMap", null);
        term14969 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14969, term14969.getClass(), "size", 0);
        setIntField(term14969, term14969.getClass(), "hash1", 0);
        setIntField(term14969, term14969.getClass(), "hash2", 0);
        setIntField(term14969, term14969.getClass(), "hash3", 0);
        setField(term14969, term14969.getClass(), "key1", null);
        setField(term14969, term14969.getClass(), "key2", null);
        setField(term14969, term14969.getClass(), "key3", null);
        setField(term14969, term14969.getClass(), "value1", null);
        setField(term14969, term14969.getClass(), "value2", null);
        setField(term14969, term14969.getClass(), "value3", null);
        setField(term14969, term14969.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "get", argTypes, term14862, args);
        assertTrue(recursiveEquals(term14862, term14969));
        assertTrue(recursiveEquals(retValue, null));
    }

};
