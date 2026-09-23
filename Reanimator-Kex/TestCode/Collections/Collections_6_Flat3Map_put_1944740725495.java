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

public class Flat3Map_put_1944740725495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92194;
     Object term92569;
     Object term92571;

    public Flat3Map_put_1944740725495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92194 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term92229 = newInstance(Class.forName("java.util.stream.IntPipeline$1$1"));
        setField(term92194, term92194.getClass(), "delegateMap", null);
        setIntField(term92194, term92194.getClass(), "size", 1);
        setIntField(term92194, term92194.getClass(), "hash1", 0);
        setField(term92194, term92194.getClass(), "value1", term92229);
        term92569 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term92570 = newInstance(Class.forName("java.util.stream.IntPipeline$1$1"));
        setIntField(term92569, term92569.getClass(), "size", 2);
        setIntField(term92569, term92569.getClass(), "hash1", 0);
        setIntField(term92569, term92569.getClass(), "hash2", 683807593);
        setIntField(term92569, term92569.getClass(), "hash3", 0);
        setField(term92569, term92569.getClass(), "key1", null);
        setField(term92569, term92569.getClass(), "key2", term92569);
        setField(term92569, term92569.getClass(), "key3", null);
        setField(term92570, term92570.getClass(), "this$1", null);
        setField(term92570, term92570.getClass(), "downstream", null);
        setField(term92569, term92569.getClass(), "value1", term92570);
        setField(term92569, term92569.getClass(), "value2", null);
        setField(term92569, term92569.getClass(), "value3", null);
        setField(term92569, term92569.getClass(), "delegateMap", null);
        term92571 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term92572 = newInstance(Class.forName("java.util.stream.IntPipeline$1$1"));
        setIntField(term92571, term92571.getClass(), "size", 2);
        setIntField(term92571, term92571.getClass(), "hash1", 0);
        setIntField(term92571, term92571.getClass(), "hash2", 683807593);
        setIntField(term92571, term92571.getClass(), "hash3", 0);
        setField(term92571, term92571.getClass(), "key1", null);
        setField(term92571, term92571.getClass(), "key2", term92571);
        setField(term92571, term92571.getClass(), "key3", null);
        setField(term92572, term92572.getClass(), "this$1", null);
        setField(term92572, term92572.getClass(), "downstream", null);
        setField(term92571, term92571.getClass(), "value1", term92572);
        setField(term92571, term92571.getClass(), "value2", null);
        setField(term92571, term92571.getClass(), "value3", null);
        setField(term92571, term92571.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term92194;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term92194, args);
        assertTrue(recursiveEquals(term92194, term92569));
        assertTrue(recursiveEquals(term92194, term92571));
        assertTrue(recursiveEquals(retValue, null));
    }

};


