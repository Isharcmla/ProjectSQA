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

public class FunctionType_isSubtype_21010021581566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2291934;
     Object term2292600;

    public FunctionType_isSubtype_21010021581566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2294922 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2294921 = ((Class) term2294922).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2294921).setAccessible(true);
        Object enum4093 = ((Field) term2294921).get((Object) null);
        term2291934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2292490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term2291934, term2291934.getClass(), "kind", enum4093);
        setField(term2291934, term2291934.getClass(), "typeOfThis", term2292490);
        term2292600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2292600, term2292600.getClass(), "kind", enum4093);
        setField(term2292600, term2292600.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2292600;
        try {
            callMethod(klass, "isSubtype", argTypes, term2291934, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


