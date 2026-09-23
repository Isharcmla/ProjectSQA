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

public class Flat3Map_put_1944740725146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25194;
     Object term25308;

    public Flat3Map_put_1944740725146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25194 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term25194, term25194.getClass(), "delegateMap", null);
        setIntField(term25194, term25194.getClass(), "size", 2);
        term25308 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term25308, term25308.getClass(), "size", 2);
        setIntField(term25308, term25308.getClass(), "hash1", 0);
        setIntField(term25308, term25308.getClass(), "hash2", 0);
        setIntField(term25308, term25308.getClass(), "hash3", 0);
        setField(term25308, term25308.getClass(), "key1", null);
        setField(term25308, term25308.getClass(), "key2", null);
        setField(term25308, term25308.getClass(), "key3", null);
        setField(term25308, term25308.getClass(), "value1", null);
        setField(term25308, term25308.getClass(), "value2", null);
        setField(term25308, term25308.getClass(), "value3", null);
        setField(term25308, term25308.getClass(), "delegateMap", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term25194, args);
        assertTrue(recursiveEquals(term25194, term25308));
        assertTrue(recursiveEquals(retValue, null));
    }

};


