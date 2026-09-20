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

public class Flat3Map_toString_1508598404218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38002;
     Object term38426;

    public Flat3Map_toString_1508598404218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38002 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term38002, term38002.getClass(), "delegateMap", null);
        setIntField(term38002, term38002.getClass(), "size", 3);
        setField(term38002, term38002.getClass(), "key3", "");
        setField(term38002, term38002.getClass(), "value3", "");
        setField(term38002, term38002.getClass(), "key2", term38002);
        term38426 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term38426, term38426.getClass(), "size", 3);
        setIntField(term38426, term38426.getClass(), "hash1", 0);
        setIntField(term38426, term38426.getClass(), "hash2", 0);
        setIntField(term38426, term38426.getClass(), "hash3", 0);
        setField(term38426, term38426.getClass(), "key1", null);
        setField(term38426, term38426.getClass(), "key2", term38426);
        setField(term38426, term38426.getClass(), "key3", "");
        setField(term38426, term38426.getClass(), "value1", null);
        setField(term38426, term38426.getClass(), "value2", null);
        setField(term38426, term38426.getClass(), "value3", "");
        setField(term38426, term38426.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term38002, args);
        assertTrue(recursiveEquals(term38002, term38426));
        assertTrue(recursiveEquals(retValue, "{=,(this Map)=null,null=null}"));
    }

};
