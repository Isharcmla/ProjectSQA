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

public class FunctionType_getGreatestSubtype_679591709949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1172184;
     Object term1172546;

    public FunctionType_getGreatestSubtype_679591709949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1175767 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1175766 = ((Class) term1175767).getDeclaredField((String) "ORDINARY");
        ((Field) term1175766).setAccessible(true);
        Object enum2112 = ((Field) term1175766).get((Object) null);
        term1172184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1172436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1172184, term1172184.getClass(), "kind", enum2112);
        setField(term1172184, term1172184.getClass(), "typeOfThis", term1172184);
        setField(term1172184, term1172184.getClass(), "registry", term1172436);
        Class<? extends Object> term1176058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1176057 = ((Class) term1176058).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1176057).setAccessible(true);
        Object enum2113 = ((Field) term1176057).get((Object) null);
        term1172546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1172794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1172546, term1172546.getClass(), "kind", enum2113);
        setField(term1172794, term1172794.getClass(), "kind", enum2112);
        setField(term1172794, term1172794.getClass(), "typeOfThis", null);
        setField(term1172546, term1172546.getClass(), "typeOfThis", term1172794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1172546;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1172184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


