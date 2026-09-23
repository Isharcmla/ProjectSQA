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

public class FunctionType_getAllImplementedInterfaces_572683533377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230258;

    public FunctionType_getAllImplementedInterfaces_572683533377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term231265 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term231264 = ((Class) term231265).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term231264).setAccessible(true);
        Object enum416 = ((Field) term231264).get((Object) null);
        term230258 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term230524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term230632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term230258, term230258.getClass(), "kind", enum416);
        setField(term230524, term230524.getClass(), "implicitPrototype", term230632);
        setField(term230258, term230258.getClass(), "prototype", term230524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term230258, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


