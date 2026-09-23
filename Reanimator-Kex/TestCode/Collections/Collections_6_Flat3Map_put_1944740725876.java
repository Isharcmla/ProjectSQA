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

public class Flat3Map_put_1944740725876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229508;
     Object term229694;

    public Flat3Map_put_1944740725876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229508 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term229602 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term229508, term229508.getClass(), "delegateMap", term229602);
        setIntField(term229508, term229508.getClass(), "size", 3);
        setIntField(term229508, term229508.getClass(), "hash3", 0);
        setField(term229508, term229508.getClass(), "key3", null);
        setIntField(term229508, term229508.getClass(), "hash2", 0);
        setField(term229508, term229508.getClass(), "key2", null);
        setIntField(term229508, term229508.getClass(), "hash1", 0);
        setField(term229508, term229508.getClass(), "key1", term229508);
        term229694 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term229804 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term229694, term229694.getClass(), "delegateMap", null);
        setIntField(term229694, term229694.getClass(), "size", 3);
        setIntField(term229694, term229694.getClass(), "hash3", 0);
        setField(term229694, term229694.getClass(), "value3", null);
        setIntField(term229694, term229694.getClass(), "hash2", 0);
        setField(term229694, term229694.getClass(), "value2", null);
        setIntField(term229694, term229694.getClass(), "hash1", 0);
        setIntField(term229804, term229804.getClass(), "size", 0);
        setField(term229694, term229694.getClass(), "value1", term229804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term229694;
        args[1] = null;
        callMethod(klass, "put", argTypes, term229508, args);
    }

};


