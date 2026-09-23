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

public class Flat3Map_put_1944740725798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211362;
     Object term211730;

    public Flat3Map_put_1944740725798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211362 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term211454 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term211546 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term211638 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term211362, term211362.getClass(), "delegateMap", null);
        setIntField(term211362, term211362.getClass(), "size", 3);
        setIntField(term211362, term211362.getClass(), "hash3", 0);
        setField(term211454, term211454.getClass(), "delegateMap", null);
        setIntField(term211454, term211454.getClass(), "size", 3);
        setField(term211454, term211454.getClass(), "key3", term211546);
        setField(term211454, term211454.getClass(), "key2", term211638);
        setField(term211454, term211454.getClass(), "key1", null);
        setField(term211454, term211454.getClass(), "value1", null);
        setField(term211362, term211362.getClass(), "key3", term211454);
        term211730 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term211822 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term211730, term211730.getClass(), "delegateMap", null);
        setIntField(term211730, term211730.getClass(), "size", 3);
        setIntField(term211730, term211730.getClass(), "hash3", 0);
        setField(term211730, term211730.getClass(), "value3", null);
        setIntField(term211730, term211730.getClass(), "hash2", 0);
        setField(term211730, term211730.getClass(), "value2", null);
        setIntField(term211730, term211730.getClass(), "hash1", 0);
        setField(term211730, term211730.getClass(), "value1", null);
        setField(term211730, term211730.getClass(), "key3", null);
        setField(term211730, term211730.getClass(), "key2", term211822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term211730;
        args[1] = null;
        callMethod(klass, "put", argTypes, term211362, args);
    }

};


