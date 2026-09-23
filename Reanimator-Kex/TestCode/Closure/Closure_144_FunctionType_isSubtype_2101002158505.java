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

public class FunctionType_isSubtype_2101002158505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434817;
     Object term435175;

    public FunctionType_isSubtype_2101002158505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term436446 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term436445 = ((Class) term436446).getDeclaredField((String) "ORDINARY");
        ((Field) term436445).setAccessible(true);
        Object enum789 = ((Field) term436445).get((Object) null);
        term434817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term435065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term434817, term434817.getClass(), "kind", enum789);
        setField(term434817, term434817.getClass(), "typeOfThis", term435065);
        Class<? extends Object> term436737 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term436736 = ((Class) term436737).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term436736).setAccessible(true);
        Object enum790 = ((Field) term436736).get((Object) null);
        term435175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term435411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term435175, term435175.getClass(), "kind", enum790);
        setField(term435175, term435175.getClass(), "typeOfThis", term435411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term435175;
        try {
            callMethod(klass, "isSubtype", argTypes, term434817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


