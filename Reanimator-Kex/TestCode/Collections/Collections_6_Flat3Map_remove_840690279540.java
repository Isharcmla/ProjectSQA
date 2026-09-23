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

public class Flat3Map_remove_840690279540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106369;
     Object term106461;
     Object term106771;
     Object term106772;

    public Flat3Map_remove_840690279540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106369 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term106369, term106369.getClass(), "delegateMap", null);
        setIntField(term106369, term106369.getClass(), "size", -1);
        term106461 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term106771 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term106771, term106771.getClass(), "size", -1);
        setIntField(term106771, term106771.getClass(), "hash1", 0);
        setIntField(term106771, term106771.getClass(), "hash2", 0);
        setIntField(term106771, term106771.getClass(), "hash3", 0);
        setField(term106771, term106771.getClass(), "key1", null);
        setField(term106771, term106771.getClass(), "key2", null);
        setField(term106771, term106771.getClass(), "key3", null);
        setField(term106771, term106771.getClass(), "value1", null);
        setField(term106771, term106771.getClass(), "value2", null);
        setField(term106771, term106771.getClass(), "value3", null);
        setField(term106771, term106771.getClass(), "delegateMap", null);
        term106772 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term106772, term106772.getClass(), "size", 0);
        setIntField(term106772, term106772.getClass(), "hash1", 0);
        setIntField(term106772, term106772.getClass(), "hash2", 0);
        setIntField(term106772, term106772.getClass(), "hash3", 0);
        setField(term106772, term106772.getClass(), "key1", null);
        setField(term106772, term106772.getClass(), "key2", null);
        setField(term106772, term106772.getClass(), "key3", null);
        setField(term106772, term106772.getClass(), "value1", null);
        setField(term106772, term106772.getClass(), "value2", null);
        setField(term106772, term106772.getClass(), "value3", null);
        setField(term106772, term106772.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term106461;
        Object retValue = callMethod(klass, "remove", argTypes, term106369, args);
        assertTrue(recursiveEquals(term106369, term106771));
        assertTrue(recursiveEquals(term106461, term106772));
        assertTrue(recursiveEquals(retValue, null));
    }

};


