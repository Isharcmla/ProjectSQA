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

public class Flat3Map_put_19447407251193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376404;
     Object term376680;

    public Flat3Map_put_19447407251193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376404 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term376496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term376588 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term376404, term376404.getClass(), "delegateMap", null);
        setIntField(term376404, term376404.getClass(), "size", 3);
        setIntField(term376404, term376404.getClass(), "hash3", 0);
        setField(term376496, term376496.getClass(), "delegateMap", null);
        setIntField(term376496, term376496.getClass(), "size", 3);
        setField(term376588, term376588.getClass(), "delegateMap", null);
        setIntField(term376588, term376588.getClass(), "size", 0);
        setField(term376496, term376496.getClass(), "key3", term376588);
        setField(term376496, term376496.getClass(), "key2", null);
        setField(term376496, term376496.getClass(), "value2", null);
        setIntField(term376496, term376496.getClass(), "hash3", 0);
        setField(term376496, term376496.getClass(), "value3", null);
        setField(term376404, term376404.getClass(), "key3", term376496);
        term376680 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term376772 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term376864 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term376680, term376680.getClass(), "delegateMap", null);
        setIntField(term376680, term376680.getClass(), "size", 3);
        setIntField(term376680, term376680.getClass(), "hash3", 1);
        setField(term376680, term376680.getClass(), "value3", null);
        setIntField(term376680, term376680.getClass(), "hash2", 0);
        setField(term376680, term376680.getClass(), "value2", null);
        setIntField(term376680, term376680.getClass(), "hash1", -1);
        setField(term376680, term376680.getClass(), "value1", null);
        setField(term376680, term376680.getClass(), "key3", null);
        setField(term376772, term376772.getClass(), "delegateMap", null);
        setIntField(term376772, term376772.getClass(), "size", 0);
        setField(term376680, term376680.getClass(), "key2", term376772);
        setField(term376864, term376864.getClass(), "delegateMap", null);
        setIntField(term376864, term376864.getClass(), "size", 1);
        setIntField(term376864, term376864.getClass(), "hash1", -1);
        setField(term376864, term376864.getClass(), "value1", null);
        setField(term376680, term376680.getClass(), "key1", term376864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term376680;
        args[1] = null;
        callMethod(klass, "put", argTypes, term376404, args);
    }

};


