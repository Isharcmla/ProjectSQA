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

public class Flat3Map_equals_1826922527337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55942;
     Object term56082;
     Object term56162;
     Object term56165;

    public Flat3Map_equals_1826922527337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term55990 = new HashMap();
        term55942 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term55942, term55942.getClass(), "delegateMap", null);
        setIntField(term55942, term55942.getClass(), "size", 3);
        setField(term55942, term55942.getClass(), "key3", null);
        setField(term55942, term55942.getClass(), "value3", null);
        setField(term55942, term55942.getClass(), "key2", null);
        setField(term55942, term55942.getClass(), "value2", null);
        setField(term55942, term55942.getClass(), "key1", term55990);
        term56082 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term56082, term56082.getClass(), "delegateMap", null);
        setIntField(term56082, term56082.getClass(), "size", 3);
        setField(term56082, term56082.getClass(), "key3", null);
        setField(term56082, term56082.getClass(), "value3", null);
        HashMap term56163 = new HashMap();
        term56162 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term56162, term56162.getClass(), "size", 3);
        setIntField(term56162, term56162.getClass(), "hash1", 0);
        setIntField(term56162, term56162.getClass(), "hash2", 0);
        setIntField(term56162, term56162.getClass(), "hash3", 0);
        setField(term56162, term56162.getClass(), "key1", term56163);
        setField(term56162, term56162.getClass(), "key2", null);
        setField(term56162, term56162.getClass(), "key3", null);
        setField(term56162, term56162.getClass(), "value1", null);
        setField(term56162, term56162.getClass(), "value2", null);
        setField(term56162, term56162.getClass(), "value3", null);
        setField(term56162, term56162.getClass(), "delegateMap", null);
        term56165 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term56165, term56165.getClass(), "size", 3);
        setIntField(term56165, term56165.getClass(), "hash1", 0);
        setIntField(term56165, term56165.getClass(), "hash2", 0);
        setIntField(term56165, term56165.getClass(), "hash3", 0);
        setField(term56165, term56165.getClass(), "key1", null);
        setField(term56165, term56165.getClass(), "key2", null);
        setField(term56165, term56165.getClass(), "key3", null);
        setField(term56165, term56165.getClass(), "value1", null);
        setField(term56165, term56165.getClass(), "value2", null);
        setField(term56165, term56165.getClass(), "value3", null);
        setField(term56165, term56165.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term56082;
        Object retValue = callMethod(klass, "equals", argTypes, term55942, args);
        assertTrue(recursiveEquals(term55942, term56162));
        assertTrue(recursiveEquals(term56082, term56165));
        assertTrue(recursiveEquals(retValue, false));
    }

};


