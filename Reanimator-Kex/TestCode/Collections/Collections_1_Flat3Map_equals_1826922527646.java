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
import java.util.HashMap;

public class Flat3Map_equals_1826922527646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126060;
     Object term126152;
     Object term126606;
     Object term126607;

    public Flat3Map_equals_1826922527646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126060 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term126060, term126060.getClass(), "delegateMap", null);
        setIntField(term126060, term126060.getClass(), "size", 3);
        setField(term126060, term126060.getClass(), "key3", null);
        HashMap term126200 = new HashMap();
        term126152 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term126152, term126152.getClass(), "delegateMap", null);
        setIntField(term126152, term126152.getClass(), "size", 3);
        setField(term126152, term126152.getClass(), "key3", term126200);
        term126606 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term126606, term126606.getClass(), "size", 3);
        setIntField(term126606, term126606.getClass(), "hash1", 0);
        setIntField(term126606, term126606.getClass(), "hash2", 0);
        setIntField(term126606, term126606.getClass(), "hash3", 0);
        setField(term126606, term126606.getClass(), "key1", null);
        setField(term126606, term126606.getClass(), "key2", null);
        setField(term126606, term126606.getClass(), "key3", null);
        setField(term126606, term126606.getClass(), "value1", null);
        setField(term126606, term126606.getClass(), "value2", null);
        setField(term126606, term126606.getClass(), "value3", null);
        setField(term126606, term126606.getClass(), "delegateMap", null);
        HashMap term126608 = new HashMap();
        term126607 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term126607, term126607.getClass(), "size", 3);
        setIntField(term126607, term126607.getClass(), "hash1", 0);
        setIntField(term126607, term126607.getClass(), "hash2", 0);
        setIntField(term126607, term126607.getClass(), "hash3", 0);
        setField(term126607, term126607.getClass(), "key1", null);
        setField(term126607, term126607.getClass(), "key2", null);
        setField(term126607, term126607.getClass(), "key3", term126608);
        setField(term126607, term126607.getClass(), "value1", null);
        setField(term126607, term126607.getClass(), "value2", null);
        setField(term126607, term126607.getClass(), "value3", null);
        setField(term126607, term126607.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term126152;
        Object retValue = callMethod(klass, "equals", argTypes, term126060, args);
        assertTrue(recursiveEquals(term126060, term126606));
        assertTrue(recursiveEquals(term126152, term126607));
        assertTrue(recursiveEquals(retValue, true));
    }

};
