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

public class FunctionType_isSubtype_2101002158936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1150138;
     Object term1150792;

    public FunctionType_isSubtype_2101002158936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1152954 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1152953 = ((Class) term1152954).getDeclaredField((String) "ORDINARY");
        ((Field) term1152953).setAccessible(true);
        Object enum2071 = ((Field) term1152953).get((Object) null);
        Class<? extends Object> term1153245 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1153244 = ((Class) term1153245).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1153244).setAccessible(true);
        Object enum2072 = ((Field) term1153244).get((Object) null);
        term1150138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1150682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1150138, term1150138.getClass(), "kind", enum2071);
        setField(term1150682, term1150682.getClass(), "kind", enum2072);
        setField(term1150682, term1150682.getClass(), "typeOfThis", null);
        setField(term1150138, term1150138.getClass(), "typeOfThis", term1150682);
        term1150792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1151122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1151222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1150792, term1150792.getClass(), "kind", enum2071);
        setField(term1151122, term1151122.getClass(), "kind", enum2071);
        setField(term1151122, term1151122.getClass(), "typeOfThis", term1151222);
        setField(term1150792, term1150792.getClass(), "typeOfThis", term1151122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1150792;
        try {
            callMethod(klass, "isSubtype", argTypes, term1150138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


