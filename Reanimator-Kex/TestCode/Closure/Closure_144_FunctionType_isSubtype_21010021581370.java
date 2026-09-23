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

public class FunctionType_isSubtype_21010021581370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1931683;
     Object term1932133;
     Object term1935690;
     Object term1935696;

    public FunctionType_isSubtype_21010021581370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1935706 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1935705 = ((Class) term1935706).getDeclaredField((String) "ORDINARY");
        ((Field) term1935705).setAccessible(true);
        Object enum3429 = ((Field) term1935705).get((Object) null);
        term1931683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1931931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1932025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1931683, term1931683.getClass(), "kind", enum3429);
        setField(term1931931, term1931931.getClass(), "kind", enum3429);
        setField(term1931683, term1931683.getClass(), "typeOfThis", term1931931);
        setField(term1931683, term1931683.getClass(), "call", term1932025);
        Class<? extends Object> term1935997 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1935996 = ((Class) term1935997).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1935996).setAccessible(true);
        Object enum3430 = ((Field) term1935996).get((Object) null);
        Class<? extends Object> term1936297 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1936296 = ((Class) term1936297).getDeclaredField((String) "INTERFACE");
        ((Field) term1936296).setAccessible(true);
        Object enum3431 = ((Field) term1936296).get((Object) null);
        term1932133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1932391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1932133, term1932133.getClass(), "kind", enum3430);
        setField(term1932391, term1932391.getClass(), "kind", enum3431);
        setField(term1932133, term1932133.getClass(), "typeOfThis", term1932391);
        setField(term1932133, term1932133.getClass(), "call", null);
        Class<? extends Object> term1936591 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1936590 = ((Class) term1936591).getDeclaredField((String) "ORDINARY");
        ((Field) term1936590).setAccessible(true);
        Object enum3432 = ((Field) term1936590).get((Object) null);
        term1935690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1935691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1935695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1935691, term1935691.getClass(), "parameters", null);
        setField(term1935691, term1935691.getClass(), "returnType", null);
        setBooleanField(term1935691, term1935691.getClass(), "returnTypeInferred", false);
        setBooleanField(term1935691, term1935691.getClass(), "resolved", false);
        setField(term1935691, term1935691.getClass(), "resolveResult", null);
        setField(term1935691, term1935691.getClass(), "registry", null);
        setField(term1935690, term1935690.getClass(), "call", term1935691);
        setField(term1935690, term1935690.getClass(), "prototype", null);
        setField(term1935690, term1935690.getClass(), "kind", enum3432);
        setField(term1935695, term1935695.getClass(), "call", null);
        setField(term1935695, term1935695.getClass(), "prototype", null);
        setField(term1935695, term1935695.getClass(), "kind", enum3432);
        setField(term1935695, term1935695.getClass(), "typeOfThis", null);
        setField(term1935695, term1935695.getClass(), "source", null);
        setField(term1935695, term1935695.getClass(), "implementedInterfaces", null);
        setField(term1935695, term1935695.getClass(), "subTypes", null);
        setField(term1935695, term1935695.getClass(), "templateTypeName", null);
        setField(term1935695, term1935695.getClass(), "className", null);
        setField(term1935695, term1935695.getClass(), "properties", null);
        setField(term1935695, term1935695.getClass(), "implicitPrototype", null);
        setBooleanField(term1935695, term1935695.getClass(), "nativeType", false);
        setBooleanField(term1935695, term1935695.getClass(), "prettyPrint", false);
        setBooleanField(term1935695, term1935695.getClass(), "visited", false);
        setField(term1935695, term1935695.getClass(), "docInfo", null);
        setBooleanField(term1935695, term1935695.getClass(), "unknown", false);
        setBooleanField(term1935695, term1935695.getClass(), "resolved", false);
        setField(term1935695, term1935695.getClass(), "resolveResult", null);
        setField(term1935695, term1935695.getClass(), "registry", null);
        setField(term1935690, term1935690.getClass(), "typeOfThis", term1935695);
        setField(term1935690, term1935690.getClass(), "source", null);
        setField(term1935690, term1935690.getClass(), "implementedInterfaces", null);
        setField(term1935690, term1935690.getClass(), "subTypes", null);
        setField(term1935690, term1935690.getClass(), "templateTypeName", null);
        setField(term1935690, term1935690.getClass(), "className", null);
        setField(term1935690, term1935690.getClass(), "properties", null);
        setField(term1935690, term1935690.getClass(), "implicitPrototype", null);
        setBooleanField(term1935690, term1935690.getClass(), "nativeType", false);
        setBooleanField(term1935690, term1935690.getClass(), "prettyPrint", false);
        setBooleanField(term1935690, term1935690.getClass(), "visited", false);
        setField(term1935690, term1935690.getClass(), "docInfo", null);
        setBooleanField(term1935690, term1935690.getClass(), "unknown", false);
        setBooleanField(term1935690, term1935690.getClass(), "resolved", false);
        setField(term1935690, term1935690.getClass(), "resolveResult", null);
        setField(term1935690, term1935690.getClass(), "registry", null);
        Class<? extends Object> term1936882 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1936881 = ((Class) term1936882).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1936881).setAccessible(true);
        Object enum3433 = ((Field) term1936881).get((Object) null);
        Class<? extends Object> term1937182 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1937181 = ((Class) term1937182).getDeclaredField((String) "INTERFACE");
        ((Field) term1937181).setAccessible(true);
        Object enum3434 = ((Field) term1937181).get((Object) null);
        term1935696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1935700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1935696, term1935696.getClass(), "this$0", null);
        setField(term1935696, term1935696.getClass(), "call", null);
        setField(term1935696, term1935696.getClass(), "prototype", null);
        setField(term1935696, term1935696.getClass(), "kind", enum3433);
        setField(term1935700, term1935700.getClass(), "call", null);
        setField(term1935700, term1935700.getClass(), "prototype", null);
        setField(term1935700, term1935700.getClass(), "kind", enum3434);
        setField(term1935700, term1935700.getClass(), "typeOfThis", null);
        setField(term1935700, term1935700.getClass(), "source", null);
        setField(term1935700, term1935700.getClass(), "implementedInterfaces", null);
        setField(term1935700, term1935700.getClass(), "subTypes", null);
        setField(term1935700, term1935700.getClass(), "templateTypeName", null);
        setField(term1935700, term1935700.getClass(), "className", null);
        setField(term1935700, term1935700.getClass(), "properties", null);
        setField(term1935700, term1935700.getClass(), "implicitPrototype", null);
        setBooleanField(term1935700, term1935700.getClass(), "nativeType", false);
        setBooleanField(term1935700, term1935700.getClass(), "prettyPrint", false);
        setBooleanField(term1935700, term1935700.getClass(), "visited", false);
        setField(term1935700, term1935700.getClass(), "docInfo", null);
        setBooleanField(term1935700, term1935700.getClass(), "unknown", false);
        setBooleanField(term1935700, term1935700.getClass(), "resolved", false);
        setField(term1935700, term1935700.getClass(), "resolveResult", null);
        setField(term1935700, term1935700.getClass(), "registry", null);
        setField(term1935696, term1935696.getClass(), "typeOfThis", term1935700);
        setField(term1935696, term1935696.getClass(), "source", null);
        setField(term1935696, term1935696.getClass(), "implementedInterfaces", null);
        setField(term1935696, term1935696.getClass(), "subTypes", null);
        setField(term1935696, term1935696.getClass(), "templateTypeName", null);
        setField(term1935696, term1935696.getClass(), "className", null);
        setField(term1935696, term1935696.getClass(), "properties", null);
        setField(term1935696, term1935696.getClass(), "implicitPrototype", null);
        setBooleanField(term1935696, term1935696.getClass(), "nativeType", false);
        setBooleanField(term1935696, term1935696.getClass(), "prettyPrint", false);
        setBooleanField(term1935696, term1935696.getClass(), "visited", false);
        setField(term1935696, term1935696.getClass(), "docInfo", null);
        setBooleanField(term1935696, term1935696.getClass(), "unknown", false);
        setBooleanField(term1935696, term1935696.getClass(), "resolved", false);
        setField(term1935696, term1935696.getClass(), "resolveResult", null);
        setField(term1935696, term1935696.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1932133;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1931683, args);
        assertTrue(recursiveEquals(term1931683, term1935690));
        assertTrue(recursiveEquals(term1932133, term1935696));
        assertTrue(recursiveEquals(retValue, false));
    }

};


