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

public class FunctionType_getGreatestSubtype_6795917091077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1248629;
     Object term1249203;

    public FunctionType_getGreatestSubtype_6795917091077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1250080 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1250079 = ((Class) term1250080).getDeclaredField((String) "ORDINARY");
        ((Field) term1250079).setAccessible(true);
        Object enum2326 = ((Field) term1250079).get((Object) null);
        term1248629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1248885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1248991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term1249095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1248629, term1248629.getClass(), "kind", enum2326);
        setField(term1248885, term1248885.getClass(), "kind", enum2326);
        setField(term1248885, term1248885.getClass(), "typeOfThis", term1248991);
        setField(term1248629, term1248629.getClass(), "typeOfThis", term1248885);
        setField(term1248629, term1248629.getClass(), "registry", term1249095);
        term1249203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1249377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1249203, term1249203.getClass(), "kind", enum2326);
        setField(term1249377, term1249377.getClass(), "kind", enum2326);
        setField(term1249377, term1249377.getClass(), "typeOfThis", null);
        setField(term1249203, term1249203.getClass(), "typeOfThis", term1249377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1249203;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1248629, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


