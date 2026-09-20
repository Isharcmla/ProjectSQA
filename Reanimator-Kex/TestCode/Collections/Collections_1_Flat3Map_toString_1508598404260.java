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

public class Flat3Map_toString_1508598404260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45639;
     Object term46288;

    public Flat3Map_toString_1508598404260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45639 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term45639, term45639.getClass(), "delegateMap", null);
        setIntField(term45639, term45639.getClass(), "size", 2);
        setField(term45639, term45639.getClass(), "key2", "");
        setField(term45639, term45639.getClass(), "value2", "");
        setField(term45639, term45639.getClass(), "key1", term45639);
        term46288 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46288, term46288.getClass(), "size", 2);
        setIntField(term46288, term46288.getClass(), "hash1", 0);
        setIntField(term46288, term46288.getClass(), "hash2", 0);
        setIntField(term46288, term46288.getClass(), "hash3", 0);
        setField(term46288, term46288.getClass(), "key1", term46288);
        setField(term46288, term46288.getClass(), "key2", "");
        setField(term46288, term46288.getClass(), "key3", null);
        setField(term46288, term46288.getClass(), "value1", null);
        setField(term46288, term46288.getClass(), "value2", "");
        setField(term46288, term46288.getClass(), "value3", null);
        setField(term46288, term46288.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term45639, args);
        assertTrue(recursiveEquals(term45639, term46288));
        assertTrue(recursiveEquals(retValue, "{=,(this Map)=null}"));
    }

};
