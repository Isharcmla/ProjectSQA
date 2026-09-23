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

public class FunctionType_getGreatestSubtype_679591709475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407810;
     Object term407612;

    public FunctionType_getGreatestSubtype_679591709475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term409024 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term409023 = ((Class) term409024).getDeclaredField((String) "ORDINARY");
        ((Field) term409023).setAccessible(true);
        Object enum673 = ((Field) term409023).get((Object) null);
        term407810 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term407934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term407986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term407810, term407810.getClass(), "kind", enum673);
        setField(term407810, term407810.getClass(), "typeOfThis", term407934);
        setField(term407810, term407810.getClass(), "registry", term407986);
        Class<? extends Object> term409315 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term409314 = ((Class) term409315).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term409314).setAccessible(true);
        Object enum674 = ((Field) term409314).get((Object) null);
        term407612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term407612, term407612.getClass(), "kind", enum674);
        setField(term407612, term407612.getClass(), "typeOfThis", term407810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term407612;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term407810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


