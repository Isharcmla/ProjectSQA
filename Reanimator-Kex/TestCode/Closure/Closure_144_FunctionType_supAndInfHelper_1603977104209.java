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

public class FunctionType_supAndInfHelper_1603977104209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107114;
     Object term107478;

    public FunctionType_supAndInfHelper_1603977104209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term108572 = ((Class) term108573).getDeclaredField((String) "ORDINARY");
        ((Field) term108572).setAccessible(true);
        Object enum226 = ((Field) term108572).get((Object) null);
        term107114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term107368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term107114, term107114.getClass(), "kind", enum226);
        setField(term107114, term107114.getClass(), "typeOfThis", term107368);
        Class<? extends Object> term108864 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term108863 = ((Class) term108864).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term108863).setAccessible(true);
        Object enum227 = ((Field) term108863).get((Object) null);
        term107478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term107478, term107478.getClass(), "kind", enum227);
        setField(term107478, term107478.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term107478;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term107114, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


