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
import java.lang.Object;

public class Flat3Map_put_1944740725981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272819;
     Object term273041;
     Object term273353;

    public Flat3Map_put_1944740725981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272819 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term272911 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term272949 = newInstance(Class.forName("java.lang.Object"));
        setField(term272819, term272819.getClass(), "delegateMap", null);
        setIntField(term272819, term272819.getClass(), "size", 3);
        setIntField(term272819, term272819.getClass(), "hash3", -1);
        setIntField(term272819, term272819.getClass(), "hash2", 0);
        setField(term272819, term272819.getClass(), "key2", null);
        setIntField(term272819, term272819.getClass(), "hash1", 0);
        setField(term272911, term272911.getClass(), "delegateMap", null);
        setIntField(term272911, term272911.getClass(), "size", 3);
        setField(term272911, term272911.getClass(), "key3", null);
        setField(term272911, term272911.getClass(), "value3", term272949);
        setField(term272819, term272819.getClass(), "key1", term272911);
        term273041 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term273151 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term273041, term273041.getClass(), "delegateMap", null);
        setIntField(term273041, term273041.getClass(), "size", 3);
        setIntField(term273041, term273041.getClass(), "hash3", 0);
        setField(term273041, term273041.getClass(), "value3", null);
        setIntField(term273041, term273041.getClass(), "hash2", 0);
        setField(term273041, term273041.getClass(), "value2", null);
        setIntField(term273041, term273041.getClass(), "hash1", 0);
        setIntField(term273151, term273151.getClass(), "size", 0);
        setField(term273041, term273041.getClass(), "value1", term273151);
        setField(term273041, term273041.getClass(), "key3", null);
        term273353 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term273353, term273353.getClass(), "size", 0);
        setIntField(term273353, term273353.getClass(), "hash1", 0);
        setIntField(term273353, term273353.getClass(), "hash2", 0);
        setIntField(term273353, term273353.getClass(), "hash3", 0);
        setField(term273353, term273353.getClass(), "key1", null);
        setField(term273353, term273353.getClass(), "key2", null);
        setField(term273353, term273353.getClass(), "key3", null);
        setField(term273353, term273353.getClass(), "value1", null);
        setField(term273353, term273353.getClass(), "value2", null);
        setField(term273353, term273353.getClass(), "value3", null);
        setField(term273353, term273353.getClass(), "delegateMap", 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term273041;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term272819, args);
        assertTrue(recursiveEquals(term272819, term273353));
        assertTrue(recursiveEquals(term273041, false));
        assertTrue(recursiveEquals(retValue, null));
    }

};


