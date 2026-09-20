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

public class Flat3Map_remove_840690279219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38285;
     Object term38377;
     Object term38474;
     Object term38475;

    public Flat3Map_remove_840690279219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38285 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term38285, term38285.getClass(), "delegateMap", null);
        setIntField(term38285, term38285.getClass(), "size", -1);
        term38377 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term38474 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term38474, term38474.getClass(), "size", -1);
        setIntField(term38474, term38474.getClass(), "hash1", 0);
        setIntField(term38474, term38474.getClass(), "hash2", 0);
        setIntField(term38474, term38474.getClass(), "hash3", 0);
        setField(term38474, term38474.getClass(), "key1", null);
        setField(term38474, term38474.getClass(), "key2", null);
        setField(term38474, term38474.getClass(), "key3", null);
        setField(term38474, term38474.getClass(), "value1", null);
        setField(term38474, term38474.getClass(), "value2", null);
        setField(term38474, term38474.getClass(), "value3", null);
        setField(term38474, term38474.getClass(), "delegateMap", null);
        term38475 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term38475, term38475.getClass(), "size", 0);
        setIntField(term38475, term38475.getClass(), "hash1", 0);
        setIntField(term38475, term38475.getClass(), "hash2", 0);
        setIntField(term38475, term38475.getClass(), "hash3", 0);
        setField(term38475, term38475.getClass(), "key1", null);
        setField(term38475, term38475.getClass(), "key2", null);
        setField(term38475, term38475.getClass(), "key3", null);
        setField(term38475, term38475.getClass(), "value1", null);
        setField(term38475, term38475.getClass(), "value2", null);
        setField(term38475, term38475.getClass(), "value3", null);
        setField(term38475, term38475.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term38377;
        Object retValue = callMethod(klass, "remove", argTypes, term38285, args);
        assertTrue(recursiveEquals(term38285, term38474));
        assertTrue(recursiveEquals(term38377, term38475));
        assertTrue(recursiveEquals(retValue, null));
    }

};
