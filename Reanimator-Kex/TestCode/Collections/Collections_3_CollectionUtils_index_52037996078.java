package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;

public class CollectionUtils_index_52037996078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term32;
     Object term4085;
     Object term4086;
     Object term4083;

    public CollectionUtils_index_52037996078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("java.lang.Object"));
        term32 = newInstance(Class.forName("java.lang.Object"));
        term4085 = newInstance(Class.forName("java.lang.Object"));
        term4086 = newInstance(Class.forName("java.lang.Object"));
        term4083 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term31;
        args[1] = term32;
        Object retValue = callMethod(klass, "index", argTypes, null, args);
        assertTrue(recursiveEquals(term31, term4085));
        assertTrue(recursiveEquals(term32, term4086));
        assertTrue(recursiveEquals(retValue, term4083));
    }

};


