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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class TypeValidator_expectCanCast_1169833078476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243874;
     Object term243984;
     Object term244242;
     Object term245134;
     Object term245135;
     Object term245139;

    public TypeValidator_expectCanCast_1169833078476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243874 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term245144 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term245143 = ((Class) term245144).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term245143).setAccessible(true);
        Object enum143 = ((Field) term245143).get((Object) null);
        term243984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term243984, term243984.getClass(), "kind", enum143);
        Class<? extends Object> term245444 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term245443 = ((Class) term245444).getDeclaredField((String) "INTERFACE");
        ((Field) term245443).setAccessible(true);
        Object enum144 = ((Field) term245443).get((Object) null);
        term244242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term244242, term244242.getClass(), "unknown", true);
        setField(term244242, term244242.getClass(), "implicitPrototypeFallback", null);
        setField(term244242, term244242.getClass(), "kind", enum144);
        term245134 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term245134, term245134.getClass(), "compiler", null);
        setField(term245134, term245134.getClass(), "typeRegistry", null);
        setField(term245134, term245134.getClass(), "allValueTypes", null);
        setBooleanField(term245134, term245134.getClass(), "shouldReport", false);
        setField(term245134, term245134.getClass(), "nullOrUndefined", null);
        setField(term245134, term245134.getClass(), "mismatches", null);
        Class<? extends Object> term245738 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term245737 = ((Class) term245738).getDeclaredField((String) "INTERFACE");
        ((Field) term245737).setAccessible(true);
        Object enum145 = ((Field) term245737).get((Object) null);
        term245135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term245135, term245135.getClass(), "call", null);
        setField(term245135, term245135.getClass(), "prototype", null);
        setField(term245135, term245135.getClass(), "kind", enum145);
        setField(term245135, term245135.getClass(), "typeOfThis", null);
        setField(term245135, term245135.getClass(), "source", null);
        setField(term245135, term245135.getClass(), "implementedInterfaces", null);
        setField(term245135, term245135.getClass(), "subTypes", null);
        setField(term245135, term245135.getClass(), "templateTypeName", null);
        setField(term245135, term245135.getClass(), "className", null);
        setField(term245135, term245135.getClass(), "properties", null);
        setBooleanField(term245135, term245135.getClass(), "nativeType", false);
        setField(term245135, term245135.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term245135, term245135.getClass(), "prettyPrint", false);
        setBooleanField(term245135, term245135.getClass(), "visited", false);
        setField(term245135, term245135.getClass(), "docInfo", null);
        setBooleanField(term245135, term245135.getClass(), "unknown", false);
        setBooleanField(term245135, term245135.getClass(), "resolved", false);
        setField(term245135, term245135.getClass(), "resolveResult", null);
        setField(term245135, term245135.getClass(), "registry", null);
        Class<? extends Object> term246032 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term246031 = ((Class) term246032).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term246031).setAccessible(true);
        Object enum146 = ((Field) term246031).get((Object) null);
        term245139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term245139, term245139.getClass(), "call", null);
        setField(term245139, term245139.getClass(), "prototype", null);
        setField(term245139, term245139.getClass(), "kind", enum146);
        setField(term245139, term245139.getClass(), "typeOfThis", null);
        setField(term245139, term245139.getClass(), "source", null);
        setField(term245139, term245139.getClass(), "implementedInterfaces", null);
        setField(term245139, term245139.getClass(), "subTypes", null);
        setField(term245139, term245139.getClass(), "templateTypeName", null);
        setField(term245139, term245139.getClass(), "className", null);
        setField(term245139, term245139.getClass(), "properties", null);
        setBooleanField(term245139, term245139.getClass(), "nativeType", false);
        setField(term245139, term245139.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term245139, term245139.getClass(), "prettyPrint", false);
        setBooleanField(term245139, term245139.getClass(), "visited", false);
        setField(term245139, term245139.getClass(), "docInfo", null);
        setBooleanField(term245139, term245139.getClass(), "unknown", false);
        setBooleanField(term245139, term245139.getClass(), "resolved", false);
        setField(term245139, term245139.getClass(), "resolveResult", null);
        setField(term245139, term245139.getClass(), "registry", null);
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
        args[2] = term243984;
        args[3] = term244242;
        callMethod(klass, "expectCanCast", argTypes, term243874, args);
        assertTrue(recursiveEquals(term243874, term245134));
        assertTrue(recursiveEquals(term243984, null));
        assertTrue(recursiveEquals(term244242, null));
    }

};


