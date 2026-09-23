package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;

public class ClassUtils_isAssignable_67332677349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228;
     Object term229;
     Object term2983;
     Object term2984;

    public ClassUtils_isAssignable_67332677349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228 = (Object[]) newArray("java.lang.Class", 3);
        term229 = (Object[]) newArray("java.lang.Class", 7);
        term2983 = (Object[]) newArray("java.lang.Class", 3);
        term2984 = (Object[]) newArray("java.lang.Class", 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.ClassUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term228;
        args[1] = term229;
        callMethod(klass, "isAssignable", argTypes, null, args);
        assertTrue(recursiveEquals(term228, term2983));
        assertTrue(recursiveEquals(term229, term2984));
    }

};


