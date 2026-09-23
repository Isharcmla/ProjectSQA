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

public class FunctionType_getAllImplementedInterfaces_572683533511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378867;

    public FunctionType_getAllImplementedInterfaces_572683533511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term379863 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term379862 = ((Class) term379863).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term379862).setAccessible(true);
        Object enum697 = ((Field) term379862).get((Object) null);
        term378867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term379133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term379233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term378867, term378867.getClass(), "kind", enum697);
        setField(term379133, term379133.getClass(), "implicitPrototype", term379233);
        setField(term378867, term378867.getClass(), "prototype", term379133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term378867, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


