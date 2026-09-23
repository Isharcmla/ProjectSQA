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

public class FunctionType_getGreatestSubtype_679591709411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314190;
     Object term314958;

    public FunctionType_getGreatestSubtype_679591709411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term315968 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term315967 = ((Class) term315968).getDeclaredField((String) "INTERFACE");
        ((Field) term315967).setAccessible(true);
        Object enum572 = ((Field) term315967).get((Object) null);
        term314190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term314744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term314848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term314190, term314190.getClass(), "kind", enum572);
        setField(term314190, term314190.getClass(), "typeOfThis", term314744);
        setField(term314190, term314190.getClass(), "registry", term314848);
        Class<? extends Object> term316262 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term316261 = ((Class) term316262).getDeclaredField((String) "INTERFACE");
        ((Field) term316261).setAccessible(true);
        Object enum573 = ((Field) term316261).get((Object) null);
        term314958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term314958, term314958.getClass(), "kind", enum573);
        setField(term314958, term314958.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term314958;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term314190, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


