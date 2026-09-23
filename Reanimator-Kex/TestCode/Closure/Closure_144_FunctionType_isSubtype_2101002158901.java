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

public class FunctionType_isSubtype_2101002158901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1094802;
     Object term1095580;

    public FunctionType_isSubtype_2101002158901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1096743 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1096742 = ((Class) term1096743).getDeclaredField((String) "ORDINARY");
        ((Field) term1096742).setAccessible(true);
        Object enum1976 = ((Field) term1096742).get((Object) null);
        term1094802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1095346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1095470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1094802, term1094802.getClass(), "kind", enum1976);
        setField(term1095346, term1095346.getClass(), "kind", enum1976);
        setField(term1095346, term1095346.getClass(), "typeOfThis", term1095470);
        setField(term1094802, term1094802.getClass(), "typeOfThis", term1095346);
        term1095580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1095912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1095580, term1095580.getClass(), "kind", enum1976);
        setField(term1095912, term1095912.getClass(), "kind", enum1976);
        setField(term1095912, term1095912.getClass(), "typeOfThis", null);
        setField(term1095580, term1095580.getClass(), "typeOfThis", term1095912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1095580;
        try {
            callMethod(klass, "isSubtype", argTypes, term1094802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


