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

public class FunctionType_supAndInfHelper_1603977104499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443949;
     Object term444514;

    public FunctionType_supAndInfHelper_1603977104499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term445578 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term445577 = ((Class) term445578).getDeclaredField((String) "ORDINARY");
        ((Field) term445577).setAccessible(true);
        Object enum727 = ((Field) term445577).get((Object) null);
        Class<? extends Object> term445869 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term445868 = ((Class) term445869).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term445868).setAccessible(true);
        Object enum728 = ((Field) term445868).get((Object) null);
        term443949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term444514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term444459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term443949, term443949.getClass(), "kind", enum727);
        setField(term444514, term444514.getClass(), "kind", enum728);
        setField(term444514, term444514.getClass(), "typeOfThis", null);
        setField(term443949, term443949.getClass(), "typeOfThis", term444514);
        setField(term443949, term443949.getClass(), "registry", term444459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term444514;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term443949, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


