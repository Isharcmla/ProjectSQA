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

public class TypeValidator_expectCanCast_1169833078502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264895;
     Object term265005;
     Object term265659;

    public TypeValidator_expectCanCast_1169833078502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264895 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term267144 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term267143 = ((Class) term267144).getDeclaredField((String) "ORDINARY");
        ((Field) term267143).setAccessible(true);
        Object enum166 = ((Field) term267143).get((Object) null);
        term265005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term265783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term265005, term265005.getClass(), "kind", enum166);
        setField(term265005, term265005.getClass(), "typeOfThis", term265783);
        Class<? extends Object> term267435 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term267434 = ((Class) term267435).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term267434).setAccessible(true);
        Object enum167 = ((Field) term267434).get((Object) null);
        term265659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term265659, term265659.getClass(), "unknown", false);
        setField(term265659, term265659.getClass(), "kind", enum167);
        setField(term265659, term265659.getClass(), "typeOfThis", term265783);
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
        args[2] = term265005;
        args[3] = term265659;
        try {
            callMethod(klass, "expectCanCast", argTypes, term264895, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


