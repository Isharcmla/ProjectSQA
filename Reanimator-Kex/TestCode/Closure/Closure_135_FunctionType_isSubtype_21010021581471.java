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

public class FunctionType_isSubtype_21010021581471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920238;
     Object term1920898;
     Object term1922064;
     Object term1922069;

    public FunctionType_isSubtype_21010021581471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1922080 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1922079 = ((Class) term1922080).getDeclaredField((String) "INTERFACE");
        ((Field) term1922079).setAccessible(true);
        Object enum3577 = ((Field) term1922079).get((Object) null);
        term1920238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1920790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1920238, term1920238.getClass(), "kind", enum3577);
        setField(term1920790, term1920790.getClass(), "kind", enum3577);
        setField(term1920790, term1920790.getClass(), "typeOfThis", term1920238);
        setField(term1920238, term1920238.getClass(), "typeOfThis", term1920790);
        Class<? extends Object> term1922374 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1922373 = ((Class) term1922374).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1922373).setAccessible(true);
        Object enum3578 = ((Field) term1922373).get((Object) null);
        term1920898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1921228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1921328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1920898, term1920898.getClass(), "kind", enum3577);
        setField(term1921228, term1921228.getClass(), "kind", enum3578);
        setField(term1921228, term1921228.getClass(), "typeOfThis", term1921328);
        setField(term1920898, term1920898.getClass(), "typeOfThis", term1921228);
        Class<? extends Object> term1922674 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1922673 = ((Class) term1922674).getDeclaredField((String) "INTERFACE");
        ((Field) term1922673).setAccessible(true);
        Object enum3579 = ((Field) term1922673).get((Object) null);
        term1922064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1922068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1922064, term1922064.getClass(), "call", null);
        setField(term1922064, term1922064.getClass(), "prototype", null);
        setField(term1922064, term1922064.getClass(), "kind", enum3579);
        setField(term1922068, term1922068.getClass(), "this$0", null);
        setField(term1922068, term1922068.getClass(), "call", null);
        setField(term1922068, term1922068.getClass(), "prototype", null);
        setField(term1922068, term1922068.getClass(), "kind", enum3579);
        setField(term1922068, term1922068.getClass(), "typeOfThis", term1922064);
        setField(term1922068, term1922068.getClass(), "source", null);
        setField(term1922068, term1922068.getClass(), "implementedInterfaces", null);
        setField(term1922068, term1922068.getClass(), "subTypes", null);
        setField(term1922068, term1922068.getClass(), "templateTypeName", null);
        setField(term1922068, term1922068.getClass(), "className", null);
        setField(term1922068, term1922068.getClass(), "properties", null);
        setField(term1922068, term1922068.getClass(), "implicitPrototype", null);
        setBooleanField(term1922068, term1922068.getClass(), "nativeType", false);
        setBooleanField(term1922068, term1922068.getClass(), "visited", false);
        setField(term1922068, term1922068.getClass(), "docInfo", null);
        setBooleanField(term1922068, term1922068.getClass(), "unknown", false);
        setBooleanField(term1922068, term1922068.getClass(), "resolved", false);
        setField(term1922068, term1922068.getClass(), "resolveResult", null);
        setField(term1922068, term1922068.getClass(), "registry", null);
        setField(term1922064, term1922064.getClass(), "typeOfThis", term1922068);
        setField(term1922064, term1922064.getClass(), "source", null);
        setField(term1922064, term1922064.getClass(), "implementedInterfaces", null);
        setField(term1922064, term1922064.getClass(), "subTypes", null);
        setField(term1922064, term1922064.getClass(), "templateTypeName", null);
        setField(term1922064, term1922064.getClass(), "className", null);
        setField(term1922064, term1922064.getClass(), "properties", null);
        setField(term1922064, term1922064.getClass(), "implicitPrototype", null);
        setBooleanField(term1922064, term1922064.getClass(), "nativeType", false);
        setBooleanField(term1922064, term1922064.getClass(), "visited", false);
        setField(term1922064, term1922064.getClass(), "docInfo", null);
        setBooleanField(term1922064, term1922064.getClass(), "unknown", false);
        setBooleanField(term1922064, term1922064.getClass(), "resolved", false);
        setField(term1922064, term1922064.getClass(), "resolveResult", null);
        setField(term1922064, term1922064.getClass(), "registry", null);
        Class<? extends Object> term1922968 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1922967 = ((Class) term1922968).getDeclaredField((String) "INTERFACE");
        ((Field) term1922967).setAccessible(true);
        Object enum3580 = ((Field) term1922967).get((Object) null);
        Class<? extends Object> term1923262 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1923261 = ((Class) term1923262).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1923261).setAccessible(true);
        Object enum3581 = ((Field) term1923261).get((Object) null);
        term1922069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1922073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1922077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1922069, term1922069.getClass(), "this$0", null);
        setField(term1922069, term1922069.getClass(), "call", null);
        setField(term1922069, term1922069.getClass(), "prototype", null);
        setField(term1922069, term1922069.getClass(), "kind", enum3580);
        setField(term1922073, term1922073.getClass(), "this$0", null);
        setField(term1922073, term1922073.getClass(), "call", null);
        setField(term1922073, term1922073.getClass(), "prototype", null);
        setField(term1922073, term1922073.getClass(), "kind", enum3581);
        setField(term1922077, term1922077.getClass(), "leastSupertypeVisitor", null);
        setField(term1922077, term1922077.getClass(), "greatestSubtypeVisitor", null);
        setField(term1922077, term1922077.getClass(), "call", null);
        setField(term1922077, term1922077.getClass(), "prototype", null);
        setField(term1922077, term1922077.getClass(), "kind", null);
        setField(term1922077, term1922077.getClass(), "typeOfThis", null);
        setField(term1922077, term1922077.getClass(), "source", null);
        setField(term1922077, term1922077.getClass(), "implementedInterfaces", null);
        setField(term1922077, term1922077.getClass(), "subTypes", null);
        setField(term1922077, term1922077.getClass(), "templateTypeName", null);
        setField(term1922077, term1922077.getClass(), "className", null);
        setField(term1922077, term1922077.getClass(), "properties", null);
        setField(term1922077, term1922077.getClass(), "implicitPrototype", null);
        setBooleanField(term1922077, term1922077.getClass(), "nativeType", false);
        setBooleanField(term1922077, term1922077.getClass(), "visited", false);
        setField(term1922077, term1922077.getClass(), "docInfo", null);
        setBooleanField(term1922077, term1922077.getClass(), "unknown", false);
        setBooleanField(term1922077, term1922077.getClass(), "resolved", false);
        setField(term1922077, term1922077.getClass(), "resolveResult", null);
        setField(term1922077, term1922077.getClass(), "registry", null);
        setField(term1922073, term1922073.getClass(), "typeOfThis", term1922077);
        setField(term1922073, term1922073.getClass(), "source", null);
        setField(term1922073, term1922073.getClass(), "implementedInterfaces", null);
        setField(term1922073, term1922073.getClass(), "subTypes", null);
        setField(term1922073, term1922073.getClass(), "templateTypeName", null);
        setField(term1922073, term1922073.getClass(), "className", null);
        setField(term1922073, term1922073.getClass(), "properties", null);
        setField(term1922073, term1922073.getClass(), "implicitPrototype", null);
        setBooleanField(term1922073, term1922073.getClass(), "nativeType", false);
        setBooleanField(term1922073, term1922073.getClass(), "visited", false);
        setField(term1922073, term1922073.getClass(), "docInfo", null);
        setBooleanField(term1922073, term1922073.getClass(), "unknown", false);
        setBooleanField(term1922073, term1922073.getClass(), "resolved", false);
        setField(term1922073, term1922073.getClass(), "resolveResult", null);
        setField(term1922073, term1922073.getClass(), "registry", null);
        setField(term1922069, term1922069.getClass(), "typeOfThis", term1922073);
        setField(term1922069, term1922069.getClass(), "source", null);
        setField(term1922069, term1922069.getClass(), "implementedInterfaces", null);
        setField(term1922069, term1922069.getClass(), "subTypes", null);
        setField(term1922069, term1922069.getClass(), "templateTypeName", null);
        setField(term1922069, term1922069.getClass(), "className", null);
        setField(term1922069, term1922069.getClass(), "properties", null);
        setField(term1922069, term1922069.getClass(), "implicitPrototype", null);
        setBooleanField(term1922069, term1922069.getClass(), "nativeType", false);
        setBooleanField(term1922069, term1922069.getClass(), "visited", false);
        setField(term1922069, term1922069.getClass(), "docInfo", null);
        setBooleanField(term1922069, term1922069.getClass(), "unknown", false);
        setBooleanField(term1922069, term1922069.getClass(), "resolved", false);
        setField(term1922069, term1922069.getClass(), "resolveResult", null);
        setField(term1922069, term1922069.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1920898;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1920238, args);
        assertTrue(recursiveEquals(term1920238, term1922064));
        assertTrue(recursiveEquals(term1920898, term1922069));
        assertTrue(recursiveEquals(retValue, true));
    }

};


