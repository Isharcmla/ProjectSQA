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

public class Flat3Map_equals_1826922527538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102162;
     Object term102410;
     Object term102694;
     Object term102696;

    public Flat3Map_equals_1826922527538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102162 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102318 = newInstance(Class.forName("org.apache.commons.collections.list.TransformedList$TransformedListIterator"));
        setField(term102162, term102162.getClass(), "delegateMap", null);
        setIntField(term102162, term102162.getClass(), "size", 2);
        setField(term102162, term102162.getClass(), "key2", term102318);
        term102410 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term102410, term102410.getClass(), "delegateMap", null);
        setIntField(term102410, term102410.getClass(), "size", 2);
        setIntField(term102410, term102410.getClass(), "hash2", 0);
        term102694 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102695 = newInstance(Class.forName("org.apache.commons.collections.list.TransformedList$TransformedListIterator"));
        setIntField(term102694, term102694.getClass(), "size", 2);
        setIntField(term102694, term102694.getClass(), "hash1", 0);
        setIntField(term102694, term102694.getClass(), "hash2", 0);
        setIntField(term102694, term102694.getClass(), "hash3", 0);
        setField(term102694, term102694.getClass(), "key1", null);
        setField(term102695, term102695.getClass(), "this$0", null);
        setField(term102695, term102695.getClass(), "iterator", null);
        setField(term102694, term102694.getClass(), "key2", term102695);
        setField(term102694, term102694.getClass(), "key3", null);
        setField(term102694, term102694.getClass(), "value1", null);
        setField(term102694, term102694.getClass(), "value2", null);
        setField(term102694, term102694.getClass(), "value3", null);
        setField(term102694, term102694.getClass(), "delegateMap", null);
        term102696 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term102696, term102696.getClass(), "size", 2);
        setIntField(term102696, term102696.getClass(), "hash1", 0);
        setIntField(term102696, term102696.getClass(), "hash2", 0);
        setIntField(term102696, term102696.getClass(), "hash3", 0);
        setField(term102696, term102696.getClass(), "key1", null);
        setField(term102696, term102696.getClass(), "key2", null);
        setField(term102696, term102696.getClass(), "key3", null);
        setField(term102696, term102696.getClass(), "value1", null);
        setField(term102696, term102696.getClass(), "value2", null);
        setField(term102696, term102696.getClass(), "value3", null);
        setField(term102696, term102696.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term102410;
        Object retValue = callMethod(klass, "equals", argTypes, term102162, args);
        assertTrue(recursiveEquals(term102162, term102694));
        assertTrue(recursiveEquals(term102410, term102696));
        assertTrue(recursiveEquals(retValue, false));
    }

};
