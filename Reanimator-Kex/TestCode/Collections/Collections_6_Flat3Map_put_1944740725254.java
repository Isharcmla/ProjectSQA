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

public class Flat3Map_put_1944740725254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41846;
     Object term42049;
     Object term42050;

    public Flat3Map_put_1944740725254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41846 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term41846, term41846.getClass(), "delegateMap", null);
        setIntField(term41846, term41846.getClass(), "size", 3);
        setIntField(term41846, term41846.getClass(), "hash3", 0);
        setField(term41846, term41846.getClass(), "value3", null);
        setIntField(term41846, term41846.getClass(), "hash2", 0);
        setField(term41846, term41846.getClass(), "value2", null);
        setIntField(term41846, term41846.getClass(), "hash1", 0);
        setField(term41846, term41846.getClass(), "value1", null);
        setField(term41846, term41846.getClass(), "key3", term41846);
        term42049 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term42049, term42049.getClass(), "size", 3);
        setIntField(term42049, term42049.getClass(), "hash1", 0);
        setIntField(term42049, term42049.getClass(), "hash2", 0);
        setIntField(term42049, term42049.getClass(), "hash3", 0);
        setField(term42049, term42049.getClass(), "key1", null);
        setField(term42049, term42049.getClass(), "key2", null);
        setField(term42049, term42049.getClass(), "key3", term42049);
        setField(term42049, term42049.getClass(), "value1", null);
        setField(term42049, term42049.getClass(), "value2", null);
        setField(term42049, term42049.getClass(), "value3", null);
        setField(term42049, term42049.getClass(), "delegateMap", null);
        term42050 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term42050, term42050.getClass(), "size", 3);
        setIntField(term42050, term42050.getClass(), "hash1", 0);
        setIntField(term42050, term42050.getClass(), "hash2", 0);
        setIntField(term42050, term42050.getClass(), "hash3", 0);
        setField(term42050, term42050.getClass(), "key1", null);
        setField(term42050, term42050.getClass(), "key2", null);
        setField(term42050, term42050.getClass(), "key3", term42050);
        setField(term42050, term42050.getClass(), "value1", null);
        setField(term42050, term42050.getClass(), "value2", null);
        setField(term42050, term42050.getClass(), "value3", null);
        setField(term42050, term42050.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term41846;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term41846, args);
        assertTrue(recursiveEquals(term41846, term42049));
        assertTrue(recursiveEquals(term41846, term42050));
        assertTrue(recursiveEquals(retValue, null));
    }

};


