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

public class FunctionType_isSubtype_21010021581503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1975816;
     Object term1976476;
     Object term1977373;
     Object term1977378;

    public FunctionType_isSubtype_21010021581503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1977385 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1977384 = ((Class) term1977385).getDeclaredField((String) "ORDINARY");
        ((Field) term1977384).setAccessible(true);
        Object enum3684 = ((Field) term1977384).get((Object) null);
        term1975816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1976368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1975816, term1975816.getClass(), "kind", enum3684);
        setField(term1975816, term1975816.getClass(), "typeOfThis", term1976368);
        Class<? extends Object> term1977676 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1977675 = ((Class) term1977676).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1977675).setAccessible(true);
        Object enum3685 = ((Field) term1977675).get((Object) null);
        term1976476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1976658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1976476, term1976476.getClass(), "kind", enum3685);
        setField(term1976476, term1976476.getClass(), "typeOfThis", term1976658);
        Class<? extends Object> term1977976 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1977975 = ((Class) term1977976).getDeclaredField((String) "INTERFACE");
        ((Field) term1977975).setAccessible(true);
        Object enum3686 = ((Field) term1977975).get((Object) null);
        term1977373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1977377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1977373, term1977373.getClass(), "this$0", null);
        setField(term1977373, term1977373.getClass(), "call", null);
        setField(term1977373, term1977373.getClass(), "prototype", null);
        setField(term1977373, term1977373.getClass(), "kind", enum3686);
        setField(term1977377, term1977377.getClass(), "this$0", null);
        setField(term1977377, term1977377.getClass(), "call", null);
        setField(term1977377, term1977377.getClass(), "prototype", null);
        setField(term1977377, term1977377.getClass(), "kind", null);
        setField(term1977377, term1977377.getClass(), "typeOfThis", null);
        setField(term1977377, term1977377.getClass(), "source", null);
        setField(term1977377, term1977377.getClass(), "implementedInterfaces", null);
        setField(term1977377, term1977377.getClass(), "subTypes", null);
        setField(term1977377, term1977377.getClass(), "templateTypeName", null);
        setField(term1977377, term1977377.getClass(), "className", null);
        setField(term1977377, term1977377.getClass(), "properties", null);
        setField(term1977377, term1977377.getClass(), "implicitPrototype", null);
        setBooleanField(term1977377, term1977377.getClass(), "nativeType", false);
        setBooleanField(term1977377, term1977377.getClass(), "visited", false);
        setField(term1977377, term1977377.getClass(), "docInfo", null);
        setBooleanField(term1977377, term1977377.getClass(), "unknown", false);
        setBooleanField(term1977377, term1977377.getClass(), "resolved", false);
        setField(term1977377, term1977377.getClass(), "resolveResult", null);
        setField(term1977377, term1977377.getClass(), "registry", null);
        setField(term1977373, term1977373.getClass(), "typeOfThis", term1977377);
        setField(term1977373, term1977373.getClass(), "source", null);
        setField(term1977373, term1977373.getClass(), "implementedInterfaces", null);
        setField(term1977373, term1977373.getClass(), "subTypes", null);
        setField(term1977373, term1977373.getClass(), "templateTypeName", null);
        setField(term1977373, term1977373.getClass(), "className", null);
        setField(term1977373, term1977373.getClass(), "properties", null);
        setField(term1977373, term1977373.getClass(), "implicitPrototype", null);
        setBooleanField(term1977373, term1977373.getClass(), "nativeType", false);
        setBooleanField(term1977373, term1977373.getClass(), "visited", false);
        setField(term1977373, term1977373.getClass(), "docInfo", null);
        setBooleanField(term1977373, term1977373.getClass(), "unknown", false);
        setBooleanField(term1977373, term1977373.getClass(), "resolved", false);
        setField(term1977373, term1977373.getClass(), "resolveResult", null);
        setField(term1977373, term1977373.getClass(), "registry", null);
        Class<? extends Object> term1978270 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1978269 = ((Class) term1978270).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1978269).setAccessible(true);
        Object enum3687 = ((Field) term1978269).get((Object) null);
        term1977378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1977382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1977378, term1977378.getClass(), "this$0", null);
        setField(term1977378, term1977378.getClass(), "call", null);
        setField(term1977378, term1977378.getClass(), "prototype", null);
        setField(term1977378, term1977378.getClass(), "kind", enum3687);
        setField(term1977382, term1977382.getClass(), "this$0", null);
        setField(term1977382, term1977382.getClass(), "call", null);
        setField(term1977382, term1977382.getClass(), "prototype", null);
        setField(term1977382, term1977382.getClass(), "kind", null);
        setField(term1977382, term1977382.getClass(), "typeOfThis", null);
        setField(term1977382, term1977382.getClass(), "source", null);
        setField(term1977382, term1977382.getClass(), "implementedInterfaces", null);
        setField(term1977382, term1977382.getClass(), "subTypes", null);
        setField(term1977382, term1977382.getClass(), "templateTypeName", null);
        setField(term1977382, term1977382.getClass(), "className", null);
        setField(term1977382, term1977382.getClass(), "properties", null);
        setField(term1977382, term1977382.getClass(), "implicitPrototype", null);
        setBooleanField(term1977382, term1977382.getClass(), "nativeType", false);
        setBooleanField(term1977382, term1977382.getClass(), "visited", false);
        setField(term1977382, term1977382.getClass(), "docInfo", null);
        setBooleanField(term1977382, term1977382.getClass(), "unknown", false);
        setBooleanField(term1977382, term1977382.getClass(), "resolved", false);
        setField(term1977382, term1977382.getClass(), "resolveResult", null);
        setField(term1977382, term1977382.getClass(), "registry", null);
        setField(term1977378, term1977378.getClass(), "typeOfThis", term1977382);
        setField(term1977378, term1977378.getClass(), "source", null);
        setField(term1977378, term1977378.getClass(), "implementedInterfaces", null);
        setField(term1977378, term1977378.getClass(), "subTypes", null);
        setField(term1977378, term1977378.getClass(), "templateTypeName", null);
        setField(term1977378, term1977378.getClass(), "className", null);
        setField(term1977378, term1977378.getClass(), "properties", null);
        setField(term1977378, term1977378.getClass(), "implicitPrototype", null);
        setBooleanField(term1977378, term1977378.getClass(), "nativeType", false);
        setBooleanField(term1977378, term1977378.getClass(), "visited", false);
        setField(term1977378, term1977378.getClass(), "docInfo", null);
        setBooleanField(term1977378, term1977378.getClass(), "unknown", false);
        setBooleanField(term1977378, term1977378.getClass(), "resolved", false);
        setField(term1977378, term1977378.getClass(), "resolveResult", null);
        setField(term1977378, term1977378.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1976476;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1975816, args);
        assertTrue(recursiveEquals(term1975816, term1977373));
        assertTrue(recursiveEquals(term1976476, term1977378));
        assertTrue(recursiveEquals(retValue, false));
    }

};


