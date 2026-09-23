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

public class FunctionType_getGreatestSubtype_679591709415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328204;
     Object term328462;

    public FunctionType_getGreatestSubtype_679591709415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term329758 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term329757 = ((Class) term329758).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term329757).setAccessible(true);
        Object enum563 = ((Field) term329757).get((Object) null);
        term328204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term328204, term328204.getClass(), "kind", enum563);
        Class<? extends Object> term330058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term330057 = ((Class) term330058).getDeclaredField((String) "ORDINARY");
        ((Field) term330057).setAccessible(true);
        Object enum564 = ((Field) term330057).get((Object) null);
        term328462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term328462, term328462.getClass(), "kind", enum564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term328462;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term328204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


