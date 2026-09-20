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

public class Flat3Map_remove_8406902791063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211209;
     Object term211293;
     Object term212012;
     Object term212013;

    public Flat3Map_remove_8406902791063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211209 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term211209, term211209.getClass(), "delegateMap", null);
        setIntField(term211209, term211209.getClass(), "size", 3);
        term211293 = newInstance(Class.forName("java.io.ObjectInputFilter$Config$Global"));
        term212012 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term212012, term212012.getClass(), "size", 3);
        setIntField(term212012, term212012.getClass(), "hash1", 0);
        setIntField(term212012, term212012.getClass(), "hash2", 0);
        setIntField(term212012, term212012.getClass(), "hash3", 0);
        setField(term212012, term212012.getClass(), "key1", null);
        setField(term212012, term212012.getClass(), "key2", null);
        setField(term212012, term212012.getClass(), "key3", null);
        setField(term212012, term212012.getClass(), "value1", null);
        setField(term212012, term212012.getClass(), "value2", null);
        setField(term212012, term212012.getClass(), "value3", null);
        setField(term212012, term212012.getClass(), "delegateMap", null);
        term212013 = newInstance(Class.forName("java.io.ObjectInputFilter$Config$Global"));
        setField(term212013, term212013.getClass(), "pattern", null);
        setField(term212013, term212013.getClass(), "filters", null);
        setLongField(term212013, term212013.getClass(), "maxStreamBytes", 0L);
        setLongField(term212013, term212013.getClass(), "maxDepth", 0L);
        setLongField(term212013, term212013.getClass(), "maxReferences", 0L);
        setLongField(term212013, term212013.getClass(), "maxArrayLength", 0L);
        setBooleanField(term212013, term212013.getClass(), "checkComponentType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term211293;
        Object retValue = callMethod(klass, "remove", argTypes, term211209, args);
        assertTrue(recursiveEquals(term211209, term212012));
        assertTrue(recursiveEquals(term211293, term212013));
        assertTrue(recursiveEquals(retValue, null));
    }

};
