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

public class Flat3Map_containsKey_76092510754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184888;
     Object term190498;
     Object term190499;

    public Flat3Map_containsKey_76092510754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184888 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term184888, term184888.getClass(), "delegateMap", null);
        setIntField(term184888, term184888.getClass(), "size", 0);
        term190498 = newInstance(Class.forName("java.lang.Object"));
        term190499 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term184888;
        callMethod(klass, "containsKey", argTypes, term184888, args);
        assertTrue(recursiveEquals(term184888, term190498));
        assertTrue(recursiveEquals(term184888, term190499));
    }

};


