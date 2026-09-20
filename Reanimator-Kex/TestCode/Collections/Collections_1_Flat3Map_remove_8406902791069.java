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

public class Flat3Map_remove_8406902791069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212196;
     Object term212288;
     Object term213027;
     Object term213028;

    public Flat3Map_remove_8406902791069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212196 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term212196, term212196.getClass(), "delegateMap", null);
        setIntField(term212196, term212196.getClass(), "size", 1);
        term212288 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212364 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        Object term212440 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setField(term212288, term212288.getClass(), "delegateMap", null);
        setIntField(term212288, term212288.getClass(), "size", 3);
        setIntField(term212288, term212288.getClass(), "hash3", 0);
        setField(term212288, term212288.getClass(), "value3", term212364);
        setIntField(term212288, term212288.getClass(), "hash2", 0);
        setField(term212288, term212288.getClass(), "value2", null);
        setIntField(term212288, term212288.getClass(), "hash1", 0);
        setField(term212288, term212288.getClass(), "value1", term212440);
        term213027 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term213027, term213027.getClass(), "size", 1);
        setIntField(term213027, term213027.getClass(), "hash1", 0);
        setIntField(term213027, term213027.getClass(), "hash2", 0);
        setIntField(term213027, term213027.getClass(), "hash3", 0);
        setField(term213027, term213027.getClass(), "key1", null);
        setField(term213027, term213027.getClass(), "key2", null);
        setField(term213027, term213027.getClass(), "key3", null);
        setField(term213027, term213027.getClass(), "value1", null);
        setField(term213027, term213027.getClass(), "value2", null);
        setField(term213027, term213027.getClass(), "value3", null);
        setField(term213027, term213027.getClass(), "delegateMap", null);
        term213028 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213029 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        Object term213030 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setIntField(term213028, term213028.getClass(), "size", 3);
        setIntField(term213028, term213028.getClass(), "hash1", 0);
        setIntField(term213028, term213028.getClass(), "hash2", 0);
        setIntField(term213028, term213028.getClass(), "hash3", 0);
        setField(term213028, term213028.getClass(), "key1", null);
        setField(term213028, term213028.getClass(), "key2", null);
        setField(term213028, term213028.getClass(), "key3", null);
        setField(term213029, term213029.getClass(), "this$1", null);
        setField(term213029, term213029.getClass(), "downstream", null);
        setField(term213028, term213028.getClass(), "value1", term213029);
        setField(term213028, term213028.getClass(), "value2", null);
        setField(term213030, term213030.getClass(), "this$1", null);
        setField(term213030, term213030.getClass(), "downstream", null);
        setField(term213028, term213028.getClass(), "value3", term213030);
        setField(term213028, term213028.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term212288;
        Object retValue = callMethod(klass, "remove", argTypes, term212196, args);
        assertTrue(recursiveEquals(term212196, term213027));
        assertTrue(recursiveEquals(term212288, term213028));
        assertTrue(recursiveEquals(retValue, null));
    }

};
