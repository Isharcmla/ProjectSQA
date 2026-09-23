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

public class FunctionType_isSubtype_21010021581065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1229524;
     Object term1229882;

    public FunctionType_isSubtype_21010021581065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1231167 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1231166 = ((Class) term1231167).getDeclaredField((String) "ORDINARY");
        ((Field) term1231166).setAccessible(true);
        Object enum2293 = ((Field) term1231166).get((Object) null);
        term1229524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1229772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1229524, term1229524.getClass(), "kind", enum2293);
        setField(term1229524, term1229524.getClass(), "typeOfThis", term1229772);
        Class<? extends Object> term1231458 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1231457 = ((Class) term1231458).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1231457).setAccessible(true);
        Object enum2294 = ((Field) term1231457).get((Object) null);
        term1229882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1230064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1229882, term1229882.getClass(), "kind", enum2293);
        setField(term1230064, term1230064.getClass(), "kind", enum2294);
        setField(term1230064, term1230064.getClass(), "typeOfThis", null);
        setField(term1229882, term1229882.getClass(), "typeOfThis", term1230064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1229882;
        try {
            callMethod(klass, "isSubtype", argTypes, term1229524, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


