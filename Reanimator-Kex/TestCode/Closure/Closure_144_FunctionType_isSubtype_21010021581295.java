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

public class FunctionType_isSubtype_21010021581295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1795081;
     Object term1795735;

    public FunctionType_isSubtype_21010021581295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1796911 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1796910 = ((Class) term1796911).getDeclaredField((String) "ORDINARY");
        ((Field) term1796910).setAccessible(true);
        Object enum3192 = ((Field) term1796910).get((Object) null);
        Class<? extends Object> term1797202 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1797201 = ((Class) term1797202).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1797201).setAccessible(true);
        Object enum3193 = ((Field) term1797201).get((Object) null);
        term1795081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1795625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1795081, term1795081.getClass(), "kind", enum3192);
        setField(term1795625, term1795625.getClass(), "kind", enum3193);
        setField(term1795081, term1795081.getClass(), "typeOfThis", term1795625);
        term1795735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1795919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1795735, term1795735.getClass(), "kind", enum3193);
        setField(term1795919, term1795919.getClass(), "kind", enum3193);
        setField(term1795735, term1795735.getClass(), "typeOfThis", term1795919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1795735;
        try {
            callMethod(klass, "isSubtype", argTypes, term1795081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


