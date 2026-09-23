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

public class Flat3Map_put_1944740725799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212019;
     Object term212381;

    public Flat3Map_put_1944740725799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212019 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212111 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212203 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term212381 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212401 = newInstance(Class.forName("java.io.Console$1"));
        setField(term212019, term212019.getClass(), "delegateMap", null);
        setIntField(term212019, term212019.getClass(), "size", 3);
        setIntField(term212019, term212019.getClass(), "hash3", 0);
        setField(term212111, term212111.getClass(), "delegateMap", null);
        setIntField(term212111, term212111.getClass(), "size", 3);
        setField(term212111, term212111.getClass(), "key3", term212203);
        setField(term212111, term212111.getClass(), "key2", null);
        setField(term212111, term212111.getClass(), "value2", null);
        setIntField(term212111, term212111.getClass(), "hash3", -1);
        setIntField(term212111, term212111.getClass(), "hash2", -1);
        setIntField(term212111, term212111.getClass(), "hash1", -1);
        setField(term212019, term212019.getClass(), "key3", term212111);
        setIntField(term212019, term212019.getClass(), "hash2", -1);
        setIntField(term212019, term212019.getClass(), "hash1", 0);
        setField(term212381, term212381.getClass(), "delegateMap", null);
        setIntField(term212381, term212381.getClass(), "size", 3);
        setIntField(term212381, term212381.getClass(), "hash3", 0);
        setField(term212381, term212381.getClass(), "value3", null);
        setIntField(term212381, term212381.getClass(), "hash2", 0);
        setField(term212381, term212381.getClass(), "value2", null);
        setIntField(term212381, term212381.getClass(), "hash1", 0);
        setField(term212381, term212381.getClass(), "value1", null);
        setField(term212381, term212381.getClass(), "key3", null);
        setField(term212381, term212381.getClass(), "key2", term212401);
        setField(term212019, term212019.getClass(), "key1", term212381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term212381;
        args[1] = null;
        callMethod(klass, "put", argTypes, term212019, args);
    }

};


