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
import java.lang.Object;

public class Flat3Map_put_1944740725970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268668;
     Object term268928;

    public Flat3Map_put_1944740725970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268668 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term268760 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term268798 = newInstance(Class.forName("java.lang.Object"));
        Object term268836 = newInstance(Class.forName("java.lang.Object"));
        setField(term268668, term268668.getClass(), "delegateMap", null);
        setIntField(term268668, term268668.getClass(), "size", 3);
        setIntField(term268668, term268668.getClass(), "hash3", 0);
        setField(term268760, term268760.getClass(), "delegateMap", null);
        setIntField(term268760, term268760.getClass(), "size", 3);
        setField(term268760, term268760.getClass(), "key3", term268798);
        setField(term268760, term268760.getClass(), "key2", null);
        setField(term268760, term268760.getClass(), "value2", null);
        setIntField(term268760, term268760.getClass(), "hash3", 0);
        setIntField(term268760, term268760.getClass(), "hash2", 0);
        setIntField(term268760, term268760.getClass(), "hash1", 0);
        setField(term268760, term268760.getClass(), "key1", term268836);
        setField(term268668, term268668.getClass(), "key3", term268760);
        setIntField(term268668, term268668.getClass(), "hash2", -1);
        term268928 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term269020 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term268928, term268928.getClass(), "delegateMap", null);
        setIntField(term268928, term268928.getClass(), "size", 3);
        setIntField(term268928, term268928.getClass(), "hash3", 0);
        setField(term268928, term268928.getClass(), "value3", null);
        setIntField(term268928, term268928.getClass(), "hash2", 0);
        setField(term268928, term268928.getClass(), "value2", null);
        setIntField(term268928, term268928.getClass(), "hash1", 0);
        setField(term268928, term268928.getClass(), "value1", null);
        setField(term268928, term268928.getClass(), "key3", null);
        setField(term269020, term269020.getClass(), "delegateMap", null);
        setIntField(term269020, term269020.getClass(), "size", 2);
        setIntField(term269020, term269020.getClass(), "hash2", 0);
        setField(term269020, term269020.getClass(), "value2", null);
        setIntField(term269020, term269020.getClass(), "hash1", 0);
        setField(term269020, term269020.getClass(), "value1", null);
        setField(term268928, term268928.getClass(), "key2", term269020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term268928;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term268668, args);
        assertTrue(recursiveEquals(term268928, 12));
        assertTrue(recursiveEquals(retValue, null));
    }

};


