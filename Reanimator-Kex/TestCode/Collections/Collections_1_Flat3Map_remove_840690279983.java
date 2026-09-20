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

public class Flat3Map_remove_840690279983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197091;
     Object term197190;
     Object term197192;

    public Flat3Map_remove_840690279983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197091 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term197129 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setField(term197091, term197091.getClass(), "delegateMap", null);
        setIntField(term197091, term197091.getClass(), "size", 3);
        setIntField(term197091, term197091.getClass(), "hash3", 0);
        setField(term197091, term197091.getClass(), "value3", term197129);
        setIntField(term197091, term197091.getClass(), "hash2", 0);
        setField(term197091, term197091.getClass(), "value2", null);
        setIntField(term197091, term197091.getClass(), "hash1", 0);
        setField(term197091, term197091.getClass(), "value1", null);
        term197190 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term197191 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setIntField(term197190, term197190.getClass(), "size", 3);
        setIntField(term197190, term197190.getClass(), "hash1", 0);
        setIntField(term197190, term197190.getClass(), "hash2", 0);
        setIntField(term197190, term197190.getClass(), "hash3", 0);
        setField(term197190, term197190.getClass(), "key1", null);
        setField(term197190, term197190.getClass(), "key2", null);
        setField(term197190, term197190.getClass(), "key3", null);
        setField(term197190, term197190.getClass(), "value1", null);
        setField(term197190, term197190.getClass(), "value2", null);
        setField(term197191, term197191.getClass(), "this$1", null);
        setField(term197191, term197191.getClass(), "downstream", null);
        setField(term197190, term197190.getClass(), "value3", term197191);
        setField(term197190, term197190.getClass(), "delegateMap", null);
        term197192 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term197193 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setIntField(term197192, term197192.getClass(), "size", 3);
        setIntField(term197192, term197192.getClass(), "hash1", 0);
        setIntField(term197192, term197192.getClass(), "hash2", 0);
        setIntField(term197192, term197192.getClass(), "hash3", 0);
        setField(term197192, term197192.getClass(), "key1", null);
        setField(term197192, term197192.getClass(), "key2", null);
        setField(term197192, term197192.getClass(), "key3", null);
        setField(term197192, term197192.getClass(), "value1", null);
        setField(term197192, term197192.getClass(), "value2", null);
        setField(term197193, term197193.getClass(), "this$1", null);
        setField(term197193, term197193.getClass(), "downstream", null);
        setField(term197192, term197192.getClass(), "value3", term197193);
        setField(term197192, term197192.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term197091;
        Object retValue = callMethod(klass, "remove", argTypes, term197091, args);
        assertTrue(recursiveEquals(term197091, term197190));
        assertTrue(recursiveEquals(term197091, term197192));
        assertTrue(recursiveEquals(retValue, null));
    }

};
