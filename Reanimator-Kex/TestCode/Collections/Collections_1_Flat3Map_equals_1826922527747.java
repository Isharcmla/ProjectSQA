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
import java.util.HashMap;
import java.lang.Object;

public class Flat3Map_equals_1826922527747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150886;
     Object term151104;
     Object term151239;
     Object term151242;

    public Flat3Map_equals_1826922527747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term151128 = new HashMap();
        term150886 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term150972 = newInstance(Class.forName("java.lang.Object"));
        setField(term150886, term150886.getClass(), "delegateMap", null);
        setIntField(term150886, term150886.getClass(), "size", 2);
        setField(term150886, term150886.getClass(), "key2", term151128);
        setField(term150886, term150886.getClass(), "value2", term150972);
        term151104 = newInstance(Class.forName("java.lang.Object"));
        HashMap term151240 = new HashMap();
        term151239 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term151241 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term151239, term151239.getClass(), "size", 2);
        setIntField(term151239, term151239.getClass(), "hash1", 0);
        setIntField(term151239, term151239.getClass(), "hash2", 0);
        setIntField(term151239, term151239.getClass(), "hash3", 0);
        setField(term151239, term151239.getClass(), "key1", null);
        setField(term151239, term151239.getClass(), "key2", term151240);
        setField(term151239, term151239.getClass(), "key3", null);
        setField(term151239, term151239.getClass(), "value1", null);
        setField(term151239, term151239.getClass(), "value2", term151241);
        setField(term151239, term151239.getClass(), "value3", null);
        setField(term151239, term151239.getClass(), "delegateMap", null);
        term151242 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term151104;
        Object retValue = callMethod(klass, "equals", argTypes, term150886, args);
        assertTrue(recursiveEquals(term150886, term151239));
        assertTrue(recursiveEquals(term151104, term151242));
        assertTrue(recursiveEquals(retValue, false));
    }

};
