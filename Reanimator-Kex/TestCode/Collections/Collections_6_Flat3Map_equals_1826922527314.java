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
import java.util.HashMap;

public class Flat3Map_equals_1826922527314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52403;
     Object term52495;
     Object term52877;
     Object term52878;

    public Flat3Map_equals_1826922527314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52403 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term52403, term52403.getClass(), "delegateMap", null);
        setIntField(term52403, term52403.getClass(), "size", 3);
        setField(term52403, term52403.getClass(), "key3", null);
        HashMap term52543 = new HashMap();
        term52495 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term52495, term52495.getClass(), "delegateMap", null);
        setIntField(term52495, term52495.getClass(), "size", 3);
        setField(term52495, term52495.getClass(), "key3", term52543);
        term52877 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term52877, term52877.getClass(), "size", 3);
        setIntField(term52877, term52877.getClass(), "hash1", 0);
        setIntField(term52877, term52877.getClass(), "hash2", 0);
        setIntField(term52877, term52877.getClass(), "hash3", 0);
        setField(term52877, term52877.getClass(), "key1", null);
        setField(term52877, term52877.getClass(), "key2", null);
        setField(term52877, term52877.getClass(), "key3", null);
        setField(term52877, term52877.getClass(), "value1", null);
        setField(term52877, term52877.getClass(), "value2", null);
        setField(term52877, term52877.getClass(), "value3", null);
        setField(term52877, term52877.getClass(), "delegateMap", null);
        HashMap term52879 = new HashMap();
        term52878 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term52878, term52878.getClass(), "size", 3);
        setIntField(term52878, term52878.getClass(), "hash1", 0);
        setIntField(term52878, term52878.getClass(), "hash2", 0);
        setIntField(term52878, term52878.getClass(), "hash3", 0);
        setField(term52878, term52878.getClass(), "key1", null);
        setField(term52878, term52878.getClass(), "key2", null);
        setField(term52878, term52878.getClass(), "key3", term52879);
        setField(term52878, term52878.getClass(), "value1", null);
        setField(term52878, term52878.getClass(), "value2", null);
        setField(term52878, term52878.getClass(), "value3", null);
        setField(term52878, term52878.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52495;
        Object retValue = callMethod(klass, "equals", argTypes, term52403, args);
        assertTrue(recursiveEquals(term52403, term52877));
        assertTrue(recursiveEquals(term52495, term52878));
        assertTrue(recursiveEquals(retValue, true));
    }

};


