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

public class FunctionType_getLeastSupertype_418850886673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689420;
     Object term689782;

    public FunctionType_getLeastSupertype_418850886673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term690855 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term690854 = ((Class) term690855).getDeclaredField((String) "INTERFACE");
        ((Field) term690854).setAccessible(true);
        Object enum1241 = ((Field) term690854).get((Object) null);
        term689420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term689672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term689420, term689420.getClass(), "kind", enum1241);
        setField(term689420, term689420.getClass(), "registry", term689672);
        Class<? extends Object> term691149 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term691148 = ((Class) term691149).getDeclaredField((String) "ORDINARY");
        ((Field) term691148).setAccessible(true);
        Object enum1242 = ((Field) term691148).get((Object) null);
        term689782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term689782, term689782.getClass(), "kind", enum1242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term689782;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term689420, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


