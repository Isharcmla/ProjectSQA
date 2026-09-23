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

public class Flat3Map_put_1944740725389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67767;
     Object term67836;
     Object term67838;

    public Flat3Map_put_1944740725389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67767 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term67802 = newInstance(Class.forName("java.util.stream.IntPipeline$1$1"));
        setField(term67767, term67767.getClass(), "delegateMap", null);
        setIntField(term67767, term67767.getClass(), "size", 1);
        setIntField(term67767, term67767.getClass(), "hash1", 0);
        setField(term67767, term67767.getClass(), "value1", term67802);
        term67836 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term67837 = newInstance(Class.forName("java.util.stream.IntPipeline$1$1"));
        setIntField(term67836, term67836.getClass(), "size", 2);
        setIntField(term67836, term67836.getClass(), "hash1", 0);
        setIntField(term67836, term67836.getClass(), "hash2", 843561255);
        setIntField(term67836, term67836.getClass(), "hash3", 0);
        setField(term67836, term67836.getClass(), "key1", null);
        setField(term67836, term67836.getClass(), "key2", term67836);
        setField(term67836, term67836.getClass(), "key3", null);
        setField(term67837, term67837.getClass(), "this$1", null);
        setField(term67837, term67837.getClass(), "downstream", null);
        setField(term67836, term67836.getClass(), "value1", term67837);
        setField(term67836, term67836.getClass(), "value2", null);
        setField(term67836, term67836.getClass(), "value3", null);
        setField(term67836, term67836.getClass(), "delegateMap", null);
        term67838 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term67839 = newInstance(Class.forName("java.util.stream.IntPipeline$1$1"));
        setIntField(term67838, term67838.getClass(), "size", 2);
        setIntField(term67838, term67838.getClass(), "hash1", 0);
        setIntField(term67838, term67838.getClass(), "hash2", 843561255);
        setIntField(term67838, term67838.getClass(), "hash3", 0);
        setField(term67838, term67838.getClass(), "key1", null);
        setField(term67838, term67838.getClass(), "key2", term67838);
        setField(term67838, term67838.getClass(), "key3", null);
        setField(term67839, term67839.getClass(), "this$1", null);
        setField(term67839, term67839.getClass(), "downstream", null);
        setField(term67838, term67838.getClass(), "value1", term67839);
        setField(term67838, term67838.getClass(), "value2", null);
        setField(term67838, term67838.getClass(), "value3", null);
        setField(term67838, term67838.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term67767;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term67767, args);
        assertTrue(recursiveEquals(term67767, term67836));
        assertTrue(recursiveEquals(term67767, term67838));
        assertTrue(recursiveEquals(retValue, null));
    }

};


