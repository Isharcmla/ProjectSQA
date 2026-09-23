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

public class FunctionType_getGreatestSubtype_679591709695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727759;
     Object term728533;

    public FunctionType_getGreatestSubtype_679591709695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term729930 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term729929 = ((Class) term729930).getDeclaredField((String) "INTERFACE");
        ((Field) term729929).setAccessible(true);
        Object enum1103 = ((Field) term729929).get((Object) null);
        term727759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term728313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term728423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term727759, term727759.getClass(), "kind", enum1103);
        setField(term728313, term728313.getClass(), "kind", enum1103);
        setField(term728313, term728313.getClass(), "typeOfThis", term728423);
        setField(term727759, term727759.getClass(), "typeOfThis", term728313);
        Class<? extends Object> term730224 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term730223 = ((Class) term730224).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term730223).setAccessible(true);
        Object enum1104 = ((Field) term730223).get((Object) null);
        term728533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term728855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term728955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term728533, term728533.getClass(), "kind", enum1103);
        setField(term728855, term728855.getClass(), "kind", enum1103);
        setField(term728955, term728955.getClass(), "kind", enum1104);
        setField(term728955, term728955.getClass(), "typeOfThis", null);
        setField(term728855, term728855.getClass(), "typeOfThis", term728955);
        setField(term728533, term728533.getClass(), "typeOfThis", term728855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term728533;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term727759, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


