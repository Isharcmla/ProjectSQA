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

public class Flat3Map_hashCode_2019358094231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38232;
     Object term38435;

    public Flat3Map_hashCode_2019358094231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38232 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term38324 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term38232, term38232.getClass(), "delegateMap", null);
        setIntField(term38232, term38232.getClass(), "size", 2);
        setIntField(term38232, term38232.getClass(), "hash2", 0);
        setField(term38324, term38324.getClass(), "delegateMap", null);
        setIntField(term38324, term38324.getClass(), "size", 3);
        setField(term38232, term38232.getClass(), "value2", term38324);
        term38435 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term38436 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term38435, term38435.getClass(), "size", 2);
        setIntField(term38435, term38435.getClass(), "hash1", 0);
        setIntField(term38435, term38435.getClass(), "hash2", 0);
        setIntField(term38435, term38435.getClass(), "hash3", 0);
        setField(term38435, term38435.getClass(), "key1", null);
        setField(term38435, term38435.getClass(), "key2", null);
        setField(term38435, term38435.getClass(), "key3", null);
        setField(term38435, term38435.getClass(), "value1", null);
        setIntField(term38436, term38436.getClass(), "size", 3);
        setIntField(term38436, term38436.getClass(), "hash1", 0);
        setIntField(term38436, term38436.getClass(), "hash2", 0);
        setIntField(term38436, term38436.getClass(), "hash3", 0);
        setField(term38436, term38436.getClass(), "key1", null);
        setField(term38436, term38436.getClass(), "key2", null);
        setField(term38436, term38436.getClass(), "key3", null);
        setField(term38436, term38436.getClass(), "value1", null);
        setField(term38436, term38436.getClass(), "value2", null);
        setField(term38436, term38436.getClass(), "value3", null);
        setField(term38436, term38436.getClass(), "delegateMap", null);
        setField(term38435, term38435.getClass(), "value2", term38436);
        setField(term38435, term38435.getClass(), "value3", null);
        setField(term38435, term38435.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term38232, args);
        assertTrue(recursiveEquals(term38232, term38435));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


