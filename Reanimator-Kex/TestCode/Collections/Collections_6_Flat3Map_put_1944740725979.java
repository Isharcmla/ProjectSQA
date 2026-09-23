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

public class Flat3Map_put_1944740725979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272387;
     Object term272623;
     Object term272624;

    public Flat3Map_put_1944740725979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272387 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term272423 = newInstance(Class.forName("java.lang.invoke.LambdaFormEditor"));
        setField(term272387, term272387.getClass(), "delegateMap", null);
        setIntField(term272387, term272387.getClass(), "size", 3);
        setIntField(term272387, term272387.getClass(), "hash3", 0);
        setField(term272387, term272387.getClass(), "value3", null);
        setIntField(term272387, term272387.getClass(), "hash2", 0);
        setField(term272387, term272387.getClass(), "value2", null);
        setIntField(term272387, term272387.getClass(), "hash1", 0);
        setField(term272387, term272387.getClass(), "value1", term272423);
        term272623 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term272623, term272623.getClass(), "size", 0);
        setIntField(term272623, term272623.getClass(), "hash1", 0);
        setIntField(term272623, term272623.getClass(), "hash2", 0);
        setIntField(term272623, term272623.getClass(), "hash3", 0);
        setField(term272623, term272623.getClass(), "key1", null);
        setField(term272623, term272623.getClass(), "key2", null);
        setField(term272623, term272623.getClass(), "key3", null);
        setField(term272623, term272623.getClass(), "value1", null);
        setField(term272623, term272623.getClass(), "value2", null);
        setField(term272623, term272623.getClass(), "value3", null);
        setField(term272623, term272623.getClass(), "delegateMap", true);
        term272624 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term272624, term272624.getClass(), "size", 0);
        setIntField(term272624, term272624.getClass(), "hash1", 0);
        setIntField(term272624, term272624.getClass(), "hash2", 0);
        setIntField(term272624, term272624.getClass(), "hash3", 0);
        setField(term272624, term272624.getClass(), "key1", null);
        setField(term272624, term272624.getClass(), "key2", null);
        setField(term272624, term272624.getClass(), "key3", null);
        setField(term272624, term272624.getClass(), "value1", null);
        setField(term272624, term272624.getClass(), "value2", null);
        setField(term272624, term272624.getClass(), "value3", null);
        setField(term272624, term272624.getClass(), "delegateMap", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term272387;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term272387, args);
        assertTrue(recursiveEquals(term272387, term272623));
        assertTrue(recursiveEquals(term272387, term272624));
        assertTrue(recursiveEquals(retValue, null));
    }

};


