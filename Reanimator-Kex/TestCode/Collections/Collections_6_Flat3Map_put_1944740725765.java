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

public class Flat3Map_put_1944740725765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192751;
     Object term193033;

    public Flat3Map_put_1944740725765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192751 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term192843 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term192941 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term192751, term192751.getClass(), "delegateMap", null);
        setIntField(term192751, term192751.getClass(), "size", 3);
        setIntField(term192751, term192751.getClass(), "hash3", 0);
        setField(term192751, term192751.getClass(), "key3", null);
        setIntField(term192751, term192751.getClass(), "hash2", 0);
        setField(term192751, term192751.getClass(), "key2", null);
        setIntField(term192751, term192751.getClass(), "hash1", 0);
        setIntField(term192941, term192941.getClass(), "size", 3);
        setField(term192843, term192843.getClass(), "delegateMap", term192941);
        setField(term192751, term192751.getClass(), "key1", term192843);
        term193033 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term193143 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term193033, term193033.getClass(), "delegateMap", null);
        setIntField(term193033, term193033.getClass(), "size", 3);
        setIntField(term193033, term193033.getClass(), "hash3", 0);
        setField(term193033, term193033.getClass(), "value3", null);
        setIntField(term193033, term193033.getClass(), "hash2", 0);
        setField(term193033, term193033.getClass(), "value2", null);
        setIntField(term193033, term193033.getClass(), "hash1", 0);
        setIntField(term193143, term193143.getClass(), "size", 0);
        setField(term193033, term193033.getClass(), "value1", term193143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term193033;
        args[1] = null;
        callMethod(klass, "put", argTypes, term192751, args);
    }

};


