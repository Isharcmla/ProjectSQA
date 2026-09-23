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
import java.lang.Object;

public class Flat3Map_put_1944740725891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235983;
     Object term236419;

    public Flat3Map_put_1944740725891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235983 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term236075 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term236113 = newInstance(Class.forName("java.lang.Object"));
        Object term236151 = newInstance(Class.forName("java.lang.Object"));
        Object term236189 = newInstance(Class.forName("java.lang.Object"));
        term236419 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term236465 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term235983, term235983.getClass(), "delegateMap", null);
        setIntField(term235983, term235983.getClass(), "size", 3);
        setIntField(term235983, term235983.getClass(), "hash3", 0);
        setField(term236075, term236075.getClass(), "delegateMap", null);
        setIntField(term236075, term236075.getClass(), "size", 3);
        setField(term236075, term236075.getClass(), "key3", term236113);
        setField(term236075, term236075.getClass(), "key2", null);
        setField(term236075, term236075.getClass(), "value2", null);
        setIntField(term236075, term236075.getClass(), "hash3", 0);
        setIntField(term236075, term236075.getClass(), "hash2", 0);
        setIntField(term236075, term236075.getClass(), "hash1", 0);
        setField(term236075, term236075.getClass(), "key1", term236151);
        setField(term235983, term235983.getClass(), "key3", term236075);
        setIntField(term235983, term235983.getClass(), "hash2", 0);
        setField(term235983, term235983.getClass(), "key2", term236189);
        setIntField(term235983, term235983.getClass(), "hash1", 0);
        setField(term236419, term236419.getClass(), "delegateMap", null);
        setIntField(term236419, term236419.getClass(), "size", 3);
        setIntField(term236419, term236419.getClass(), "hash3", 0);
        setField(term236419, term236419.getClass(), "value3", null);
        setIntField(term236419, term236419.getClass(), "hash2", 0);
        setField(term236419, term236419.getClass(), "value2", null);
        setIntField(term236419, term236419.getClass(), "hash1", 0);
        setField(term236419, term236419.getClass(), "value1", null);
        setField(term236419, term236419.getClass(), "key3", null);
        setField(term236465, term236465.getClass(), "delegateMap", null);
        setIntField(term236465, term236465.getClass(), "size", 2);
        setIntField(term236465, term236465.getClass(), "hash2", 0);
        setField(term236465, term236465.getClass(), "value2", null);
        setIntField(term236465, term236465.getClass(), "hash1", 0);
        setField(term236465, term236465.getClass(), "value1", null);
        setField(term236419, term236419.getClass(), "key2", term236465);
        setField(term235983, term235983.getClass(), "key1", term236419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term236419;
        args[1] = null;
        callMethod(klass, "put", argTypes, term235983, args);
    }

};


