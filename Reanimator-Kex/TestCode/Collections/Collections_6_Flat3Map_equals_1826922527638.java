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

public class Flat3Map_equals_1826922527638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140331;
     Object term140533;
     Object term141445;
     Object term141447;

    public Flat3Map_equals_1826922527638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140331 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140441 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term140331, term140331.getClass(), "delegateMap", null);
        setIntField(term140331, term140331.getClass(), "size", 2);
        setField(term140331, term140331.getClass(), "key2", null);
        setField(term140331, term140331.getClass(), "value2", term140441);
        term140533 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140643 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term140533, term140533.getClass(), "delegateMap", null);
        setIntField(term140533, term140533.getClass(), "size", 2);
        setField(term140533, term140533.getClass(), "key2", null);
        setField(term140533, term140533.getClass(), "value2", term140643);
        term141445 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141446 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term141445, term141445.getClass(), "size", 2);
        setIntField(term141445, term141445.getClass(), "hash1", 0);
        setIntField(term141445, term141445.getClass(), "hash2", 0);
        setIntField(term141445, term141445.getClass(), "hash3", 0);
        setField(term141445, term141445.getClass(), "key1", null);
        setField(term141445, term141445.getClass(), "key2", null);
        setField(term141445, term141445.getClass(), "key3", null);
        setField(term141445, term141445.getClass(), "value1", null);
        setFloatField(term141446, term141446.getClass(), "loadFactor", 0.0F);
        setIntField(term141446, term141446.getClass(), "size", 0);
        setField(term141446, term141446.getClass(), "data", null);
        setIntField(term141446, term141446.getClass(), "threshold", 0);
        setIntField(term141446, term141446.getClass(), "modCount", 0);
        setField(term141446, term141446.getClass(), "entrySet", null);
        setField(term141446, term141446.getClass(), "keySet", null);
        setField(term141446, term141446.getClass(), "values", null);
        setField(term141446, term141446.getClass(), "keySet", null);
        setField(term141446, term141446.getClass(), "values", null);
        setField(term141445, term141445.getClass(), "value2", term141446);
        setField(term141445, term141445.getClass(), "value3", null);
        setField(term141445, term141445.getClass(), "delegateMap", null);
        term141447 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141448 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term141447, term141447.getClass(), "size", 2);
        setIntField(term141447, term141447.getClass(), "hash1", 0);
        setIntField(term141447, term141447.getClass(), "hash2", 0);
        setIntField(term141447, term141447.getClass(), "hash3", 0);
        setField(term141447, term141447.getClass(), "key1", null);
        setField(term141447, term141447.getClass(), "key2", null);
        setField(term141447, term141447.getClass(), "key3", null);
        setField(term141447, term141447.getClass(), "value1", null);
        setFloatField(term141448, term141448.getClass(), "loadFactor", 0.0F);
        setIntField(term141448, term141448.getClass(), "size", 0);
        setField(term141448, term141448.getClass(), "data", null);
        setIntField(term141448, term141448.getClass(), "threshold", 0);
        setIntField(term141448, term141448.getClass(), "modCount", 0);
        setField(term141448, term141448.getClass(), "entrySet", null);
        setField(term141448, term141448.getClass(), "keySet", null);
        setField(term141448, term141448.getClass(), "values", null);
        setField(term141448, term141448.getClass(), "keySet", null);
        setField(term141448, term141448.getClass(), "values", null);
        setField(term141447, term141447.getClass(), "value2", term141448);
        setField(term141447, term141447.getClass(), "value3", null);
        setField(term141447, term141447.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term140533;
        Object retValue = callMethod(klass, "equals", argTypes, term140331, args);
        assertTrue(recursiveEquals(term140331, term141445));
        assertTrue(recursiveEquals(term140533, term141447));
        assertTrue(recursiveEquals(retValue, false));
    }

};


