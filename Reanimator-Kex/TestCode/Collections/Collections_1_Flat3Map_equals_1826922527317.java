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

public class Flat3Map_equals_1826922527317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56549;
     Object term56751;
     Object term57611;
     Object term57612;

    public Flat3Map_equals_1826922527317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56549 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term56659 = newInstance(Class.forName("org.apache.commons.collections.map.StaticBucketMap$1"));
        setField(term56549, term56549.getClass(), "delegateMap", null);
        setIntField(term56549, term56549.getClass(), "size", 1);
        setField(term56549, term56549.getClass(), "key1", term56659);
        term56751 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term56751, term56751.getClass(), "delegateMap", null);
        setIntField(term56751, term56751.getClass(), "size", 1);
        term57611 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term57611, term57611.getClass(), "size", 1);
        setIntField(term57611, term57611.getClass(), "hash1", 0);
        setIntField(term57611, term57611.getClass(), "hash2", 0);
        setIntField(term57611, term57611.getClass(), "hash3", 0);
        setField(term57611, term57611.getClass(), "key1", null);
        setField(term57611, term57611.getClass(), "key2", null);
        setField(term57611, term57611.getClass(), "key3", null);
        setField(term57611, term57611.getClass(), "value1", null);
        setField(term57611, term57611.getClass(), "value2", null);
        setField(term57611, term57611.getClass(), "value3", null);
        setField(term57611, term57611.getClass(), "delegateMap", null);
        term57612 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term57612, term57612.getClass(), "size", 1);
        setIntField(term57612, term57612.getClass(), "hash1", 0);
        setIntField(term57612, term57612.getClass(), "hash2", 0);
        setIntField(term57612, term57612.getClass(), "hash3", 0);
        setField(term57612, term57612.getClass(), "key1", null);
        setField(term57612, term57612.getClass(), "key2", null);
        setField(term57612, term57612.getClass(), "key3", null);
        setField(term57612, term57612.getClass(), "value1", null);
        setField(term57612, term57612.getClass(), "value2", null);
        setField(term57612, term57612.getClass(), "value3", null);
        setField(term57612, term57612.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term56751;
        Object retValue = callMethod(klass, "equals", argTypes, term56549, args);
        assertTrue(recursiveEquals(term56549, term57611));
        assertTrue(recursiveEquals(term56751, term57612));
        assertTrue(recursiveEquals(retValue, false));
    }

};
