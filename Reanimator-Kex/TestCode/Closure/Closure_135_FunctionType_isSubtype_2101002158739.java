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

public class FunctionType_isSubtype_2101002158739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698885;
     Object term699537;
     Object term700311;
     Object term700316;

    public FunctionType_isSubtype_2101002158739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term700322 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term700321 = ((Class) term700322).getDeclaredField((String) "INTERFACE");
        ((Field) term700321).setAccessible(true);
        Object enum1299 = ((Field) term700321).get((Object) null);
        term698885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term699429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term698885, term698885.getClass(), "kind", enum1299);
        setField(term698885, term698885.getClass(), "typeOfThis", term699429);
        Class<? extends Object> term700616 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term700615 = ((Class) term700616).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term700615).setAccessible(true);
        Object enum1300 = ((Field) term700615).get((Object) null);
        term699537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term699537, term699537.getClass(), "kind", enum1300);
        setField(term699537, term699537.getClass(), "typeOfThis", null);
        Class<? extends Object> term700916 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term700915 = ((Class) term700916).getDeclaredField((String) "INTERFACE");
        ((Field) term700915).setAccessible(true);
        Object enum1301 = ((Field) term700915).get((Object) null);
        term700311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term700315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term700311, term700311.getClass(), "this$0", null);
        setField(term700311, term700311.getClass(), "call", null);
        setField(term700311, term700311.getClass(), "prototype", null);
        setField(term700311, term700311.getClass(), "kind", enum1301);
        setField(term700315, term700315.getClass(), "leastSupertypeVisitor", null);
        setField(term700315, term700315.getClass(), "greatestSubtypeVisitor", null);
        setField(term700315, term700315.getClass(), "call", null);
        setField(term700315, term700315.getClass(), "prototype", null);
        setField(term700315, term700315.getClass(), "kind", null);
        setField(term700315, term700315.getClass(), "typeOfThis", null);
        setField(term700315, term700315.getClass(), "source", null);
        setField(term700315, term700315.getClass(), "implementedInterfaces", null);
        setField(term700315, term700315.getClass(), "subTypes", null);
        setField(term700315, term700315.getClass(), "templateTypeName", null);
        setField(term700315, term700315.getClass(), "className", null);
        setField(term700315, term700315.getClass(), "properties", null);
        setField(term700315, term700315.getClass(), "implicitPrototype", null);
        setBooleanField(term700315, term700315.getClass(), "nativeType", false);
        setBooleanField(term700315, term700315.getClass(), "visited", false);
        setField(term700315, term700315.getClass(), "docInfo", null);
        setBooleanField(term700315, term700315.getClass(), "unknown", false);
        setBooleanField(term700315, term700315.getClass(), "resolved", false);
        setField(term700315, term700315.getClass(), "resolveResult", null);
        setField(term700315, term700315.getClass(), "registry", null);
        setField(term700311, term700311.getClass(), "typeOfThis", term700315);
        setField(term700311, term700311.getClass(), "source", null);
        setField(term700311, term700311.getClass(), "implementedInterfaces", null);
        setField(term700311, term700311.getClass(), "subTypes", null);
        setField(term700311, term700311.getClass(), "templateTypeName", null);
        setField(term700311, term700311.getClass(), "className", null);
        setField(term700311, term700311.getClass(), "properties", null);
        setField(term700311, term700311.getClass(), "implicitPrototype", null);
        setBooleanField(term700311, term700311.getClass(), "nativeType", false);
        setBooleanField(term700311, term700311.getClass(), "visited", false);
        setField(term700311, term700311.getClass(), "docInfo", null);
        setBooleanField(term700311, term700311.getClass(), "unknown", false);
        setBooleanField(term700311, term700311.getClass(), "resolved", false);
        setField(term700311, term700311.getClass(), "resolveResult", null);
        setField(term700311, term700311.getClass(), "registry", null);
        Class<? extends Object> term701210 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term701209 = ((Class) term701210).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term701209).setAccessible(true);
        Object enum1302 = ((Field) term701209).get((Object) null);
        term700316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term700316, term700316.getClass(), "this$0", null);
        setField(term700316, term700316.getClass(), "call", null);
        setField(term700316, term700316.getClass(), "prototype", null);
        setField(term700316, term700316.getClass(), "kind", enum1302);
        setField(term700316, term700316.getClass(), "typeOfThis", null);
        setField(term700316, term700316.getClass(), "source", null);
        setField(term700316, term700316.getClass(), "implementedInterfaces", null);
        setField(term700316, term700316.getClass(), "subTypes", null);
        setField(term700316, term700316.getClass(), "templateTypeName", null);
        setField(term700316, term700316.getClass(), "className", null);
        setField(term700316, term700316.getClass(), "properties", null);
        setField(term700316, term700316.getClass(), "implicitPrototype", null);
        setBooleanField(term700316, term700316.getClass(), "nativeType", false);
        setBooleanField(term700316, term700316.getClass(), "visited", false);
        setField(term700316, term700316.getClass(), "docInfo", null);
        setBooleanField(term700316, term700316.getClass(), "unknown", false);
        setBooleanField(term700316, term700316.getClass(), "resolved", false);
        setField(term700316, term700316.getClass(), "resolveResult", null);
        setField(term700316, term700316.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term699537;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term698885, args);
        assertTrue(recursiveEquals(term698885, term700311));
        assertTrue(recursiveEquals(term699537, term700316));
        assertTrue(recursiveEquals(retValue, false));
    }

};


