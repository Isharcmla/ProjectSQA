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

public class Flat3Map_containsValue_2053071372479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90387;
     Object term90479;
     Object term90517;
     Object term90518;

    public Flat3Map_containsValue_2053071372479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90387 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term90387, term90387.getClass(), "delegateMap", null);
        setIntField(term90387, term90387.getClass(), "size", 0);
        setField(term90387, term90387.getClass(), "value3", term90387);
        term90479 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term90479, term90479.getClass(), "delegateMap", null);
        setIntField(term90479, term90479.getClass(), "size", 0);
        term90517 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term90517, term90517.getClass(), "size", 0);
        setIntField(term90517, term90517.getClass(), "hash1", 0);
        setIntField(term90517, term90517.getClass(), "hash2", 0);
        setIntField(term90517, term90517.getClass(), "hash3", 0);
        setField(term90517, term90517.getClass(), "key1", null);
        setField(term90517, term90517.getClass(), "key2", null);
        setField(term90517, term90517.getClass(), "key3", null);
        setField(term90517, term90517.getClass(), "value1", null);
        setField(term90517, term90517.getClass(), "value2", null);
        setField(term90517, term90517.getClass(), "value3", term90517);
        setField(term90517, term90517.getClass(), "delegateMap", null);
        term90518 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term90518, term90518.getClass(), "size", 0);
        setIntField(term90518, term90518.getClass(), "hash1", 0);
        setIntField(term90518, term90518.getClass(), "hash2", 0);
        setIntField(term90518, term90518.getClass(), "hash3", 0);
        setField(term90518, term90518.getClass(), "key1", null);
        setField(term90518, term90518.getClass(), "key2", null);
        setField(term90518, term90518.getClass(), "key3", null);
        setField(term90518, term90518.getClass(), "value1", null);
        setField(term90518, term90518.getClass(), "value2", null);
        setField(term90518, term90518.getClass(), "value3", null);
        setField(term90518, term90518.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term90479;
        callMethod(klass, "containsValue", argTypes, term90387, args);
        assertTrue(recursiveEquals(term90387, term90517));
        assertTrue(recursiveEquals(term90479, term90518));
    }

};
