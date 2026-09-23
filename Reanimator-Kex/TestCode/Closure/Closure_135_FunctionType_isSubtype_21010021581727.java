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

public class FunctionType_isSubtype_21010021581727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2353369;
     Object term2354023;
     Object term2356503;
     Object term2356511;

    public FunctionType_isSubtype_21010021581727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2356518 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2356517 = ((Class) term2356518).getDeclaredField((String) "ORDINARY");
        ((Field) term2356517).setAccessible(true);
        Object enum4401 = ((Field) term2356517).get((Object) null);
        Class<? extends Object> term2356809 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2356808 = ((Class) term2356809).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2356808).setAccessible(true);
        Object enum4402 = ((Field) term2356808).get((Object) null);
        term2353369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2353913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2353369, term2353369.getClass(), "kind", enum4401);
        setField(term2353913, term2353913.getClass(), "kind", enum4402);
        setField(term2353369, term2353369.getClass(), "typeOfThis", term2353913);
        term2354023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2354353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2354023, term2354023.getClass(), "kind", enum4401);
        setField(term2354023, term2354023.getClass(), "typeOfThis", term2354353);
        Class<? extends Object> term2357109 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2357108 = ((Class) term2357109).getDeclaredField((String) "INTERFACE");
        ((Field) term2357108).setAccessible(true);
        Object enum4403 = ((Field) term2357108).get((Object) null);
        Class<? extends Object> term2357403 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2357402 = ((Class) term2357403).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2357402).setAccessible(true);
        Object enum4404 = ((Field) term2357402).get((Object) null);
        term2356503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2356507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2356503, term2356503.getClass(), "this$0", null);
        setField(term2356503, term2356503.getClass(), "call", null);
        setField(term2356503, term2356503.getClass(), "prototype", null);
        setField(term2356503, term2356503.getClass(), "kind", enum4403);
        setField(term2356507, term2356507.getClass(), "call", null);
        setField(term2356507, term2356507.getClass(), "prototype", null);
        setField(term2356507, term2356507.getClass(), "kind", enum4404);
        setField(term2356507, term2356507.getClass(), "typeOfThis", null);
        setField(term2356507, term2356507.getClass(), "source", null);
        setField(term2356507, term2356507.getClass(), "implementedInterfaces", null);
        setField(term2356507, term2356507.getClass(), "subTypes", null);
        setField(term2356507, term2356507.getClass(), "templateTypeName", null);
        setField(term2356507, term2356507.getClass(), "className", null);
        setField(term2356507, term2356507.getClass(), "properties", null);
        setField(term2356507, term2356507.getClass(), "implicitPrototype", null);
        setBooleanField(term2356507, term2356507.getClass(), "nativeType", false);
        setBooleanField(term2356507, term2356507.getClass(), "visited", false);
        setField(term2356507, term2356507.getClass(), "docInfo", null);
        setBooleanField(term2356507, term2356507.getClass(), "unknown", false);
        setBooleanField(term2356507, term2356507.getClass(), "resolved", false);
        setField(term2356507, term2356507.getClass(), "resolveResult", null);
        setField(term2356507, term2356507.getClass(), "registry", null);
        setField(term2356503, term2356503.getClass(), "typeOfThis", term2356507);
        setField(term2356503, term2356503.getClass(), "source", null);
        setField(term2356503, term2356503.getClass(), "implementedInterfaces", null);
        setField(term2356503, term2356503.getClass(), "subTypes", null);
        setField(term2356503, term2356503.getClass(), "templateTypeName", null);
        setField(term2356503, term2356503.getClass(), "className", null);
        setField(term2356503, term2356503.getClass(), "properties", null);
        setField(term2356503, term2356503.getClass(), "implicitPrototype", null);
        setBooleanField(term2356503, term2356503.getClass(), "nativeType", false);
        setBooleanField(term2356503, term2356503.getClass(), "visited", false);
        setField(term2356503, term2356503.getClass(), "docInfo", null);
        setBooleanField(term2356503, term2356503.getClass(), "unknown", false);
        setBooleanField(term2356503, term2356503.getClass(), "resolved", false);
        setField(term2356503, term2356503.getClass(), "resolveResult", null);
        setField(term2356503, term2356503.getClass(), "registry", null);
        Class<? extends Object> term2357703 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2357702 = ((Class) term2357703).getDeclaredField((String) "INTERFACE");
        ((Field) term2357702).setAccessible(true);
        Object enum4405 = ((Field) term2357702).get((Object) null);
        term2356511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2356515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2356511, term2356511.getClass(), "call", null);
        setField(term2356511, term2356511.getClass(), "prototype", null);
        setField(term2356511, term2356511.getClass(), "kind", enum4405);
        setField(term2356515, term2356515.getClass(), "this$0", null);
        setField(term2356515, term2356515.getClass(), "call", null);
        setField(term2356515, term2356515.getClass(), "prototype", null);
        setField(term2356515, term2356515.getClass(), "kind", null);
        setField(term2356515, term2356515.getClass(), "typeOfThis", null);
        setField(term2356515, term2356515.getClass(), "source", null);
        setField(term2356515, term2356515.getClass(), "implementedInterfaces", null);
        setField(term2356515, term2356515.getClass(), "subTypes", null);
        setField(term2356515, term2356515.getClass(), "templateTypeName", null);
        setField(term2356515, term2356515.getClass(), "className", null);
        setField(term2356515, term2356515.getClass(), "properties", null);
        setField(term2356515, term2356515.getClass(), "implicitPrototype", null);
        setBooleanField(term2356515, term2356515.getClass(), "nativeType", false);
        setBooleanField(term2356515, term2356515.getClass(), "visited", false);
        setField(term2356515, term2356515.getClass(), "docInfo", null);
        setBooleanField(term2356515, term2356515.getClass(), "unknown", false);
        setBooleanField(term2356515, term2356515.getClass(), "resolved", false);
        setField(term2356515, term2356515.getClass(), "resolveResult", null);
        setField(term2356515, term2356515.getClass(), "registry", null);
        setField(term2356511, term2356511.getClass(), "typeOfThis", term2356515);
        setField(term2356511, term2356511.getClass(), "source", null);
        setField(term2356511, term2356511.getClass(), "implementedInterfaces", null);
        setField(term2356511, term2356511.getClass(), "subTypes", null);
        setField(term2356511, term2356511.getClass(), "templateTypeName", null);
        setField(term2356511, term2356511.getClass(), "className", null);
        setField(term2356511, term2356511.getClass(), "properties", null);
        setField(term2356511, term2356511.getClass(), "implicitPrototype", null);
        setBooleanField(term2356511, term2356511.getClass(), "nativeType", false);
        setBooleanField(term2356511, term2356511.getClass(), "visited", false);
        setField(term2356511, term2356511.getClass(), "docInfo", null);
        setBooleanField(term2356511, term2356511.getClass(), "unknown", false);
        setBooleanField(term2356511, term2356511.getClass(), "resolved", false);
        setField(term2356511, term2356511.getClass(), "resolveResult", null);
        setField(term2356511, term2356511.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2354023;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2353369, args);
        assertTrue(recursiveEquals(term2353369, term2356503));
        assertTrue(recursiveEquals(term2354023, term2356511));
        assertTrue(recursiveEquals(retValue, true));
    }

};


