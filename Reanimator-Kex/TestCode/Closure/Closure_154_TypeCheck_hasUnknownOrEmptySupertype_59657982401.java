package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TypeCheck_hasUnknownOrEmptySupertype_59657982401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109971;

    public TypeCheck_hasUnknownOrEmptySupertype_59657982401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term111013 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term111012 = ((Class) term111013).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term111012).setAccessible(true);
        Object enum26 = ((Field) term111012).get((Object) null);
        term109971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term109971, term109971.getClass(), "kind", enum26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term109971;
        try {
            callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


