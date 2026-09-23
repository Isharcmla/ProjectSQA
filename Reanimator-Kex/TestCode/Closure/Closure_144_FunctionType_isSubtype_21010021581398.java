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

public class FunctionType_isSubtype_21010021581398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1980712;
     Object term1981366;

    public FunctionType_isSubtype_21010021581398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1984884 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1984883 = ((Class) term1984884).getDeclaredField((String) "ORDINARY");
        ((Field) term1984883).setAccessible(true);
        Object enum3519 = ((Field) term1984883).get((Object) null);
        Class<? extends Object> term1985175 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1985174 = ((Class) term1985175).getDeclaredField((String) "INTERFACE");
        ((Field) term1985174).setAccessible(true);
        Object enum3520 = ((Field) term1985174).get((Object) null);
        term1980712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1981256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1980712, term1980712.getClass(), "kind", enum3519);
        setField(term1981256, term1981256.getClass(), "kind", enum3520);
        setField(term1980712, term1980712.getClass(), "typeOfThis", term1981256);
        term1981366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1981698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1981366, term1981366.getClass(), "kind", enum3519);
        setField(term1981698, term1981698.getClass(), "kind", enum3520);
        setField(term1981366, term1981366.getClass(), "typeOfThis", term1981698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1981366;
        try {
            callMethod(klass, "isSubtype", argTypes, term1980712, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


