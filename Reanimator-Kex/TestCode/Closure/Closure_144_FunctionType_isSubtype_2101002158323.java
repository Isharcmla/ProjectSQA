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

public class FunctionType_isSubtype_2101002158323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210316;
     Object term210668;
     Object term211514;
     Object term211519;

    public FunctionType_isSubtype_2101002158323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term211525 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term211524 = ((Class) term211525).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term211524).setAccessible(true);
        Object enum401 = ((Field) term211524).get((Object) null);
        term210316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term210558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term210316, term210316.getClass(), "kind", enum401);
        setField(term210316, term210316.getClass(), "call", term210558);
        Class<? extends Object> term211825 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term211824 = ((Class) term211825).getDeclaredField((String) "ORDINARY");
        ((Field) term211824).setAccessible(true);
        Object enum402 = ((Field) term211824).get((Object) null);
        term210668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term210668, term210668.getClass(), "kind", enum402);
        setField(term210668, term210668.getClass(), "call", null);
        Class<? extends Object> term212116 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term212115 = ((Class) term212116).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term212115).setAccessible(true);
        Object enum403 = ((Field) term212115).get((Object) null);
        term211514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term211515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term211515, term211515.getClass(), "parameters", null);
        setField(term211515, term211515.getClass(), "returnType", null);
        setBooleanField(term211515, term211515.getClass(), "returnTypeInferred", false);
        setBooleanField(term211515, term211515.getClass(), "resolved", false);
        setField(term211515, term211515.getClass(), "resolveResult", null);
        setField(term211515, term211515.getClass(), "registry", null);
        setField(term211514, term211514.getClass(), "call", term211515);
        setField(term211514, term211514.getClass(), "prototype", null);
        setField(term211514, term211514.getClass(), "kind", enum403);
        setField(term211514, term211514.getClass(), "typeOfThis", null);
        setField(term211514, term211514.getClass(), "source", null);
        setField(term211514, term211514.getClass(), "implementedInterfaces", null);
        setField(term211514, term211514.getClass(), "subTypes", null);
        setField(term211514, term211514.getClass(), "templateTypeName", null);
        setField(term211514, term211514.getClass(), "className", null);
        setField(term211514, term211514.getClass(), "properties", null);
        setField(term211514, term211514.getClass(), "implicitPrototype", null);
        setBooleanField(term211514, term211514.getClass(), "nativeType", false);
        setBooleanField(term211514, term211514.getClass(), "prettyPrint", false);
        setBooleanField(term211514, term211514.getClass(), "visited", false);
        setField(term211514, term211514.getClass(), "docInfo", null);
        setBooleanField(term211514, term211514.getClass(), "unknown", false);
        setBooleanField(term211514, term211514.getClass(), "resolved", false);
        setField(term211514, term211514.getClass(), "resolveResult", null);
        setField(term211514, term211514.getClass(), "registry", null);
        Class<? extends Object> term212416 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term212415 = ((Class) term212416).getDeclaredField((String) "ORDINARY");
        ((Field) term212415).setAccessible(true);
        Object enum404 = ((Field) term212415).get((Object) null);
        term211519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term211519, term211519.getClass(), "call", null);
        setField(term211519, term211519.getClass(), "prototype", null);
        setField(term211519, term211519.getClass(), "kind", enum404);
        setField(term211519, term211519.getClass(), "typeOfThis", null);
        setField(term211519, term211519.getClass(), "source", null);
        setField(term211519, term211519.getClass(), "implementedInterfaces", null);
        setField(term211519, term211519.getClass(), "subTypes", null);
        setField(term211519, term211519.getClass(), "templateTypeName", null);
        setField(term211519, term211519.getClass(), "className", null);
        setField(term211519, term211519.getClass(), "properties", null);
        setField(term211519, term211519.getClass(), "implicitPrototype", null);
        setBooleanField(term211519, term211519.getClass(), "nativeType", false);
        setBooleanField(term211519, term211519.getClass(), "prettyPrint", false);
        setBooleanField(term211519, term211519.getClass(), "visited", false);
        setField(term211519, term211519.getClass(), "docInfo", null);
        setBooleanField(term211519, term211519.getClass(), "unknown", false);
        setBooleanField(term211519, term211519.getClass(), "resolved", false);
        setField(term211519, term211519.getClass(), "resolveResult", null);
        setField(term211519, term211519.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term210668;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term210316, args);
        assertTrue(recursiveEquals(term210316, term211514));
        assertTrue(recursiveEquals(term210668, term211519));
        assertTrue(recursiveEquals(retValue, false));
    }

};


