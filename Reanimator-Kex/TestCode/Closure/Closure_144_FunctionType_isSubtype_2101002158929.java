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

public class FunctionType_isSubtype_2101002158929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1137322;
     Object term1137826;

    public FunctionType_isSubtype_2101002158929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1141686 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1141685 = ((Class) term1141686).getDeclaredField((String) "ORDINARY");
        ((Field) term1141685).setAccessible(true);
        Object enum2050 = ((Field) term1141685).get((Object) null);
        Class<? extends Object> term1141977 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1141976 = ((Class) term1141977).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1141976).setAccessible(true);
        Object enum2051 = ((Field) term1141976).get((Object) null);
        term1137322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1138058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1137322, term1137322.getClass(), "kind", enum2050);
        setField(term1138058, term1138058.getClass(), "kind", enum2051);
        setField(term1138058, term1138058.getClass(), "typeOfThis", null);
        setField(term1138058, term1138058.getClass(), "call", null);
        setField(term1137322, term1137322.getClass(), "typeOfThis", term1138058);
        term1137826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1138008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1138226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1137826, term1137826.getClass(), "kind", enum2050);
        setField(term1138008, term1138008.getClass(), "kind", enum2050);
        setField(term1138008, term1138008.getClass(), "typeOfThis", term1138058);
        setField(term1138008, term1138008.getClass(), "call", term1138226);
        setField(term1137826, term1137826.getClass(), "typeOfThis", term1138008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1137826;
        try {
            callMethod(klass, "isSubtype", argTypes, term1137322, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


