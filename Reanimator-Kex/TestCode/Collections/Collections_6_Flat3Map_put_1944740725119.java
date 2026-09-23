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

public class Flat3Map_put_1944740725119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21884;
     Object term21976;
     Object term22003;
     Object term22005;

    public Flat3Map_put_1944740725119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21884 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term21884, term21884.getClass(), "delegateMap", null);
        term21976 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term22003 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term22004 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term22003, term22003.getClass(), "size", 1);
        setIntField(term22003, term22003.getClass(), "hash1", 0);
        setIntField(term22003, term22003.getClass(), "hash2", 0);
        setIntField(term22003, term22003.getClass(), "hash3", 0);
        setIntField(term22004, term22004.getClass(), "size", 0);
        setIntField(term22004, term22004.getClass(), "hash1", 0);
        setIntField(term22004, term22004.getClass(), "hash2", 0);
        setIntField(term22004, term22004.getClass(), "hash3", 0);
        setField(term22004, term22004.getClass(), "key1", null);
        setField(term22004, term22004.getClass(), "key2", null);
        setField(term22004, term22004.getClass(), "key3", null);
        setField(term22004, term22004.getClass(), "value1", null);
        setField(term22004, term22004.getClass(), "value2", null);
        setField(term22004, term22004.getClass(), "value3", null);
        setField(term22004, term22004.getClass(), "delegateMap", null);
        setField(term22003, term22003.getClass(), "key1", term22004);
        setField(term22003, term22003.getClass(), "key2", null);
        setField(term22003, term22003.getClass(), "key3", null);
        setField(term22003, term22003.getClass(), "value1", null);
        setField(term22003, term22003.getClass(), "value2", null);
        setField(term22003, term22003.getClass(), "value3", null);
        setField(term22003, term22003.getClass(), "delegateMap", null);
        term22005 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term22005, term22005.getClass(), "size", 0);
        setIntField(term22005, term22005.getClass(), "hash1", 0);
        setIntField(term22005, term22005.getClass(), "hash2", 0);
        setIntField(term22005, term22005.getClass(), "hash3", 0);
        setField(term22005, term22005.getClass(), "key1", null);
        setField(term22005, term22005.getClass(), "key2", null);
        setField(term22005, term22005.getClass(), "key3", null);
        setField(term22005, term22005.getClass(), "value1", null);
        setField(term22005, term22005.getClass(), "value2", null);
        setField(term22005, term22005.getClass(), "value3", null);
        setField(term22005, term22005.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term21976;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term21884, args);
        assertTrue(recursiveEquals(term21884, term22003));
        assertTrue(recursiveEquals(term21976, term22005));
        assertTrue(recursiveEquals(retValue, null));
    }

};


