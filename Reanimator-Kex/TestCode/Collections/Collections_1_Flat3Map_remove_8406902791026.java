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

public class Flat3Map_remove_8406902791026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205414;
     Object term205798;
     Object term205800;

    public Flat3Map_remove_8406902791026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205414 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term205474 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap$ValueIterator"));
        setField(term205414, term205414.getClass(), "delegateMap", null);
        setIntField(term205414, term205414.getClass(), "size", 1);
        setIntField(term205414, term205414.getClass(), "hash1", 0);
        setField(term205414, term205414.getClass(), "value1", term205474);
        term205798 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term205799 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap$ValueIterator"));
        setIntField(term205798, term205798.getClass(), "size", 1);
        setIntField(term205798, term205798.getClass(), "hash1", 0);
        setIntField(term205798, term205798.getClass(), "hash2", 0);
        setIntField(term205798, term205798.getClass(), "hash3", 0);
        setField(term205798, term205798.getClass(), "key1", null);
        setField(term205798, term205798.getClass(), "key2", null);
        setField(term205798, term205798.getClass(), "key3", null);
        setField(term205799, term205799.getClass(), "backedIterator", null);
        setField(term205799, term205799.getClass(), "tempIterator", null);
        setField(term205799, term205799.getClass(), "this$0", null);
        setField(term205798, term205798.getClass(), "value1", term205799);
        setField(term205798, term205798.getClass(), "value2", null);
        setField(term205798, term205798.getClass(), "value3", null);
        setField(term205798, term205798.getClass(), "delegateMap", null);
        term205800 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term205801 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap$ValueIterator"));
        setIntField(term205800, term205800.getClass(), "size", 1);
        setIntField(term205800, term205800.getClass(), "hash1", 0);
        setIntField(term205800, term205800.getClass(), "hash2", 0);
        setIntField(term205800, term205800.getClass(), "hash3", 0);
        setField(term205800, term205800.getClass(), "key1", null);
        setField(term205800, term205800.getClass(), "key2", null);
        setField(term205800, term205800.getClass(), "key3", null);
        setField(term205801, term205801.getClass(), "backedIterator", null);
        setField(term205801, term205801.getClass(), "tempIterator", null);
        setField(term205801, term205801.getClass(), "this$0", null);
        setField(term205800, term205800.getClass(), "value1", term205801);
        setField(term205800, term205800.getClass(), "value2", null);
        setField(term205800, term205800.getClass(), "value3", null);
        setField(term205800, term205800.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term205414;
        Object retValue = callMethod(klass, "remove", argTypes, term205414, args);
        assertTrue(recursiveEquals(term205414, term205798));
        assertTrue(recursiveEquals(term205414, term205800));
        assertTrue(recursiveEquals(retValue, null));
    }

};
