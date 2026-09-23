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

public class FunctionType_isSubtype_21010021581065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1383559;
     Object term1384011;

    public FunctionType_isSubtype_21010021581065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1386227 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1386226 = ((Class) term1386227).getDeclaredField((String) "ORDINARY");
        ((Field) term1386226).setAccessible(true);
        Object enum2486 = ((Field) term1386226).get((Object) null);
        term1383559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1383807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term1383901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1383559, term1383559.getClass(), "kind", enum2486);
        setField(term1383559, term1383559.getClass(), "typeOfThis", term1383807);
        setField(term1383559, term1383559.getClass(), "call", term1383901);
        Class<? extends Object> term1386518 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1386517 = ((Class) term1386518).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1386517).setAccessible(true);
        Object enum2487 = ((Field) term1386517).get((Object) null);
        term1384011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1384253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1384011, term1384011.getClass(), "kind", enum2487);
        setField(term1384011, term1384011.getClass(), "typeOfThis", null);
        setField(term1384011, term1384011.getClass(), "call", term1384253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1384011;
        try {
            callMethod(klass, "isSubtype", argTypes, term1383559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


