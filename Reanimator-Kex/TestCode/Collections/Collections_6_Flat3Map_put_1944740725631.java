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

public class Flat3Map_put_1944740725631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138239;
     Object term138790;
     Object term138791;

    public Flat3Map_put_1944740725631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138239 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term138239, term138239.getClass(), "delegateMap", null);
        setIntField(term138239, term138239.getClass(), "size", 1);
        term138790 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term138790, term138790.getClass(), "size", 2);
        setIntField(term138790, term138790.getClass(), "hash1", 0);
        setIntField(term138790, term138790.getClass(), "hash2", 0);
        setIntField(term138790, term138790.getClass(), "hash3", 0);
        setField(term138790, term138790.getClass(), "key1", null);
        setField(term138790, term138790.getClass(), "key2", term138790);
        setField(term138790, term138790.getClass(), "key3", null);
        setField(term138790, term138790.getClass(), "value1", null);
        setField(term138790, term138790.getClass(), "value2", null);
        setField(term138790, term138790.getClass(), "value3", null);
        setField(term138790, term138790.getClass(), "delegateMap", null);
        term138791 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term138791, term138791.getClass(), "size", 2);
        setIntField(term138791, term138791.getClass(), "hash1", 0);
        setIntField(term138791, term138791.getClass(), "hash2", 0);
        setIntField(term138791, term138791.getClass(), "hash3", 0);
        setField(term138791, term138791.getClass(), "key1", null);
        setField(term138791, term138791.getClass(), "key2", term138791);
        setField(term138791, term138791.getClass(), "key3", null);
        setField(term138791, term138791.getClass(), "value1", null);
        setField(term138791, term138791.getClass(), "value2", null);
        setField(term138791, term138791.getClass(), "value3", null);
        setField(term138791, term138791.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term138239;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term138239, args);
        assertTrue(recursiveEquals(term138239, term138790));
        assertTrue(recursiveEquals(term138239, term138791));
        assertTrue(recursiveEquals(retValue, null));
    }

};


