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

public class Flat3Map_equals_1826922527713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141764;
     Object term141952;
     Object term142095;
     Object term142097;

    public Flat3Map_equals_1826922527713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141764 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141860 = newInstance(Class.forName("java.nio.channels.NonReadableChannelException"));
        setField(term141764, term141764.getClass(), "delegateMap", null);
        setIntField(term141764, term141764.getClass(), "size", 2);
        setField(term141764, term141764.getClass(), "key2", null);
        setField(term141764, term141764.getClass(), "value2", null);
        setField(term141764, term141764.getClass(), "key1", term141860);
        term141952 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term141952, term141952.getClass(), "delegateMap", null);
        setIntField(term141952, term141952.getClass(), "size", 2);
        setField(term141952, term141952.getClass(), "key2", null);
        setField(term141952, term141952.getClass(), "value2", null);
        term142095 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142096 = newInstance(Class.forName("java.nio.channels.NonReadableChannelException"));
        setIntField(term142095, term142095.getClass(), "size", 2);
        setIntField(term142095, term142095.getClass(), "hash1", 0);
        setIntField(term142095, term142095.getClass(), "hash2", 0);
        setIntField(term142095, term142095.getClass(), "hash3", 0);
        setField(term142096, term142096.getClass(), "backtrace", null);
        setField(term142096, term142096.getClass(), "detailMessage", null);
        setField(term142096, term142096.getClass(), "cause", null);
        setField(term142096, term142096.getClass(), "stackTrace", null);
        setIntField(term142096, term142096.getClass(), "depth", 0);
        setField(term142096, term142096.getClass(), "suppressedExceptions", null);
        setField(term142095, term142095.getClass(), "key1", term142096);
        setField(term142095, term142095.getClass(), "key2", null);
        setField(term142095, term142095.getClass(), "key3", null);
        setField(term142095, term142095.getClass(), "value1", null);
        setField(term142095, term142095.getClass(), "value2", null);
        setField(term142095, term142095.getClass(), "value3", null);
        setField(term142095, term142095.getClass(), "delegateMap", null);
        term142097 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term142097, term142097.getClass(), "size", 2);
        setIntField(term142097, term142097.getClass(), "hash1", 0);
        setIntField(term142097, term142097.getClass(), "hash2", 0);
        setIntField(term142097, term142097.getClass(), "hash3", 0);
        setField(term142097, term142097.getClass(), "key1", null);
        setField(term142097, term142097.getClass(), "key2", null);
        setField(term142097, term142097.getClass(), "key3", null);
        setField(term142097, term142097.getClass(), "value1", null);
        setField(term142097, term142097.getClass(), "value2", null);
        setField(term142097, term142097.getClass(), "value3", null);
        setField(term142097, term142097.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term141952;
        Object retValue = callMethod(klass, "equals", argTypes, term141764, args);
        assertTrue(recursiveEquals(term141764, term142095));
        assertTrue(recursiveEquals(term141952, term142097));
        assertTrue(recursiveEquals(retValue, false));
    }

};
