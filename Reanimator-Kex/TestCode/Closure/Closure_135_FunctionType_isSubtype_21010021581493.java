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

public class FunctionType_isSubtype_21010021581493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1958283;
     Object term1958745;

    public FunctionType_isSubtype_21010021581493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1960355 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1960354 = ((Class) term1960355).getDeclaredField((String) "ORDINARY");
        ((Field) term1960354).setAccessible(true);
        Object enum3653 = ((Field) term1960354).get((Object) null);
        term1958283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1958531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1958637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term1958283, term1958283.getClass(), "kind", enum3653);
        setField(term1958531, term1958531.getClass(), "kind", enum3653);
        setField(term1958531, term1958531.getClass(), "typeOfThis", term1958637);
        setField(term1958283, term1958283.getClass(), "typeOfThis", term1958531);
        Class<? extends Object> term1960646 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1960645 = ((Class) term1960646).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1960645).setAccessible(true);
        Object enum3654 = ((Field) term1960645).get((Object) null);
        term1958745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1959001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1959175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1958745, term1958745.getClass(), "kind", enum3654);
        setField(term1959001, term1959001.getClass(), "kind", enum3653);
        setField(term1959001, term1959001.getClass(), "typeOfThis", term1959175);
        setField(term1958745, term1958745.getClass(), "typeOfThis", term1959001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1958745;
        try {
            callMethod(klass, "isSubtype", argTypes, term1958283, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


