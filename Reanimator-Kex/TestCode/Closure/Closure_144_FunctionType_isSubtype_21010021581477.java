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

public class FunctionType_isSubtype_21010021581477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2132387;
     Object term2133163;

    public FunctionType_isSubtype_21010021581477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2136515 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2136514 = ((Class) term2136515).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2136514).setAccessible(true);
        Object enum3805 = ((Field) term2136514).get((Object) null);
        term2132387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2132931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2133055 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term2132387, term2132387.getClass(), "kind", enum3805);
        setField(term2132931, term2132931.getClass(), "kind", enum3805);
        setField(term2132931, term2132931.getClass(), "typeOfThis", term2133055);
        setField(term2132931, term2132931.getClass(), "call", null);
        setField(term2132387, term2132387.getClass(), "typeOfThis", term2132931);
        term2133163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2133495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2133589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2133163, term2133163.getClass(), "kind", enum3805);
        setField(term2133495, term2133495.getClass(), "kind", enum3805);
        setField(term2133495, term2133495.getClass(), "typeOfThis", null);
        setField(term2133495, term2133495.getClass(), "call", term2133589);
        setField(term2133163, term2133163.getClass(), "typeOfThis", term2133495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2133163;
        try {
            callMethod(klass, "isSubtype", argTypes, term2132387, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


