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

public class Flat3Map_equals_1826922527453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83836;
     Object term84014;
     Object term84123;
     Object term84125;

    public Flat3Map_equals_1826922527453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83836 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term83922 = newInstance(Class.forName("java.util.stream.Nodes$ToArrayTask$OfRef"));
        setField(term83836, term83836.getClass(), "delegateMap", null);
        setIntField(term83836, term83836.getClass(), "size", 1);
        setField(term83836, term83836.getClass(), "key1", term83922);
        term84014 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term84014, term84014.getClass(), "delegateMap", null);
        setIntField(term84014, term84014.getClass(), "size", 1);
        setIntField(term84014, term84014.getClass(), "hash1", 0);
        term84123 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term84124 = newInstance(Class.forName("java.util.stream.Nodes$ToArrayTask$OfRef"));
        setIntField(term84123, term84123.getClass(), "size", 1);
        setIntField(term84123, term84123.getClass(), "hash1", 0);
        setIntField(term84123, term84123.getClass(), "hash2", 0);
        setIntField(term84123, term84123.getClass(), "hash3", 0);
        setField(term84124, term84124.getClass(), "array", null);
        setField(term84124, term84124.getClass(), "node", null);
        setIntField(term84124, term84124.getClass(), "offset", 0);
        setField(term84124, term84124.getClass(), "completer", null);
        setIntField(term84124, term84124.getClass(), "pending", 0);
        setIntField(term84124, term84124.getClass(), "status", 0);
        setField(term84123, term84123.getClass(), "key1", term84124);
        setField(term84123, term84123.getClass(), "key2", null);
        setField(term84123, term84123.getClass(), "key3", null);
        setField(term84123, term84123.getClass(), "value1", null);
        setField(term84123, term84123.getClass(), "value2", null);
        setField(term84123, term84123.getClass(), "value3", null);
        setField(term84123, term84123.getClass(), "delegateMap", null);
        term84125 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term84125, term84125.getClass(), "size", 1);
        setIntField(term84125, term84125.getClass(), "hash1", 0);
        setIntField(term84125, term84125.getClass(), "hash2", 0);
        setIntField(term84125, term84125.getClass(), "hash3", 0);
        setField(term84125, term84125.getClass(), "key1", null);
        setField(term84125, term84125.getClass(), "key2", null);
        setField(term84125, term84125.getClass(), "key3", null);
        setField(term84125, term84125.getClass(), "value1", null);
        setField(term84125, term84125.getClass(), "value2", null);
        setField(term84125, term84125.getClass(), "value3", null);
        setField(term84125, term84125.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term84014;
        Object retValue = callMethod(klass, "equals", argTypes, term83836, args);
        assertTrue(recursiveEquals(term83836, term84123));
        assertTrue(recursiveEquals(term84014, term84125));
        assertTrue(recursiveEquals(retValue, false));
    }

};
