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

public class FunctionType_isSubtype_21010021581363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1918003;
     Object term1918663;

    public FunctionType_isSubtype_21010021581363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1921711 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1921710 = ((Class) term1921711).getDeclaredField((String) "INTERFACE");
        ((Field) term1921710).setAccessible(true);
        Object enum3403 = ((Field) term1921710).get((Object) null);
        Class<? extends Object> term1922005 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1922004 = ((Class) term1922005).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1922004).setAccessible(true);
        Object enum3404 = ((Field) term1922004).get((Object) null);
        term1918003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1918555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1918003, term1918003.getClass(), "kind", enum3403);
        setField(term1918555, term1918555.getClass(), "kind", enum3404);
        setField(term1918003, term1918003.getClass(), "typeOfThis", term1918555);
        term1918663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1918993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1918663, term1918663.getClass(), "kind", enum3403);
        setField(term1918993, term1918993.getClass(), "kind", enum3403);
        setField(term1918663, term1918663.getClass(), "typeOfThis", term1918993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1918663;
        try {
            callMethod(klass, "isSubtype", argTypes, term1918003, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


