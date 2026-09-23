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

public class FunctionType_getGreatestSubtype_679591709265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152098;
     Object term152356;

    public FunctionType_getGreatestSubtype_679591709265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term152955 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term152954 = ((Class) term152955).getDeclaredField((String) "INTERFACE");
        ((Field) term152954).setAccessible(true);
        Object enum297 = ((Field) term152954).get((Object) null);
        term152098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term152098, term152098.getClass(), "kind", enum297);
        term152356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term152356;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term152098, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


