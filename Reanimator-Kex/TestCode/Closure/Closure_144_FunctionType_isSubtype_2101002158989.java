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

public class FunctionType_isSubtype_2101002158989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1236857;
     Object term1237609;

    public FunctionType_isSubtype_2101002158989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1241280 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1241279 = ((Class) term1241280).getDeclaredField((String) "ORDINARY");
        ((Field) term1241279).setAccessible(true);
        Object enum2227 = ((Field) term1241279).get((Object) null);
        term1236857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1237401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1237499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term1236857, term1236857.getClass(), "kind", enum2227);
        setField(term1237401, term1237401.getClass(), "kind", enum2227);
        setField(term1237401, term1237401.getClass(), "typeOfThis", term1237499);
        setField(term1236857, term1236857.getClass(), "typeOfThis", term1237401);
        Class<? extends Object> term1241571 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1241570 = ((Class) term1241571).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1241570).setAccessible(true);
        Object enum2228 = ((Field) term1241570).get((Object) null);
        term1237609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1237941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1237609, term1237609.getClass(), "kind", enum2227);
        setField(term1237941, term1237941.getClass(), "kind", enum2228);
        setField(term1237941, term1237941.getClass(), "typeOfThis", null);
        setField(term1237609, term1237609.getClass(), "typeOfThis", term1237941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1237609;
        try {
            callMethod(klass, "isSubtype", argTypes, term1236857, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


