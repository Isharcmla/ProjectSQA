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

public class Flat3Map_remove_8406902791052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209884;
     Object term210303;
     Object term210305;

    public Flat3Map_remove_8406902791052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209884 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term209922 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setField(term209884, term209884.getClass(), "delegateMap", null);
        setIntField(term209884, term209884.getClass(), "size", 3);
        setIntField(term209884, term209884.getClass(), "hash3", -1);
        setField(term209884, term209884.getClass(), "value3", term209922);
        setIntField(term209884, term209884.getClass(), "hash2", 0);
        setField(term209884, term209884.getClass(), "value2", null);
        setIntField(term209884, term209884.getClass(), "hash1", 0);
        setField(term209884, term209884.getClass(), "value1", null);
        term210303 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term210304 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setIntField(term210303, term210303.getClass(), "size", 3);
        setIntField(term210303, term210303.getClass(), "hash1", 0);
        setIntField(term210303, term210303.getClass(), "hash2", 0);
        setIntField(term210303, term210303.getClass(), "hash3", -1);
        setField(term210303, term210303.getClass(), "key1", null);
        setField(term210303, term210303.getClass(), "key2", null);
        setField(term210303, term210303.getClass(), "key3", null);
        setField(term210303, term210303.getClass(), "value1", null);
        setField(term210303, term210303.getClass(), "value2", null);
        setField(term210304, term210304.getClass(), "this$1", null);
        setField(term210304, term210304.getClass(), "downstream", null);
        setField(term210303, term210303.getClass(), "value3", term210304);
        setField(term210303, term210303.getClass(), "delegateMap", null);
        term210305 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term210306 = newInstance(Class.forName("java.util.stream.DoublePipeline$7$1"));
        setIntField(term210305, term210305.getClass(), "size", 3);
        setIntField(term210305, term210305.getClass(), "hash1", 0);
        setIntField(term210305, term210305.getClass(), "hash2", 0);
        setIntField(term210305, term210305.getClass(), "hash3", -1);
        setField(term210305, term210305.getClass(), "key1", null);
        setField(term210305, term210305.getClass(), "key2", null);
        setField(term210305, term210305.getClass(), "key3", null);
        setField(term210305, term210305.getClass(), "value1", null);
        setField(term210305, term210305.getClass(), "value2", null);
        setField(term210306, term210306.getClass(), "this$1", null);
        setField(term210306, term210306.getClass(), "downstream", null);
        setField(term210305, term210305.getClass(), "value3", term210306);
        setField(term210305, term210305.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term209884;
        Object retValue = callMethod(klass, "remove", argTypes, term209884, args);
        assertTrue(recursiveEquals(term209884, term210303));
        assertTrue(recursiveEquals(term209884, term210305));
        assertTrue(recursiveEquals(retValue, null));
    }

};
