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

public class Flat3Map_put_1944740725991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278030;
     Object term278526;

    public Flat3Map_put_1944740725991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278030 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term278122 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term278214 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term278324 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term278434 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term278030, term278030.getClass(), "delegateMap", null);
        setIntField(term278030, term278030.getClass(), "size", 3);
        setIntField(term278030, term278030.getClass(), "hash3", -1302035452);
        setField(term278122, term278122.getClass(), "delegateMap", null);
        setIntField(term278122, term278122.getClass(), "size", 3);
        setField(term278122, term278122.getClass(), "key3", term278214);
        setField(term278122, term278122.getClass(), "key2", null);
        setField(term278122, term278122.getClass(), "value2", null);
        setIntField(term278122, term278122.getClass(), "hash3", 151130180);
        setIntField(term278122, term278122.getClass(), "hash2", -937851904);
        setIntField(term278122, term278122.getClass(), "hash1", 753164288);
        setField(term278122, term278122.getClass(), "value3", null);
        setField(term278122, term278122.getClass(), "value1", null);
        setField(term278030, term278030.getClass(), "key3", term278122);
        setIntField(term278030, term278030.getClass(), "hash2", -1302035452);
        setField(term278030, term278030.getClass(), "key2", null);
        setIntField(term278030, term278030.getClass(), "hash1", -1302035452);
        setField(term278030, term278030.getClass(), "key1", null);
        setField(term278030, term278030.getClass(), "value3", term278324);
        setField(term278030, term278030.getClass(), "value2", term278434);
        setField(term278030, term278030.getClass(), "value1", null);
        term278526 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term278566 = newInstance(Class.forName("java.io.Console$1"));
        setField(term278526, term278526.getClass(), "delegateMap", null);
        setIntField(term278526, term278526.getClass(), "size", 3);
        setIntField(term278526, term278526.getClass(), "hash3", 111017988);
        setField(term278526, term278526.getClass(), "value3", null);
        setIntField(term278526, term278526.getClass(), "hash2", 537165824);
        setField(term278526, term278526.getClass(), "value2", null);
        setIntField(term278526, term278526.getClass(), "hash1", -1950219264);
        setField(term278526, term278526.getClass(), "value1", null);
        setField(term278526, term278526.getClass(), "key3", null);
        setField(term278526, term278526.getClass(), "key2", term278566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term278526;
        args[1] = null;
        callMethod(klass, "put", argTypes, term278030, args);
    }

};


