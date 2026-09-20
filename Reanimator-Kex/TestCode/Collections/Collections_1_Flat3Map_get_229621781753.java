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

public class Flat3Map_get_229621781753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152389;
     Object term152735;
     Object term152737;

    public Flat3Map_get_229621781753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term152413 = new HashMap();
        term152389 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term152389, term152389.getClass(), "delegateMap", null);
        setIntField(term152389, term152389.getClass(), "size", 2);
        setIntField(term152389, term152389.getClass(), "hash2", 0);
        setField(term152389, term152389.getClass(), "value2", null);
        setIntField(term152389, term152389.getClass(), "hash1", 0);
        setField(term152389, term152389.getClass(), "value1", null);
        setField(term152389, term152389.getClass(), "key2", term152413);
        HashMap term152736 = new HashMap();
        term152735 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term152735, term152735.getClass(), "size", 2);
        setIntField(term152735, term152735.getClass(), "hash1", 0);
        setIntField(term152735, term152735.getClass(), "hash2", 0);
        setIntField(term152735, term152735.getClass(), "hash3", 0);
        setField(term152735, term152735.getClass(), "key1", null);
        setField(term152735, term152735.getClass(), "key2", term152736);
        setField(term152735, term152735.getClass(), "key3", null);
        setField(term152735, term152735.getClass(), "value1", null);
        setField(term152735, term152735.getClass(), "value2", null);
        setField(term152735, term152735.getClass(), "value3", null);
        setField(term152735, term152735.getClass(), "delegateMap", null);
        HashMap term152738 = new HashMap();
        term152737 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term152737, term152737.getClass(), "size", 2);
        setIntField(term152737, term152737.getClass(), "hash1", 0);
        setIntField(term152737, term152737.getClass(), "hash2", 0);
        setIntField(term152737, term152737.getClass(), "hash3", 0);
        setField(term152737, term152737.getClass(), "key1", null);
        setField(term152737, term152737.getClass(), "key2", term152738);
        setField(term152737, term152737.getClass(), "key3", null);
        setField(term152737, term152737.getClass(), "value1", null);
        setField(term152737, term152737.getClass(), "value2", null);
        setField(term152737, term152737.getClass(), "value3", null);
        setField(term152737, term152737.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term152389;
        Object retValue = callMethod(klass, "get", argTypes, term152389, args);
        assertTrue(recursiveEquals(term152389, term152735));
        assertTrue(recursiveEquals(term152389, term152737));
        assertTrue(recursiveEquals(retValue, null));
    }

};
