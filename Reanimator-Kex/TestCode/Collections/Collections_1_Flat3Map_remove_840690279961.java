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

public class Flat3Map_remove_840690279961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192870;
     Object term193084;
     Object term193469;
     Object term193472;

    public Flat3Map_remove_840690279961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192870 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term192908 = newInstance(Class.forName("java.lang.Object"));
        Object term192946 = newInstance(Class.forName("java.lang.Object"));
        term193084 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term192870, term192870.getClass(), "delegateMap", null);
        setIntField(term192870, term192870.getClass(), "size", 3);
        setIntField(term192870, term192870.getClass(), "hash3", 0);
        setField(term192870, term192870.getClass(), "key3", term192908);
        setIntField(term192870, term192870.getClass(), "hash2", 0);
        setField(term192870, term192870.getClass(), "key2", term192946);
        setIntField(term192870, term192870.getClass(), "hash1", 0);
        setField(term193084, term193084.getClass(), "delegateMap", null);
        setIntField(term193084, term193084.getClass(), "size", 3);
        setIntField(term193084, term193084.getClass(), "hash3", 0);
        setField(term193084, term193084.getClass(), "value3", null);
        setIntField(term193084, term193084.getClass(), "hash2", 0);
        setField(term193084, term193084.getClass(), "value2", null);
        setIntField(term193084, term193084.getClass(), "hash1", 0);
        setField(term193084, term193084.getClass(), "value1", null);
        setField(term192870, term192870.getClass(), "key1", term193084);
        term193469 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term193470 = newInstance(Class.forName("java.lang.Object"));
        Object term193471 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term193469, term193469.getClass(), "size", 2);
        setIntField(term193469, term193469.getClass(), "hash1", 0);
        setIntField(term193469, term193469.getClass(), "hash2", 0);
        setIntField(term193469, term193469.getClass(), "hash3", 0);
        setField(term193469, term193469.getClass(), "key1", term193470);
        setField(term193469, term193469.getClass(), "key2", term193471);
        setField(term193469, term193469.getClass(), "key3", null);
        setField(term193469, term193469.getClass(), "value1", null);
        setField(term193469, term193469.getClass(), "value2", null);
        setField(term193469, term193469.getClass(), "value3", null);
        setField(term193469, term193469.getClass(), "delegateMap", null);
        term193472 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term193472, term193472.getClass(), "size", 3);
        setIntField(term193472, term193472.getClass(), "hash1", 0);
        setIntField(term193472, term193472.getClass(), "hash2", 0);
        setIntField(term193472, term193472.getClass(), "hash3", 0);
        setField(term193472, term193472.getClass(), "key1", null);
        setField(term193472, term193472.getClass(), "key2", null);
        setField(term193472, term193472.getClass(), "key3", null);
        setField(term193472, term193472.getClass(), "value1", null);
        setField(term193472, term193472.getClass(), "value2", null);
        setField(term193472, term193472.getClass(), "value3", null);
        setField(term193472, term193472.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term193084;
        Object retValue = callMethod(klass, "remove", argTypes, term192870, args);
        assertTrue(recursiveEquals(term192870, term193469));
        assertTrue(recursiveEquals(term193084, term193472));
        assertTrue(recursiveEquals(retValue, null));
    }

};
