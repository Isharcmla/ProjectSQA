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

public class Flat3Map_put_19447407251185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370645;
     Object term370737;

    public Flat3Map_put_19447407251185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370645 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term370645, term370645.getClass(), "delegateMap", null);
        setIntField(term370645, term370645.getClass(), "size", 3);
        setIntField(term370645, term370645.getClass(), "hash3", 0);
        setField(term370645, term370645.getClass(), "key3", null);
        setIntField(term370645, term370645.getClass(), "hash2", 0);
        setField(term370645, term370645.getClass(), "key2", null);
        setIntField(term370645, term370645.getClass(), "hash1", -1);
        term370737 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term370831 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term370737, term370737.getClass(), "delegateMap", null);
        setIntField(term370737, term370737.getClass(), "size", 3);
        setIntField(term370737, term370737.getClass(), "hash3", 0);
        setField(term370737, term370737.getClass(), "value3", null);
        setIntField(term370737, term370737.getClass(), "hash2", 0);
        setIntField(term370831, term370831.getClass(), "size", 0);
        setField(term370737, term370737.getClass(), "value2", term370831);
        setIntField(term370737, term370737.getClass(), "hash1", 0);
        setField(term370737, term370737.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term370737;
        args[1] = null;
        callMethod(klass, "put", argTypes, term370645, args);
    }

};


