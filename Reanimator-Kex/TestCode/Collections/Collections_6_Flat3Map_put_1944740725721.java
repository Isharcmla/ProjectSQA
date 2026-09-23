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

public class Flat3Map_put_1944740725721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179905;
     Object term180199;

    public Flat3Map_put_1944740725721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179905 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term179997 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term180107 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term179905, term179905.getClass(), "delegateMap", null);
        setIntField(term179905, term179905.getClass(), "size", 3);
        setIntField(term179905, term179905.getClass(), "hash3", 0);
        setField(term179997, term179997.getClass(), "delegateMap", null);
        setIntField(term179997, term179997.getClass(), "size", 3);
        setIntField(term180107, term180107.getClass(), "size", 2);
        setField(term179997, term179997.getClass(), "key3", term180107);
        setField(term179997, term179997.getClass(), "key2", null);
        setField(term179997, term179997.getClass(), "value2", null);
        setIntField(term179997, term179997.getClass(), "hash3", 0);
        setField(term179905, term179905.getClass(), "key3", term179997);
        term180199 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term180291 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term180199, term180199.getClass(), "delegateMap", null);
        setIntField(term180199, term180199.getClass(), "size", 3);
        setIntField(term180199, term180199.getClass(), "hash3", 0);
        setField(term180199, term180199.getClass(), "value3", null);
        setIntField(term180199, term180199.getClass(), "hash2", 0);
        setField(term180199, term180199.getClass(), "value2", null);
        setIntField(term180199, term180199.getClass(), "hash1", 0);
        setField(term180199, term180199.getClass(), "value1", null);
        setField(term180199, term180199.getClass(), "key3", null);
        setField(term180291, term180291.getClass(), "delegateMap", null);
        setIntField(term180291, term180291.getClass(), "size", 2);
        setIntField(term180291, term180291.getClass(), "hash2", 0);
        setField(term180291, term180291.getClass(), "value2", null);
        setIntField(term180291, term180291.getClass(), "hash1", 0);
        setField(term180291, term180291.getClass(), "value1", null);
        setField(term180199, term180199.getClass(), "key2", term180291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term180199;
        args[1] = null;
        callMethod(klass, "put", argTypes, term179905, args);
    }

};


