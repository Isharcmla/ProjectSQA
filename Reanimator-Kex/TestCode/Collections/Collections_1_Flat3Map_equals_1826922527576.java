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
import java.util.HashMap;

public class Flat3Map_equals_1826922527576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109932;
     Object term110072;
     Object term110514;
     Object term110517;

    public Flat3Map_equals_1826922527576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term110096 = new HashMap();
        term109932 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term109932, term109932.getClass(), "delegateMap", null);
        setIntField(term109932, term109932.getClass(), "size", 2);
        setField(term109932, term109932.getClass(), "key2", term110096);
        term110072 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term110072, term110072.getClass(), "delegateMap", null);
        setIntField(term110072, term110072.getClass(), "size", 2);
        setIntField(term110072, term110072.getClass(), "hash2", 0);
        setField(term110072, term110072.getClass(), "key2", term110096);
        HashMap term110515 = new HashMap();
        term110514 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term110514, term110514.getClass(), "size", 2);
        setIntField(term110514, term110514.getClass(), "hash1", 0);
        setIntField(term110514, term110514.getClass(), "hash2", 0);
        setIntField(term110514, term110514.getClass(), "hash3", 0);
        setField(term110514, term110514.getClass(), "key1", null);
        setField(term110514, term110514.getClass(), "key2", term110515);
        setField(term110514, term110514.getClass(), "key3", null);
        setField(term110514, term110514.getClass(), "value1", null);
        setField(term110514, term110514.getClass(), "value2", null);
        setField(term110514, term110514.getClass(), "value3", null);
        setField(term110514, term110514.getClass(), "delegateMap", null);
        HashMap term110518 = new HashMap();
        term110517 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term110517, term110517.getClass(), "size", 2);
        setIntField(term110517, term110517.getClass(), "hash1", 0);
        setIntField(term110517, term110517.getClass(), "hash2", 0);
        setIntField(term110517, term110517.getClass(), "hash3", 0);
        setField(term110517, term110517.getClass(), "key1", null);
        setField(term110517, term110517.getClass(), "key2", term110518);
        setField(term110517, term110517.getClass(), "key3", null);
        setField(term110517, term110517.getClass(), "value1", null);
        setField(term110517, term110517.getClass(), "value2", null);
        setField(term110517, term110517.getClass(), "value3", null);
        setField(term110517, term110517.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term110072;
        Object retValue = callMethod(klass, "equals", argTypes, term109932, args);
        assertTrue(recursiveEquals(term109932, term110514));
        assertTrue(recursiveEquals(term110072, term110517));
        assertTrue(recursiveEquals(retValue, true));
    }

};
