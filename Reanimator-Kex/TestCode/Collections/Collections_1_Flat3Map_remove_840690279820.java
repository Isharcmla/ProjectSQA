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

public class Flat3Map_remove_840690279820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166251;
     Object term166343;
     Object term166726;
     Object term166727;

    public Flat3Map_remove_840690279820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166251 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term166251, term166251.getClass(), "delegateMap", null);
        setIntField(term166251, term166251.getClass(), "size", 1073741824);
        term166343 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term166343, term166343.getClass(), "delegateMap", null);
        setIntField(term166343, term166343.getClass(), "size", 3);
        term166726 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term166726, term166726.getClass(), "size", 1073741824);
        setIntField(term166726, term166726.getClass(), "hash1", 0);
        setIntField(term166726, term166726.getClass(), "hash2", 0);
        setIntField(term166726, term166726.getClass(), "hash3", 0);
        setField(term166726, term166726.getClass(), "key1", null);
        setField(term166726, term166726.getClass(), "key2", null);
        setField(term166726, term166726.getClass(), "key3", null);
        setField(term166726, term166726.getClass(), "value1", null);
        setField(term166726, term166726.getClass(), "value2", null);
        setField(term166726, term166726.getClass(), "value3", null);
        setField(term166726, term166726.getClass(), "delegateMap", null);
        term166727 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term166727, term166727.getClass(), "size", 3);
        setIntField(term166727, term166727.getClass(), "hash1", 0);
        setIntField(term166727, term166727.getClass(), "hash2", 0);
        setIntField(term166727, term166727.getClass(), "hash3", 0);
        setField(term166727, term166727.getClass(), "key1", null);
        setField(term166727, term166727.getClass(), "key2", null);
        setField(term166727, term166727.getClass(), "key3", null);
        setField(term166727, term166727.getClass(), "value1", null);
        setField(term166727, term166727.getClass(), "value2", null);
        setField(term166727, term166727.getClass(), "value3", null);
        setField(term166727, term166727.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term166343;
        Object retValue = callMethod(klass, "remove", argTypes, term166251, args);
        assertTrue(recursiveEquals(term166251, term166726));
        assertTrue(recursiveEquals(term166343, term166727));
        assertTrue(recursiveEquals(retValue, null));
    }

};
