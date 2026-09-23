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

public class FunctionType_getGreatestSubtype_679591709489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416975;
     Object term417233;

    public FunctionType_getGreatestSubtype_679591709489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term418491 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term418490 = ((Class) term418491).getDeclaredField((String) "ORDINARY");
        ((Field) term418490).setAccessible(true);
        Object enum758 = ((Field) term418490).get((Object) null);
        term416975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term416975, term416975.getClass(), "kind", enum758);
        setField(term416975, term416975.getClass(), "typeOfThis", term416975);
        Class<? extends Object> term418782 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term418781 = ((Class) term418782).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term418781).setAccessible(true);
        Object enum759 = ((Field) term418781).get((Object) null);
        term417233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term417481 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term417233, term417233.getClass(), "kind", enum759);
        setField(term417233, term417233.getClass(), "typeOfThis", term417481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term417233;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term416975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


