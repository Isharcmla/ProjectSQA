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

public class Flat3Map_put_1944740725848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220746;
     Object term221040;

    public Flat3Map_put_1944740725848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220746 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term221086 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term221141 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term220746, term220746.getClass(), "delegateMap", null);
        setIntField(term220746, term220746.getClass(), "size", 3);
        setIntField(term220746, term220746.getClass(), "hash3", 0);
        setField(term221086, term221086.getClass(), "delegateMap", null);
        setIntField(term221086, term221086.getClass(), "size", 2);
        setField(term221086, term221086.getClass(), "key3", term221141);
        setField(term221086, term221086.getClass(), "key2", null);
        setField(term221086, term221086.getClass(), "value2", null);
        setIntField(term221086, term221086.getClass(), "hash2", 0);
        setIntField(term221086, term221086.getClass(), "hash1", -1);
        setField(term221086, term221086.getClass(), "value1", null);
        setIntField(term221086, term221086.getClass(), "hash3", -1);
        setField(term220746, term220746.getClass(), "key3", term221086);
        term221040 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term221040, term221040.getClass(), "delegateMap", null);
        setIntField(term221040, term221040.getClass(), "size", 3);
        setIntField(term221040, term221040.getClass(), "hash3", 0);
        setField(term221040, term221040.getClass(), "value3", null);
        setIntField(term221040, term221040.getClass(), "hash2", 0);
        setField(term221040, term221040.getClass(), "value2", null);
        setIntField(term221040, term221040.getClass(), "hash1", 0);
        setField(term221040, term221040.getClass(), "value1", null);
        setField(term221040, term221040.getClass(), "key3", null);
        setField(term221040, term221040.getClass(), "key2", term221086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term221040;
        args[1] = null;
        callMethod(klass, "put", argTypes, term220746, args);
    }

};


