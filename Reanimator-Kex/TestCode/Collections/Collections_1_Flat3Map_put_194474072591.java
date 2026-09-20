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
import static org.apache.commons.collections.map.EqualityUtils.*;

public class Flat3Map_put_194474072591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17461;
     Object term17760;

    public Flat3Map_put_194474072591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17461 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term17461, term17461.getClass(), "delegateMap", null);
        term17760 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term17760, term17760.getClass(), "size", 1);
        setIntField(term17760, term17760.getClass(), "hash1", 0);
        setIntField(term17760, term17760.getClass(), "hash2", 0);
        setIntField(term17760, term17760.getClass(), "hash3", 0);
        setField(term17760, term17760.getClass(), "key1", null);
        setField(term17760, term17760.getClass(), "key2", null);
        setField(term17760, term17760.getClass(), "key3", null);
        setField(term17760, term17760.getClass(), "value1", null);
        setField(term17760, term17760.getClass(), "value2", null);
        setField(term17760, term17760.getClass(), "value3", null);
        setField(term17760, term17760.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term17461, args);
        assertTrue(recursiveEquals(term17461, term17760));
        assertTrue(recursiveEquals(retValue, null));
    }

};
