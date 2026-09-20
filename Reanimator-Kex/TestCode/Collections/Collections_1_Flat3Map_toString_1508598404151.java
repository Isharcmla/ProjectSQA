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

public class Flat3Map_toString_1508598404151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26643;
     Object term26701;

    public Flat3Map_toString_1508598404151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26643 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term26643, term26643.getClass(), "delegateMap", null);
        setIntField(term26643, term26643.getClass(), "size", 2);
        term26701 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term26701, term26701.getClass(), "size", 2);
        setIntField(term26701, term26701.getClass(), "hash1", 0);
        setIntField(term26701, term26701.getClass(), "hash2", 0);
        setIntField(term26701, term26701.getClass(), "hash3", 0);
        setField(term26701, term26701.getClass(), "key1", null);
        setField(term26701, term26701.getClass(), "key2", null);
        setField(term26701, term26701.getClass(), "key3", null);
        setField(term26701, term26701.getClass(), "value1", null);
        setField(term26701, term26701.getClass(), "value2", null);
        setField(term26701, term26701.getClass(), "value3", null);
        setField(term26701, term26701.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term26643, args);
        assertTrue(recursiveEquals(term26643, term26701));
        assertTrue(recursiveEquals(retValue, "{null=null,null=null}"));
    }

};
