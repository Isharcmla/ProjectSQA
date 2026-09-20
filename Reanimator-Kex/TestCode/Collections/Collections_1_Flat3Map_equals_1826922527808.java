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

public class Flat3Map_equals_1826922527808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164778;
     Object term164936;
     Object term165226;
     Object term165228;

    public Flat3Map_equals_1826922527808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164778 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164844 = newInstance(Class.forName("java.io.InterruptedIOException"));
        setField(term164778, term164778.getClass(), "delegateMap", null);
        setIntField(term164778, term164778.getClass(), "size", 3);
        setField(term164778, term164778.getClass(), "key3", null);
        setField(term164778, term164778.getClass(), "value3", null);
        setField(term164778, term164778.getClass(), "key2", term164844);
        term164936 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164974 = newInstance(Class.forName("java.lang.Object"));
        setField(term164936, term164936.getClass(), "delegateMap", null);
        setIntField(term164936, term164936.getClass(), "size", 3);
        setField(term164936, term164936.getClass(), "key3", term164974);
        setField(term164936, term164936.getClass(), "key2", null);
        setField(term164936, term164936.getClass(), "value2", null);
        term165226 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term165227 = newInstance(Class.forName("java.io.InterruptedIOException"));
        setIntField(term165226, term165226.getClass(), "size", 3);
        setIntField(term165226, term165226.getClass(), "hash1", 0);
        setIntField(term165226, term165226.getClass(), "hash2", 0);
        setIntField(term165226, term165226.getClass(), "hash3", 0);
        setField(term165226, term165226.getClass(), "key1", null);
        setIntField(term165227, term165227.getClass(), "bytesTransferred", 0);
        setField(term165227, term165227.getClass(), "backtrace", null);
        setField(term165227, term165227.getClass(), "detailMessage", null);
        setField(term165227, term165227.getClass(), "cause", null);
        setField(term165227, term165227.getClass(), "stackTrace", null);
        setIntField(term165227, term165227.getClass(), "depth", 0);
        setField(term165227, term165227.getClass(), "suppressedExceptions", null);
        setField(term165226, term165226.getClass(), "key2", term165227);
        setField(term165226, term165226.getClass(), "key3", null);
        setField(term165226, term165226.getClass(), "value1", null);
        setField(term165226, term165226.getClass(), "value2", null);
        setField(term165226, term165226.getClass(), "value3", null);
        setField(term165226, term165226.getClass(), "delegateMap", null);
        term165228 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term165229 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term165228, term165228.getClass(), "size", 3);
        setIntField(term165228, term165228.getClass(), "hash1", 0);
        setIntField(term165228, term165228.getClass(), "hash2", 0);
        setIntField(term165228, term165228.getClass(), "hash3", 0);
        setField(term165228, term165228.getClass(), "key1", null);
        setField(term165228, term165228.getClass(), "key2", null);
        setField(term165228, term165228.getClass(), "key3", term165229);
        setField(term165228, term165228.getClass(), "value1", null);
        setField(term165228, term165228.getClass(), "value2", null);
        setField(term165228, term165228.getClass(), "value3", null);
        setField(term165228, term165228.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term164936;
        Object retValue = callMethod(klass, "equals", argTypes, term164778, args);
        assertTrue(recursiveEquals(term164778, term165226));
        assertTrue(recursiveEquals(term164936, term165228));
        assertTrue(recursiveEquals(retValue, false));
    }

};
