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

public class FunctionType_isSubtype_2101002158913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1112695;
     Object term1113347;

    public FunctionType_isSubtype_2101002158913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1115281 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1115280 = ((Class) term1115281).getDeclaredField((String) "INTERFACE");
        ((Field) term1115280).setAccessible(true);
        Object enum2004 = ((Field) term1115280).get((Object) null);
        term1112695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1113239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1112695, term1112695.getClass(), "kind", enum2004);
        setField(term1112695, term1112695.getClass(), "typeOfThis", term1113239);
        term1113347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1113657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1113347, term1113347.getClass(), "kind", enum2004);
        setField(term1113347, term1113347.getClass(), "typeOfThis", term1113657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1113347;
        try {
            callMethod(klass, "isSubtype", argTypes, term1112695, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


