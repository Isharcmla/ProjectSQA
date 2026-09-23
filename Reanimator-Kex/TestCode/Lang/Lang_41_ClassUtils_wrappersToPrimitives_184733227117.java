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

public class ClassUtils_wrappersToPrimitives_184733227117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45304;
     Object term48139;
     Object term48137;

    public ClassUtils_wrappersToPrimitives_184733227117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45304 = (Object[]) newArray("java.lang.Class", 0);
        term48139 = (Object[]) newArray("java.lang.Class", 0);
        term48137 = (Object[]) newArray("java.lang.Class", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.ClassUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term45304;
        Object retValue = callMethod(klass, "wrappersToPrimitives", argTypes, null, args);
        assertTrue(recursiveEquals(term45304, term48139));
        assertTrue(recursiveEquals(retValue, term48137));
    }

};


