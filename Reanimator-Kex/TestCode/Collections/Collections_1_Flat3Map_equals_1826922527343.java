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

public class Flat3Map_equals_1826922527343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61832;
     Object term62022;
     Object term62078;
     Object term62080;

    public Flat3Map_equals_1826922527343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61832 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61930 = newInstance(Class.forName("java.util.concurrent.Executors$RunnableAdapter"));
        setField(term61832, term61832.getClass(), "delegateMap", null);
        setIntField(term61832, term61832.getClass(), "size", 1);
        setField(term61832, term61832.getClass(), "key1", term61930);
        term62022 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term62022, term62022.getClass(), "delegateMap", null);
        setIntField(term62022, term62022.getClass(), "size", 1);
        term62078 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term62079 = newInstance(Class.forName("java.util.concurrent.Executors$RunnableAdapter"));
        setIntField(term62078, term62078.getClass(), "size", 1);
        setIntField(term62078, term62078.getClass(), "hash1", 0);
        setIntField(term62078, term62078.getClass(), "hash2", 0);
        setIntField(term62078, term62078.getClass(), "hash3", 0);
        setField(term62079, term62079.getClass(), "task", null);
        setField(term62079, term62079.getClass(), "result", null);
        setField(term62078, term62078.getClass(), "key1", term62079);
        setField(term62078, term62078.getClass(), "key2", null);
        setField(term62078, term62078.getClass(), "key3", null);
        setField(term62078, term62078.getClass(), "value1", null);
        setField(term62078, term62078.getClass(), "value2", null);
        setField(term62078, term62078.getClass(), "value3", null);
        setField(term62078, term62078.getClass(), "delegateMap", null);
        term62080 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term62080, term62080.getClass(), "size", 1);
        setIntField(term62080, term62080.getClass(), "hash1", 0);
        setIntField(term62080, term62080.getClass(), "hash2", 0);
        setIntField(term62080, term62080.getClass(), "hash3", 0);
        setField(term62080, term62080.getClass(), "key1", null);
        setField(term62080, term62080.getClass(), "key2", null);
        setField(term62080, term62080.getClass(), "key3", null);
        setField(term62080, term62080.getClass(), "value1", null);
        setField(term62080, term62080.getClass(), "value2", null);
        setField(term62080, term62080.getClass(), "value3", null);
        setField(term62080, term62080.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term62022;
        Object retValue = callMethod(klass, "equals", argTypes, term61832, args);
        assertTrue(recursiveEquals(term61832, term62078));
        assertTrue(recursiveEquals(term62022, term62080));
        assertTrue(recursiveEquals(retValue, false));
    }

};
