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

public class Flat3Map_equals_1826922527762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154324;
     Object term154486;
     Object term154976;
     Object term154978;

    public Flat3Map_equals_1826922527762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154324 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term154394 = newInstance(Class.forName("java.util.InputMismatchException"));
        setField(term154324, term154324.getClass(), "delegateMap", null);
        setIntField(term154324, term154324.getClass(), "size", 2);
        setField(term154324, term154324.getClass(), "key2", null);
        setField(term154324, term154324.getClass(), "value2", null);
        setField(term154324, term154324.getClass(), "key1", term154394);
        term154486 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term154486, term154486.getClass(), "delegateMap", null);
        setIntField(term154486, term154486.getClass(), "size", 2);
        setField(term154486, term154486.getClass(), "key2", null);
        setField(term154486, term154486.getClass(), "value2", null);
        setIntField(term154486, term154486.getClass(), "hash2", -1);
        setIntField(term154486, term154486.getClass(), "hash1", 0);
        term154976 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term154977 = newInstance(Class.forName("java.util.InputMismatchException"));
        setIntField(term154976, term154976.getClass(), "size", 2);
        setIntField(term154976, term154976.getClass(), "hash1", 0);
        setIntField(term154976, term154976.getClass(), "hash2", 0);
        setIntField(term154976, term154976.getClass(), "hash3", 0);
        setField(term154977, term154977.getClass(), "backtrace", null);
        setField(term154977, term154977.getClass(), "detailMessage", null);
        setField(term154977, term154977.getClass(), "cause", null);
        setField(term154977, term154977.getClass(), "stackTrace", null);
        setIntField(term154977, term154977.getClass(), "depth", 0);
        setField(term154977, term154977.getClass(), "suppressedExceptions", null);
        setField(term154976, term154976.getClass(), "key1", term154977);
        setField(term154976, term154976.getClass(), "key2", null);
        setField(term154976, term154976.getClass(), "key3", null);
        setField(term154976, term154976.getClass(), "value1", null);
        setField(term154976, term154976.getClass(), "value2", null);
        setField(term154976, term154976.getClass(), "value3", null);
        setField(term154976, term154976.getClass(), "delegateMap", null);
        term154978 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term154978, term154978.getClass(), "size", 2);
        setIntField(term154978, term154978.getClass(), "hash1", 0);
        setIntField(term154978, term154978.getClass(), "hash2", -1);
        setIntField(term154978, term154978.getClass(), "hash3", 0);
        setField(term154978, term154978.getClass(), "key1", null);
        setField(term154978, term154978.getClass(), "key2", null);
        setField(term154978, term154978.getClass(), "key3", null);
        setField(term154978, term154978.getClass(), "value1", null);
        setField(term154978, term154978.getClass(), "value2", null);
        setField(term154978, term154978.getClass(), "value3", null);
        setField(term154978, term154978.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term154486;
        Object retValue = callMethod(klass, "equals", argTypes, term154324, args);
        assertTrue(recursiveEquals(term154324, term154976));
        assertTrue(recursiveEquals(term154486, term154978));
        assertTrue(recursiveEquals(retValue, false));
    }

};
