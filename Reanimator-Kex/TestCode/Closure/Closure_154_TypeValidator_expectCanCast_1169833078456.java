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

public class TypeValidator_expectCanCast_1169833078456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224909;
     Object term225019;
     Object term225277;
     Object term226243;
     Object term226244;
     Object term226248;

    public TypeValidator_expectCanCast_1169833078456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224909 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term226253 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term226252 = ((Class) term226253).getDeclaredField((String) "INTERFACE");
        ((Field) term226252).setAccessible(true);
        Object enum114 = ((Field) term226252).get((Object) null);
        term225019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term225019, term225019.getClass(), "kind", enum114);
        setBooleanField(term225019, term225019.getClass(), "unknown", false);
        Class<? extends Object> term226547 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term226546 = ((Class) term226547).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term226546).setAccessible(true);
        Object enum115 = ((Field) term226546).get((Object) null);
        term225277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term225277, term225277.getClass(), "unknown", true);
        setField(term225277, term225277.getClass(), "implicitPrototypeFallback", null);
        setField(term225277, term225277.getClass(), "kind", enum115);
        term226243 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term226243, term226243.getClass(), "compiler", null);
        setField(term226243, term226243.getClass(), "typeRegistry", null);
        setField(term226243, term226243.getClass(), "allValueTypes", null);
        setBooleanField(term226243, term226243.getClass(), "shouldReport", false);
        setField(term226243, term226243.getClass(), "nullOrUndefined", null);
        setField(term226243, term226243.getClass(), "mismatches", null);
        Class<? extends Object> term226847 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term226846 = ((Class) term226847).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term226846).setAccessible(true);
        Object enum116 = ((Field) term226846).get((Object) null);
        term226244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term226244, term226244.getClass(), "call", null);
        setField(term226244, term226244.getClass(), "prototype", null);
        setField(term226244, term226244.getClass(), "kind", enum116);
        setField(term226244, term226244.getClass(), "typeOfThis", null);
        setField(term226244, term226244.getClass(), "source", null);
        setField(term226244, term226244.getClass(), "implementedInterfaces", null);
        setField(term226244, term226244.getClass(), "subTypes", null);
        setField(term226244, term226244.getClass(), "templateTypeName", null);
        setField(term226244, term226244.getClass(), "className", null);
        setField(term226244, term226244.getClass(), "properties", null);
        setBooleanField(term226244, term226244.getClass(), "nativeType", false);
        setField(term226244, term226244.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term226244, term226244.getClass(), "prettyPrint", false);
        setBooleanField(term226244, term226244.getClass(), "visited", false);
        setField(term226244, term226244.getClass(), "docInfo", null);
        setBooleanField(term226244, term226244.getClass(), "unknown", false);
        setBooleanField(term226244, term226244.getClass(), "resolved", false);
        setField(term226244, term226244.getClass(), "resolveResult", null);
        setField(term226244, term226244.getClass(), "registry", null);
        Class<? extends Object> term227147 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term227146 = ((Class) term227147).getDeclaredField((String) "INTERFACE");
        ((Field) term227146).setAccessible(true);
        Object enum117 = ((Field) term227146).get((Object) null);
        term226248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term226248, term226248.getClass(), "call", null);
        setField(term226248, term226248.getClass(), "prototype", null);
        setField(term226248, term226248.getClass(), "kind", enum117);
        setField(term226248, term226248.getClass(), "typeOfThis", null);
        setField(term226248, term226248.getClass(), "source", null);
        setField(term226248, term226248.getClass(), "implementedInterfaces", null);
        setField(term226248, term226248.getClass(), "subTypes", null);
        setField(term226248, term226248.getClass(), "templateTypeName", null);
        setField(term226248, term226248.getClass(), "className", null);
        setField(term226248, term226248.getClass(), "properties", null);
        setBooleanField(term226248, term226248.getClass(), "nativeType", false);
        setField(term226248, term226248.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term226248, term226248.getClass(), "prettyPrint", false);
        setBooleanField(term226248, term226248.getClass(), "visited", false);
        setField(term226248, term226248.getClass(), "docInfo", null);
        setBooleanField(term226248, term226248.getClass(), "unknown", false);
        setBooleanField(term226248, term226248.getClass(), "resolved", false);
        setField(term226248, term226248.getClass(), "resolveResult", null);
        setField(term226248, term226248.getClass(), "registry", null);
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
        args[2] = term225019;
        args[3] = term225277;
        callMethod(klass, "expectCanCast", argTypes, term224909, args);
        assertTrue(recursiveEquals(term224909, term226243));
        assertTrue(recursiveEquals(term225019, null));
        assertTrue(recursiveEquals(term225277, null));
    }

};


