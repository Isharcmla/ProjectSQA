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

public class FunctionType_isSubtype_21010021581326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1851896;
     Object term1852674;

    public FunctionType_isSubtype_21010021581326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1856279 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1856278 = ((Class) term1856279).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1856278).setAccessible(true);
        Object enum3293 = ((Field) term1856278).get((Object) null);
        Class<? extends Object> term1856579 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1856578 = ((Class) term1856579).getDeclaredField((String) "INTERFACE");
        ((Field) term1856578).setAccessible(true);
        Object enum3294 = ((Field) term1856578).get((Object) null);
        term1851896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1852440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1852564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1851896, term1851896.getClass(), "kind", enum3293);
        setField(term1852440, term1852440.getClass(), "kind", enum3294);
        setField(term1852440, term1852440.getClass(), "typeOfThis", term1852564);
        setField(term1851896, term1851896.getClass(), "typeOfThis", term1852440);
        term1852674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1853006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1852674, term1852674.getClass(), "kind", enum3293);
        setField(term1853006, term1853006.getClass(), "kind", enum3293);
        setField(term1853006, term1853006.getClass(), "typeOfThis", null);
        setField(term1852674, term1852674.getClass(), "typeOfThis", term1853006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1852674;
        try {
            callMethod(klass, "isSubtype", argTypes, term1851896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


