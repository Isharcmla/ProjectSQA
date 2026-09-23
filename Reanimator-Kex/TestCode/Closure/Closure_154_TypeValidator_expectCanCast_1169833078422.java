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

public class TypeValidator_expectCanCast_1169833078422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198855;
     Object term198965;
     Object term199223;
     Object term199684;
     Object term199685;
     Object term199686;

    public TypeValidator_expectCanCast_1169833078422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198855 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term199691 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term199690 = ((Class) term199691).getDeclaredField((String) "INTERFACE");
        ((Field) term199690).setAccessible(true);
        Object enum87 = ((Field) term199690).get((Object) null);
        term198965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term198965, term198965.getClass(), "kind", enum87);
        term199223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term199223, term199223.getClass(), "unknown", true);
        setField(term199223, term199223.getClass(), "implicitPrototypeFallback", null);
        term199684 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term199684, term199684.getClass(), "compiler", null);
        setField(term199684, term199684.getClass(), "typeRegistry", null);
        setField(term199684, term199684.getClass(), "allValueTypes", null);
        setBooleanField(term199684, term199684.getClass(), "shouldReport", false);
        setField(term199684, term199684.getClass(), "nullOrUndefined", null);
        setField(term199684, term199684.getClass(), "mismatches", null);
        term199685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term199685, term199685.getClass(), "call", null);
        setField(term199685, term199685.getClass(), "prototype", null);
        setField(term199685, term199685.getClass(), "kind", null);
        setField(term199685, term199685.getClass(), "typeOfThis", null);
        setField(term199685, term199685.getClass(), "source", null);
        setField(term199685, term199685.getClass(), "implementedInterfaces", null);
        setField(term199685, term199685.getClass(), "subTypes", null);
        setField(term199685, term199685.getClass(), "templateTypeName", null);
        setField(term199685, term199685.getClass(), "className", null);
        setField(term199685, term199685.getClass(), "properties", null);
        setBooleanField(term199685, term199685.getClass(), "nativeType", false);
        setField(term199685, term199685.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term199685, term199685.getClass(), "prettyPrint", false);
        setBooleanField(term199685, term199685.getClass(), "visited", false);
        setField(term199685, term199685.getClass(), "docInfo", null);
        setBooleanField(term199685, term199685.getClass(), "unknown", false);
        setBooleanField(term199685, term199685.getClass(), "resolved", false);
        setField(term199685, term199685.getClass(), "resolveResult", null);
        setField(term199685, term199685.getClass(), "registry", null);
        Class<? extends Object> term199985 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term199984 = ((Class) term199985).getDeclaredField((String) "INTERFACE");
        ((Field) term199984).setAccessible(true);
        Object enum88 = ((Field) term199984).get((Object) null);
        term199686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term199686, term199686.getClass(), "call", null);
        setField(term199686, term199686.getClass(), "prototype", null);
        setField(term199686, term199686.getClass(), "kind", enum88);
        setField(term199686, term199686.getClass(), "typeOfThis", null);
        setField(term199686, term199686.getClass(), "source", null);
        setField(term199686, term199686.getClass(), "implementedInterfaces", null);
        setField(term199686, term199686.getClass(), "subTypes", null);
        setField(term199686, term199686.getClass(), "templateTypeName", null);
        setField(term199686, term199686.getClass(), "className", null);
        setField(term199686, term199686.getClass(), "properties", null);
        setBooleanField(term199686, term199686.getClass(), "nativeType", false);
        setField(term199686, term199686.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term199686, term199686.getClass(), "prettyPrint", false);
        setBooleanField(term199686, term199686.getClass(), "visited", false);
        setField(term199686, term199686.getClass(), "docInfo", null);
        setBooleanField(term199686, term199686.getClass(), "unknown", false);
        setBooleanField(term199686, term199686.getClass(), "resolved", false);
        setField(term199686, term199686.getClass(), "resolveResult", null);
        setField(term199686, term199686.getClass(), "registry", null);
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
        args[2] = term198965;
        args[3] = term199223;
        callMethod(klass, "expectCanCast", argTypes, term198855, args);
        assertTrue(recursiveEquals(term198855, term199684));
        assertTrue(recursiveEquals(term198965, null));
        assertTrue(recursiveEquals(term199223, null));
    }

};


