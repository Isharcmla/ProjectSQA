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
import java.lang.Boolean;

public class ClassUtils_isAssignable_169571810350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230;
     Object term231;
     Object term232;
     Object term2996;
     Object term2997;

    public ClassUtils_isAssignable_169571810350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230 = (Object[]) newArray("java.lang.Class", 2);
        term231 = (Object[]) newArray("java.lang.Class", 9);
        term232 = new Boolean(false);
        term2996 = (Object[]) newArray("java.lang.Class", 2);
        term2997 = (Object[]) newArray("java.lang.Class", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.ClassUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term230;
        args[1] = term231;
        args[2] = term232;
        Object retValue = callMethod(klass, "isAssignable", argTypes, null, args);
        assertTrue(recursiveEquals(term230, term2996));
        assertTrue(recursiveEquals(term231, term2997));
        assertTrue(recursiveEquals(term232, false));
        assertTrue(recursiveEquals(retValue, false));
    }

};


