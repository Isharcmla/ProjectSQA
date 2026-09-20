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

public class Flat3Map_equals_1826922527603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116047;
     Object term116187;
     Object term116325;
     Object term116328;

    public Flat3Map_equals_1826922527603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term116095 = new HashMap();
        term116047 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term116047, term116047.getClass(), "delegateMap", null);
        setIntField(term116047, term116047.getClass(), "size", 3);
        setField(term116047, term116047.getClass(), "key3", null);
        setField(term116047, term116047.getClass(), "value3", null);
        setField(term116047, term116047.getClass(), "key2", term116095);
        HashMap term116235 = new HashMap();
        term116187 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term116187, term116187.getClass(), "delegateMap", null);
        setIntField(term116187, term116187.getClass(), "size", 3);
        setField(term116187, term116187.getClass(), "key3", null);
        setField(term116187, term116187.getClass(), "value3", null);
        setIntField(term116187, term116187.getClass(), "hash3", 0);
        setIntField(term116187, term116187.getClass(), "hash2", 0);
        setField(term116187, term116187.getClass(), "key2", term116235);
        setIntField(term116187, term116187.getClass(), "hash1", -1);
        HashMap term116326 = new HashMap();
        term116325 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term116325, term116325.getClass(), "size", 3);
        setIntField(term116325, term116325.getClass(), "hash1", 0);
        setIntField(term116325, term116325.getClass(), "hash2", 0);
        setIntField(term116325, term116325.getClass(), "hash3", 0);
        setField(term116325, term116325.getClass(), "key1", null);
        setField(term116325, term116325.getClass(), "key2", term116326);
        setField(term116325, term116325.getClass(), "key3", null);
        setField(term116325, term116325.getClass(), "value1", null);
        setField(term116325, term116325.getClass(), "value2", null);
        setField(term116325, term116325.getClass(), "value3", null);
        setField(term116325, term116325.getClass(), "delegateMap", null);
        HashMap term116329 = new HashMap();
        term116328 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term116328, term116328.getClass(), "size", 3);
        setIntField(term116328, term116328.getClass(), "hash1", -1);
        setIntField(term116328, term116328.getClass(), "hash2", 0);
        setIntField(term116328, term116328.getClass(), "hash3", 0);
        setField(term116328, term116328.getClass(), "key1", null);
        setField(term116328, term116328.getClass(), "key2", term116329);
        setField(term116328, term116328.getClass(), "key3", null);
        setField(term116328, term116328.getClass(), "value1", null);
        setField(term116328, term116328.getClass(), "value2", null);
        setField(term116328, term116328.getClass(), "value3", null);
        setField(term116328, term116328.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term116187;
        Object retValue = callMethod(klass, "equals", argTypes, term116047, args);
        assertTrue(recursiveEquals(term116047, term116325));
        assertTrue(recursiveEquals(term116187, term116328));
        assertTrue(recursiveEquals(retValue, true));
    }

};
