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

public class FunctionType_isSubtype_21010021581515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2202452;
     Object term2202958;

    public FunctionType_isSubtype_21010021581515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2206731 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2206730 = ((Class) term2206731).getDeclaredField((String) "ORDINARY");
        ((Field) term2206730).setAccessible(true);
        Object enum3935 = ((Field) term2206730).get((Object) null);
        Class<? extends Object> term2207022 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2207021 = ((Class) term2207022).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2207021).setAccessible(true);
        Object enum3936 = ((Field) term2207021).get((Object) null);
        term2202452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2202700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2202452, term2202452.getClass(), "kind", enum3935);
        setField(term2202700, term2202700.getClass(), "kind", enum3936);
        setField(term2202700, term2202700.getClass(), "typeOfThis", null);
        setField(term2202452, term2202452.getClass(), "typeOfThis", term2202700);
        term2202958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2203142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2203266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term2202958, term2202958.getClass(), "kind", enum3935);
        setField(term2203142, term2203142.getClass(), "kind", enum3935);
        setField(term2203142, term2203142.getClass(), "typeOfThis", term2203266);
        setField(term2202958, term2202958.getClass(), "typeOfThis", term2203142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2202958;
        try {
            callMethod(klass, "isSubtype", argTypes, term2202452, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


