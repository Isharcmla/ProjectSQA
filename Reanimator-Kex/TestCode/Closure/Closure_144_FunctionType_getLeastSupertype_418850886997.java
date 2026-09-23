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

public class FunctionType_getLeastSupertype_418850886997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1255350;
     Object term1255712;

    public FunctionType_getLeastSupertype_418850886997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1256790 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1256789 = ((Class) term1256790).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1256789).setAccessible(true);
        Object enum2253 = ((Field) term1256789).get((Object) null);
        term1255350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1255602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1255350, term1255350.getClass(), "kind", enum2253);
        setField(term1255350, term1255350.getClass(), "registry", term1255602);
        Class<? extends Object> term1257090 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1257089 = ((Class) term1257090).getDeclaredField((String) "ORDINARY");
        ((Field) term1257089).setAccessible(true);
        Object enum2254 = ((Field) term1257089).get((Object) null);
        term1255712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1255712, term1255712.getClass(), "kind", enum2254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1255712;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1255350, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


