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

public class FunctionType_isSubtype_21010021581448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2076429;
     Object term2076891;

    public FunctionType_isSubtype_21010021581448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2079674 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2079673 = ((Class) term2079674).getDeclaredField((String) "ORDINARY");
        ((Field) term2079673).setAccessible(true);
        Object enum3699 = ((Field) term2079673).get((Object) null);
        term2076429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2077094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2076781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2076429, term2076429.getClass(), "kind", enum3699);
        setField(term2077094, term2077094.getClass(), "kind", enum3699);
        setField(term2077094, term2077094.getClass(), "typeOfThis", null);
        setField(term2076429, term2076429.getClass(), "typeOfThis", term2077094);
        setField(term2076429, term2076429.getClass(), "call", term2076781);
        Class<? extends Object> term2079965 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2079964 = ((Class) term2079965).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2079964).setAccessible(true);
        Object enum3700 = ((Field) term2079964).get((Object) null);
        term2076891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2076891, term2076891.getClass(), "kind", enum3700);
        setField(term2076891, term2076891.getClass(), "typeOfThis", term2077094);
        setField(term2076891, term2076891.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2076891;
        try {
            callMethod(klass, "isSubtype", argTypes, term2076429, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


