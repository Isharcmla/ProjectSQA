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

public class Flat3Map_put_1944740725831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215297;
     Object term215573;

    public Flat3Map_put_1944740725831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215297 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term215389 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term215481 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term215297, term215297.getClass(), "delegateMap", null);
        setIntField(term215297, term215297.getClass(), "size", 3);
        setIntField(term215297, term215297.getClass(), "hash3", 0);
        setField(term215389, term215389.getClass(), "delegateMap", null);
        setIntField(term215389, term215389.getClass(), "size", -4);
        setField(term215297, term215297.getClass(), "key3", term215389);
        setIntField(term215297, term215297.getClass(), "hash2", 0);
        setField(term215297, term215297.getClass(), "key2", term215481);
        term215573 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term215573, term215573.getClass(), "delegateMap", null);
        setIntField(term215573, term215573.getClass(), "size", 3);
        setIntField(term215573, term215573.getClass(), "hash3", 0);
        setField(term215573, term215573.getClass(), "value3", null);
        setIntField(term215573, term215573.getClass(), "hash2", 0);
        setField(term215573, term215573.getClass(), "value2", null);
        setIntField(term215573, term215573.getClass(), "hash1", 0);
        setField(term215573, term215573.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term215573;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term215297, args);
        assertTrue(recursiveEquals(term215573, 2));
        assertTrue(recursiveEquals(retValue, null));
    }

};


