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

public class Flat3Map_put_1944740725955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263938;
     Object term264160;

    public Flat3Map_put_1944740725955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263938 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term263976 = newInstance(Class.forName("java.lang.Object"));
        Object term264206 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term263938, term263938.getClass(), "delegateMap", null);
        setIntField(term263938, term263938.getClass(), "size", 3);
        setIntField(term263938, term263938.getClass(), "hash3", 0);
        setField(term263938, term263938.getClass(), "key3", term263976);
        setField(term263938, term263938.getClass(), "key2", null);
        setField(term263938, term263938.getClass(), "value2", null);
        setIntField(term263938, term263938.getClass(), "hash2", 0);
        setIntField(term263938, term263938.getClass(), "hash1", 0);
        setField(term264206, term264206.getClass(), "delegateMap", null);
        setIntField(term264206, term264206.getClass(), "size", 2);
        setIntField(term264206, term264206.getClass(), "hash2", 0);
        setField(term264206, term264206.getClass(), "value2", null);
        setIntField(term264206, term264206.getClass(), "hash1", 0);
        setField(term264206, term264206.getClass(), "value1", null);
        setField(term263938, term263938.getClass(), "key1", term264206);
        term264160 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term264160, term264160.getClass(), "delegateMap", null);
        setIntField(term264160, term264160.getClass(), "size", 3);
        setIntField(term264160, term264160.getClass(), "hash3", 0);
        setField(term264160, term264160.getClass(), "value3", null);
        setIntField(term264160, term264160.getClass(), "hash2", 0);
        setField(term264160, term264160.getClass(), "value2", null);
        setIntField(term264160, term264160.getClass(), "hash1", 0);
        setField(term264160, term264160.getClass(), "value1", null);
        setField(term264160, term264160.getClass(), "key3", null);
        setField(term264160, term264160.getClass(), "key2", term264206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term264160;
        args[1] = null;
        callMethod(klass, "put", argTypes, term263938, args);
    }

};


