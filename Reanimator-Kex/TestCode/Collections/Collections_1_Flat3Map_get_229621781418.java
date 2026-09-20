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

public class Flat3Map_get_229621781418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76766;
     Object term76858;
     Object term77194;
     Object term77195;

    public Flat3Map_get_229621781418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76766 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term76766, term76766.getClass(), "delegateMap", null);
        setIntField(term76766, term76766.getClass(), "size", 3);
        setIntField(term76766, term76766.getClass(), "hash3", 0);
        setField(term76766, term76766.getClass(), "key3", term76766);
        term76858 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term76858, term76858.getClass(), "delegateMap", null);
        setIntField(term76858, term76858.getClass(), "size", 3);
        setIntField(term76858, term76858.getClass(), "hash3", 0);
        setField(term76858, term76858.getClass(), "value3", null);
        setIntField(term76858, term76858.getClass(), "hash2", 0);
        setField(term76858, term76858.getClass(), "value2", null);
        setIntField(term76858, term76858.getClass(), "hash1", 0);
        setField(term76858, term76858.getClass(), "value1", null);
        term77194 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term77194, term77194.getClass(), "size", 3);
        setIntField(term77194, term77194.getClass(), "hash1", 0);
        setIntField(term77194, term77194.getClass(), "hash2", 0);
        setIntField(term77194, term77194.getClass(), "hash3", 0);
        setField(term77194, term77194.getClass(), "key1", null);
        setField(term77194, term77194.getClass(), "key2", null);
        setField(term77194, term77194.getClass(), "key3", term77194);
        setField(term77194, term77194.getClass(), "value1", null);
        setField(term77194, term77194.getClass(), "value2", null);
        setField(term77194, term77194.getClass(), "value3", null);
        setField(term77194, term77194.getClass(), "delegateMap", null);
        term77195 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term77195, term77195.getClass(), "size", 3);
        setIntField(term77195, term77195.getClass(), "hash1", 0);
        setIntField(term77195, term77195.getClass(), "hash2", 0);
        setIntField(term77195, term77195.getClass(), "hash3", 0);
        setField(term77195, term77195.getClass(), "key1", null);
        setField(term77195, term77195.getClass(), "key2", null);
        setField(term77195, term77195.getClass(), "key3", null);
        setField(term77195, term77195.getClass(), "value1", null);
        setField(term77195, term77195.getClass(), "value2", null);
        setField(term77195, term77195.getClass(), "value3", null);
        setField(term77195, term77195.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term76858;
        Object retValue = callMethod(klass, "get", argTypes, term76766, args);
        assertTrue(recursiveEquals(term76766, term77194));
        assertTrue(recursiveEquals(term76858, term77195));
        assertTrue(recursiveEquals(retValue, null));
    }

};
