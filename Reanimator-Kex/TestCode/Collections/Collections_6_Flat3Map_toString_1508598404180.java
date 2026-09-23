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

public class Flat3Map_toString_1508598404180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29844;
     Object term30293;

    public Flat3Map_toString_1508598404180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29844 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term29844, term29844.getClass(), "delegateMap", null);
        setIntField(term29844, term29844.getClass(), "size", 2);
        setField(term29844, term29844.getClass(), "key2", "");
        setField(term29844, term29844.getClass(), "value2", "");
        setField(term29844, term29844.getClass(), "key1", term29844);
        term30293 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term30293, term30293.getClass(), "size", 2);
        setIntField(term30293, term30293.getClass(), "hash1", 0);
        setIntField(term30293, term30293.getClass(), "hash2", 0);
        setIntField(term30293, term30293.getClass(), "hash3", 0);
        setField(term30293, term30293.getClass(), "key1", term30293);
        setField(term30293, term30293.getClass(), "key2", "");
        setField(term30293, term30293.getClass(), "key3", null);
        setField(term30293, term30293.getClass(), "value1", null);
        setField(term30293, term30293.getClass(), "value2", "");
        setField(term30293, term30293.getClass(), "value3", null);
        setField(term30293, term30293.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term29844, args);
        assertTrue(recursiveEquals(term29844, term30293));
        assertTrue(recursiveEquals(retValue, "{=,(this Map)=null}"));
    }

};


