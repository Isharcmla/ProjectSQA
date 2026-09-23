package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_getAllImplementedInterfaces_572683533199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91990;

    public FunctionType_getAllImplementedInterfaces_572683533199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92989 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term92988 = ((Class) term92989).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term92988).setAccessible(true);
        Object enum192 = ((Field) term92988).get((Object) null);
        term91990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term92256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term92356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term91990, term91990.getClass(), "kind", enum192);
        setField(term92256, term92256.getClass(), "implicitPrototype", term92356);
        setField(term91990, term91990.getClass(), "prototype", term92256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term91990, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


