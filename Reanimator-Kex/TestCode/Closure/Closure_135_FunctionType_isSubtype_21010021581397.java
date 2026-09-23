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

public class FunctionType_isSubtype_21010021581397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1801773;
     Object term1802435;
     Object term1803312;
     Object term1803317;

    public FunctionType_isSubtype_21010021581397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1803324 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1803323 = ((Class) term1803324).getDeclaredField((String) "ORDINARY");
        ((Field) term1803323).setAccessible(true);
        Object enum3360 = ((Field) term1803323).get((Object) null);
        term1801773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1802325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1801773, term1801773.getClass(), "kind", enum3360);
        setField(term1801773, term1801773.getClass(), "typeOfThis", term1802325);
        Class<? extends Object> term1803615 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1803614 = ((Class) term1803615).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1803614).setAccessible(true);
        Object enum3361 = ((Field) term1803614).get((Object) null);
        term1802435 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1802597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1802435, term1802435.getClass(), "kind", enum3361);
        setField(term1802435, term1802435.getClass(), "typeOfThis", term1802597);
        Class<? extends Object> term1803915 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1803914 = ((Class) term1803915).getDeclaredField((String) "INTERFACE");
        ((Field) term1803914).setAccessible(true);
        Object enum3362 = ((Field) term1803914).get((Object) null);
        term1803312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1803316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1803312, term1803312.getClass(), "this$0", null);
        setField(term1803312, term1803312.getClass(), "call", null);
        setField(term1803312, term1803312.getClass(), "prototype", null);
        setField(term1803312, term1803312.getClass(), "kind", enum3362);
        setField(term1803316, term1803316.getClass(), "this$0", null);
        setField(term1803316, term1803316.getClass(), "call", null);
        setField(term1803316, term1803316.getClass(), "prototype", null);
        setField(term1803316, term1803316.getClass(), "kind", null);
        setField(term1803316, term1803316.getClass(), "typeOfThis", null);
        setField(term1803316, term1803316.getClass(), "source", null);
        setField(term1803316, term1803316.getClass(), "implementedInterfaces", null);
        setField(term1803316, term1803316.getClass(), "subTypes", null);
        setField(term1803316, term1803316.getClass(), "templateTypeName", null);
        setField(term1803316, term1803316.getClass(), "className", null);
        setField(term1803316, term1803316.getClass(), "properties", null);
        setField(term1803316, term1803316.getClass(), "implicitPrototype", null);
        setBooleanField(term1803316, term1803316.getClass(), "nativeType", false);
        setBooleanField(term1803316, term1803316.getClass(), "visited", false);
        setField(term1803316, term1803316.getClass(), "docInfo", null);
        setBooleanField(term1803316, term1803316.getClass(), "unknown", false);
        setBooleanField(term1803316, term1803316.getClass(), "resolved", false);
        setField(term1803316, term1803316.getClass(), "resolveResult", null);
        setField(term1803316, term1803316.getClass(), "registry", null);
        setField(term1803312, term1803312.getClass(), "typeOfThis", term1803316);
        setField(term1803312, term1803312.getClass(), "source", null);
        setField(term1803312, term1803312.getClass(), "implementedInterfaces", null);
        setField(term1803312, term1803312.getClass(), "subTypes", null);
        setField(term1803312, term1803312.getClass(), "templateTypeName", null);
        setField(term1803312, term1803312.getClass(), "className", null);
        setField(term1803312, term1803312.getClass(), "properties", null);
        setField(term1803312, term1803312.getClass(), "implicitPrototype", null);
        setBooleanField(term1803312, term1803312.getClass(), "nativeType", false);
        setBooleanField(term1803312, term1803312.getClass(), "visited", false);
        setField(term1803312, term1803312.getClass(), "docInfo", null);
        setBooleanField(term1803312, term1803312.getClass(), "unknown", false);
        setBooleanField(term1803312, term1803312.getClass(), "resolved", false);
        setField(term1803312, term1803312.getClass(), "resolveResult", null);
        setField(term1803312, term1803312.getClass(), "registry", null);
        Class<? extends Object> term1804209 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1804208 = ((Class) term1804209).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1804208).setAccessible(true);
        Object enum3363 = ((Field) term1804208).get((Object) null);
        term1803317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1803321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1803317, term1803317.getClass(), "call", null);
        setField(term1803317, term1803317.getClass(), "prototype", null);
        setField(term1803317, term1803317.getClass(), "kind", enum3363);
        setField(term1803321, term1803321.getClass(), "leastSupertypeVisitor", null);
        setField(term1803321, term1803321.getClass(), "greatestSubtypeVisitor", null);
        setField(term1803321, term1803321.getClass(), "call", null);
        setField(term1803321, term1803321.getClass(), "prototype", null);
        setField(term1803321, term1803321.getClass(), "kind", null);
        setField(term1803321, term1803321.getClass(), "typeOfThis", null);
        setField(term1803321, term1803321.getClass(), "source", null);
        setField(term1803321, term1803321.getClass(), "implementedInterfaces", null);
        setField(term1803321, term1803321.getClass(), "subTypes", null);
        setField(term1803321, term1803321.getClass(), "templateTypeName", null);
        setField(term1803321, term1803321.getClass(), "className", null);
        setField(term1803321, term1803321.getClass(), "properties", null);
        setField(term1803321, term1803321.getClass(), "implicitPrototype", null);
        setBooleanField(term1803321, term1803321.getClass(), "nativeType", false);
        setBooleanField(term1803321, term1803321.getClass(), "visited", false);
        setField(term1803321, term1803321.getClass(), "docInfo", null);
        setBooleanField(term1803321, term1803321.getClass(), "unknown", false);
        setBooleanField(term1803321, term1803321.getClass(), "resolved", false);
        setField(term1803321, term1803321.getClass(), "resolveResult", null);
        setField(term1803321, term1803321.getClass(), "registry", null);
        setField(term1803317, term1803317.getClass(), "typeOfThis", term1803321);
        setField(term1803317, term1803317.getClass(), "source", null);
        setField(term1803317, term1803317.getClass(), "implementedInterfaces", null);
        setField(term1803317, term1803317.getClass(), "subTypes", null);
        setField(term1803317, term1803317.getClass(), "templateTypeName", null);
        setField(term1803317, term1803317.getClass(), "className", null);
        setField(term1803317, term1803317.getClass(), "properties", null);
        setField(term1803317, term1803317.getClass(), "implicitPrototype", null);
        setBooleanField(term1803317, term1803317.getClass(), "nativeType", false);
        setBooleanField(term1803317, term1803317.getClass(), "visited", false);
        setField(term1803317, term1803317.getClass(), "docInfo", null);
        setBooleanField(term1803317, term1803317.getClass(), "unknown", false);
        setBooleanField(term1803317, term1803317.getClass(), "resolved", false);
        setField(term1803317, term1803317.getClass(), "resolveResult", null);
        setField(term1803317, term1803317.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1802435;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1801773, args);
        assertTrue(recursiveEquals(term1801773, term1803312));
        assertTrue(recursiveEquals(term1802435, term1803317));
        assertTrue(recursiveEquals(retValue, false));
    }

};


