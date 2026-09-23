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

public class FunctionType_isSubtype_21010021581496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2169910;
     Object term2170262;

    public FunctionType_isSubtype_21010021581496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2172986 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2172985 = ((Class) term2172986).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2172985).setAccessible(true);
        Object enum3870 = ((Field) term2172985).get((Object) null);
        term2169910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2170152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2169910, term2169910.getClass(), "kind", enum3870);
        setField(term2169910, term2169910.getClass(), "call", term2170152);
        term2170262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2170430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2170262, term2170262.getClass(), "kind", enum3870);
        setField(term2170262, term2170262.getClass(), "call", term2170430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2170262;
        try {
            callMethod(klass, "isSubtype", argTypes, term2169910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


