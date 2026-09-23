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

public class Flat3Map_hashCode_2019358094240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39399;
     Object term39632;

    public Flat3Map_hashCode_2019358094240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39399 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39451 = newInstance(Class.forName("java.lang.ClassLoader$1"));
        setField(term39399, term39399.getClass(), "delegateMap", null);
        setIntField(term39399, term39399.getClass(), "size", 2);
        setIntField(term39399, term39399.getClass(), "hash2", 0);
        setField(term39399, term39399.getClass(), "value2", term39451);
        term39632 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39633 = newInstance(Class.forName("java.lang.ClassLoader$1"));
        setIntField(term39632, term39632.getClass(), "size", 2);
        setIntField(term39632, term39632.getClass(), "hash1", 0);
        setIntField(term39632, term39632.getClass(), "hash2", 0);
        setIntField(term39632, term39632.getClass(), "hash3", 0);
        setField(term39632, term39632.getClass(), "key1", null);
        setField(term39632, term39632.getClass(), "key2", null);
        setField(term39632, term39632.getClass(), "key3", null);
        setField(term39632, term39632.getClass(), "value1", null);
        setField(term39633, term39633.getClass(), "val$sm", null);
        setField(term39633, term39633.getClass(), "val$packageName", null);
        setField(term39633, term39633.getClass(), "this$0", null);
        setField(term39632, term39632.getClass(), "value2", term39633);
        setField(term39632, term39632.getClass(), "value3", null);
        setField(term39632, term39632.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term39399, args);
        assertTrue(recursiveEquals(term39399, term39632));
        assertTrue(recursiveEquals(retValue, 1954145670));
    }

};


