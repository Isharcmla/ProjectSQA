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

public class FunctionType_isSubtype_21010021581371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1933652;
     Object term1934414;

    public FunctionType_isSubtype_21010021581371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1937898 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1937897 = ((Class) term1937898).getDeclaredField((String) "INTERFACE");
        ((Field) term1937897).setAccessible(true);
        Object enum3435 = ((Field) term1937897).get((Object) null);
        term1933652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1934196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1934799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1933652, term1933652.getClass(), "kind", enum3435);
        setField(term1934196, term1934196.getClass(), "kind", enum3435);
        setField(term1934799, term1934799.getClass(), "kind", enum3435);
        setField(term1934196, term1934196.getClass(), "typeOfThis", term1934799);
        setField(term1933652, term1933652.getClass(), "typeOfThis", term1934196);
        Class<? extends Object> term1938192 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1938191 = ((Class) term1938192).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1938191).setAccessible(true);
        Object enum3436 = ((Field) term1938191).get((Object) null);
        term1934414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1934596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1934414, term1934414.getClass(), "kind", enum3436);
        setField(term1934596, term1934596.getClass(), "kind", enum3435);
        setField(term1934596, term1934596.getClass(), "typeOfThis", term1934799);
        setField(term1934414, term1934414.getClass(), "typeOfThis", term1934596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1934414;
        try {
            callMethod(klass, "isSubtype", argTypes, term1933652, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


