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

public class FunctionType_isSubtype_21010021581168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1559158;
     Object term1560020;

    public FunctionType_isSubtype_21010021581168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1563362 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1563361 = ((Class) term1563362).getDeclaredField((String) "ORDINARY");
        ((Field) term1563361).setAccessible(true);
        Object enum2785 = ((Field) term1563361).get((Object) null);
        Class<? extends Object> term1563653 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1563652 = ((Class) term1563653).getDeclaredField((String) "INTERFACE");
        ((Field) term1563652).setAccessible(true);
        Object enum2786 = ((Field) term1563652).get((Object) null);
        term1559158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1559702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1560297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1560347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1559158, term1559158.getClass(), "kind", enum2785);
        setField(term1559702, term1559702.getClass(), "kind", enum2785);
        setField(term1560297, term1560297.getClass(), "kind", enum2786);
        setField(term1560297, term1560297.getClass(), "typeOfThis", term1560347);
        setField(term1559702, term1559702.getClass(), "typeOfThis", term1560297);
        setField(term1559158, term1559158.getClass(), "typeOfThis", term1559702);
        term1560020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1560020, term1560020.getClass(), "kind", enum2785);
        setField(term1560020, term1560020.getClass(), "typeOfThis", term1560297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1560020;
        try {
            callMethod(klass, "isSubtype", argTypes, term1559158, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


