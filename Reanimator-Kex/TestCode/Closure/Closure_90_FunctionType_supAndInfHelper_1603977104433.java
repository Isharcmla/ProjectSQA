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

public class FunctionType_supAndInfHelper_1603977104433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341651;
     Object term342013;

    public FunctionType_supAndInfHelper_1603977104433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term343093 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term343092 = ((Class) term343093).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term343092).setAccessible(true);
        Object enum586 = ((Field) term343092).get((Object) null);
        term341651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term341903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term341651, term341651.getClass(), "kind", enum586);
        setField(term341651, term341651.getClass(), "registry", term341903);
        Class<? extends Object> term343393 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term343392 = ((Class) term343393).getDeclaredField((String) "ORDINARY");
        ((Field) term343392).setAccessible(true);
        Object enum587 = ((Field) term343392).get((Object) null);
        term342013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term342013, term342013.getClass(), "kind", enum587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term342013;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term341651, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


