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

public class Flat3Map_equals_1826922527693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136731;
     Object term136891;
     Object term136936;
     Object term136938;

    public Flat3Map_equals_1826922527693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136731 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term136799 = newInstance(Class.forName("java.util.stream.DoubleStream$1"));
        setField(term136731, term136731.getClass(), "delegateMap", null);
        setIntField(term136731, term136731.getClass(), "size", 2);
        setField(term136731, term136731.getClass(), "key2", term136799);
        term136891 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term136891, term136891.getClass(), "delegateMap", null);
        setIntField(term136891, term136891.getClass(), "size", 2);
        setIntField(term136891, term136891.getClass(), "hash2", 0);
        term136936 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term136937 = newInstance(Class.forName("java.util.stream.DoubleStream$1"));
        setIntField(term136936, term136936.getClass(), "size", 2);
        setIntField(term136936, term136936.getClass(), "hash1", 0);
        setIntField(term136936, term136936.getClass(), "hash2", 0);
        setIntField(term136936, term136936.getClass(), "hash3", 0);
        setField(term136936, term136936.getClass(), "key1", null);
        setDoubleField(term136937, term136937.getClass(), "prev", 0.0);
        setBooleanField(term136937, term136937.getClass(), "started", false);
        setField(term136937, term136937.getClass(), "val$f", null);
        setDoubleField(term136937, term136937.getClass(), "val$seed", 0.0);
        setIntField(term136937, term136937.getClass(), "characteristics", 0);
        setLongField(term136937, term136937.getClass(), "est", 0L);
        setIntField(term136937, term136937.getClass(), "batch", 0);
        setField(term136936, term136936.getClass(), "key2", term136937);
        setField(term136936, term136936.getClass(), "key3", null);
        setField(term136936, term136936.getClass(), "value1", null);
        setField(term136936, term136936.getClass(), "value2", null);
        setField(term136936, term136936.getClass(), "value3", null);
        setField(term136936, term136936.getClass(), "delegateMap", null);
        term136938 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term136938, term136938.getClass(), "size", 2);
        setIntField(term136938, term136938.getClass(), "hash1", 0);
        setIntField(term136938, term136938.getClass(), "hash2", 0);
        setIntField(term136938, term136938.getClass(), "hash3", 0);
        setField(term136938, term136938.getClass(), "key1", null);
        setField(term136938, term136938.getClass(), "key2", null);
        setField(term136938, term136938.getClass(), "key3", null);
        setField(term136938, term136938.getClass(), "value1", null);
        setField(term136938, term136938.getClass(), "value2", null);
        setField(term136938, term136938.getClass(), "value3", null);
        setField(term136938, term136938.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term136891;
        Object retValue = callMethod(klass, "equals", argTypes, term136731, args);
        assertTrue(recursiveEquals(term136731, term136936));
        assertTrue(recursiveEquals(term136891, term136938));
        assertTrue(recursiveEquals(retValue, false));
    }

};
