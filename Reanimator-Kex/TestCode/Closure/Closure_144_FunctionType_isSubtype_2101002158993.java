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

public class FunctionType_isSubtype_2101002158993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1246522;
     Object term1247294;

    public FunctionType_isSubtype_2101002158993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1248623 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1248622 = ((Class) term1248623).getDeclaredField((String) "ORDINARY");
        ((Field) term1248622).setAccessible(true);
        Object enum2240 = ((Field) term1248622).get((Object) null);
        term1246522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1247066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1247184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1246522, term1246522.getClass(), "kind", enum2240);
        setField(term1247066, term1247066.getClass(), "kind", enum2240);
        setField(term1247066, term1247066.getClass(), "typeOfThis", term1247184);
        setField(term1246522, term1246522.getClass(), "typeOfThis", term1247066);
        Class<? extends Object> term1248914 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1248913 = ((Class) term1248914).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1248913).setAccessible(true);
        Object enum2241 = ((Field) term1248913).get((Object) null);
        term1247294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1247624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1247294, term1247294.getClass(), "kind", enum2240);
        setField(term1247624, term1247624.getClass(), "kind", enum2241);
        setField(term1247624, term1247624.getClass(), "typeOfThis", null);
        setField(term1247294, term1247294.getClass(), "typeOfThis", term1247624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1247294;
        try {
            callMethod(klass, "isSubtype", argTypes, term1246522, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


