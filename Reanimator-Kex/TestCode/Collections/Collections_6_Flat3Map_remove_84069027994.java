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

public class Flat3Map_remove_84069027994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18278;
     Object term18515;

    public Flat3Map_remove_84069027994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18278 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term18278, term18278.getClass(), "delegateMap", null);
        term18515 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term18515, term18515.getClass(), "size", 0);
        setIntField(term18515, term18515.getClass(), "hash1", 0);
        setIntField(term18515, term18515.getClass(), "hash2", 0);
        setIntField(term18515, term18515.getClass(), "hash3", 0);
        setField(term18515, term18515.getClass(), "key1", null);
        setField(term18515, term18515.getClass(), "key2", null);
        setField(term18515, term18515.getClass(), "key3", null);
        setField(term18515, term18515.getClass(), "value1", null);
        setField(term18515, term18515.getClass(), "value2", null);
        setField(term18515, term18515.getClass(), "value3", null);
        setField(term18515, term18515.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term18278, args);
        assertTrue(recursiveEquals(term18278, term18515));
        assertTrue(recursiveEquals(retValue, null));
    }

};


