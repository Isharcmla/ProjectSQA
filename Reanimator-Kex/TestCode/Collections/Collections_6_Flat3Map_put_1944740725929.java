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

public class Flat3Map_put_1944740725929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249502;
     Object term249926;

    public Flat3Map_put_1944740725929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249502 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term249594 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term249686 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term249724 = newInstance(Class.forName("java.lang.Object"));
        Object term249834 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term249502, term249502.getClass(), "delegateMap", null);
        setIntField(term249502, term249502.getClass(), "size", 3);
        setIntField(term249502, term249502.getClass(), "hash3", -1421540862);
        setField(term249594, term249594.getClass(), "delegateMap", null);
        setIntField(term249594, term249594.getClass(), "size", 3);
        setField(term249686, term249686.getClass(), "delegateMap", null);
        setIntField(term249686, term249686.getClass(), "size", 0);
        setField(term249594, term249594.getClass(), "key3", term249686);
        setField(term249594, term249594.getClass(), "key2", null);
        setField(term249594, term249594.getClass(), "value2", null);
        setIntField(term249594, term249594.getClass(), "hash3", 7646528);
        setField(term249594, term249594.getClass(), "value3", null);
        setIntField(term249594, term249594.getClass(), "hash2", 1508032);
        setIntField(term249594, term249594.getClass(), "hash1", 81002496);
        setField(term249594, term249594.getClass(), "key1", term249724);
        setField(term249594, term249594.getClass(), "value1", null);
        setField(term249502, term249502.getClass(), "key3", term249594);
        setIntField(term249502, term249502.getClass(), "hash2", -1421540862);
        setField(term249502, term249502.getClass(), "key2", null);
        setIntField(term249502, term249502.getClass(), "hash1", -1421540862);
        setField(term249502, term249502.getClass(), "key1", null);
        setField(term249502, term249502.getClass(), "value3", null);
        setField(term249502, term249502.getClass(), "value2", null);
        setField(term249502, term249502.getClass(), "value1", term249834);
        term249926 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250018 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250110 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term249926, term249926.getClass(), "delegateMap", null);
        setIntField(term249926, term249926.getClass(), "size", 3);
        setIntField(term249926, term249926.getClass(), "hash3", 1777074176);
        setField(term249926, term249926.getClass(), "value3", null);
        setIntField(term249926, term249926.getClass(), "hash2", 8519906);
        setField(term249926, term249926.getClass(), "value2", null);
        setIntField(term249926, term249926.getClass(), "hash1", 1087832352);
        setField(term249926, term249926.getClass(), "value1", null);
        setField(term249926, term249926.getClass(), "key3", null);
        setField(term250018, term250018.getClass(), "delegateMap", null);
        setIntField(term250018, term250018.getClass(), "size", 0);
        setField(term249926, term249926.getClass(), "key2", term250018);
        setField(term250110, term250110.getClass(), "delegateMap", null);
        setIntField(term250110, term250110.getClass(), "size", 1);
        setIntField(term250110, term250110.getClass(), "hash1", 0);
        setField(term250110, term250110.getClass(), "value1", null);
        setField(term249926, term249926.getClass(), "key1", term250110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term249926;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term249502, args);
        assertTrue(recursiveEquals(term249926, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


