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

public class Flat3Map_containsValue_2053071372205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33783;
     Object term33875;
     Object term34373;
     Object term34374;

    public Flat3Map_containsValue_2053071372205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33783 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term33783, term33783.getClass(), "delegateMap", null);
        setIntField(term33783, term33783.getClass(), "size", 2);
        term33875 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term34373 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term34373, term34373.getClass(), "size", 2);
        setIntField(term34373, term34373.getClass(), "hash1", 0);
        setIntField(term34373, term34373.getClass(), "hash2", 0);
        setIntField(term34373, term34373.getClass(), "hash3", 0);
        setField(term34373, term34373.getClass(), "key1", null);
        setField(term34373, term34373.getClass(), "key2", null);
        setField(term34373, term34373.getClass(), "key3", null);
        setField(term34373, term34373.getClass(), "value1", null);
        setField(term34373, term34373.getClass(), "value2", null);
        setField(term34373, term34373.getClass(), "value3", null);
        setField(term34373, term34373.getClass(), "delegateMap", null);
        term34374 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term34374, term34374.getClass(), "size", 0);
        setIntField(term34374, term34374.getClass(), "hash1", 0);
        setIntField(term34374, term34374.getClass(), "hash2", 0);
        setIntField(term34374, term34374.getClass(), "hash3", 0);
        setField(term34374, term34374.getClass(), "key1", null);
        setField(term34374, term34374.getClass(), "key2", null);
        setField(term34374, term34374.getClass(), "key3", null);
        setField(term34374, term34374.getClass(), "value1", null);
        setField(term34374, term34374.getClass(), "value2", null);
        setField(term34374, term34374.getClass(), "value3", null);
        setField(term34374, term34374.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term33875;
        callMethod(klass, "containsValue", argTypes, term33783, args);
        assertTrue(recursiveEquals(term33783, term34373));
        assertTrue(recursiveEquals(term33875, term34374));
    }

};


