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

public class Flat3Map_put_19447407251127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337714;
     Object term338010;

    public Flat3Map_put_19447407251127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337714 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term337806 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term337918 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term337714, term337714.getClass(), "delegateMap", null);
        setIntField(term337714, term337714.getClass(), "size", 3);
        setIntField(term337714, term337714.getClass(), "hash3", 0);
        setField(term337714, term337714.getClass(), "key3", null);
        setIntField(term337714, term337714.getClass(), "hash2", 0);
        setField(term337714, term337714.getClass(), "key2", null);
        setIntField(term337714, term337714.getClass(), "hash1", 0);
        setIntField(term337918, term337918.getClass(), "size", 3);
        setField(term337806, term337806.getClass(), "delegateMap", term337918);
        setField(term337714, term337714.getClass(), "key1", term337806);
        term338010 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term338120 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term338010, term338010.getClass(), "delegateMap", null);
        setIntField(term338010, term338010.getClass(), "size", 3);
        setIntField(term338010, term338010.getClass(), "hash3", 0);
        setField(term338010, term338010.getClass(), "value3", null);
        setIntField(term338010, term338010.getClass(), "hash2", 0);
        setField(term338010, term338010.getClass(), "value2", null);
        setIntField(term338010, term338010.getClass(), "hash1", 0);
        setIntField(term338120, term338120.getClass(), "size", 0);
        setField(term338010, term338010.getClass(), "value1", term338120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term338010;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term337714, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


