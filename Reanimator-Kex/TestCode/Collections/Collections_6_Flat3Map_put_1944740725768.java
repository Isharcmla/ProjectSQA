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

public class Flat3Map_put_1944740725768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194464;

    public Flat3Map_put_1944740725768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194464 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term194464, term194464.getClass(), "delegateMap", null);
        setIntField(term194464, term194464.getClass(), "size", 3);
        setIntField(term194464, term194464.getClass(), "hash3", -1);
        setField(term194464, term194464.getClass(), "value3", null);
        setIntField(term194464, term194464.getClass(), "hash2", -1);
        setField(term194464, term194464.getClass(), "value2", null);
        setIntField(term194464, term194464.getClass(), "hash1", 0);
        setField(term194464, term194464.getClass(), "value1", null);
        setField(term194464, term194464.getClass(), "key1", term194464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term194464;
        args[1] = null;
        callMethod(klass, "put", argTypes, term194464, args);
    }

};


