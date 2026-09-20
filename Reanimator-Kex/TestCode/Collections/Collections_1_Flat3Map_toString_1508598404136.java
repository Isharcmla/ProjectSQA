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

public class Flat3Map_toString_1508598404136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23343;
     Object term23941;

    public Flat3Map_toString_1508598404136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23343 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term23343, term23343.getClass(), "delegateMap", null);
        setIntField(term23343, term23343.getClass(), "size", 3);
        term23941 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term23941, term23941.getClass(), "size", 3);
        setIntField(term23941, term23941.getClass(), "hash1", 0);
        setIntField(term23941, term23941.getClass(), "hash2", 0);
        setIntField(term23941, term23941.getClass(), "hash3", 0);
        setField(term23941, term23941.getClass(), "key1", null);
        setField(term23941, term23941.getClass(), "key2", null);
        setField(term23941, term23941.getClass(), "key3", null);
        setField(term23941, term23941.getClass(), "value1", null);
        setField(term23941, term23941.getClass(), "value2", null);
        setField(term23941, term23941.getClass(), "value3", null);
        setField(term23941, term23941.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term23343, args);
        assertTrue(recursiveEquals(term23343, term23941));
        assertTrue(recursiveEquals(retValue, "{null=null,null=null,null=null}"));
    }

};
