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

public class FunctionType_getAllImplementedInterfaces_572683533381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279908;

    public FunctionType_getAllImplementedInterfaces_572683533381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term280917 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term280916 = ((Class) term280917).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term280916).setAccessible(true);
        Object enum491 = ((Field) term280916).get((Object) null);
        term279908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term280174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term280274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term279908, term279908.getClass(), "kind", enum491);
        setField(term280174, term280174.getClass(), "implicitPrototypeFallback", term280274);
        setField(term279908, term279908.getClass(), "prototype", term280174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term279908, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


