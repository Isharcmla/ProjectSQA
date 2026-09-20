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

public class Flat3Map_remove_8406902791091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216042;
     Object term216074;
     Object term216647;
     Object term216648;

    public Flat3Map_remove_8406902791091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216042 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term216042, term216042.getClass(), "delegateMap", null);
        setIntField(term216042, term216042.getClass(), "size", 1);
        setIntField(term216042, term216042.getClass(), "hash1", 0);
        term216074 = newInstance(Class.forName("java.nio.Bits"));
        term216647 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term216647, term216647.getClass(), "size", 1);
        setIntField(term216647, term216647.getClass(), "hash1", 0);
        setIntField(term216647, term216647.getClass(), "hash2", 0);
        setIntField(term216647, term216647.getClass(), "hash3", 0);
        setField(term216647, term216647.getClass(), "key1", null);
        setField(term216647, term216647.getClass(), "key2", null);
        setField(term216647, term216647.getClass(), "key3", null);
        setField(term216647, term216647.getClass(), "value1", null);
        setField(term216647, term216647.getClass(), "value2", null);
        setField(term216647, term216647.getClass(), "value3", null);
        setField(term216647, term216647.getClass(), "delegateMap", null);
        term216648 = newInstance(Class.forName("java.nio.Bits"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term216074;
        Object retValue = callMethod(klass, "remove", argTypes, term216042, args);
        assertTrue(recursiveEquals(term216042, term216647));
        assertTrue(recursiveEquals(term216074, term216648));
        assertTrue(recursiveEquals(retValue, null));
    }

};
