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

public class Flat3Map_remove_840690279997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198994;
     Object term199017;
     Object term199018;

    public Flat3Map_remove_840690279997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198994 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term198994, term198994.getClass(), "delegateMap", null);
        setIntField(term198994, term198994.getClass(), "size", 2);
        setIntField(term198994, term198994.getClass(), "hash2", 0);
        setField(term198994, term198994.getClass(), "value2", null);
        setIntField(term198994, term198994.getClass(), "hash1", 0);
        setField(term198994, term198994.getClass(), "value1", null);
        setField(term198994, term198994.getClass(), "key2", term198994);
        term199017 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term199017, term199017.getClass(), "size", 1);
        setIntField(term199017, term199017.getClass(), "hash1", 0);
        setIntField(term199017, term199017.getClass(), "hash2", 0);
        setIntField(term199017, term199017.getClass(), "hash3", 0);
        setField(term199017, term199017.getClass(), "key1", null);
        setField(term199017, term199017.getClass(), "key2", null);
        setField(term199017, term199017.getClass(), "key3", null);
        setField(term199017, term199017.getClass(), "value1", null);
        setField(term199017, term199017.getClass(), "value2", null);
        setField(term199017, term199017.getClass(), "value3", null);
        setField(term199017, term199017.getClass(), "delegateMap", null);
        term199018 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term199018, term199018.getClass(), "size", 1);
        setIntField(term199018, term199018.getClass(), "hash1", 0);
        setIntField(term199018, term199018.getClass(), "hash2", 0);
        setIntField(term199018, term199018.getClass(), "hash3", 0);
        setField(term199018, term199018.getClass(), "key1", null);
        setField(term199018, term199018.getClass(), "key2", null);
        setField(term199018, term199018.getClass(), "key3", null);
        setField(term199018, term199018.getClass(), "value1", null);
        setField(term199018, term199018.getClass(), "value2", null);
        setField(term199018, term199018.getClass(), "value3", null);
        setField(term199018, term199018.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term198994;
        Object retValue = callMethod(klass, "remove", argTypes, term198994, args);
        assertTrue(recursiveEquals(term198994, term199017));
        assertTrue(recursiveEquals(term198994, term199018));
        assertTrue(recursiveEquals(retValue, null));
    }

};
