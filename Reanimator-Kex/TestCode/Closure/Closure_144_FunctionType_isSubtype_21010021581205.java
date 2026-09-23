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

public class FunctionType_isSubtype_21010021581205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1633002;
     Object term1633656;

    public FunctionType_isSubtype_21010021581205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1634485 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1634484 = ((Class) term1634485).getDeclaredField((String) "INTERFACE");
        ((Field) term1634484).setAccessible(true);
        Object enum2920 = ((Field) term1634484).get((Object) null);
        term1633002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1633546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term1633002, term1633002.getClass(), "kind", enum2920);
        setField(term1633002, term1633002.getClass(), "typeOfThis", term1633546);
        term1633656 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1633656, term1633656.getClass(), "kind", enum2920);
        setField(term1633656, term1633656.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1633656;
        try {
            callMethod(klass, "isSubtype", argTypes, term1633002, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


