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

public class Flat3Map_remove_840690279848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170812;
     Object term170888;
     Object term171196;
     Object term171197;

    public Flat3Map_remove_840690279848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170812 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term170812, term170812.getClass(), "delegateMap", null);
        setIntField(term170812, term170812.getClass(), "size", 1073741824);
        term170888 = newInstance(Class.forName("java.util.stream.DoublePipeline$3$1"));
        term171196 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term171196, term171196.getClass(), "size", 1073741824);
        setIntField(term171196, term171196.getClass(), "hash1", 0);
        setIntField(term171196, term171196.getClass(), "hash2", 0);
        setIntField(term171196, term171196.getClass(), "hash3", 0);
        setField(term171196, term171196.getClass(), "key1", null);
        setField(term171196, term171196.getClass(), "key2", null);
        setField(term171196, term171196.getClass(), "key3", null);
        setField(term171196, term171196.getClass(), "value1", null);
        setField(term171196, term171196.getClass(), "value2", null);
        setField(term171196, term171196.getClass(), "value3", null);
        setField(term171196, term171196.getClass(), "delegateMap", null);
        term171197 = newInstance(Class.forName("java.util.stream.DoublePipeline$3$1"));
        setField(term171197, term171197.getClass(), "this$1", null);
        setField(term171197, term171197.getClass(), "downstream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term170888;
        Object retValue = callMethod(klass, "remove", argTypes, term170812, args);
        assertTrue(recursiveEquals(term170812, term171196));
        assertTrue(recursiveEquals(term170888, term171197));
        assertTrue(recursiveEquals(retValue, null));
    }

};
