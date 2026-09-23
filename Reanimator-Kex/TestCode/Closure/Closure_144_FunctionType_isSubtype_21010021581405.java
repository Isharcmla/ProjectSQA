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

public class FunctionType_isSubtype_21010021581405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1994566;
     Object term1995022;

    public FunctionType_isSubtype_21010021581405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1998427 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1998426 = ((Class) term1998427).getDeclaredField((String) "ORDINARY");
        ((Field) term1998426).setAccessible(true);
        Object enum3546 = ((Field) term1998426).get((Object) null);
        term1994566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1994824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1994912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1994566, term1994566.getClass(), "kind", enum3546);
        setField(term1994824, term1994824.getClass(), "kind", enum3546);
        setField(term1994824, term1994824.getClass(), "typeOfThis", term1994912);
        setField(term1994566, term1994566.getClass(), "typeOfThis", term1994824);
        Class<? extends Object> term1998718 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1998717 = ((Class) term1998718).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1998717).setAccessible(true);
        Object enum3547 = ((Field) term1998717).get((Object) null);
        term1995022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1995206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1995022, term1995022.getClass(), "kind", enum3546);
        setField(term1995206, term1995206.getClass(), "kind", enum3547);
        setField(term1995206, term1995206.getClass(), "typeOfThis", null);
        setField(term1995022, term1995022.getClass(), "typeOfThis", term1995206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1995022;
        try {
            callMethod(klass, "isSubtype", argTypes, term1994566, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


