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

public class FunctionType_getGreatestSubtype_6795917091009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1278812;
     Object term1279421;

    public FunctionType_getGreatestSubtype_6795917091009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1280277 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1280276 = ((Class) term1280277).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1280276).setAccessible(true);
        Object enum2297 = ((Field) term1280276).get((Object) null);
        term1278812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term1279421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1278812, term1278812.getClass(), "kind", enum2297);
        setField(term1279421, term1279421.getClass(), "kind", enum2297);
        setField(term1279421, term1279421.getClass(), "typeOfThis", term1279421);
        setField(term1278812, term1278812.getClass(), "typeOfThis", term1279421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1279421;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1278812, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


