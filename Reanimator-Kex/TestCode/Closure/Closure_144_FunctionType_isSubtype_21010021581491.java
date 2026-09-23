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

public class FunctionType_isSubtype_21010021581491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2160712;
     Object term2161454;

    public FunctionType_isSubtype_21010021581491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2163358 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2163357 = ((Class) term2163358).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2163357).setAccessible(true);
        Object enum3852 = ((Field) term2163357).get((Object) null);
        Class<? extends Object> term2163658 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2163657 = ((Class) term2163658).getDeclaredField((String) "INTERFACE");
        ((Field) term2163657).setAccessible(true);
        Object enum3853 = ((Field) term2163657).get((Object) null);
        term2160712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2161256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2161344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2160712, term2160712.getClass(), "kind", enum3852);
        setField(term2161256, term2161256.getClass(), "kind", enum3853);
        setField(term2161256, term2161256.getClass(), "typeOfThis", term2161344);
        setField(term2160712, term2160712.getClass(), "typeOfThis", term2161256);
        Class<? extends Object> term2163952 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2163951 = ((Class) term2163952).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2163951).setAccessible(true);
        Object enum3854 = ((Field) term2163951).get((Object) null);
        term2161454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2161786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2161454, term2161454.getClass(), "kind", enum3852);
        setField(term2161786, term2161786.getClass(), "kind", enum3854);
        setField(term2161786, term2161786.getClass(), "typeOfThis", null);
        setField(term2161454, term2161454.getClass(), "typeOfThis", term2161786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2161454;
        try {
            callMethod(klass, "isSubtype", argTypes, term2160712, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


