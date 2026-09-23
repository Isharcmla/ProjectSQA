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

public class FunctionType_isSubtype_2101002158659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663862;
     Object term664314;
     Object term665208;
     Object term665214;

    public FunctionType_isSubtype_2101002158659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term665220 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term665219 = ((Class) term665220).getDeclaredField((String) "ORDINARY");
        ((Field) term665219).setAccessible(true);
        Object enum1197 = ((Field) term665219).get((Object) null);
        term663862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term664110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term664204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term663862, term663862.getClass(), "kind", enum1197);
        setField(term663862, term663862.getClass(), "typeOfThis", term664110);
        setField(term663862, term663862.getClass(), "call", term664204);
        Class<? extends Object> term665511 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term665510 = ((Class) term665511).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term665510).setAccessible(true);
        Object enum1198 = ((Field) term665510).get((Object) null);
        term664314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term664314, term664314.getClass(), "kind", enum1198);
        setField(term664314, term664314.getClass(), "typeOfThis", null);
        setField(term664314, term664314.getClass(), "call", null);
        Class<? extends Object> term665811 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term665810 = ((Class) term665811).getDeclaredField((String) "ORDINARY");
        ((Field) term665810).setAccessible(true);
        Object enum1199 = ((Field) term665810).get((Object) null);
        term665208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term665209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term665213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term665209, term665209.getClass(), "parameters", null);
        setField(term665209, term665209.getClass(), "returnType", null);
        setBooleanField(term665209, term665209.getClass(), "returnTypeInferred", false);
        setBooleanField(term665209, term665209.getClass(), "resolved", false);
        setField(term665209, term665209.getClass(), "resolveResult", null);
        setField(term665209, term665209.getClass(), "registry", null);
        setField(term665208, term665208.getClass(), "call", term665209);
        setField(term665208, term665208.getClass(), "prototype", null);
        setField(term665208, term665208.getClass(), "kind", enum1199);
        setField(term665213, term665213.getClass(), "leastSupertypeVisitor", null);
        setField(term665213, term665213.getClass(), "greatestSubtypeVisitor", null);
        setField(term665213, term665213.getClass(), "call", null);
        setField(term665213, term665213.getClass(), "prototype", null);
        setField(term665213, term665213.getClass(), "kind", null);
        setField(term665213, term665213.getClass(), "typeOfThis", null);
        setField(term665213, term665213.getClass(), "source", null);
        setField(term665213, term665213.getClass(), "implementedInterfaces", null);
        setField(term665213, term665213.getClass(), "subTypes", null);
        setField(term665213, term665213.getClass(), "templateTypeName", null);
        setField(term665213, term665213.getClass(), "className", null);
        setField(term665213, term665213.getClass(), "properties", null);
        setField(term665213, term665213.getClass(), "implicitPrototype", null);
        setBooleanField(term665213, term665213.getClass(), "nativeType", false);
        setBooleanField(term665213, term665213.getClass(), "prettyPrint", false);
        setBooleanField(term665213, term665213.getClass(), "visited", false);
        setField(term665213, term665213.getClass(), "docInfo", null);
        setBooleanField(term665213, term665213.getClass(), "unknown", false);
        setBooleanField(term665213, term665213.getClass(), "resolved", false);
        setField(term665213, term665213.getClass(), "resolveResult", null);
        setField(term665213, term665213.getClass(), "registry", null);
        setField(term665208, term665208.getClass(), "typeOfThis", term665213);
        setField(term665208, term665208.getClass(), "source", null);
        setField(term665208, term665208.getClass(), "implementedInterfaces", null);
        setField(term665208, term665208.getClass(), "subTypes", null);
        setField(term665208, term665208.getClass(), "templateTypeName", null);
        setField(term665208, term665208.getClass(), "className", null);
        setField(term665208, term665208.getClass(), "properties", null);
        setField(term665208, term665208.getClass(), "implicitPrototype", null);
        setBooleanField(term665208, term665208.getClass(), "nativeType", false);
        setBooleanField(term665208, term665208.getClass(), "prettyPrint", false);
        setBooleanField(term665208, term665208.getClass(), "visited", false);
        setField(term665208, term665208.getClass(), "docInfo", null);
        setBooleanField(term665208, term665208.getClass(), "unknown", false);
        setBooleanField(term665208, term665208.getClass(), "resolved", false);
        setField(term665208, term665208.getClass(), "resolveResult", null);
        setField(term665208, term665208.getClass(), "registry", null);
        Class<? extends Object> term666102 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term666101 = ((Class) term666102).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term666101).setAccessible(true);
        Object enum1200 = ((Field) term666101).get((Object) null);
        term665214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term665214, term665214.getClass(), "call", null);
        setField(term665214, term665214.getClass(), "prototype", null);
        setField(term665214, term665214.getClass(), "kind", enum1200);
        setField(term665214, term665214.getClass(), "typeOfThis", null);
        setField(term665214, term665214.getClass(), "source", null);
        setField(term665214, term665214.getClass(), "implementedInterfaces", null);
        setField(term665214, term665214.getClass(), "subTypes", null);
        setField(term665214, term665214.getClass(), "templateTypeName", null);
        setField(term665214, term665214.getClass(), "className", null);
        setField(term665214, term665214.getClass(), "properties", null);
        setField(term665214, term665214.getClass(), "implicitPrototype", null);
        setBooleanField(term665214, term665214.getClass(), "nativeType", false);
        setBooleanField(term665214, term665214.getClass(), "prettyPrint", false);
        setBooleanField(term665214, term665214.getClass(), "visited", false);
        setField(term665214, term665214.getClass(), "docInfo", null);
        setBooleanField(term665214, term665214.getClass(), "unknown", false);
        setBooleanField(term665214, term665214.getClass(), "resolved", false);
        setField(term665214, term665214.getClass(), "resolveResult", null);
        setField(term665214, term665214.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term664314;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term663862, args);
        assertTrue(recursiveEquals(term663862, term665208));
        assertTrue(recursiveEquals(term664314, term665214));
        assertTrue(recursiveEquals(retValue, false));
    }

};


