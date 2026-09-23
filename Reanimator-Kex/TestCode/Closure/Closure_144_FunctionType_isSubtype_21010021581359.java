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

public class FunctionType_isSubtype_21010021581359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1911778;
     Object term1912430;

    public FunctionType_isSubtype_21010021581359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1915424 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1915423 = ((Class) term1915424).getDeclaredField((String) "ORDINARY");
        ((Field) term1915423).setAccessible(true);
        Object enum3393 = ((Field) term1915423).get((Object) null);
        term1911778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1912322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1911778, term1911778.getClass(), "kind", enum3393);
        setField(term1911778, term1911778.getClass(), "typeOfThis", term1912322);
        term1912430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1912752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1912430, term1912430.getClass(), "kind", enum3393);
        setField(term1912430, term1912430.getClass(), "typeOfThis", term1912752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1912430;
        try {
            callMethod(klass, "isSubtype", argTypes, term1911778, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


