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

public class Flat3Map_put_1944740725722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180841;
     Object term181379;

    public Flat3Map_put_1944740725722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180841 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term180933 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term181027 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term181157 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term181195 = newInstance(Class.forName("java.lang.Object"));
        Object[] term180332 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term181287 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term180841, term180841.getClass(), "delegateMap", null);
        setIntField(term180841, term180841.getClass(), "size", 3);
        setIntField(term180841, term180841.getClass(), "hash3", -51638520);
        setField(term180933, term180933.getClass(), "delegateMap", null);
        setIntField(term180933, term180933.getClass(), "size", 3);
        setIntField(term181027, term181027.getClass(), "size", 0);
        setField(term180933, term180933.getClass(), "key3", term181027);
        setField(term180933, term180933.getClass(), "key2", null);
        setField(term180933, term180933.getClass(), "value2", null);
        setIntField(term180933, term180933.getClass(), "hash3", 1096990644);
        setIntField(term180933, term180933.getClass(), "hash2", 16778304);
        setIntField(term180933, term180933.getClass(), "hash1", 522190848);
        setField(term180933, term180933.getClass(), "key1", term181157);
        setField(term180933, term180933.getClass(), "value3", null);
        setField(term180933, term180933.getClass(), "value1", null);
        setField(term180841, term180841.getClass(), "key3", term180933);
        setIntField(term180841, term180841.getClass(), "hash2", -51638520);
        setField(term180841, term180841.getClass(), "key2", null);
        setIntField(term180841, term180841.getClass(), "hash1", -51638520);
        setField(term180841, term180841.getClass(), "key1", null);
        setField(term180841, term180841.getClass(), "value3", term181195);
        setField(term180841, term180841.getClass(), "value2", term180332);
        setField(term180841, term180841.getClass(), "value1", term181287);
        term181379 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term181471 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term181379, term181379.getClass(), "delegateMap", null);
        setIntField(term181379, term181379.getClass(), "size", 3);
        setIntField(term181379, term181379.getClass(), "hash3", 203292680);
        setField(term181379, term181379.getClass(), "value3", null);
        setIntField(term181379, term181379.getClass(), "hash2", -1564999680);
        setField(term181379, term181379.getClass(), "value2", null);
        setIntField(term181379, term181379.getClass(), "hash1", 1310068480);
        setField(term181379, term181379.getClass(), "value1", null);
        setField(term181379, term181379.getClass(), "key3", null);
        setField(term181471, term181471.getClass(), "delegateMap", null);
        setIntField(term181471, term181471.getClass(), "size", 2);
        setIntField(term181471, term181471.getClass(), "hash2", 16909338);
        setField(term181471, term181471.getClass(), "value2", null);
        setIntField(term181471, term181471.getClass(), "hash1", 549519552);
        setField(term181471, term181471.getClass(), "value1", null);
        setField(term181379, term181379.getClass(), "key2", term181471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term181379;
        args[1] = null;
        callMethod(klass, "put", argTypes, term180841, args);
    }

};


