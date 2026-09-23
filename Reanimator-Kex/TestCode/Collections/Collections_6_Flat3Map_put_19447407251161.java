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

public class Flat3Map_put_19447407251161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356194;
     Object term356472;

    public Flat3Map_put_19447407251161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356194 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term356286 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term356380 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term356194, term356194.getClass(), "delegateMap", null);
        setIntField(term356194, term356194.getClass(), "size", 3);
        setIntField(term356194, term356194.getClass(), "hash3", 0);
        setField(term356194, term356194.getClass(), "key3", null);
        setIntField(term356194, term356194.getClass(), "hash2", 0);
        setField(term356194, term356194.getClass(), "key2", null);
        setIntField(term356194, term356194.getClass(), "hash1", 0);
        setIntField(term356380, term356380.getClass(), "size", 3);
        setField(term356286, term356286.getClass(), "delegateMap", term356380);
        setField(term356194, term356194.getClass(), "key1", term356286);
        term356472 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term356582 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term356472, term356472.getClass(), "delegateMap", null);
        setIntField(term356472, term356472.getClass(), "size", 3);
        setIntField(term356472, term356472.getClass(), "hash3", 0);
        setField(term356472, term356472.getClass(), "value3", null);
        setIntField(term356472, term356472.getClass(), "hash2", 0);
        setField(term356472, term356472.getClass(), "value2", null);
        setIntField(term356472, term356472.getClass(), "hash1", 0);
        setIntField(term356582, term356582.getClass(), "size", 0);
        setField(term356472, term356472.getClass(), "value1", term356582);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term356472;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term356194, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


