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

public class Flat3Map_put_1944740725810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165082;
     Object term165174;
     Object term165567;
     Object term165569;

    public Flat3Map_put_1944740725810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165082 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term165082, term165082.getClass(), "delegateMap", null);
        setIntField(term165082, term165082.getClass(), "size", 1);
        term165174 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term165567 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term165568 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term165567, term165567.getClass(), "size", 2);
        setIntField(term165567, term165567.getClass(), "hash1", 0);
        setIntField(term165567, term165567.getClass(), "hash2", 0);
        setIntField(term165567, term165567.getClass(), "hash3", 0);
        setField(term165567, term165567.getClass(), "key1", null);
        setIntField(term165568, term165568.getClass(), "size", 0);
        setIntField(term165568, term165568.getClass(), "hash1", 0);
        setIntField(term165568, term165568.getClass(), "hash2", 0);
        setIntField(term165568, term165568.getClass(), "hash3", 0);
        setField(term165568, term165568.getClass(), "key1", null);
        setField(term165568, term165568.getClass(), "key2", null);
        setField(term165568, term165568.getClass(), "key3", null);
        setField(term165568, term165568.getClass(), "value1", null);
        setField(term165568, term165568.getClass(), "value2", null);
        setField(term165568, term165568.getClass(), "value3", null);
        setField(term165568, term165568.getClass(), "delegateMap", null);
        setField(term165567, term165567.getClass(), "key2", term165568);
        setField(term165567, term165567.getClass(), "key3", null);
        setField(term165567, term165567.getClass(), "value1", null);
        setField(term165567, term165567.getClass(), "value2", null);
        setField(term165567, term165567.getClass(), "value3", null);
        setField(term165567, term165567.getClass(), "delegateMap", null);
        term165569 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term165569, term165569.getClass(), "size", 0);
        setIntField(term165569, term165569.getClass(), "hash1", 0);
        setIntField(term165569, term165569.getClass(), "hash2", 0);
        setIntField(term165569, term165569.getClass(), "hash3", 0);
        setField(term165569, term165569.getClass(), "key1", null);
        setField(term165569, term165569.getClass(), "key2", null);
        setField(term165569, term165569.getClass(), "key3", null);
        setField(term165569, term165569.getClass(), "value1", null);
        setField(term165569, term165569.getClass(), "value2", null);
        setField(term165569, term165569.getClass(), "value3", null);
        setField(term165569, term165569.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term165174;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term165082, args);
        assertTrue(recursiveEquals(term165082, term165567));
        assertTrue(recursiveEquals(term165174, term165569));
        assertTrue(recursiveEquals(retValue, null));
    }

};
