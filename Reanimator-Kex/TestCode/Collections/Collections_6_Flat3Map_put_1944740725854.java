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

public class Flat3Map_put_1944740725854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222957;
     Object term223049;

    public Flat3Map_put_1944740725854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222957 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term222957, term222957.getClass(), "delegateMap", null);
        setIntField(term222957, term222957.getClass(), "size", 2);
        setIntField(term222957, term222957.getClass(), "hash2", 0);
        setField(term222957, term222957.getClass(), "key2", null);
        setIntField(term222957, term222957.getClass(), "hash1", 0);
        setField(term222957, term222957.getClass(), "key1", term222957);
        term223049 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term223159 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term223049, term223049.getClass(), "delegateMap", null);
        setIntField(term223049, term223049.getClass(), "size", 2);
        setIntField(term223049, term223049.getClass(), "hash2", 0);
        setField(term223049, term223049.getClass(), "value2", null);
        setIntField(term223049, term223049.getClass(), "hash1", 0);
        setIntField(term223159, term223159.getClass(), "size", 0);
        setField(term223049, term223049.getClass(), "value1", term223159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term223049;
        args[1] = null;
        callMethod(klass, "put", argTypes, term222957, args);
    }

};


