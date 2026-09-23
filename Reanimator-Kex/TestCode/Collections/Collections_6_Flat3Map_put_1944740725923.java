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

public class Flat3Map_put_1944740725923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247776;
     Object term247906;

    public Flat3Map_put_1944740725923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247776 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term248035 = newInstance(Class.forName("java.lang.Object"));
        setField(term247776, term247776.getClass(), "delegateMap", null);
        setIntField(term247776, term247776.getClass(), "size", 3);
        setIntField(term247776, term247776.getClass(), "hash3", 0);
        setField(term247776, term247776.getClass(), "key3", term248035);
        setIntField(term247776, term247776.getClass(), "hash2", 0);
        setField(term247776, term247776.getClass(), "key2", null);
        setIntField(term247776, term247776.getClass(), "hash1", 0);
        setField(term247776, term247776.getClass(), "key1", term247776);
        setField(term247776, term247776.getClass(), "value2", null);
        term247906 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term248016 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term247906, term247906.getClass(), "delegateMap", null);
        setIntField(term247906, term247906.getClass(), "size", 3);
        setIntField(term247906, term247906.getClass(), "hash3", 0);
        setField(term247906, term247906.getClass(), "value3", null);
        setIntField(term247906, term247906.getClass(), "hash2", 0);
        setIntField(term248016, term248016.getClass(), "size", 0);
        setField(term247906, term247906.getClass(), "value2", term248016);
        setIntField(term247906, term247906.getClass(), "hash1", 0);
        setField(term247906, term247906.getClass(), "value1", null);
        setField(term247906, term247906.getClass(), "key3", null);
        setField(term247906, term247906.getClass(), "key2", term248035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term247906;
        args[1] = null;
        callMethod(klass, "put", argTypes, term247776, args);
    }

};


