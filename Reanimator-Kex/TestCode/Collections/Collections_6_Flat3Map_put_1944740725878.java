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
import java.util.HashMap;

public class Flat3Map_put_1944740725878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230227;
     Object term230749;

    public Flat3Map_put_1944740725878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term230657 = new HashMap();
        term230227 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term230319 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term230417 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        Object term230509 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term230609 = newInstance(Class.forName("org.apache.commons.collections.map.ReferenceMap"));
        setField(term230227, term230227.getClass(), "delegateMap", null);
        setIntField(term230227, term230227.getClass(), "size", 3);
        setIntField(term230227, term230227.getClass(), "hash3", 677731360);
        setField(term230227, term230227.getClass(), "key3", null);
        setIntField(term230227, term230227.getClass(), "hash2", 677731360);
        setField(term230227, term230227.getClass(), "key2", null);
        setIntField(term230227, term230227.getClass(), "hash1", 677731360);
        setIntField(term230417, term230417.getClass(), "size", 0);
        setField(term230319, term230319.getClass(), "delegateMap", term230417);
        setField(term230227, term230227.getClass(), "key1", term230319);
        setField(term230227, term230227.getClass(), "value3", term230509);
        setField(term230227, term230227.getClass(), "value2", term230609);
        setField(term230227, term230227.getClass(), "value1", term230657);
        term230749 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term230843 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term230749, term230749.getClass(), "delegateMap", null);
        setIntField(term230749, term230749.getClass(), "size", 3);
        setIntField(term230749, term230749.getClass(), "hash3", 710164480);
        setField(term230749, term230749.getClass(), "value3", null);
        setIntField(term230749, term230749.getClass(), "hash2", -1677656064);
        setField(term230749, term230749.getClass(), "value2", null);
        setIntField(term230749, term230749.getClass(), "hash1", 1645222944);
        setIntField(term230843, term230843.getClass(), "size", 0);
        setField(term230749, term230749.getClass(), "value1", term230843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term230749;
        args[1] = null;
        callMethod(klass, "put", argTypes, term230227, args);
    }

};


