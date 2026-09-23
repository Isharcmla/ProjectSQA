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

public class Flat3Map_put_1944740725692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162276;
     Object term162662;

    public Flat3Map_put_1944740725692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162276 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term162368 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term162460 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term162570 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term162276, term162276.getClass(), "delegateMap", null);
        setIntField(term162276, term162276.getClass(), "size", 3);
        setIntField(term162276, term162276.getClass(), "hash3", 0);
        setField(term162368, term162368.getClass(), "delegateMap", null);
        setIntField(term162368, term162368.getClass(), "size", 3);
        setField(term162460, term162460.getClass(), "delegateMap", null);
        setIntField(term162460, term162460.getClass(), "size", 0);
        setField(term162368, term162368.getClass(), "key3", term162460);
        setField(term162368, term162368.getClass(), "key2", null);
        setField(term162368, term162368.getClass(), "value2", null);
        setIntField(term162368, term162368.getClass(), "hash3", 0);
        setField(term162368, term162368.getClass(), "value3", term162570);
        setField(term162276, term162276.getClass(), "key3", term162368);
        setIntField(term162276, term162276.getClass(), "hash2", -1);
        setIntField(term162276, term162276.getClass(), "hash1", -1);
        term162662 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term162754 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term162662, term162662.getClass(), "delegateMap", null);
        setIntField(term162662, term162662.getClass(), "size", 3);
        setIntField(term162662, term162662.getClass(), "hash3", 0);
        setField(term162662, term162662.getClass(), "value3", null);
        setIntField(term162662, term162662.getClass(), "hash2", 0);
        setField(term162662, term162662.getClass(), "value2", null);
        setIntField(term162662, term162662.getClass(), "hash1", 0);
        setField(term162662, term162662.getClass(), "value1", null);
        setField(term162662, term162662.getClass(), "key3", null);
        setField(term162754, term162754.getClass(), "delegateMap", null);
        setIntField(term162754, term162754.getClass(), "size", 0);
        setField(term162662, term162662.getClass(), "key2", term162754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term162662;
        args[1] = null;
        callMethod(klass, "put", argTypes, term162276, args);
    }

};


