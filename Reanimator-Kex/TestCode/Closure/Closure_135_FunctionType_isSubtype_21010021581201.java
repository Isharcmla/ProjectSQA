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

public class FunctionType_isSubtype_21010021581201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1462409;
     Object term1462773;

    public FunctionType_isSubtype_21010021581201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1464166 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1464165 = ((Class) term1464166).getDeclaredField((String) "ORDINARY");
        ((Field) term1464165).setAccessible(true);
        Object enum2734 = ((Field) term1464165).get((Object) null);
        term1462409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1462665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1462409, term1462409.getClass(), "kind", enum2734);
        setField(term1462409, term1462409.getClass(), "typeOfThis", term1462665);
        Class<? extends Object> term1464457 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1464456 = ((Class) term1464457).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1464456).setAccessible(true);
        Object enum2735 = ((Field) term1464456).get((Object) null);
        term1462773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1462955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1463203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term1462773, term1462773.getClass(), "kind", enum2734);
        setField(term1462955, term1462955.getClass(), "kind", enum2735);
        setField(term1462955, term1462955.getClass(), "typeOfThis", term1463203);
        setField(term1462773, term1462773.getClass(), "typeOfThis", term1462955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1462773;
        try {
            callMethod(klass, "isSubtype", argTypes, term1462409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


