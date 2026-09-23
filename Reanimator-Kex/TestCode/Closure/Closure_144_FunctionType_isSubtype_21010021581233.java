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

public class FunctionType_isSubtype_21010021581233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1686450;
     Object term1686928;

    public FunctionType_isSubtype_21010021581233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1688531 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1688530 = ((Class) term1688531).getDeclaredField((String) "ORDINARY");
        ((Field) term1688530).setAccessible(true);
        Object enum3015 = ((Field) term1688530).get((Object) null);
        term1686450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1686708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1686818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1686450, term1686450.getClass(), "kind", enum3015);
        setField(term1686708, term1686708.getClass(), "kind", enum3015);
        setField(term1686708, term1686708.getClass(), "typeOfThis", term1686818);
        setField(term1686450, term1686450.getClass(), "typeOfThis", term1686708);
        Class<? extends Object> term1688822 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1688821 = ((Class) term1688822).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1688821).setAccessible(true);
        Object enum3016 = ((Field) term1688821).get((Object) null);
        term1686928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1687112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1686928, term1686928.getClass(), "kind", enum3015);
        setField(term1687112, term1687112.getClass(), "kind", enum3016);
        setField(term1687112, term1687112.getClass(), "typeOfThis", null);
        setField(term1686928, term1686928.getClass(), "typeOfThis", term1687112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1686928;
        try {
            callMethod(klass, "isSubtype", argTypes, term1686450, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


