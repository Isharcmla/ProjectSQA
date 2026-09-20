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

public class Flat3Map_remove_8406902791036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207580;
     Object term208016;
     Object term208018;

    public Flat3Map_remove_8406902791036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207580 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term207618 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setField(term207580, term207580.getClass(), "delegateMap", null);
        setIntField(term207580, term207580.getClass(), "size", 3);
        setIntField(term207580, term207580.getClass(), "hash3", 0);
        setField(term207580, term207580.getClass(), "value3", term207618);
        setIntField(term207580, term207580.getClass(), "hash2", 0);
        setField(term207580, term207580.getClass(), "value2", null);
        setIntField(term207580, term207580.getClass(), "hash1", 0);
        setField(term207580, term207580.getClass(), "value1", null);
        term208016 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term208017 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setIntField(term208016, term208016.getClass(), "size", 3);
        setIntField(term208016, term208016.getClass(), "hash1", 0);
        setIntField(term208016, term208016.getClass(), "hash2", 0);
        setIntField(term208016, term208016.getClass(), "hash3", 0);
        setField(term208016, term208016.getClass(), "key1", null);
        setField(term208016, term208016.getClass(), "key2", null);
        setField(term208016, term208016.getClass(), "key3", null);
        setField(term208016, term208016.getClass(), "value1", null);
        setField(term208016, term208016.getClass(), "value2", null);
        setField(term208017, term208017.getClass(), "this$1", null);
        setField(term208017, term208017.getClass(), "downstream", null);
        setField(term208016, term208016.getClass(), "value3", term208017);
        setField(term208016, term208016.getClass(), "delegateMap", null);
        term208018 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term208019 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setIntField(term208018, term208018.getClass(), "size", 3);
        setIntField(term208018, term208018.getClass(), "hash1", 0);
        setIntField(term208018, term208018.getClass(), "hash2", 0);
        setIntField(term208018, term208018.getClass(), "hash3", 0);
        setField(term208018, term208018.getClass(), "key1", null);
        setField(term208018, term208018.getClass(), "key2", null);
        setField(term208018, term208018.getClass(), "key3", null);
        setField(term208018, term208018.getClass(), "value1", null);
        setField(term208018, term208018.getClass(), "value2", null);
        setField(term208019, term208019.getClass(), "this$1", null);
        setField(term208019, term208019.getClass(), "downstream", null);
        setField(term208018, term208018.getClass(), "value3", term208019);
        setField(term208018, term208018.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term207580;
        Object retValue = callMethod(klass, "remove", argTypes, term207580, args);
        assertTrue(recursiveEquals(term207580, term208016));
        assertTrue(recursiveEquals(term207580, term208018));
        assertTrue(recursiveEquals(retValue, null));
    }

};
