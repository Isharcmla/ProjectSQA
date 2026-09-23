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

public class Flat3Map_hashCode_2019358094175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28967;
     Object term28985;

    public Flat3Map_hashCode_2019358094175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28967 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term28967, term28967.getClass(), "delegateMap", null);
        setIntField(term28967, term28967.getClass(), "size", 1);
        term28985 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28985, term28985.getClass(), "size", 1);
        setIntField(term28985, term28985.getClass(), "hash1", 0);
        setIntField(term28985, term28985.getClass(), "hash2", 0);
        setIntField(term28985, term28985.getClass(), "hash3", 0);
        setField(term28985, term28985.getClass(), "key1", null);
        setField(term28985, term28985.getClass(), "key2", null);
        setField(term28985, term28985.getClass(), "key3", null);
        setField(term28985, term28985.getClass(), "value1", null);
        setField(term28985, term28985.getClass(), "value2", null);
        setField(term28985, term28985.getClass(), "value3", null);
        setField(term28985, term28985.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term28967, args);
        assertTrue(recursiveEquals(term28967, term28985));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


