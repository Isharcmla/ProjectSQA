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
import java.util.HashMap;

public class Flat3Map_put_1944740725777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200203;
     Object term200435;

    public Flat3Map_put_1944740725777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term200343 = new HashMap();
        term200203 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term200295 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term200203, term200203.getClass(), "delegateMap", null);
        setIntField(term200203, term200203.getClass(), "size", 3);
        setIntField(term200203, term200203.getClass(), "hash3", 1987740177);
        setField(term200295, term200295.getClass(), "delegateMap", null);
        setIntField(term200295, term200295.getClass(), "size", 0);
        setField(term200203, term200203.getClass(), "key3", term200295);
        setIntField(term200203, term200203.getClass(), "hash2", 1987740177);
        setField(term200203, term200203.getClass(), "key2", null);
        setIntField(term200203, term200203.getClass(), "hash1", 1987740177);
        setField(term200203, term200203.getClass(), "key1", null);
        setField(term200203, term200203.getClass(), "value3", null);
        setField(term200203, term200203.getClass(), "value2", term200343);
        setField(term200203, term200203.getClass(), "value1", term200295);
        term200435 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term200435, term200435.getClass(), "delegateMap", null);
        setIntField(term200435, term200435.getClass(), "size", 3);
        setIntField(term200435, term200435.getClass(), "hash3", 938213440);
        setField(term200435, term200435.getClass(), "value3", null);
        setIntField(term200435, term200435.getClass(), "hash2", 646316448);
        setField(term200435, term200435.getClass(), "value2", null);
        setIntField(term200435, term200435.getClass(), "hash1", 403210289);
        setField(term200435, term200435.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term200435;
        args[1] = null;
        callMethod(klass, "put", argTypes, term200203, args);
    }

};


