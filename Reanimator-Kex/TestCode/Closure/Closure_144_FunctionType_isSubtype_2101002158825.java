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

public class FunctionType_isSubtype_2101002158825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term958426;
     Object term958782;

    public FunctionType_isSubtype_2101002158825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term960053 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term960052 = ((Class) term960053).getDeclaredField((String) "ORDINARY");
        ((Field) term960052).setAccessible(true);
        Object enum1734 = ((Field) term960052).get((Object) null);
        term958426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term958674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term958426, term958426.getClass(), "kind", enum1734);
        setField(term958426, term958426.getClass(), "typeOfThis", term958674);
        Class<? extends Object> term960344 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term960343 = ((Class) term960344).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term960343).setAccessible(true);
        Object enum1735 = ((Field) term960343).get((Object) null);
        term958782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term959018 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term958782, term958782.getClass(), "kind", enum1735);
        setField(term958782, term958782.getClass(), "typeOfThis", term959018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term958782;
        try {
            callMethod(klass, "isSubtype", argTypes, term958426, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


