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

public class Flat3Map_put_19447407251202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381920;
     Object term382586;

    public Flat3Map_put_19447407251202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381920 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term382012 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term382050 = newInstance(Class.forName("java.lang.Object"));
        Object term382142 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term382234 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term382326 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term382364 = newInstance(Class.forName("java.lang.Object"));
        Object term382494 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term381920, term381920.getClass(), "delegateMap", null);
        setIntField(term381920, term381920.getClass(), "size", 3);
        setIntField(term381920, term381920.getClass(), "hash3", 918258272);
        setField(term382012, term382012.getClass(), "delegateMap", null);
        setIntField(term382012, term382012.getClass(), "size", 3);
        setField(term382012, term382012.getClass(), "key3", term382050);
        setField(term382012, term382012.getClass(), "key2", null);
        setField(term382142, term382142.getClass(), "delegateMap", null);
        setIntField(term382142, term382142.getClass(), "size", 0);
        setField(term382012, term382012.getClass(), "value2", term382142);
        setIntField(term382012, term382012.getClass(), "hash3", 341901312);
        setField(term382012, term382012.getClass(), "value3", null);
        setIntField(term382012, term382012.getClass(), "hash2", 2065596416);
        setIntField(term382012, term382012.getClass(), "hash1", 1887469568);
        setField(term382012, term382012.getClass(), "value1", null);
        setField(term381920, term381920.getClass(), "key3", term382012);
        setIntField(term381920, term381920.getClass(), "hash2", 918258272);
        setField(term382234, term382234.getClass(), "delegateMap", null);
        setIntField(term382234, term382234.getClass(), "size", -4);
        setField(term381920, term381920.getClass(), "key2", term382234);
        setIntField(term381920, term381920.getClass(), "hash1", -918258273);
        setField(term381920, term381920.getClass(), "value3", term382326);
        setField(term381920, term381920.getClass(), "value2", term382364);
        setField(term381920, term381920.getClass(), "key1", null);
        setField(term381920, term381920.getClass(), "value1", term382494);
        term382586 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term382586, term382586.getClass(), "delegateMap", null);
        setIntField(term382586, term382586.getClass(), "size", 3);
        setIntField(term382586, term382586.getClass(), "hash3", -2046813600);
        setField(term382586, term382586.getClass(), "value3", null);
        setIntField(term382586, term382586.getClass(), "hash2", 279992320);
        setField(term382586, term382586.getClass(), "value2", null);
        setIntField(term382586, term382586.getClass(), "hash1", -1609887744);
        setField(term382586, term382586.getClass(), "value1", null);
        setField(term382586, term382586.getClass(), "key3", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term382586;
        args[1] = null;
        callMethod(klass, "put", argTypes, term381920, args);
    }

};


