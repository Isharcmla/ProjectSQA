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

public class TypeValidator_expectCanCast_1169833078404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181805;
     Object term181915;
     Object term182469;
     Object term183287;
     Object term183288;
     Object term183292;

    public TypeValidator_expectCanCast_1169833078404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181805 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term183297 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term183296 = ((Class) term183297).getDeclaredField((String) "INTERFACE");
        ((Field) term183296).setAccessible(true);
        Object enum73 = ((Field) term183296).get((Object) null);
        term181915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term181915, term181915.getClass(), "kind", enum73);
        Class<? extends Object> term183591 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term183590 = ((Class) term183591).getDeclaredField((String) "INTERFACE");
        ((Field) term183590).setAccessible(true);
        Object enum74 = ((Field) term183590).get((Object) null);
        term182469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term182469, term182469.getClass(), "unknown", true);
        setField(term182469, term182469.getClass(), "implicitPrototypeFallback", null);
        setField(term182469, term182469.getClass(), "kind", enum74);
        term183287 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term183287, term183287.getClass(), "compiler", null);
        setField(term183287, term183287.getClass(), "typeRegistry", null);
        setField(term183287, term183287.getClass(), "allValueTypes", null);
        setBooleanField(term183287, term183287.getClass(), "shouldReport", false);
        setField(term183287, term183287.getClass(), "nullOrUndefined", null);
        setField(term183287, term183287.getClass(), "mismatches", null);
        Class<? extends Object> term183885 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term183884 = ((Class) term183885).getDeclaredField((String) "INTERFACE");
        ((Field) term183884).setAccessible(true);
        Object enum75 = ((Field) term183884).get((Object) null);
        term183288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term183288, term183288.getClass(), "call", null);
        setField(term183288, term183288.getClass(), "prototype", null);
        setField(term183288, term183288.getClass(), "kind", enum75);
        setField(term183288, term183288.getClass(), "typeOfThis", null);
        setField(term183288, term183288.getClass(), "source", null);
        setField(term183288, term183288.getClass(), "implementedInterfaces", null);
        setField(term183288, term183288.getClass(), "subTypes", null);
        setField(term183288, term183288.getClass(), "templateTypeName", null);
        setField(term183288, term183288.getClass(), "className", null);
        setField(term183288, term183288.getClass(), "properties", null);
        setBooleanField(term183288, term183288.getClass(), "nativeType", false);
        setField(term183288, term183288.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term183288, term183288.getClass(), "prettyPrint", false);
        setBooleanField(term183288, term183288.getClass(), "visited", false);
        setField(term183288, term183288.getClass(), "docInfo", null);
        setBooleanField(term183288, term183288.getClass(), "unknown", false);
        setBooleanField(term183288, term183288.getClass(), "resolved", false);
        setField(term183288, term183288.getClass(), "resolveResult", null);
        setField(term183288, term183288.getClass(), "registry", null);
        Class<? extends Object> term184179 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term184178 = ((Class) term184179).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term184178).setAccessible(true);
        Object enum76 = ((Field) term184178).get((Object) null);
        term183292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term183292, term183292.getClass(), "call", null);
        setField(term183292, term183292.getClass(), "prototype", null);
        setField(term183292, term183292.getClass(), "kind", enum76);
        setField(term183292, term183292.getClass(), "typeOfThis", null);
        setField(term183292, term183292.getClass(), "source", null);
        setField(term183292, term183292.getClass(), "implementedInterfaces", null);
        setField(term183292, term183292.getClass(), "subTypes", null);
        setField(term183292, term183292.getClass(), "templateTypeName", null);
        setField(term183292, term183292.getClass(), "className", null);
        setField(term183292, term183292.getClass(), "properties", null);
        setBooleanField(term183292, term183292.getClass(), "nativeType", false);
        setField(term183292, term183292.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term183292, term183292.getClass(), "prettyPrint", false);
        setBooleanField(term183292, term183292.getClass(), "visited", false);
        setField(term183292, term183292.getClass(), "docInfo", null);
        setBooleanField(term183292, term183292.getClass(), "unknown", false);
        setBooleanField(term183292, term183292.getClass(), "resolved", false);
        setField(term183292, term183292.getClass(), "resolveResult", null);
        setField(term183292, term183292.getClass(), "registry", null);
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
        args[2] = term181915;
        args[3] = term182469;
        callMethod(klass, "expectCanCast", argTypes, term181805, args);
        assertTrue(recursiveEquals(term181805, term183287));
        assertTrue(recursiveEquals(term181915, null));
        assertTrue(recursiveEquals(term182469, null));
    }

};


