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

public class FunctionType_isSubtype_2101002158965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1198265;
     Object term1198733;

    public FunctionType_isSubtype_2101002158965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1201063 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1201062 = ((Class) term1201063).getDeclaredField((String) "ORDINARY");
        ((Field) term1201062).setAccessible(true);
        Object enum2154 = ((Field) term1201062).get((Object) null);
        term1198265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1198513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1198623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1198265, term1198265.getClass(), "kind", enum2154);
        setField(term1198513, term1198513.getClass(), "kind", enum2154);
        setField(term1198513, term1198513.getClass(), "typeOfThis", term1198623);
        setField(term1198265, term1198265.getClass(), "typeOfThis", term1198513);
        term1198733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1198917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1198733, term1198733.getClass(), "kind", enum2154);
        setField(term1198917, term1198917.getClass(), "kind", enum2154);
        setField(term1198917, term1198917.getClass(), "typeOfThis", null);
        setField(term1198733, term1198733.getClass(), "typeOfThis", term1198917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1198733;
        try {
            callMethod(klass, "isSubtype", argTypes, term1198265, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


