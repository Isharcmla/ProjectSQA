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

public class FunctionType_isSubtype_21010021581711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2325498;
     Object term2326158;

    public FunctionType_isSubtype_21010021581711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2328956 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2328955 = ((Class) term2328956).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2328955).setAccessible(true);
        Object enum4349 = ((Field) term2328955).get((Object) null);
        Class<? extends Object> term2329256 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2329255 = ((Class) term2329256).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2329255).setAccessible(true);
        Object enum4350 = ((Field) term2329255).get((Object) null);
        term2325498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2326434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2325498, term2325498.getClass(), "kind", enum4349);
        setField(term2326434, term2326434.getClass(), "kind", enum4350);
        setField(term2326434, term2326434.getClass(), "typeOfThis", null);
        setField(term2325498, term2325498.getClass(), "typeOfThis", term2326434);
        term2326158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2326158, term2326158.getClass(), "kind", enum4349);
        setField(term2326158, term2326158.getClass(), "typeOfThis", term2326434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2326158;
        try {
            callMethod(klass, "isSubtype", argTypes, term2325498, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


