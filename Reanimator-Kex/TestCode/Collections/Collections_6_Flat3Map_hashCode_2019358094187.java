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

public class Flat3Map_hashCode_2019358094187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30753;
     Object term31443;

    public Flat3Map_hashCode_2019358094187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30753 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term30845 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term30753, term30753.getClass(), "delegateMap", null);
        setIntField(term30753, term30753.getClass(), "size", 3);
        setIntField(term30753, term30753.getClass(), "hash3", 0);
        setField(term30753, term30753.getClass(), "value3", null);
        setIntField(term30753, term30753.getClass(), "hash2", 0);
        setField(term30753, term30753.getClass(), "value2", term30845);
        term31443 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term31444 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term31443, term31443.getClass(), "size", 3);
        setIntField(term31443, term31443.getClass(), "hash1", 0);
        setIntField(term31443, term31443.getClass(), "hash2", 0);
        setIntField(term31443, term31443.getClass(), "hash3", 0);
        setField(term31443, term31443.getClass(), "key1", null);
        setField(term31443, term31443.getClass(), "key2", null);
        setField(term31443, term31443.getClass(), "key3", null);
        setField(term31443, term31443.getClass(), "value1", null);
        setIntField(term31444, term31444.getClass(), "size", 0);
        setIntField(term31444, term31444.getClass(), "hash1", 0);
        setIntField(term31444, term31444.getClass(), "hash2", 0);
        setIntField(term31444, term31444.getClass(), "hash3", 0);
        setField(term31444, term31444.getClass(), "key1", null);
        setField(term31444, term31444.getClass(), "key2", null);
        setField(term31444, term31444.getClass(), "key3", null);
        setField(term31444, term31444.getClass(), "value1", null);
        setField(term31444, term31444.getClass(), "value2", null);
        setField(term31444, term31444.getClass(), "value3", null);
        setField(term31444, term31444.getClass(), "delegateMap", null);
        setField(term31443, term31443.getClass(), "value2", term31444);
        setField(term31443, term31443.getClass(), "value3", null);
        setField(term31443, term31443.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term30753, args);
        assertTrue(recursiveEquals(term30753, term31443));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


