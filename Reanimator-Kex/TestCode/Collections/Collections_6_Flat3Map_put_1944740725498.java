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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_put_1944740725498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92984;

    public Flat3Map_put_1944740725498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92984 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term93030 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term93085 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term92984, term92984.getClass(), "delegateMap", null);
        setIntField(term92984, term92984.getClass(), "size", 3);
        setIntField(term92984, term92984.getClass(), "hash3", 0);
        setField(term92984, term92984.getClass(), "value3", null);
        setIntField(term92984, term92984.getClass(), "hash2", 0);
        setField(term92984, term92984.getClass(), "value2", null);
        setIntField(term92984, term92984.getClass(), "hash1", -1);
        setField(term92984, term92984.getClass(), "value1", null);
        setIntField(term93085, term93085.getClass(), "size", -4);
        setField(term93030, term93030.getClass(), "delegateMap", term93085);
        setField(term92984, term92984.getClass(), "key3", term93030);
        setField(term92984, term92984.getClass(), "key2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term92984;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term92984, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


