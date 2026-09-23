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

public class Flat3Map_hashCode_2019358094247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40112;
     Object term41399;

    public Flat3Map_hashCode_2019358094247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40112 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term40204 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term40296 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term40112, term40112.getClass(), "delegateMap", null);
        setIntField(term40112, term40112.getClass(), "size", 2);
        setIntField(term40112, term40112.getClass(), "hash2", 0);
        setField(term40112, term40112.getClass(), "value2", null);
        setIntField(term40112, term40112.getClass(), "hash1", 0);
        setField(term40204, term40204.getClass(), "delegateMap", null);
        setIntField(term40204, term40204.getClass(), "size", 1);
        setIntField(term40204, term40204.getClass(), "hash1", 0);
        setField(term40204, term40204.getClass(), "value1", term40296);
        setField(term40112, term40112.getClass(), "value1", term40204);
        term41399 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term41400 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term41401 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term41399, term41399.getClass(), "size", 2);
        setIntField(term41399, term41399.getClass(), "hash1", 0);
        setIntField(term41399, term41399.getClass(), "hash2", 0);
        setIntField(term41399, term41399.getClass(), "hash3", 0);
        setField(term41399, term41399.getClass(), "key1", null);
        setField(term41399, term41399.getClass(), "key2", null);
        setField(term41399, term41399.getClass(), "key3", null);
        setIntField(term41400, term41400.getClass(), "size", 1);
        setIntField(term41400, term41400.getClass(), "hash1", 0);
        setIntField(term41400, term41400.getClass(), "hash2", 0);
        setIntField(term41400, term41400.getClass(), "hash3", 0);
        setField(term41400, term41400.getClass(), "key1", null);
        setField(term41400, term41400.getClass(), "key2", null);
        setField(term41400, term41400.getClass(), "key3", null);
        setIntField(term41401, term41401.getClass(), "size", 0);
        setIntField(term41401, term41401.getClass(), "hash1", 0);
        setIntField(term41401, term41401.getClass(), "hash2", 0);
        setIntField(term41401, term41401.getClass(), "hash3", 0);
        setField(term41401, term41401.getClass(), "key1", null);
        setField(term41401, term41401.getClass(), "key2", null);
        setField(term41401, term41401.getClass(), "key3", null);
        setField(term41401, term41401.getClass(), "value1", null);
        setField(term41401, term41401.getClass(), "value2", null);
        setField(term41401, term41401.getClass(), "value3", null);
        setField(term41401, term41401.getClass(), "delegateMap", null);
        setField(term41400, term41400.getClass(), "value1", term41401);
        setField(term41400, term41400.getClass(), "value2", null);
        setField(term41400, term41400.getClass(), "value3", null);
        setField(term41400, term41400.getClass(), "delegateMap", null);
        setField(term41399, term41399.getClass(), "value1", term41400);
        setField(term41399, term41399.getClass(), "value2", null);
        setField(term41399, term41399.getClass(), "value3", null);
        setField(term41399, term41399.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term40112, args);
        assertTrue(recursiveEquals(term40112, term41399));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


