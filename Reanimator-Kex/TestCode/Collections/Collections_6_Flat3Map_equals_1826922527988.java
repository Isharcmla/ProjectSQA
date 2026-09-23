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

public class Flat3Map_equals_1826922527988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274569;
     Object term274703;
     Object term276014;
     Object term276016;

    public Flat3Map_equals_1826922527988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274569 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term274611 = newInstance(Class.forName("java.lang.Compiler"));
        setField(term274569, term274569.getClass(), "delegateMap", null);
        setIntField(term274569, term274569.getClass(), "size", 3);
        setField(term274569, term274569.getClass(), "key3", null);
        setField(term274569, term274569.getClass(), "value3", null);
        setField(term274569, term274569.getClass(), "key2", term274611);
        term274703 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term274741 = newInstance(Class.forName("java.lang.Object"));
        setField(term274703, term274703.getClass(), "delegateMap", null);
        setIntField(term274703, term274703.getClass(), "size", 3);
        setField(term274703, term274703.getClass(), "key3", term274741);
        setField(term274703, term274703.getClass(), "key2", null);
        setField(term274703, term274703.getClass(), "value2", null);
        term276014 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term276015 = newInstance(Class.forName("java.lang.Compiler"));
        setIntField(term276014, term276014.getClass(), "size", 3);
        setIntField(term276014, term276014.getClass(), "hash1", 0);
        setIntField(term276014, term276014.getClass(), "hash2", 0);
        setIntField(term276014, term276014.getClass(), "hash3", 0);
        setField(term276014, term276014.getClass(), "key1", null);
        setField(term276014, term276014.getClass(), "key2", term276015);
        setField(term276014, term276014.getClass(), "key3", null);
        setField(term276014, term276014.getClass(), "value1", null);
        setField(term276014, term276014.getClass(), "value2", null);
        setField(term276014, term276014.getClass(), "value3", null);
        setField(term276014, term276014.getClass(), "delegateMap", null);
        term276016 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term276017 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term276016, term276016.getClass(), "size", 3);
        setIntField(term276016, term276016.getClass(), "hash1", 0);
        setIntField(term276016, term276016.getClass(), "hash2", 0);
        setIntField(term276016, term276016.getClass(), "hash3", 0);
        setField(term276016, term276016.getClass(), "key1", null);
        setField(term276016, term276016.getClass(), "key2", null);
        setField(term276016, term276016.getClass(), "key3", term276017);
        setField(term276016, term276016.getClass(), "value1", null);
        setField(term276016, term276016.getClass(), "value2", null);
        setField(term276016, term276016.getClass(), "value3", null);
        setField(term276016, term276016.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term274703;
        Object retValue = callMethod(klass, "equals", argTypes, term274569, args);
        assertTrue(recursiveEquals(term274569, term276014));
        assertTrue(recursiveEquals(term274703, term276016));
        assertTrue(recursiveEquals(retValue, false));
    }

};


