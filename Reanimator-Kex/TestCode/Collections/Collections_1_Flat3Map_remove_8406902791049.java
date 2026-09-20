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

public class Flat3Map_remove_8406902791049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209504;
     Object term209588;
     Object term209620;
     Object term209621;

    public Flat3Map_remove_8406902791049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209504 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term209504, term209504.getClass(), "delegateMap", null);
        setIntField(term209504, term209504.getClass(), "size", 1);
        term209588 = newInstance(Class.forName("java.io.ObjectInputFilter$Config$Global"));
        term209620 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term209620, term209620.getClass(), "size", 1);
        setIntField(term209620, term209620.getClass(), "hash1", 0);
        setIntField(term209620, term209620.getClass(), "hash2", 0);
        setIntField(term209620, term209620.getClass(), "hash3", 0);
        setField(term209620, term209620.getClass(), "key1", null);
        setField(term209620, term209620.getClass(), "key2", null);
        setField(term209620, term209620.getClass(), "key3", null);
        setField(term209620, term209620.getClass(), "value1", null);
        setField(term209620, term209620.getClass(), "value2", null);
        setField(term209620, term209620.getClass(), "value3", null);
        setField(term209620, term209620.getClass(), "delegateMap", null);
        term209621 = newInstance(Class.forName("java.io.ObjectInputFilter$Config$Global"));
        setField(term209621, term209621.getClass(), "pattern", null);
        setField(term209621, term209621.getClass(), "filters", null);
        setLongField(term209621, term209621.getClass(), "maxStreamBytes", 0L);
        setLongField(term209621, term209621.getClass(), "maxDepth", 0L);
        setLongField(term209621, term209621.getClass(), "maxReferences", 0L);
        setLongField(term209621, term209621.getClass(), "maxArrayLength", 0L);
        setBooleanField(term209621, term209621.getClass(), "checkComponentType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term209588;
        Object retValue = callMethod(klass, "remove", argTypes, term209504, args);
        assertTrue(recursiveEquals(term209504, term209620));
        assertTrue(recursiveEquals(term209588, term209621));
        assertTrue(recursiveEquals(retValue, null));
    }

};
