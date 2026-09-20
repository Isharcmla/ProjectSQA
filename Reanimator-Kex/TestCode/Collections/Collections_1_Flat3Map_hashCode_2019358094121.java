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

public class Flat3Map_hashCode_2019358094121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20556;
     Object term20668;

    public Flat3Map_hashCode_2019358094121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20556 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term20556, term20556.getClass(), "delegateMap", null);
        setIntField(term20556, term20556.getClass(), "size", 3);
        term20668 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term20668, term20668.getClass(), "size", 3);
        setIntField(term20668, term20668.getClass(), "hash1", 0);
        setIntField(term20668, term20668.getClass(), "hash2", 0);
        setIntField(term20668, term20668.getClass(), "hash3", 0);
        setField(term20668, term20668.getClass(), "key1", null);
        setField(term20668, term20668.getClass(), "key2", null);
        setField(term20668, term20668.getClass(), "key3", null);
        setField(term20668, term20668.getClass(), "value1", null);
        setField(term20668, term20668.getClass(), "value2", null);
        setField(term20668, term20668.getClass(), "value3", null);
        setField(term20668, term20668.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20556, args);
        assertTrue(recursiveEquals(term20556, term20668));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
