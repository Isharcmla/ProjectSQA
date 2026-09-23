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

public class Flat3Map_toString_1508598404669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152460;
     Object term152640;

    public Flat3Map_toString_1508598404669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152460 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term152460, term152460.getClass(), "delegateMap", null);
        setIntField(term152460, term152460.getClass(), "size", 3);
        setField(term152460, term152460.getClass(), "key3", term152460);
        term152640 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term152640, term152640.getClass(), "size", 3);
        setIntField(term152640, term152640.getClass(), "hash1", 0);
        setIntField(term152640, term152640.getClass(), "hash2", 0);
        setIntField(term152640, term152640.getClass(), "hash3", 0);
        setField(term152640, term152640.getClass(), "key1", null);
        setField(term152640, term152640.getClass(), "key2", null);
        setField(term152640, term152640.getClass(), "key3", term152640);
        setField(term152640, term152640.getClass(), "value1", null);
        setField(term152640, term152640.getClass(), "value2", null);
        setField(term152640, term152640.getClass(), "value3", null);
        setField(term152640, term152640.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term152460, args);
        assertTrue(recursiveEquals(term152460, term152640));
        assertTrue(recursiveEquals(retValue, "{(this Map)=null,null=null,null=null}"));
    }

};


