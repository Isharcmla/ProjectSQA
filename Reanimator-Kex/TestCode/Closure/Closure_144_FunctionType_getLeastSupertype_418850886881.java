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

public class FunctionType_getLeastSupertype_418850886881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1059124;
     Object term1059382;

    public FunctionType_getLeastSupertype_418850886881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1060676 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1060675 = ((Class) term1060676).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1060675).setAccessible(true);
        Object enum1915 = ((Field) term1060675).get((Object) null);
        term1059124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1059124, term1059124.getClass(), "kind", enum1915);
        Class<? extends Object> term1060976 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1060975 = ((Class) term1060976).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1060975).setAccessible(true);
        Object enum1916 = ((Field) term1060975).get((Object) null);
        term1059382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1059382, term1059382.getClass(), "kind", enum1916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1059382;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1059124, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


