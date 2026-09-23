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

public class FunctionType_supAndInfHelper_1603977104701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739785;
     Object term740147;

    public FunctionType_supAndInfHelper_1603977104701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term741227 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term741226 = ((Class) term741227).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term741226).setAccessible(true);
        Object enum1116 = ((Field) term741226).get((Object) null);
        term739785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term740037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term739785, term739785.getClass(), "kind", enum1116);
        setField(term739785, term739785.getClass(), "registry", term740037);
        Class<? extends Object> term741527 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term741526 = ((Class) term741527).getDeclaredField((String) "ORDINARY");
        ((Field) term741526).setAccessible(true);
        Object enum1117 = ((Field) term741526).get((Object) null);
        term740147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term740147, term740147.getClass(), "kind", enum1117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term740147;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term739785, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


