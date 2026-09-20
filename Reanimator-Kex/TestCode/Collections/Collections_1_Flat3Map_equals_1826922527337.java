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

public class Flat3Map_equals_1826922527337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60969;
     Object term61147;
     Object term61185;
     Object term61187;

    public Flat3Map_equals_1826922527337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60969 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61055 = newInstance(Class.forName("java.util.stream.Nodes$ToArrayTask$OfRef"));
        setField(term60969, term60969.getClass(), "delegateMap", null);
        setIntField(term60969, term60969.getClass(), "size", 1);
        setField(term60969, term60969.getClass(), "key1", term61055);
        term61147 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term61147, term61147.getClass(), "delegateMap", null);
        setIntField(term61147, term61147.getClass(), "size", 1);
        term61185 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61186 = newInstance(Class.forName("java.util.stream.Nodes$ToArrayTask$OfRef"));
        setIntField(term61185, term61185.getClass(), "size", 1);
        setIntField(term61185, term61185.getClass(), "hash1", 0);
        setIntField(term61185, term61185.getClass(), "hash2", 0);
        setIntField(term61185, term61185.getClass(), "hash3", 0);
        setField(term61186, term61186.getClass(), "array", null);
        setField(term61186, term61186.getClass(), "node", null);
        setIntField(term61186, term61186.getClass(), "offset", 0);
        setField(term61186, term61186.getClass(), "completer", null);
        setIntField(term61186, term61186.getClass(), "pending", 0);
        setIntField(term61186, term61186.getClass(), "status", 0);
        setField(term61185, term61185.getClass(), "key1", term61186);
        setField(term61185, term61185.getClass(), "key2", null);
        setField(term61185, term61185.getClass(), "key3", null);
        setField(term61185, term61185.getClass(), "value1", null);
        setField(term61185, term61185.getClass(), "value2", null);
        setField(term61185, term61185.getClass(), "value3", null);
        setField(term61185, term61185.getClass(), "delegateMap", null);
        term61187 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term61187, term61187.getClass(), "size", 1);
        setIntField(term61187, term61187.getClass(), "hash1", 0);
        setIntField(term61187, term61187.getClass(), "hash2", 0);
        setIntField(term61187, term61187.getClass(), "hash3", 0);
        setField(term61187, term61187.getClass(), "key1", null);
        setField(term61187, term61187.getClass(), "key2", null);
        setField(term61187, term61187.getClass(), "key3", null);
        setField(term61187, term61187.getClass(), "value1", null);
        setField(term61187, term61187.getClass(), "value2", null);
        setField(term61187, term61187.getClass(), "value3", null);
        setField(term61187, term61187.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61147;
        Object retValue = callMethod(klass, "equals", argTypes, term60969, args);
        assertTrue(recursiveEquals(term60969, term61185));
        assertTrue(recursiveEquals(term61147, term61187));
        assertTrue(recursiveEquals(retValue, false));
    }

};
