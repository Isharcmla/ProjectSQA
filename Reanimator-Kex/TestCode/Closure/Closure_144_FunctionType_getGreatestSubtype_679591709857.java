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

public class FunctionType_getGreatestSubtype_679591709857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1015073;
     Object term1015727;

    public FunctionType_getGreatestSubtype_679591709857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1016861 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1016860 = ((Class) term1016861).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1016860).setAccessible(true);
        Object enum1836 = ((Field) term1016860).get((Object) null);
        term1015073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1015617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1015073, term1015073.getClass(), "kind", enum1836);
        setField(term1015617, term1015617.getClass(), "kind", enum1836);
        setField(term1015073, term1015073.getClass(), "typeOfThis", term1015617);
        Class<? extends Object> term1017161 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1017160 = ((Class) term1017161).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1017160).setAccessible(true);
        Object enum1837 = ((Field) term1017160).get((Object) null);
        term1015727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1015901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1015727, term1015727.getClass(), "kind", enum1837);
        setField(term1015727, term1015727.getClass(), "typeOfThis", term1015901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1015727;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1015073, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


