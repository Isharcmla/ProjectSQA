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

public class FunctionType_isSubtype_2101002158897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086695;
     Object term1087473;

    public FunctionType_isSubtype_2101002158897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1090767 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1090766 = ((Class) term1090767).getDeclaredField((String) "ORDINARY");
        ((Field) term1090766).setAccessible(true);
        Object enum1968 = ((Field) term1090766).get((Object) null);
        term1086695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1087239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1087363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1086695, term1086695.getClass(), "kind", enum1968);
        setField(term1087239, term1087239.getClass(), "kind", enum1968);
        setField(term1087239, term1087239.getClass(), "typeOfThis", term1087363);
        setField(term1086695, term1086695.getClass(), "typeOfThis", term1087239);
        Class<? extends Object> term1091058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1091057 = ((Class) term1091058).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1091057).setAccessible(true);
        Object enum1969 = ((Field) term1091057).get((Object) null);
        term1087473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1087805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1087473, term1087473.getClass(), "kind", enum1968);
        setField(term1087805, term1087805.getClass(), "kind", enum1969);
        setField(term1087805, term1087805.getClass(), "typeOfThis", null);
        setField(term1087473, term1087473.getClass(), "typeOfThis", term1087805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1087473;
        try {
            callMethod(klass, "isSubtype", argTypes, term1086695, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


