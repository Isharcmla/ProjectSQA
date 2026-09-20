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

public class Flat3Map_containsValue_2053071372243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42994;
     Object term43170;
     Object term43199;
     Object term43202;

    public Flat3Map_containsValue_2053071372243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42994 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43032 = newInstance(Class.forName("java.lang.Object"));
        term43170 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term42994, term42994.getClass(), "delegateMap", null);
        setIntField(term42994, term42994.getClass(), "size", 2);
        setField(term42994, term42994.getClass(), "value2", term43032);
        setField(term43170, term43170.getClass(), "delegateMap", null);
        setField(term42994, term42994.getClass(), "value1", term43170);
        term43199 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43200 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43201 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term43199, term43199.getClass(), "size", 2);
        setIntField(term43199, term43199.getClass(), "hash1", 0);
        setIntField(term43199, term43199.getClass(), "hash2", 0);
        setIntField(term43199, term43199.getClass(), "hash3", 0);
        setField(term43199, term43199.getClass(), "key1", null);
        setField(term43199, term43199.getClass(), "key2", null);
        setField(term43199, term43199.getClass(), "key3", null);
        setIntField(term43200, term43200.getClass(), "size", 0);
        setIntField(term43200, term43200.getClass(), "hash1", 0);
        setIntField(term43200, term43200.getClass(), "hash2", 0);
        setIntField(term43200, term43200.getClass(), "hash3", 0);
        setField(term43200, term43200.getClass(), "key1", null);
        setField(term43200, term43200.getClass(), "key2", null);
        setField(term43200, term43200.getClass(), "key3", null);
        setField(term43200, term43200.getClass(), "value1", null);
        setField(term43200, term43200.getClass(), "value2", null);
        setField(term43200, term43200.getClass(), "value3", null);
        setField(term43200, term43200.getClass(), "delegateMap", null);
        setField(term43199, term43199.getClass(), "value1", term43200);
        setField(term43199, term43199.getClass(), "value2", term43201);
        setField(term43199, term43199.getClass(), "value3", null);
        setField(term43199, term43199.getClass(), "delegateMap", null);
        term43202 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term43202, term43202.getClass(), "size", 0);
        setIntField(term43202, term43202.getClass(), "hash1", 0);
        setIntField(term43202, term43202.getClass(), "hash2", 0);
        setIntField(term43202, term43202.getClass(), "hash3", 0);
        setField(term43202, term43202.getClass(), "key1", null);
        setField(term43202, term43202.getClass(), "key2", null);
        setField(term43202, term43202.getClass(), "key3", null);
        setField(term43202, term43202.getClass(), "value1", null);
        setField(term43202, term43202.getClass(), "value2", null);
        setField(term43202, term43202.getClass(), "value3", null);
        setField(term43202, term43202.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term43170;
        callMethod(klass, "containsValue", argTypes, term42994, args);
        assertTrue(recursiveEquals(term42994, term43199));
        assertTrue(recursiveEquals(term43170, term43202));
    }

};
