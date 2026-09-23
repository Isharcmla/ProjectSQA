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

public class Flat3Map_put_1944740725969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269194;
     Object term269470;

    public Flat3Map_put_1944740725969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269194 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term269286 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term269378 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term269194, term269194.getClass(), "delegateMap", null);
        setIntField(term269194, term269194.getClass(), "size", 3);
        setIntField(term269194, term269194.getClass(), "hash3", 0);
        setField(term269286, term269286.getClass(), "delegateMap", null);
        setIntField(term269286, term269286.getClass(), "size", 3);
        setField(term269286, term269286.getClass(), "key3", term269378);
        setField(term269286, term269286.getClass(), "key2", null);
        setField(term269286, term269286.getClass(), "value2", null);
        setField(term269194, term269194.getClass(), "key3", term269286);
        term269470 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term269552 = newInstance(Class.forName("java.lang.invoke.MethodHandleProxies$2"));
        setField(term269470, term269470.getClass(), "delegateMap", null);
        setIntField(term269470, term269470.getClass(), "size", 3);
        setIntField(term269470, term269470.getClass(), "hash3", 0);
        setField(term269470, term269470.getClass(), "value3", null);
        setIntField(term269470, term269470.getClass(), "hash2", 0);
        setField(term269470, term269470.getClass(), "value2", null);
        setIntField(term269470, term269470.getClass(), "hash1", 0);
        setField(term269470, term269470.getClass(), "value1", null);
        setField(term269470, term269470.getClass(), "key3", null);
        setField(term269470, term269470.getClass(), "key2", term269552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term269470;
        args[1] = null;
        callMethod(klass, "put", argTypes, term269194, args);
    }

};


