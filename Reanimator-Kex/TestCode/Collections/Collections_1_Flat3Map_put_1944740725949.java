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

public class Flat3Map_put_1944740725949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189974;
     Object term189997;
     Object term189998;

    public Flat3Map_put_1944740725949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189974 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term189974, term189974.getClass(), "delegateMap", null);
        setIntField(term189974, term189974.getClass(), "size", 3);
        setIntField(term189974, term189974.getClass(), "hash3", 0);
        setField(term189974, term189974.getClass(), "value3", null);
        setIntField(term189974, term189974.getClass(), "hash2", 0);
        setField(term189974, term189974.getClass(), "value2", null);
        setIntField(term189974, term189974.getClass(), "hash1", 0);
        setField(term189974, term189974.getClass(), "value1", null);
        setField(term189974, term189974.getClass(), "key3", term189974);
        term189997 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term189997, term189997.getClass(), "size", 3);
        setIntField(term189997, term189997.getClass(), "hash1", 0);
        setIntField(term189997, term189997.getClass(), "hash2", 0);
        setIntField(term189997, term189997.getClass(), "hash3", 0);
        setField(term189997, term189997.getClass(), "key1", null);
        setField(term189997, term189997.getClass(), "key2", null);
        setField(term189997, term189997.getClass(), "key3", term189997);
        setField(term189997, term189997.getClass(), "value1", null);
        setField(term189997, term189997.getClass(), "value2", null);
        setField(term189997, term189997.getClass(), "value3", null);
        setField(term189997, term189997.getClass(), "delegateMap", null);
        term189998 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term189998, term189998.getClass(), "size", 3);
        setIntField(term189998, term189998.getClass(), "hash1", 0);
        setIntField(term189998, term189998.getClass(), "hash2", 0);
        setIntField(term189998, term189998.getClass(), "hash3", 0);
        setField(term189998, term189998.getClass(), "key1", null);
        setField(term189998, term189998.getClass(), "key2", null);
        setField(term189998, term189998.getClass(), "key3", term189998);
        setField(term189998, term189998.getClass(), "value1", null);
        setField(term189998, term189998.getClass(), "value2", null);
        setField(term189998, term189998.getClass(), "value3", null);
        setField(term189998, term189998.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term189974;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term189974, args);
        assertTrue(recursiveEquals(term189974, term189997));
        assertTrue(recursiveEquals(term189974, term189998));
        assertTrue(recursiveEquals(retValue, null));
    }

};
