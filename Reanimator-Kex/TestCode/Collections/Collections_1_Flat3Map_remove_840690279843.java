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

public class Flat3Map_remove_840690279843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169884;
     Object term169982;
     Object term170084;
     Object term170085;

    public Flat3Map_remove_840690279843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169884 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term169884, term169884.getClass(), "delegateMap", null);
        setIntField(term169884, term169884.getClass(), "size", 1073741824);
        term169982 = newInstance(Class.forName("java.lang.reflect.MalformedParametersException"));
        term170084 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term170084, term170084.getClass(), "size", 1073741824);
        setIntField(term170084, term170084.getClass(), "hash1", 0);
        setIntField(term170084, term170084.getClass(), "hash2", 0);
        setIntField(term170084, term170084.getClass(), "hash3", 0);
        setField(term170084, term170084.getClass(), "key1", null);
        setField(term170084, term170084.getClass(), "key2", null);
        setField(term170084, term170084.getClass(), "key3", null);
        setField(term170084, term170084.getClass(), "value1", null);
        setField(term170084, term170084.getClass(), "value2", null);
        setField(term170084, term170084.getClass(), "value3", null);
        setField(term170084, term170084.getClass(), "delegateMap", null);
        term170085 = newInstance(Class.forName("java.lang.reflect.MalformedParametersException"));
        setField(term170085, term170085.getClass(), "backtrace", null);
        setField(term170085, term170085.getClass(), "detailMessage", null);
        setField(term170085, term170085.getClass(), "cause", null);
        setField(term170085, term170085.getClass(), "stackTrace", null);
        setIntField(term170085, term170085.getClass(), "depth", 0);
        setField(term170085, term170085.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term169982;
        Object retValue = callMethod(klass, "remove", argTypes, term169884, args);
        assertTrue(recursiveEquals(term169884, term170084));
        assertTrue(recursiveEquals(term169982, term170085));
        assertTrue(recursiveEquals(retValue, null));
    }

};
