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

public class Flat3Map_equals_1826922527975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271756;
     Object term271972;

    public Flat3Map_equals_1826922527975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271756 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term271880 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueSpliterator"));
        setField(term271756, term271756.getClass(), "delegateMap", null);
        setIntField(term271756, term271756.getClass(), "size", 3);
        setField(term271756, term271756.getClass(), "key3", term271880);
        term271972 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term271972, term271972.getClass(), "delegateMap", null);
        setIntField(term271972, term271972.getClass(), "size", 3);
        setIntField(term271972, term271972.getClass(), "hash3", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term271972;
        callMethod(klass, "equals", argTypes, term271756, args);
    }

};


