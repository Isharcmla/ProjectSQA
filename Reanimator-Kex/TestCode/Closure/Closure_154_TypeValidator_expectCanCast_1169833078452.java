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

public class TypeValidator_expectCanCast_1169833078452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218672;
     Object term218782;
     Object term219436;

    public TypeValidator_expectCanCast_1169833078452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218672 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term220565 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term220564 = ((Class) term220565).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term220564).setAccessible(true);
        Object enum102 = ((Field) term220564).get((Object) null);
        term218782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term219326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term218782, term218782.getClass(), "kind", enum102);
        setField(term218782, term218782.getClass(), "typeOfThis", term219326);
        Class<? extends Object> term220865 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term220864 = ((Class) term220865).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term220864).setAccessible(true);
        Object enum103 = ((Field) term220864).get((Object) null);
        term219436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term219436, term219436.getClass(), "unknown", false);
        setField(term219436, term219436.getClass(), "kind", enum103);
        setField(term219436, term219436.getClass(), "typeOfThis", null);
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
        args[2] = term218782;
        args[3] = term219436;
        try {
            callMethod(klass, "expectCanCast", argTypes, term218672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


