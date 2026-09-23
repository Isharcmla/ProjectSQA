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

public class Flat3Map_put_1944740725767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193796;
     Object term194232;

    public Flat3Map_put_1944740725767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193796 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term193888 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term193926 = newInstance(Class.forName("java.lang.Object"));
        Object term193964 = newInstance(Class.forName("java.lang.Object"));
        Object term194002 = newInstance(Class.forName("java.lang.Object"));
        term194232 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term194278 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term193796, term193796.getClass(), "delegateMap", null);
        setIntField(term193796, term193796.getClass(), "size", 3);
        setIntField(term193796, term193796.getClass(), "hash3", 0);
        setField(term193888, term193888.getClass(), "delegateMap", null);
        setIntField(term193888, term193888.getClass(), "size", 3);
        setField(term193888, term193888.getClass(), "key3", term193926);
        setField(term193888, term193888.getClass(), "key2", null);
        setField(term193888, term193888.getClass(), "value2", null);
        setIntField(term193888, term193888.getClass(), "hash3", -1);
        setIntField(term193888, term193888.getClass(), "hash2", 0);
        setIntField(term193888, term193888.getClass(), "hash1", 0);
        setField(term193888, term193888.getClass(), "key1", term193964);
        setField(term193796, term193796.getClass(), "key3", term193888);
        setIntField(term193796, term193796.getClass(), "hash2", 0);
        setField(term193796, term193796.getClass(), "key2", term194002);
        setIntField(term193796, term193796.getClass(), "hash1", 0);
        setField(term194232, term194232.getClass(), "delegateMap", null);
        setIntField(term194232, term194232.getClass(), "size", 3);
        setIntField(term194232, term194232.getClass(), "hash3", 0);
        setField(term194232, term194232.getClass(), "value3", null);
        setIntField(term194232, term194232.getClass(), "hash2", 0);
        setField(term194232, term194232.getClass(), "value2", null);
        setIntField(term194232, term194232.getClass(), "hash1", 0);
        setField(term194232, term194232.getClass(), "value1", null);
        setField(term194232, term194232.getClass(), "key3", null);
        setField(term194278, term194278.getClass(), "delegateMap", null);
        setIntField(term194278, term194278.getClass(), "size", 0);
        setField(term194232, term194232.getClass(), "key2", term194278);
        setField(term193796, term193796.getClass(), "key1", term194232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term194232;
        args[1] = null;
        callMethod(klass, "put", argTypes, term193796, args);
    }

};


