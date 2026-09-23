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

public class FunctionType_getGreatestSubtype_6795917091213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1644567;
     Object term1645331;

    public FunctionType_getGreatestSubtype_6795917091213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1646706 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1646705 = ((Class) term1646706).getDeclaredField((String) "ORDINARY");
        ((Field) term1646705).setAccessible(true);
        Object enum2939 = ((Field) term1646705).get((Object) null);
        Class<? extends Object> term1646997 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1646996 = ((Class) term1646997).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1646996).setAccessible(true);
        Object enum2940 = ((Field) term1646996).get((Object) null);
        term1644567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1645121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1645711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1644567, term1644567.getClass(), "kind", enum2939);
        setField(term1645121, term1645121.getClass(), "kind", enum2939);
        setField(term1645711, term1645711.getClass(), "kind", enum2940);
        setField(term1645121, term1645121.getClass(), "typeOfThis", term1645711);
        setField(term1644567, term1644567.getClass(), "typeOfThis", term1645121);
        term1645331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1645513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1645331, term1645331.getClass(), "kind", enum2940);
        setField(term1645513, term1645513.getClass(), "kind", enum2939);
        setField(term1645513, term1645513.getClass(), "typeOfThis", term1645711);
        setField(term1645331, term1645331.getClass(), "typeOfThis", term1645513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1645331;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1644567, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


