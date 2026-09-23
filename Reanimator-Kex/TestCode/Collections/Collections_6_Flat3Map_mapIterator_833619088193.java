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

public class Flat3Map_mapIterator_833619088193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32017;
     Object term32570;
     Object term32567;

    public Flat3Map_mapIterator_833619088193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32017 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term32017, term32017.getClass(), "delegateMap", null);
        setIntField(term32017, term32017.getClass(), "size", -1);
        term32570 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term32570, term32570.getClass(), "size", -1);
        setIntField(term32570, term32570.getClass(), "hash1", 0);
        setIntField(term32570, term32570.getClass(), "hash2", 0);
        setIntField(term32570, term32570.getClass(), "hash3", 0);
        setField(term32570, term32570.getClass(), "key1", null);
        setField(term32570, term32570.getClass(), "key2", null);
        setField(term32570, term32570.getClass(), "key3", null);
        setField(term32570, term32570.getClass(), "value1", null);
        setField(term32570, term32570.getClass(), "value2", null);
        setField(term32570, term32570.getClass(), "value3", null);
        setField(term32570, term32570.getClass(), "delegateMap", null);
        term32567 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map$FlatMapIterator"));
        Object term32562 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term32562, term32562.getClass(), "size", -1);
        setIntField(term32562, term32562.getClass(), "hash1", 0);
        setIntField(term32562, term32562.getClass(), "hash2", 0);
        setIntField(term32562, term32562.getClass(), "hash3", 0);
        setField(term32562, term32562.getClass(), "key1", null);
        setField(term32562, term32562.getClass(), "key2", null);
        setField(term32562, term32562.getClass(), "key3", null);
        setField(term32562, term32562.getClass(), "value1", null);
        setField(term32562, term32562.getClass(), "value2", null);
        setField(term32562, term32562.getClass(), "value3", null);
        setField(term32562, term32562.getClass(), "delegateMap", null);
        setField(term32567, term32567.getClass(), "parent", term32562);
        setIntField(term32567, term32567.getClass(), "nextIndex", 0);
        setBooleanField(term32567, term32567.getClass(), "canRemove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapIterator", argTypes, term32017, args);
        assertTrue(recursiveEquals(term32017, term32570));
        assertTrue(recursiveEquals(retValue, term32567));
    }

};


