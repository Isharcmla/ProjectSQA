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

public class FunctionType_getGreatestSubtype_679591709375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272946;
     Object term273314;

    public FunctionType_getGreatestSubtype_679591709375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term274528 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term274527 = ((Class) term274528).getDeclaredField((String) "ORDINARY");
        ((Field) term274527).setAccessible(true);
        Object enum506 = ((Field) term274527).get((Object) null);
        term272946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term273204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term272946, term272946.getClass(), "kind", enum506);
        setField(term272946, term272946.getClass(), "typeOfThis", term273204);
        Class<? extends Object> term274819 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term274818 = ((Class) term274819).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term274818).setAccessible(true);
        Object enum507 = ((Field) term274818).get((Object) null);
        term273314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term273562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term273314, term273314.getClass(), "kind", enum507);
        setField(term273314, term273314.getClass(), "typeOfThis", term273562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term273314;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term272946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


