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

public class FunctionType_getGreatestSubtype_6795917091263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1740904;
     Object term1741266;

    public FunctionType_getGreatestSubtype_6795917091263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1741986 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1741985 = ((Class) term1741986).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1741985).setAccessible(true);
        Object enum3103 = ((Field) term1741985).get((Object) null);
        term1740904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1741156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1740904, term1740904.getClass(), "kind", enum3103);
        setField(term1740904, term1740904.getClass(), "registry", term1741156);
        term1741266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1741266, term1741266.getClass(), "kind", enum3103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1741266;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1740904, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


