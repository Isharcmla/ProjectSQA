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

public class Flat3Map_containsValue_2053071372313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56342;
     Object term56420;
     Object term56422;

    public Flat3Map_containsValue_2053071372313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56342 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term56388 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term56342, term56342.getClass(), "delegateMap", null);
        setIntField(term56342, term56342.getClass(), "size", 1);
        setField(term56342, term56342.getClass(), "value1", term56388);
        term56420 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term56421 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term56420, term56420.getClass(), "size", 1);
        setIntField(term56420, term56420.getClass(), "hash1", 0);
        setIntField(term56420, term56420.getClass(), "hash2", 0);
        setIntField(term56420, term56420.getClass(), "hash3", 0);
        setField(term56420, term56420.getClass(), "key1", null);
        setField(term56420, term56420.getClass(), "key2", null);
        setField(term56420, term56420.getClass(), "key3", null);
        setIntField(term56421, term56421.getClass(), "size", 0);
        setIntField(term56421, term56421.getClass(), "hash1", 0);
        setIntField(term56421, term56421.getClass(), "hash2", 0);
        setIntField(term56421, term56421.getClass(), "hash3", 0);
        setField(term56421, term56421.getClass(), "key1", null);
        setField(term56421, term56421.getClass(), "key2", null);
        setField(term56421, term56421.getClass(), "key3", null);
        setField(term56421, term56421.getClass(), "value1", null);
        setField(term56421, term56421.getClass(), "value2", null);
        setField(term56421, term56421.getClass(), "value3", null);
        setField(term56421, term56421.getClass(), "delegateMap", null);
        setField(term56420, term56420.getClass(), "value1", term56421);
        setField(term56420, term56420.getClass(), "value2", null);
        setField(term56420, term56420.getClass(), "value3", null);
        setField(term56420, term56420.getClass(), "delegateMap", null);
        term56422 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term56423 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term56422, term56422.getClass(), "size", 1);
        setIntField(term56422, term56422.getClass(), "hash1", 0);
        setIntField(term56422, term56422.getClass(), "hash2", 0);
        setIntField(term56422, term56422.getClass(), "hash3", 0);
        setField(term56422, term56422.getClass(), "key1", null);
        setField(term56422, term56422.getClass(), "key2", null);
        setField(term56422, term56422.getClass(), "key3", null);
        setIntField(term56423, term56423.getClass(), "size", 0);
        setIntField(term56423, term56423.getClass(), "hash1", 0);
        setIntField(term56423, term56423.getClass(), "hash2", 0);
        setIntField(term56423, term56423.getClass(), "hash3", 0);
        setField(term56423, term56423.getClass(), "key1", null);
        setField(term56423, term56423.getClass(), "key2", null);
        setField(term56423, term56423.getClass(), "key3", null);
        setField(term56423, term56423.getClass(), "value1", null);
        setField(term56423, term56423.getClass(), "value2", null);
        setField(term56423, term56423.getClass(), "value3", null);
        setField(term56423, term56423.getClass(), "delegateMap", null);
        setField(term56422, term56422.getClass(), "value1", term56423);
        setField(term56422, term56422.getClass(), "value2", null);
        setField(term56422, term56422.getClass(), "value3", null);
        setField(term56422, term56422.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term56342;
        callMethod(klass, "containsValue", argTypes, term56342, args);
        assertTrue(recursiveEquals(term56342, term56420));
        assertTrue(recursiveEquals(term56342, term56422));
    }

};
