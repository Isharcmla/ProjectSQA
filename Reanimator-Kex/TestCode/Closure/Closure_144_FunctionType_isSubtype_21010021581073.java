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

public class FunctionType_isSubtype_21010021581073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1398713;
     Object term1399265;
     Object term1400044;
     Object term1400048;

    public FunctionType_isSubtype_21010021581073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1400054 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1400053 = ((Class) term1400054).getDeclaredField((String) "INTERFACE");
        ((Field) term1400053).setAccessible(true);
        Object enum2509 = ((Field) term1400053).get((Object) null);
        term1398713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1398713, term1398713.getClass(), "kind", enum2509);
        setField(term1398713, term1398713.getClass(), "typeOfThis", term1398713);
        Class<? extends Object> term1400348 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1400347 = ((Class) term1400348).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1400347).setAccessible(true);
        Object enum2510 = ((Field) term1400347).get((Object) null);
        term1399265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1399265, term1399265.getClass(), "kind", enum2510);
        setField(term1399265, term1399265.getClass(), "typeOfThis", null);
        Class<? extends Object> term1400648 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1400647 = ((Class) term1400648).getDeclaredField((String) "INTERFACE");
        ((Field) term1400647).setAccessible(true);
        Object enum2511 = ((Field) term1400647).get((Object) null);
        term1400044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1400044, term1400044.getClass(), "this$0", null);
        setField(term1400044, term1400044.getClass(), "call", null);
        setField(term1400044, term1400044.getClass(), "prototype", null);
        setField(term1400044, term1400044.getClass(), "kind", enum2511);
        setField(term1400044, term1400044.getClass(), "typeOfThis", term1400044);
        setField(term1400044, term1400044.getClass(), "source", null);
        setField(term1400044, term1400044.getClass(), "implementedInterfaces", null);
        setField(term1400044, term1400044.getClass(), "subTypes", null);
        setField(term1400044, term1400044.getClass(), "templateTypeName", null);
        setField(term1400044, term1400044.getClass(), "className", null);
        setField(term1400044, term1400044.getClass(), "properties", null);
        setField(term1400044, term1400044.getClass(), "implicitPrototype", null);
        setBooleanField(term1400044, term1400044.getClass(), "nativeType", false);
        setBooleanField(term1400044, term1400044.getClass(), "prettyPrint", false);
        setBooleanField(term1400044, term1400044.getClass(), "visited", false);
        setField(term1400044, term1400044.getClass(), "docInfo", null);
        setBooleanField(term1400044, term1400044.getClass(), "unknown", false);
        setBooleanField(term1400044, term1400044.getClass(), "resolved", false);
        setField(term1400044, term1400044.getClass(), "resolveResult", null);
        setField(term1400044, term1400044.getClass(), "registry", null);
        Class<? extends Object> term1400942 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1400941 = ((Class) term1400942).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1400941).setAccessible(true);
        Object enum2512 = ((Field) term1400941).get((Object) null);
        term1400048 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1400048, term1400048.getClass(), "this$0", null);
        setField(term1400048, term1400048.getClass(), "call", null);
        setField(term1400048, term1400048.getClass(), "prototype", null);
        setField(term1400048, term1400048.getClass(), "kind", enum2512);
        setField(term1400048, term1400048.getClass(), "typeOfThis", null);
        setField(term1400048, term1400048.getClass(), "source", null);
        setField(term1400048, term1400048.getClass(), "implementedInterfaces", null);
        setField(term1400048, term1400048.getClass(), "subTypes", null);
        setField(term1400048, term1400048.getClass(), "templateTypeName", null);
        setField(term1400048, term1400048.getClass(), "className", null);
        setField(term1400048, term1400048.getClass(), "properties", null);
        setField(term1400048, term1400048.getClass(), "implicitPrototype", null);
        setBooleanField(term1400048, term1400048.getClass(), "nativeType", false);
        setBooleanField(term1400048, term1400048.getClass(), "prettyPrint", false);
        setBooleanField(term1400048, term1400048.getClass(), "visited", false);
        setField(term1400048, term1400048.getClass(), "docInfo", null);
        setBooleanField(term1400048, term1400048.getClass(), "unknown", false);
        setBooleanField(term1400048, term1400048.getClass(), "resolved", false);
        setField(term1400048, term1400048.getClass(), "resolveResult", null);
        setField(term1400048, term1400048.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1399265;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1398713, args);
        assertTrue(recursiveEquals(term1398713, term1400044));
        assertTrue(recursiveEquals(term1399265, term1400048));
        assertTrue(recursiveEquals(retValue, false));
    }

};


