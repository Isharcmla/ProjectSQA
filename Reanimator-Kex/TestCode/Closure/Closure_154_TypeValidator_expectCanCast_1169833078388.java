package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TypeValidator_expectCanCast_1169833078388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163733;
     Object term163843;
     Object term164101;

    public TypeValidator_expectCanCast_1169833078388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163733 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term164895 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term164894 = ((Class) term164895).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term164894).setAccessible(true);
        Object enum51 = ((Field) term164894).get((Object) null);
        term163843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term163843, term163843.getClass(), "kind", enum51);
        term164101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term164101, term164101.getClass(), "unknown", false);
        setField(term164101, term164101.getClass(), "kind", enum51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term163843;
        args[3] = term164101;
        try {
            callMethod(klass, "expectCanCast", argTypes, term163733, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


