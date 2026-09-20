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

public class Flat3Map_equals_1826922527773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156795;
     Object term156935;
     Object term156992;
     Object term156995;

    public Flat3Map_equals_1826922527773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term156843 = new HashMap();
        term156795 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term156795, term156795.getClass(), "delegateMap", null);
        setIntField(term156795, term156795.getClass(), "size", 3);
        setField(term156795, term156795.getClass(), "key3", null);
        setField(term156795, term156795.getClass(), "value3", null);
        setField(term156795, term156795.getClass(), "key2", term156843);
        term156935 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term156935, term156935.getClass(), "delegateMap", null);
        setIntField(term156935, term156935.getClass(), "size", 3);
        setField(term156935, term156935.getClass(), "key3", null);
        setField(term156935, term156935.getClass(), "value3", null);
        setIntField(term156935, term156935.getClass(), "hash3", 0);
        HashMap term156993 = new HashMap();
        term156992 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term156992, term156992.getClass(), "size", 3);
        setIntField(term156992, term156992.getClass(), "hash1", 0);
        setIntField(term156992, term156992.getClass(), "hash2", 0);
        setIntField(term156992, term156992.getClass(), "hash3", 0);
        setField(term156992, term156992.getClass(), "key1", null);
        setField(term156992, term156992.getClass(), "key2", term156993);
        setField(term156992, term156992.getClass(), "key3", null);
        setField(term156992, term156992.getClass(), "value1", null);
        setField(term156992, term156992.getClass(), "value2", null);
        setField(term156992, term156992.getClass(), "value3", null);
        setField(term156992, term156992.getClass(), "delegateMap", null);
        term156995 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term156995, term156995.getClass(), "size", 3);
        setIntField(term156995, term156995.getClass(), "hash1", 0);
        setIntField(term156995, term156995.getClass(), "hash2", 0);
        setIntField(term156995, term156995.getClass(), "hash3", 0);
        setField(term156995, term156995.getClass(), "key1", null);
        setField(term156995, term156995.getClass(), "key2", null);
        setField(term156995, term156995.getClass(), "key3", null);
        setField(term156995, term156995.getClass(), "value1", null);
        setField(term156995, term156995.getClass(), "value2", null);
        setField(term156995, term156995.getClass(), "value3", null);
        setField(term156995, term156995.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term156935;
        Object retValue = callMethod(klass, "equals", argTypes, term156795, args);
        assertTrue(recursiveEquals(term156795, term156992));
        assertTrue(recursiveEquals(term156935, term156995));
        assertTrue(recursiveEquals(retValue, false));
    }

};
