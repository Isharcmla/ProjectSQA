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
import java.util.HashMap;

public class Flat3Map_remove_8406902791015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203598;
     Object term203814;
     Object term203867;
     Object term203871;

    public Flat3Map_remove_8406902791015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term203722 = new HashMap();
        term203598 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203636 = newInstance(Class.forName("java.lang.Object"));
        Object term203674 = newInstance(Class.forName("java.lang.Object"));
        setField(term203598, term203598.getClass(), "delegateMap", null);
        setIntField(term203598, term203598.getClass(), "size", 3);
        setIntField(term203598, term203598.getClass(), "hash3", 0);
        setField(term203598, term203598.getClass(), "key3", term203636);
        setIntField(term203598, term203598.getClass(), "hash2", 0);
        setField(term203598, term203598.getClass(), "key2", term203674);
        setIntField(term203598, term203598.getClass(), "hash1", 0);
        setField(term203598, term203598.getClass(), "key1", term203722);
        term203814 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term203814, term203814.getClass(), "delegateMap", null);
        setIntField(term203814, term203814.getClass(), "size", 3);
        setIntField(term203814, term203814.getClass(), "hash3", 0);
        setField(term203814, term203814.getClass(), "value3", null);
        setIntField(term203814, term203814.getClass(), "hash2", 0);
        setField(term203814, term203814.getClass(), "value2", null);
        setIntField(term203814, term203814.getClass(), "hash1", 0);
        setField(term203814, term203814.getClass(), "value1", null);
        HashMap term203868 = new HashMap();
        term203867 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203869 = newInstance(Class.forName("java.lang.Object"));
        Object term203870 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term203867, term203867.getClass(), "size", 3);
        setIntField(term203867, term203867.getClass(), "hash1", 0);
        setIntField(term203867, term203867.getClass(), "hash2", 0);
        setIntField(term203867, term203867.getClass(), "hash3", 0);
        setField(term203867, term203867.getClass(), "key1", term203868);
        setField(term203867, term203867.getClass(), "key2", term203869);
        setField(term203867, term203867.getClass(), "key3", term203870);
        setField(term203867, term203867.getClass(), "value1", null);
        setField(term203867, term203867.getClass(), "value2", null);
        setField(term203867, term203867.getClass(), "value3", null);
        setField(term203867, term203867.getClass(), "delegateMap", null);
        term203871 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term203871, term203871.getClass(), "size", 3);
        setIntField(term203871, term203871.getClass(), "hash1", 0);
        setIntField(term203871, term203871.getClass(), "hash2", 0);
        setIntField(term203871, term203871.getClass(), "hash3", 0);
        setField(term203871, term203871.getClass(), "key1", null);
        setField(term203871, term203871.getClass(), "key2", null);
        setField(term203871, term203871.getClass(), "key3", null);
        setField(term203871, term203871.getClass(), "value1", null);
        setField(term203871, term203871.getClass(), "value2", null);
        setField(term203871, term203871.getClass(), "value3", null);
        setField(term203871, term203871.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term203814;
        Object retValue = callMethod(klass, "remove", argTypes, term203598, args);
        assertTrue(recursiveEquals(term203598, term203867));
        assertTrue(recursiveEquals(term203814, term203871));
        assertTrue(recursiveEquals(retValue, null));
    }

};
