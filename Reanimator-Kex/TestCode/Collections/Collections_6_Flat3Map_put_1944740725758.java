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

public class Flat3Map_put_1944740725758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187191;

    public Flat3Map_put_1944740725758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187191 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term187246 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term187191, term187191.getClass(), "delegateMap", null);
        setIntField(term187191, term187191.getClass(), "size", 3);
        setIntField(term187191, term187191.getClass(), "hash3", -23785760);
        setField(term187191, term187191.getClass(), "value3", term187246);
        setIntField(term187191, term187191.getClass(), "hash2", -23785760);
        setField(term187191, term187191.getClass(), "value2", null);
        setIntField(term187191, term187191.getClass(), "hash1", -23785760);
        setField(term187191, term187191.getClass(), "value1", null);
        setField(term187191, term187191.getClass(), "key3", null);
        setField(term187191, term187191.getClass(), "key2", null);
        setField(term187191, term187191.getClass(), "key1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term187191;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term187191, args);
        assertTrue(recursiveEquals(term187191, (short) 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


