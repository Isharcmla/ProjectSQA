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

public class Flat3Map_containsKey_76092510649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127030;
     Object term127052;
     Object term127053;

    public Flat3Map_containsKey_76092510649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127030 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term127030, term127030.getClass(), "delegateMap", null);
        setIntField(term127030, term127030.getClass(), "size", 1);
        setIntField(term127030, term127030.getClass(), "hash1", 0);
        setField(term127030, term127030.getClass(), "value1", null);
        setField(term127030, term127030.getClass(), "key1", term127030);
        term127052 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term127052, term127052.getClass(), "size", 1);
        setIntField(term127052, term127052.getClass(), "hash1", 0);
        setIntField(term127052, term127052.getClass(), "hash2", 0);
        setIntField(term127052, term127052.getClass(), "hash3", 0);
        setField(term127052, term127052.getClass(), "key1", term127052);
        setField(term127052, term127052.getClass(), "key2", null);
        setField(term127052, term127052.getClass(), "key3", null);
        setField(term127052, term127052.getClass(), "value1", null);
        setField(term127052, term127052.getClass(), "value2", null);
        setField(term127052, term127052.getClass(), "value3", null);
        setField(term127052, term127052.getClass(), "delegateMap", null);
        term127053 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term127053, term127053.getClass(), "size", 1);
        setIntField(term127053, term127053.getClass(), "hash1", 0);
        setIntField(term127053, term127053.getClass(), "hash2", 0);
        setIntField(term127053, term127053.getClass(), "hash3", 0);
        setField(term127053, term127053.getClass(), "key1", term127053);
        setField(term127053, term127053.getClass(), "key2", null);
        setField(term127053, term127053.getClass(), "key3", null);
        setField(term127053, term127053.getClass(), "value1", null);
        setField(term127053, term127053.getClass(), "value2", null);
        setField(term127053, term127053.getClass(), "value3", null);
        setField(term127053, term127053.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term127030;
        callMethod(klass, "containsKey", argTypes, term127030, args);
        assertTrue(recursiveEquals(term127030, term127052));
        assertTrue(recursiveEquals(term127030, term127053));
    }

};
