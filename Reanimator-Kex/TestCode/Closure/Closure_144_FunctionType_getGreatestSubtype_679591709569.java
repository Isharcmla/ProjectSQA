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

public class FunctionType_getGreatestSubtype_679591709569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527697;
     Object term528343;

    public FunctionType_getGreatestSubtype_679591709569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term529501 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term529500 = ((Class) term529501).getDeclaredField((String) "ORDINARY");
        ((Field) term529500).setAccessible(true);
        Object enum966 = ((Field) term529500).get((Object) null);
        term527697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term528233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term527697, term527697.getClass(), "kind", enum966);
        setField(term527697, term527697.getClass(), "typeOfThis", term528233);
        Class<? extends Object> term529792 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term529791 = ((Class) term529792).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term529791).setAccessible(true);
        Object enum967 = ((Field) term529791).get((Object) null);
        term528343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term528517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term528343, term528343.getClass(), "kind", enum967);
        setField(term528517, term528517.getClass(), "kind", enum967);
        setField(term528517, term528517.getClass(), "typeOfThis", null);
        setField(term528343, term528343.getClass(), "typeOfThis", term528517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term528343;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term527697, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


