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

public class Flat3Map_toString_1508598404156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26840;
     Object term27087;

    public Flat3Map_toString_1508598404156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26840 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term26840, term26840.getClass(), "delegateMap", null);
        setIntField(term26840, term26840.getClass(), "size", 3);
        term27087 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27087, term27087.getClass(), "size", 3);
        setIntField(term27087, term27087.getClass(), "hash1", 0);
        setIntField(term27087, term27087.getClass(), "hash2", 0);
        setIntField(term27087, term27087.getClass(), "hash3", 0);
        setField(term27087, term27087.getClass(), "key1", null);
        setField(term27087, term27087.getClass(), "key2", null);
        setField(term27087, term27087.getClass(), "key3", null);
        setField(term27087, term27087.getClass(), "value1", null);
        setField(term27087, term27087.getClass(), "value2", null);
        setField(term27087, term27087.getClass(), "value3", null);
        setField(term27087, term27087.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term26840, args);
        assertTrue(recursiveEquals(term26840, term27087));
        assertTrue(recursiveEquals(retValue, "{null=null,null=null,null=null}"));
    }

};


