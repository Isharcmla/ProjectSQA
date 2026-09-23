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

public class Flat3Map_put_1944740725827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213092;
     Object term213454;
     Object term216061;
     Object term216066;

    public Flat3Map_put_1944740725827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213092 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213184 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213276 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term213454 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213474 = newInstance(Class.forName("java.io.Console$1"));
        setField(term213092, term213092.getClass(), "delegateMap", null);
        setIntField(term213092, term213092.getClass(), "size", 3);
        setIntField(term213092, term213092.getClass(), "hash3", 0);
        setField(term213184, term213184.getClass(), "delegateMap", null);
        setIntField(term213184, term213184.getClass(), "size", 3);
        setField(term213184, term213184.getClass(), "key3", term213276);
        setField(term213184, term213184.getClass(), "key2", null);
        setField(term213184, term213184.getClass(), "value2", null);
        setIntField(term213184, term213184.getClass(), "hash3", -1);
        setIntField(term213184, term213184.getClass(), "hash2", -1);
        setIntField(term213184, term213184.getClass(), "hash1", -1);
        setField(term213092, term213092.getClass(), "key3", term213184);
        setIntField(term213092, term213092.getClass(), "hash2", 0);
        setField(term213454, term213454.getClass(), "delegateMap", null);
        setIntField(term213454, term213454.getClass(), "size", 3);
        setIntField(term213454, term213454.getClass(), "hash3", 0);
        setField(term213454, term213454.getClass(), "value3", null);
        setIntField(term213454, term213454.getClass(), "hash2", 0);
        setField(term213454, term213454.getClass(), "value2", null);
        setIntField(term213454, term213454.getClass(), "hash1", 0);
        setField(term213454, term213454.getClass(), "value1", null);
        setField(term213454, term213454.getClass(), "key3", null);
        setField(term213454, term213454.getClass(), "key2", term213474);
        setField(term213092, term213092.getClass(), "key2", term213454);
        term216061 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term216062 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term216063 = newInstance(Class.forName("java.io.Console$1"));
        Object term216064 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term216065 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term216061, term216061.getClass(), "size", 3);
        setIntField(term216061, term216061.getClass(), "hash1", 0);
        setIntField(term216061, term216061.getClass(), "hash2", 0);
        setIntField(term216061, term216061.getClass(), "hash3", 0);
        setField(term216061, term216061.getClass(), "key1", null);
        setIntField(term216062, term216062.getClass(), "size", 3);
        setIntField(term216062, term216062.getClass(), "hash1", 0);
        setIntField(term216062, term216062.getClass(), "hash2", 15);
        setIntField(term216062, term216062.getClass(), "hash3", 0);
        setField(term216062, term216062.getClass(), "key1", null);
        setField(term216063, term216063.getClass(), "this$0", null);
        setField(term216062, term216062.getClass(), "key2", term216063);
        setField(term216062, term216062.getClass(), "key3", null);
        setField(term216062, term216062.getClass(), "value1", null);
        setField(term216062, term216062.getClass(), "value2", null);
        setField(term216062, term216062.getClass(), "value3", null);
        setField(term216062, term216062.getClass(), "delegateMap", null);
        setField(term216061, term216061.getClass(), "key2", term216062);
        setField(term216064, term216064.getClass(), "next", null);
        setField(term216064, term216064.getClass(), "key", term216065);
        setField(term216064, term216064.getClass(), "value", null);
        setField(term216061, term216061.getClass(), "key3", term216064);
        setField(term216061, term216061.getClass(), "value1", null);
        setField(term216061, term216061.getClass(), "value2", null);
        setField(term216061, term216061.getClass(), "value3", null);
        setField(term216061, term216061.getClass(), "delegateMap", null);
        term216066 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term216067 = newInstance(Class.forName("java.io.Console$1"));
        setIntField(term216066, term216066.getClass(), "size", 3);
        setIntField(term216066, term216066.getClass(), "hash1", 0);
        setIntField(term216066, term216066.getClass(), "hash2", 15);
        setIntField(term216066, term216066.getClass(), "hash3", 0);
        setField(term216066, term216066.getClass(), "key1", null);
        setField(term216067, term216067.getClass(), "this$0", null);
        setField(term216066, term216066.getClass(), "key2", term216067);
        setField(term216066, term216066.getClass(), "key3", null);
        setField(term216066, term216066.getClass(), "value1", null);
        setField(term216066, term216066.getClass(), "value2", null);
        setField(term216066, term216066.getClass(), "value3", null);
        setField(term216066, term216066.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term213454;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term213092, args);
        assertTrue(recursiveEquals(term213092, term216061));
        assertTrue(recursiveEquals(term213454, term216066));
        assertTrue(recursiveEquals(retValue, null));
    }

};


