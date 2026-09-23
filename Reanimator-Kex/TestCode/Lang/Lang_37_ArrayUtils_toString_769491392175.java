package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;

public class ArrayUtils_toString_769491392175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term6099;
     Object term6100;

    public ArrayUtils_toString_769491392175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.lang.Object"));
        term6099 = newInstance(Class.forName("org.apache.commons.lang3.builder.ToStringStyle$1"));
        setIntField(term6099, term6099.getClass(), "threadLocalHashCode", 1731955226);
        term6100 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1;
        Object retValue = callMethod(klass, "toString", argTypes, null, args);
        assertTrue(recursiveEquals(null, term6099));
        assertTrue(recursiveEquals(term1, term6100));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@6cdb09b4"));
    }

};


