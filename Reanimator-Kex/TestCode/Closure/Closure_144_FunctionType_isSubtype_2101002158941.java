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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_2101002158941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156715;
     Object term1157377;
     Object term1160245;
     Object term1160253;

    public FunctionType_isSubtype_2101002158941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1160260 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1160259 = ((Class) term1160260).getDeclaredField((String) "INTERFACE");
        ((Field) term1160259).setAccessible(true);
        Object enum2086 = ((Field) term1160259).get((Object) null);
        Class<? extends Object> term1160554 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1160553 = ((Class) term1160554).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1160553).setAccessible(true);
        Object enum2087 = ((Field) term1160553).get((Object) null);
        term1156715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1157267 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1156715, term1156715.getClass(), "kind", enum2086);
        setField(term1157267, term1157267.getClass(), "kind", enum2087);
        setField(term1156715, term1156715.getClass(), "typeOfThis", term1157267);
        term1157377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1157559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1157377, term1157377.getClass(), "kind", enum2087);
        setField(term1157377, term1157377.getClass(), "typeOfThis", term1157559);
        Class<? extends Object> term1160854 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1160853 = ((Class) term1160854).getDeclaredField((String) "INTERFACE");
        ((Field) term1160853).setAccessible(true);
        Object enum2088 = ((Field) term1160853).get((Object) null);
        Class<? extends Object> term1161148 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1161147 = ((Class) term1161148).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1161147).setAccessible(true);
        Object enum2089 = ((Field) term1161147).get((Object) null);
        term1160245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1160249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1160245, term1160245.getClass(), "call", null);
        setField(term1160245, term1160245.getClass(), "prototype", null);
        setField(term1160245, term1160245.getClass(), "kind", enum2088);
        setField(term1160249, term1160249.getClass(), "this$0", null);
        setField(term1160249, term1160249.getClass(), "call", null);
        setField(term1160249, term1160249.getClass(), "prototype", null);
        setField(term1160249, term1160249.getClass(), "kind", enum2089);
        setField(term1160249, term1160249.getClass(), "typeOfThis", null);
        setField(term1160249, term1160249.getClass(), "source", null);
        setField(term1160249, term1160249.getClass(), "implementedInterfaces", null);
        setField(term1160249, term1160249.getClass(), "subTypes", null);
        setField(term1160249, term1160249.getClass(), "templateTypeName", null);
        setField(term1160249, term1160249.getClass(), "className", null);
        setField(term1160249, term1160249.getClass(), "properties", null);
        setField(term1160249, term1160249.getClass(), "implicitPrototype", null);
        setBooleanField(term1160249, term1160249.getClass(), "nativeType", false);
        setBooleanField(term1160249, term1160249.getClass(), "prettyPrint", false);
        setBooleanField(term1160249, term1160249.getClass(), "visited", false);
        setField(term1160249, term1160249.getClass(), "docInfo", null);
        setBooleanField(term1160249, term1160249.getClass(), "unknown", false);
        setBooleanField(term1160249, term1160249.getClass(), "resolved", false);
        setField(term1160249, term1160249.getClass(), "resolveResult", null);
        setField(term1160249, term1160249.getClass(), "registry", null);
        setField(term1160245, term1160245.getClass(), "typeOfThis", term1160249);
        setField(term1160245, term1160245.getClass(), "source", null);
        setField(term1160245, term1160245.getClass(), "implementedInterfaces", null);
        setField(term1160245, term1160245.getClass(), "subTypes", null);
        setField(term1160245, term1160245.getClass(), "templateTypeName", null);
        setField(term1160245, term1160245.getClass(), "className", null);
        setField(term1160245, term1160245.getClass(), "properties", null);
        setField(term1160245, term1160245.getClass(), "implicitPrototype", null);
        setBooleanField(term1160245, term1160245.getClass(), "nativeType", false);
        setBooleanField(term1160245, term1160245.getClass(), "prettyPrint", false);
        setBooleanField(term1160245, term1160245.getClass(), "visited", false);
        setField(term1160245, term1160245.getClass(), "docInfo", null);
        setBooleanField(term1160245, term1160245.getClass(), "unknown", false);
        setBooleanField(term1160245, term1160245.getClass(), "resolved", false);
        setField(term1160245, term1160245.getClass(), "resolveResult", null);
        setField(term1160245, term1160245.getClass(), "registry", null);
        Class<? extends Object> term1161448 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1161447 = ((Class) term1161448).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1161447).setAccessible(true);
        Object enum2090 = ((Field) term1161447).get((Object) null);
        term1160253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1160257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1160253, term1160253.getClass(), "call", null);
        setField(term1160253, term1160253.getClass(), "prototype", null);
        setField(term1160253, term1160253.getClass(), "kind", enum2090);
        setField(term1160257, term1160257.getClass(), "this$0", null);
        setField(term1160257, term1160257.getClass(), "call", null);
        setField(term1160257, term1160257.getClass(), "prototype", null);
        setField(term1160257, term1160257.getClass(), "kind", null);
        setField(term1160257, term1160257.getClass(), "typeOfThis", null);
        setField(term1160257, term1160257.getClass(), "source", null);
        setField(term1160257, term1160257.getClass(), "implementedInterfaces", null);
        setField(term1160257, term1160257.getClass(), "subTypes", null);
        setField(term1160257, term1160257.getClass(), "templateTypeName", null);
        setField(term1160257, term1160257.getClass(), "className", null);
        setField(term1160257, term1160257.getClass(), "properties", null);
        setField(term1160257, term1160257.getClass(), "implicitPrototype", null);
        setBooleanField(term1160257, term1160257.getClass(), "nativeType", false);
        setBooleanField(term1160257, term1160257.getClass(), "prettyPrint", false);
        setBooleanField(term1160257, term1160257.getClass(), "visited", false);
        setField(term1160257, term1160257.getClass(), "docInfo", null);
        setBooleanField(term1160257, term1160257.getClass(), "unknown", false);
        setBooleanField(term1160257, term1160257.getClass(), "resolved", false);
        setField(term1160257, term1160257.getClass(), "resolveResult", null);
        setField(term1160257, term1160257.getClass(), "registry", null);
        setField(term1160253, term1160253.getClass(), "typeOfThis", term1160257);
        setField(term1160253, term1160253.getClass(), "source", null);
        setField(term1160253, term1160253.getClass(), "implementedInterfaces", null);
        setField(term1160253, term1160253.getClass(), "subTypes", null);
        setField(term1160253, term1160253.getClass(), "templateTypeName", null);
        setField(term1160253, term1160253.getClass(), "className", null);
        setField(term1160253, term1160253.getClass(), "properties", null);
        setField(term1160253, term1160253.getClass(), "implicitPrototype", null);
        setBooleanField(term1160253, term1160253.getClass(), "nativeType", false);
        setBooleanField(term1160253, term1160253.getClass(), "prettyPrint", false);
        setBooleanField(term1160253, term1160253.getClass(), "visited", false);
        setField(term1160253, term1160253.getClass(), "docInfo", null);
        setBooleanField(term1160253, term1160253.getClass(), "unknown", false);
        setBooleanField(term1160253, term1160253.getClass(), "resolved", false);
        setField(term1160253, term1160253.getClass(), "resolveResult", null);
        setField(term1160253, term1160253.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1157377;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1156715, args);
        assertTrue(recursiveEquals(term1156715, term1160245));
        assertTrue(recursiveEquals(term1157377, term1160253));
        assertTrue(recursiveEquals(retValue, false));
    }

};


