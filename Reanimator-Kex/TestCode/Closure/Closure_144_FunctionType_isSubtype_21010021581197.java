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

public class FunctionType_isSubtype_21010021581197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1616958;
     Object term1617612;

    public FunctionType_isSubtype_21010021581197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1618944 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1618943 = ((Class) term1618944).getDeclaredField((String) "ORDINARY");
        ((Field) term1618943).setAccessible(true);
        Object enum2891 = ((Field) term1618943).get((Object) null);
        Class<? extends Object> term1619235 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1619234 = ((Class) term1619235).getDeclaredField((String) "INTERFACE");
        ((Field) term1619234).setAccessible(true);
        Object enum2892 = ((Field) term1619234).get((Object) null);
        term1616958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1617502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1616958, term1616958.getClass(), "kind", enum2891);
        setField(term1617502, term1617502.getClass(), "kind", enum2892);
        setField(term1616958, term1616958.getClass(), "typeOfThis", term1617502);
        term1617612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1617942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1617612, term1617612.getClass(), "kind", enum2891);
        setField(term1617942, term1617942.getClass(), "kind", enum2891);
        setField(term1617612, term1617612.getClass(), "typeOfThis", term1617942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1617612;
        try {
            callMethod(klass, "isSubtype", argTypes, term1616958, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


