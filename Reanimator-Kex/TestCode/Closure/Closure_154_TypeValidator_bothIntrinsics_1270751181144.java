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

public class TypeValidator_bothIntrinsics_1270751181144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34257;
     Object term34361;

    public TypeValidator_bothIntrinsics_1270751181144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34257 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term35087 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term35086 = ((Class) term35087).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term35086).setAccessible(true);
        Object enum11 = ((Field) term35086).get((Object) null);
        term34361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term34361, term34361.getClass(), "kind", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34361;
        try {
            callMethod(klass, "bothIntrinsics", argTypes, term34257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


