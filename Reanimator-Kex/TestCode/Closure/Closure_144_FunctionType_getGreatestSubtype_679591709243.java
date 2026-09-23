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

public class FunctionType_getGreatestSubtype_679591709243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135289;
     Object term135645;

    public FunctionType_getGreatestSubtype_679591709243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term136739 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term136738 = ((Class) term136739).getDeclaredField((String) "ORDINARY");
        ((Field) term136738).setAccessible(true);
        Object enum274 = ((Field) term136738).get((Object) null);
        term135289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term135535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term135289, term135289.getClass(), "kind", enum274);
        setField(term135289, term135289.getClass(), "typeOfThis", term135535);
        Class<? extends Object> term137030 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term137029 = ((Class) term137030).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term137029).setAccessible(true);
        Object enum275 = ((Field) term137029).get((Object) null);
        term135645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term135645, term135645.getClass(), "kind", enum275);
        setField(term135645, term135645.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term135645;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term135289, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


