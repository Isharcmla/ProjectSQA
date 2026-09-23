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

public class Flat3Map_put_1944740725211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34663;
     Object term34780;

    public Flat3Map_put_1944740725211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34663 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34755 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term34663, term34663.getClass(), "delegateMap", null);
        setIntField(term34663, term34663.getClass(), "size", 3);
        setField(term34663, term34663.getClass(), "key3", term34755);
        term34780 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34781 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term34780, term34780.getClass(), "size", 3);
        setIntField(term34780, term34780.getClass(), "hash1", 0);
        setIntField(term34780, term34780.getClass(), "hash2", 0);
        setIntField(term34780, term34780.getClass(), "hash3", 0);
        setField(term34780, term34780.getClass(), "key1", null);
        setField(term34780, term34780.getClass(), "key2", null);
        setIntField(term34781, term34781.getClass(), "size", 0);
        setIntField(term34781, term34781.getClass(), "hash1", 0);
        setIntField(term34781, term34781.getClass(), "hash2", 0);
        setIntField(term34781, term34781.getClass(), "hash3", 0);
        setField(term34781, term34781.getClass(), "key1", null);
        setField(term34781, term34781.getClass(), "key2", null);
        setField(term34781, term34781.getClass(), "key3", null);
        setField(term34781, term34781.getClass(), "value1", null);
        setField(term34781, term34781.getClass(), "value2", null);
        setField(term34781, term34781.getClass(), "value3", null);
        setField(term34781, term34781.getClass(), "delegateMap", null);
        setField(term34780, term34780.getClass(), "key3", term34781);
        setField(term34780, term34780.getClass(), "value1", null);
        setField(term34780, term34780.getClass(), "value2", null);
        setField(term34780, term34780.getClass(), "value3", null);
        setField(term34780, term34780.getClass(), "delegateMap", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term34663, args);
        assertTrue(recursiveEquals(term34663, term34780));
        assertTrue(recursiveEquals(retValue, null));
    }

};


