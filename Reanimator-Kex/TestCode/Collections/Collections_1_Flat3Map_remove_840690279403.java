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

public class Flat3Map_remove_840690279403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74219;
     Object term74514;

    public Flat3Map_remove_840690279403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74219 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term74219, term74219.getClass(), "delegateMap", null);
        setIntField(term74219, term74219.getClass(), "size", 1);
        term74514 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term74514, term74514.getClass(), "size", 0);
        setIntField(term74514, term74514.getClass(), "hash1", 0);
        setIntField(term74514, term74514.getClass(), "hash2", 0);
        setIntField(term74514, term74514.getClass(), "hash3", 0);
        setField(term74514, term74514.getClass(), "key1", null);
        setField(term74514, term74514.getClass(), "key2", null);
        setField(term74514, term74514.getClass(), "key3", null);
        setField(term74514, term74514.getClass(), "value1", null);
        setField(term74514, term74514.getClass(), "value2", null);
        setField(term74514, term74514.getClass(), "value3", null);
        setField(term74514, term74514.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term74219, args);
        assertTrue(recursiveEquals(term74219, term74514));
        assertTrue(recursiveEquals(retValue, null));
    }

};
