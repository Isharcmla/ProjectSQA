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

public class Flat3Map_put_1944740725766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193318;
     Object term193520;

    public Flat3Map_put_1944740725766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193318 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term193575 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term193575, term193575.getClass(), "size", 0);
        setField(term193318, term193318.getClass(), "delegateMap", term193575);
        setIntField(term193318, term193318.getClass(), "size", 3);
        setIntField(term193318, term193318.getClass(), "hash3", -1);
        setIntField(term193318, term193318.getClass(), "hash2", 0);
        setField(term193318, term193318.getClass(), "key2", null);
        setIntField(term193318, term193318.getClass(), "hash1", 0);
        setField(term193318, term193318.getClass(), "key1", term193318);
        term193520 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term193520, term193520.getClass(), "delegateMap", null);
        setIntField(term193520, term193520.getClass(), "size", 3);
        setIntField(term193520, term193520.getClass(), "hash3", 0);
        setField(term193520, term193520.getClass(), "value3", null);
        setIntField(term193520, term193520.getClass(), "hash2", 0);
        setField(term193520, term193520.getClass(), "value2", null);
        setIntField(term193520, term193520.getClass(), "hash1", 0);
        setField(term193520, term193520.getClass(), "value1", term193575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term193520;
        args[1] = null;
        callMethod(klass, "put", argTypes, term193318, args);
    }

};


