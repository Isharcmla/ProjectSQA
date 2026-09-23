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

public class FunctionType_isSubtype_21010021581034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1176218;
     Object term1176676;
     Object term1179012;
     Object term1179018;

    public FunctionType_isSubtype_21010021581034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1179025 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1179024 = ((Class) term1179025).getDeclaredField((String) "ORDINARY");
        ((Field) term1179024).setAccessible(true);
        Object enum2194 = ((Field) term1179024).get((Object) null);
        term1176218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1176474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1176568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1176218, term1176218.getClass(), "kind", enum2194);
        setField(term1176218, term1176218.getClass(), "typeOfThis", term1176474);
        setField(term1176218, term1176218.getClass(), "call", term1176568);
        Class<? extends Object> term1179316 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1179315 = ((Class) term1179316).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1179315).setAccessible(true);
        Object enum2195 = ((Field) term1179315).get((Object) null);
        term1176676 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1176924 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1176676, term1176676.getClass(), "kind", enum2195);
        setField(term1176676, term1176676.getClass(), "typeOfThis", term1176924);
        setField(term1176676, term1176676.getClass(), "call", null);
        Class<? extends Object> term1179616 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1179615 = ((Class) term1179616).getDeclaredField((String) "ORDINARY");
        ((Field) term1179615).setAccessible(true);
        Object enum2196 = ((Field) term1179615).get((Object) null);
        term1179012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1179013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1179017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1179012, term1179012.getClass(), "this$0", null);
        setField(term1179013, term1179013.getClass(), "parameters", null);
        setField(term1179013, term1179013.getClass(), "returnType", null);
        setBooleanField(term1179013, term1179013.getClass(), "resolved", false);
        setField(term1179013, term1179013.getClass(), "resolveResult", null);
        setField(term1179013, term1179013.getClass(), "registry", null);
        setField(term1179012, term1179012.getClass(), "call", term1179013);
        setField(term1179012, term1179012.getClass(), "prototype", null);
        setField(term1179012, term1179012.getClass(), "kind", enum2196);
        setField(term1179017, term1179017.getClass(), "this$0", null);
        setField(term1179017, term1179017.getClass(), "call", null);
        setField(term1179017, term1179017.getClass(), "prototype", null);
        setField(term1179017, term1179017.getClass(), "kind", null);
        setField(term1179017, term1179017.getClass(), "typeOfThis", null);
        setField(term1179017, term1179017.getClass(), "source", null);
        setField(term1179017, term1179017.getClass(), "implementedInterfaces", null);
        setField(term1179017, term1179017.getClass(), "subTypes", null);
        setField(term1179017, term1179017.getClass(), "templateTypeName", null);
        setField(term1179017, term1179017.getClass(), "className", null);
        setField(term1179017, term1179017.getClass(), "properties", null);
        setField(term1179017, term1179017.getClass(), "implicitPrototype", null);
        setBooleanField(term1179017, term1179017.getClass(), "nativeType", false);
        setBooleanField(term1179017, term1179017.getClass(), "visited", false);
        setField(term1179017, term1179017.getClass(), "docInfo", null);
        setBooleanField(term1179017, term1179017.getClass(), "unknown", false);
        setBooleanField(term1179017, term1179017.getClass(), "resolved", false);
        setField(term1179017, term1179017.getClass(), "resolveResult", null);
        setField(term1179017, term1179017.getClass(), "registry", null);
        setField(term1179012, term1179012.getClass(), "typeOfThis", term1179017);
        setField(term1179012, term1179012.getClass(), "source", null);
        setField(term1179012, term1179012.getClass(), "implementedInterfaces", null);
        setField(term1179012, term1179012.getClass(), "subTypes", null);
        setField(term1179012, term1179012.getClass(), "templateTypeName", null);
        setField(term1179012, term1179012.getClass(), "className", null);
        setField(term1179012, term1179012.getClass(), "properties", null);
        setField(term1179012, term1179012.getClass(), "implicitPrototype", null);
        setBooleanField(term1179012, term1179012.getClass(), "nativeType", false);
        setBooleanField(term1179012, term1179012.getClass(), "visited", false);
        setField(term1179012, term1179012.getClass(), "docInfo", null);
        setBooleanField(term1179012, term1179012.getClass(), "unknown", false);
        setBooleanField(term1179012, term1179012.getClass(), "resolved", false);
        setField(term1179012, term1179012.getClass(), "resolveResult", null);
        setField(term1179012, term1179012.getClass(), "registry", null);
        Class<? extends Object> term1179907 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1179906 = ((Class) term1179907).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1179906).setAccessible(true);
        Object enum2197 = ((Field) term1179906).get((Object) null);
        term1179018 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1179022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1179018, term1179018.getClass(), "this$0", null);
        setField(term1179018, term1179018.getClass(), "call", null);
        setField(term1179018, term1179018.getClass(), "prototype", null);
        setField(term1179018, term1179018.getClass(), "kind", enum2197);
        setField(term1179022, term1179022.getClass(), "leastSupertypeVisitor", null);
        setField(term1179022, term1179022.getClass(), "greatestSubtypeVisitor", null);
        setField(term1179022, term1179022.getClass(), "call", null);
        setField(term1179022, term1179022.getClass(), "prototype", null);
        setField(term1179022, term1179022.getClass(), "kind", null);
        setField(term1179022, term1179022.getClass(), "typeOfThis", null);
        setField(term1179022, term1179022.getClass(), "source", null);
        setField(term1179022, term1179022.getClass(), "implementedInterfaces", null);
        setField(term1179022, term1179022.getClass(), "subTypes", null);
        setField(term1179022, term1179022.getClass(), "templateTypeName", null);
        setField(term1179022, term1179022.getClass(), "className", null);
        setField(term1179022, term1179022.getClass(), "properties", null);
        setField(term1179022, term1179022.getClass(), "implicitPrototype", null);
        setBooleanField(term1179022, term1179022.getClass(), "nativeType", false);
        setBooleanField(term1179022, term1179022.getClass(), "visited", false);
        setField(term1179022, term1179022.getClass(), "docInfo", null);
        setBooleanField(term1179022, term1179022.getClass(), "unknown", false);
        setBooleanField(term1179022, term1179022.getClass(), "resolved", false);
        setField(term1179022, term1179022.getClass(), "resolveResult", null);
        setField(term1179022, term1179022.getClass(), "registry", null);
        setField(term1179018, term1179018.getClass(), "typeOfThis", term1179022);
        setField(term1179018, term1179018.getClass(), "source", null);
        setField(term1179018, term1179018.getClass(), "implementedInterfaces", null);
        setField(term1179018, term1179018.getClass(), "subTypes", null);
        setField(term1179018, term1179018.getClass(), "templateTypeName", null);
        setField(term1179018, term1179018.getClass(), "className", null);
        setField(term1179018, term1179018.getClass(), "properties", null);
        setField(term1179018, term1179018.getClass(), "implicitPrototype", null);
        setBooleanField(term1179018, term1179018.getClass(), "nativeType", false);
        setBooleanField(term1179018, term1179018.getClass(), "visited", false);
        setField(term1179018, term1179018.getClass(), "docInfo", null);
        setBooleanField(term1179018, term1179018.getClass(), "unknown", false);
        setBooleanField(term1179018, term1179018.getClass(), "resolved", false);
        setField(term1179018, term1179018.getClass(), "resolveResult", null);
        setField(term1179018, term1179018.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1176676;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1176218, args);
        assertTrue(recursiveEquals(term1176218, term1179012));
        assertTrue(recursiveEquals(term1176676, term1179018));
        assertTrue(recursiveEquals(retValue, false));
    }

};


