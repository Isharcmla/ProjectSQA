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

public class TypeValidator_expectCanCast_1169833078454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222003;
     Object term222113;
     Object term222371;
     Object term223485;
     Object term223486;
     Object term223490;

    public TypeValidator_expectCanCast_1169833078454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222003 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term223495 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term223494 = ((Class) term223495).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term223494).setAccessible(true);
        Object enum108 = ((Field) term223494).get((Object) null);
        term222113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term222113, term222113.getClass(), "kind", enum108);
        setBooleanField(term222113, term222113.getClass(), "unknown", false);
        Class<? extends Object> term223795 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term223794 = ((Class) term223795).getDeclaredField((String) "ORDINARY");
        ((Field) term223794).setAccessible(true);
        Object enum109 = ((Field) term223794).get((Object) null);
        term222371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term222371, term222371.getClass(), "unknown", true);
        setField(term222371, term222371.getClass(), "implicitPrototypeFallback", null);
        setField(term222371, term222371.getClass(), "kind", enum109);
        term223485 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term223485, term223485.getClass(), "compiler", null);
        setField(term223485, term223485.getClass(), "typeRegistry", null);
        setField(term223485, term223485.getClass(), "allValueTypes", null);
        setBooleanField(term223485, term223485.getClass(), "shouldReport", false);
        setField(term223485, term223485.getClass(), "nullOrUndefined", null);
        setField(term223485, term223485.getClass(), "mismatches", null);
        Class<? extends Object> term224086 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term224085 = ((Class) term224086).getDeclaredField((String) "INTERFACE");
        ((Field) term224085).setAccessible(true);
        Object enum110 = ((Field) term224085).get((Object) null);
        term223486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term223486, term223486.getClass(), "call", null);
        setField(term223486, term223486.getClass(), "prototype", null);
        setField(term223486, term223486.getClass(), "kind", enum110);
        setField(term223486, term223486.getClass(), "typeOfThis", null);
        setField(term223486, term223486.getClass(), "source", null);
        setField(term223486, term223486.getClass(), "implementedInterfaces", null);
        setField(term223486, term223486.getClass(), "subTypes", null);
        setField(term223486, term223486.getClass(), "templateTypeName", null);
        setField(term223486, term223486.getClass(), "className", null);
        setField(term223486, term223486.getClass(), "properties", null);
        setBooleanField(term223486, term223486.getClass(), "nativeType", false);
        setField(term223486, term223486.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term223486, term223486.getClass(), "prettyPrint", false);
        setBooleanField(term223486, term223486.getClass(), "visited", false);
        setField(term223486, term223486.getClass(), "docInfo", null);
        setBooleanField(term223486, term223486.getClass(), "unknown", false);
        setBooleanField(term223486, term223486.getClass(), "resolved", false);
        setField(term223486, term223486.getClass(), "resolveResult", null);
        setField(term223486, term223486.getClass(), "registry", null);
        Class<? extends Object> term224380 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term224379 = ((Class) term224380).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term224379).setAccessible(true);
        Object enum111 = ((Field) term224379).get((Object) null);
        term223490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term223490, term223490.getClass(), "call", null);
        setField(term223490, term223490.getClass(), "prototype", null);
        setField(term223490, term223490.getClass(), "kind", enum111);
        setField(term223490, term223490.getClass(), "typeOfThis", null);
        setField(term223490, term223490.getClass(), "source", null);
        setField(term223490, term223490.getClass(), "implementedInterfaces", null);
        setField(term223490, term223490.getClass(), "subTypes", null);
        setField(term223490, term223490.getClass(), "templateTypeName", null);
        setField(term223490, term223490.getClass(), "className", null);
        setField(term223490, term223490.getClass(), "properties", null);
        setBooleanField(term223490, term223490.getClass(), "nativeType", false);
        setField(term223490, term223490.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term223490, term223490.getClass(), "prettyPrint", false);
        setBooleanField(term223490, term223490.getClass(), "visited", false);
        setField(term223490, term223490.getClass(), "docInfo", null);
        setBooleanField(term223490, term223490.getClass(), "unknown", false);
        setBooleanField(term223490, term223490.getClass(), "resolved", false);
        setField(term223490, term223490.getClass(), "resolveResult", null);
        setField(term223490, term223490.getClass(), "registry", null);
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
        args[2] = term222113;
        args[3] = term222371;
        callMethod(klass, "expectCanCast", argTypes, term222003, args);
        assertTrue(recursiveEquals(term222003, term223485));
        assertTrue(recursiveEquals(term222113, null));
        assertTrue(recursiveEquals(term222371, null));
    }

};


