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

public class FunctionType_isSubtype_2101002158889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1073351;
     Object term1074005;

    public FunctionType_isSubtype_2101002158889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1077742 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1077741 = ((Class) term1077742).getDeclaredField((String) "ORDINARY");
        ((Field) term1077741).setAccessible(true);
        Object enum1945 = ((Field) term1077741).get((Object) null);
        Class<? extends Object> term1078033 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1078032 = ((Class) term1078033).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1078032).setAccessible(true);
        Object enum1946 = ((Field) term1078032).get((Object) null);
        term1073351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1073895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1073351, term1073351.getClass(), "kind", enum1945);
        setField(term1073895, term1073895.getClass(), "kind", enum1946);
        setField(term1073351, term1073351.getClass(), "typeOfThis", term1073895);
        term1074005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1074189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1074005, term1074005.getClass(), "kind", enum1946);
        setField(term1074005, term1074005.getClass(), "typeOfThis", term1074189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1074005;
        try {
            callMethod(klass, "isSubtype", argTypes, term1073351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


