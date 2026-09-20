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

public class Flat3Map_toString_1508598404251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44321;
     Object term44362;

    public Flat3Map_toString_1508598404251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44321 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term44321, term44321.getClass(), "delegateMap", null);
        setIntField(term44321, term44321.getClass(), "size", 1);
        setField(term44321, term44321.getClass(), "key1", term44321);
        term44362 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term44362, term44362.getClass(), "size", 1);
        setIntField(term44362, term44362.getClass(), "hash1", 0);
        setIntField(term44362, term44362.getClass(), "hash2", 0);
        setIntField(term44362, term44362.getClass(), "hash3", 0);
        setField(term44362, term44362.getClass(), "key1", term44362);
        setField(term44362, term44362.getClass(), "key2", null);
        setField(term44362, term44362.getClass(), "key3", null);
        setField(term44362, term44362.getClass(), "value1", null);
        setField(term44362, term44362.getClass(), "value2", null);
        setField(term44362, term44362.getClass(), "value3", null);
        setField(term44362, term44362.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term44321, args);
        assertTrue(recursiveEquals(term44321, term44362));
        assertTrue(recursiveEquals(retValue, "{(this Map)=null}"));
    }

};
