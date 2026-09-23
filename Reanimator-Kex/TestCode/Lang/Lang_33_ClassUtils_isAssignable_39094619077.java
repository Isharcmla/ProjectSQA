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
import java.lang.Object;

public class ClassUtils_isAssignable_39094619077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7743;
     Object term7801;
     Object term7802;

    public ClassUtils_isAssignable_39094619077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7743 = (Object[]) newArray("java.lang.Class", 0);
        term7801 = (Object[]) newArray("java.lang.Class", 0);
        term7802 = (Object[]) newArray("java.lang.Class", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term7743;
        args[1] = term7743;
        callMethod(klass, "isAssignable", argTypes, null, args);
        assertTrue(recursiveEquals(term7743, term7801));
        assertTrue(recursiveEquals(term7743, term7802));
    }

};


