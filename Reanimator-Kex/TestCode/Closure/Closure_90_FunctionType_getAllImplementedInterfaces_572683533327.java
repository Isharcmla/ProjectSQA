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
import java.util.ArrayList;

public class FunctionType_getAllImplementedInterfaces_572683533327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217880;

    public FunctionType_getAllImplementedInterfaces_572683533327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218817 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term218816 = ((Class) term218817).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term218816).setAccessible(true);
        Object enum382 = ((Field) term218816).get((Object) null);
        ArrayList term218198 = new ArrayList();
        ((ArrayList) term218198).add((Object)null);
        term217880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term218146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term217880, term217880.getClass(), "kind", enum382);
        setField(term218146, term218146.getClass(), "implicitPrototypeFallback", null);
        setField(term217880, term217880.getClass(), "prototype", term218146);
        setField(term217880, term217880.getClass(), "implementedInterfaces", term218198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term217880, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


