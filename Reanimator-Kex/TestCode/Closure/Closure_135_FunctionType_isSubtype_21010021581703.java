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

public class FunctionType_isSubtype_21010021581703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2314959;
     Object term2315417;
     Object term2317186;
     Object term2317192;

    public FunctionType_isSubtype_21010021581703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2317200 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2317199 = ((Class) term2317200).getDeclaredField((String) "ORDINARY");
        ((Field) term2317199).setAccessible(true);
        Object enum4326 = ((Field) term2317199).get((Object) null);
        term2314959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2315215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2315309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2314959, term2314959.getClass(), "kind", enum4326);
        setField(term2314959, term2314959.getClass(), "typeOfThis", term2315215);
        setField(term2314959, term2314959.getClass(), "call", term2315309);
        Class<? extends Object> term2317491 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2317490 = ((Class) term2317491).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2317490).setAccessible(true);
        Object enum4327 = ((Field) term2317490).get((Object) null);
        term2315417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2315671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term2315765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2315417, term2315417.getClass(), "kind", enum4327);
        setField(term2315417, term2315417.getClass(), "typeOfThis", term2315671);
        setField(term2315417, term2315417.getClass(), "call", term2315765);
        Class<? extends Object> term2317791 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2317790 = ((Class) term2317791).getDeclaredField((String) "ORDINARY");
        ((Field) term2317790).setAccessible(true);
        Object enum4328 = ((Field) term2317790).get((Object) null);
        term2317186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2317187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2317191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2317187, term2317187.getClass(), "parameters", null);
        setField(term2317187, term2317187.getClass(), "returnType", null);
        setBooleanField(term2317187, term2317187.getClass(), "resolved", false);
        setField(term2317187, term2317187.getClass(), "resolveResult", null);
        setField(term2317187, term2317187.getClass(), "registry", null);
        setField(term2317186, term2317186.getClass(), "call", term2317187);
        setField(term2317186, term2317186.getClass(), "prototype", null);
        setField(term2317186, term2317186.getClass(), "kind", enum4328);
        setField(term2317191, term2317191.getClass(), "this$0", null);
        setField(term2317191, term2317191.getClass(), "call", null);
        setField(term2317191, term2317191.getClass(), "prototype", null);
        setField(term2317191, term2317191.getClass(), "kind", null);
        setField(term2317191, term2317191.getClass(), "typeOfThis", null);
        setField(term2317191, term2317191.getClass(), "source", null);
        setField(term2317191, term2317191.getClass(), "implementedInterfaces", null);
        setField(term2317191, term2317191.getClass(), "subTypes", null);
        setField(term2317191, term2317191.getClass(), "templateTypeName", null);
        setField(term2317191, term2317191.getClass(), "className", null);
        setField(term2317191, term2317191.getClass(), "properties", null);
        setField(term2317191, term2317191.getClass(), "implicitPrototype", null);
        setBooleanField(term2317191, term2317191.getClass(), "nativeType", false);
        setBooleanField(term2317191, term2317191.getClass(), "visited", false);
        setField(term2317191, term2317191.getClass(), "docInfo", null);
        setBooleanField(term2317191, term2317191.getClass(), "unknown", false);
        setBooleanField(term2317191, term2317191.getClass(), "resolved", false);
        setField(term2317191, term2317191.getClass(), "resolveResult", null);
        setField(term2317191, term2317191.getClass(), "registry", null);
        setField(term2317186, term2317186.getClass(), "typeOfThis", term2317191);
        setField(term2317186, term2317186.getClass(), "source", null);
        setField(term2317186, term2317186.getClass(), "implementedInterfaces", null);
        setField(term2317186, term2317186.getClass(), "subTypes", null);
        setField(term2317186, term2317186.getClass(), "templateTypeName", null);
        setField(term2317186, term2317186.getClass(), "className", null);
        setField(term2317186, term2317186.getClass(), "properties", null);
        setField(term2317186, term2317186.getClass(), "implicitPrototype", null);
        setBooleanField(term2317186, term2317186.getClass(), "nativeType", false);
        setBooleanField(term2317186, term2317186.getClass(), "visited", false);
        setField(term2317186, term2317186.getClass(), "docInfo", null);
        setBooleanField(term2317186, term2317186.getClass(), "unknown", false);
        setBooleanField(term2317186, term2317186.getClass(), "resolved", false);
        setField(term2317186, term2317186.getClass(), "resolveResult", null);
        setField(term2317186, term2317186.getClass(), "registry", null);
        Class<? extends Object> term2318082 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2318081 = ((Class) term2318082).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2318081).setAccessible(true);
        Object enum4329 = ((Field) term2318081).get((Object) null);
        term2317192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2317193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2317197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term2317192, term2317192.getClass(), "this$0", null);
        setField(term2317193, term2317193.getClass(), "parameters", null);
        setField(term2317193, term2317193.getClass(), "returnType", null);
        setBooleanField(term2317193, term2317193.getClass(), "resolved", false);
        setField(term2317193, term2317193.getClass(), "resolveResult", null);
        setField(term2317193, term2317193.getClass(), "registry", null);
        setField(term2317192, term2317192.getClass(), "call", term2317193);
        setField(term2317192, term2317192.getClass(), "prototype", null);
        setField(term2317192, term2317192.getClass(), "kind", enum4329);
        setField(term2317197, term2317197.getClass(), "referencedType", null);
        setBooleanField(term2317197, term2317197.getClass(), "visited", false);
        setField(term2317197, term2317197.getClass(), "docInfo", null);
        setBooleanField(term2317197, term2317197.getClass(), "unknown", false);
        setBooleanField(term2317197, term2317197.getClass(), "resolved", false);
        setField(term2317197, term2317197.getClass(), "resolveResult", null);
        setField(term2317197, term2317197.getClass(), "registry", null);
        setField(term2317192, term2317192.getClass(), "typeOfThis", term2317197);
        setField(term2317192, term2317192.getClass(), "source", null);
        setField(term2317192, term2317192.getClass(), "implementedInterfaces", null);
        setField(term2317192, term2317192.getClass(), "subTypes", null);
        setField(term2317192, term2317192.getClass(), "templateTypeName", null);
        setField(term2317192, term2317192.getClass(), "className", null);
        setField(term2317192, term2317192.getClass(), "properties", null);
        setField(term2317192, term2317192.getClass(), "implicitPrototype", null);
        setBooleanField(term2317192, term2317192.getClass(), "nativeType", false);
        setBooleanField(term2317192, term2317192.getClass(), "visited", false);
        setField(term2317192, term2317192.getClass(), "docInfo", null);
        setBooleanField(term2317192, term2317192.getClass(), "unknown", false);
        setBooleanField(term2317192, term2317192.getClass(), "resolved", false);
        setField(term2317192, term2317192.getClass(), "resolveResult", null);
        setField(term2317192, term2317192.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2315417;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2314959, args);
        assertTrue(recursiveEquals(term2314959, term2317186));
        assertTrue(recursiveEquals(term2315417, term2317192));
        assertTrue(recursiveEquals(retValue, true));
    }

};


