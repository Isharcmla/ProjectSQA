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

public class Flat3Map_remove_840690279918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184649;
     Object term184681;
     Object term185054;
     Object term185055;

    public Flat3Map_remove_840690279918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184649 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term184649, term184649.getClass(), "delegateMap", null);
        setIntField(term184649, term184649.getClass(), "size", 2);
        term184681 = newInstance(Class.forName("java.nio.Bits"));
        term185054 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term185054, term185054.getClass(), "size", 2);
        setIntField(term185054, term185054.getClass(), "hash1", 0);
        setIntField(term185054, term185054.getClass(), "hash2", 0);
        setIntField(term185054, term185054.getClass(), "hash3", 0);
        setField(term185054, term185054.getClass(), "key1", null);
        setField(term185054, term185054.getClass(), "key2", null);
        setField(term185054, term185054.getClass(), "key3", null);
        setField(term185054, term185054.getClass(), "value1", null);
        setField(term185054, term185054.getClass(), "value2", null);
        setField(term185054, term185054.getClass(), "value3", null);
        setField(term185054, term185054.getClass(), "delegateMap", null);
        term185055 = newInstance(Class.forName("java.nio.Bits"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term184681;
        Object retValue = callMethod(klass, "remove", argTypes, term184649, args);
        assertTrue(recursiveEquals(term184649, term185054));
        assertTrue(recursiveEquals(term184681, term185055));
        assertTrue(recursiveEquals(retValue, null));
    }

};
