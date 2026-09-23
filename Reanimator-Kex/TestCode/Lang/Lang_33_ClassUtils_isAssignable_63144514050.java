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
import java.lang.Boolean;

public class ClassUtils_isAssignable_63144514050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230;
     Object term231;
     Object term232;
     Object term3007;
     Object term3008;

    public ClassUtils_isAssignable_63144514050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230 = (Object[]) newArray("java.lang.Class", 4);
        term231 = (Object[]) newArray("java.lang.Class", 0);
        term232 = new Boolean(false);
        term3007 = (Object[]) newArray("java.lang.Class", 4);
        term3008 = (Object[]) newArray("java.lang.Class", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term230;
        args[1] = term231;
        args[2] = term232;
        Object retValue = callMethod(klass, "isAssignable", argTypes, null, args);
        assertTrue(recursiveEquals(term230, term3007));
        assertTrue(recursiveEquals(term231, term3008));
        assertTrue(recursiveEquals(term232, false));
        assertTrue(recursiveEquals(retValue, false));
    }

};


