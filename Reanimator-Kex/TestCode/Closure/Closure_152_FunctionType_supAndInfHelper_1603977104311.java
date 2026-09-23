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

public class FunctionType_supAndInfHelper_1603977104311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194883;
     Object term195245;

    public FunctionType_supAndInfHelper_1603977104311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196323 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term196322 = ((Class) term196323).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term196322).setAccessible(true);
        Object enum353 = ((Field) term196322).get((Object) null);
        term194883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term195135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term194883, term194883.getClass(), "kind", enum353);
        setField(term194883, term194883.getClass(), "registry", term195135);
        Class<? extends Object> term196623 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term196622 = ((Class) term196623).getDeclaredField((String) "ORDINARY");
        ((Field) term196622).setAccessible(true);
        Object enum354 = ((Field) term196622).get((Object) null);
        term195245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term195245, term195245.getClass(), "kind", enum354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term195245;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term194883, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


