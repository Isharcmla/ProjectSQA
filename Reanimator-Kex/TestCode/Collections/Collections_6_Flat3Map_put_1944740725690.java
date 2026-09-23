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

public class Flat3Map_put_1944740725690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161439;
     Object term161569;

    public Flat3Map_put_1944740725690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161439 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term161477 = newInstance(Class.forName("java.lang.Object"));
        setField(term161439, term161439.getClass(), "delegateMap", null);
        setIntField(term161439, term161439.getClass(), "size", 3);
        setIntField(term161439, term161439.getClass(), "hash3", 0);
        setField(term161439, term161439.getClass(), "key3", term161477);
        setField(term161439, term161439.getClass(), "key2", term161477);
        term161569 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term161679 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term161569, term161569.getClass(), "delegateMap", null);
        setIntField(term161569, term161569.getClass(), "size", 3);
        setIntField(term161569, term161569.getClass(), "hash3", 0);
        setField(term161569, term161569.getClass(), "value3", null);
        setIntField(term161569, term161569.getClass(), "hash2", 0);
        setIntField(term161679, term161679.getClass(), "size", 0);
        setField(term161569, term161569.getClass(), "value2", term161679);
        setIntField(term161569, term161569.getClass(), "hash1", 0);
        setField(term161569, term161569.getClass(), "value1", null);
        setField(term161569, term161569.getClass(), "key3", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term161569;
        args[1] = null;
        callMethod(klass, "put", argTypes, term161439, args);
    }

};


