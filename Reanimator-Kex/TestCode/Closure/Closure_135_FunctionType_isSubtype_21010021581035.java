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

public class FunctionType_isSubtype_21010021581035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1177726;
     Object term1177984;
     Object term1180327;
     Object term1180331;

    public FunctionType_isSubtype_21010021581035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1180338 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1180337 = ((Class) term1180338).getDeclaredField((String) "INTERFACE");
        ((Field) term1180337).setAccessible(true);
        Object enum2198 = ((Field) term1180337).get((Object) null);
        term1177726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1177726, term1177726.getClass(), "kind", enum2198);
        setField(term1177726, term1177726.getClass(), "typeOfThis", term1177726);
        Class<? extends Object> term1180632 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1180631 = ((Class) term1180632).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1180631).setAccessible(true);
        Object enum2199 = ((Field) term1180631).get((Object) null);
        term1177984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1178240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1177984, term1177984.getClass(), "kind", enum2199);
        setField(term1177984, term1177984.getClass(), "typeOfThis", term1178240);
        Class<? extends Object> term1180932 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1180931 = ((Class) term1180932).getDeclaredField((String) "INTERFACE");
        ((Field) term1180931).setAccessible(true);
        Object enum2200 = ((Field) term1180931).get((Object) null);
        term1180327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1180327, term1180327.getClass(), "this$0", null);
        setField(term1180327, term1180327.getClass(), "call", null);
        setField(term1180327, term1180327.getClass(), "prototype", null);
        setField(term1180327, term1180327.getClass(), "kind", enum2200);
        setField(term1180327, term1180327.getClass(), "typeOfThis", term1180327);
        setField(term1180327, term1180327.getClass(), "source", null);
        setField(term1180327, term1180327.getClass(), "implementedInterfaces", null);
        setField(term1180327, term1180327.getClass(), "subTypes", null);
        setField(term1180327, term1180327.getClass(), "templateTypeName", null);
        setField(term1180327, term1180327.getClass(), "className", null);
        setField(term1180327, term1180327.getClass(), "properties", null);
        setField(term1180327, term1180327.getClass(), "implicitPrototype", null);
        setBooleanField(term1180327, term1180327.getClass(), "nativeType", false);
        setBooleanField(term1180327, term1180327.getClass(), "visited", false);
        setField(term1180327, term1180327.getClass(), "docInfo", null);
        setBooleanField(term1180327, term1180327.getClass(), "unknown", false);
        setBooleanField(term1180327, term1180327.getClass(), "resolved", false);
        setField(term1180327, term1180327.getClass(), "resolveResult", null);
        setField(term1180327, term1180327.getClass(), "registry", null);
        Class<? extends Object> term1181226 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1181225 = ((Class) term1181226).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1181225).setAccessible(true);
        Object enum2201 = ((Field) term1181225).get((Object) null);
        term1180331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1180335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1180331, term1180331.getClass(), "call", null);
        setField(term1180331, term1180331.getClass(), "prototype", null);
        setField(term1180331, term1180331.getClass(), "kind", enum2201);
        setField(term1180335, term1180335.getClass(), "this$0", null);
        setField(term1180335, term1180335.getClass(), "call", null);
        setField(term1180335, term1180335.getClass(), "prototype", null);
        setField(term1180335, term1180335.getClass(), "kind", null);
        setField(term1180335, term1180335.getClass(), "typeOfThis", null);
        setField(term1180335, term1180335.getClass(), "source", null);
        setField(term1180335, term1180335.getClass(), "implementedInterfaces", null);
        setField(term1180335, term1180335.getClass(), "subTypes", null);
        setField(term1180335, term1180335.getClass(), "templateTypeName", null);
        setField(term1180335, term1180335.getClass(), "className", null);
        setField(term1180335, term1180335.getClass(), "properties", null);
        setField(term1180335, term1180335.getClass(), "implicitPrototype", null);
        setBooleanField(term1180335, term1180335.getClass(), "nativeType", false);
        setBooleanField(term1180335, term1180335.getClass(), "visited", false);
        setField(term1180335, term1180335.getClass(), "docInfo", null);
        setBooleanField(term1180335, term1180335.getClass(), "unknown", false);
        setBooleanField(term1180335, term1180335.getClass(), "resolved", false);
        setField(term1180335, term1180335.getClass(), "resolveResult", null);
        setField(term1180335, term1180335.getClass(), "registry", null);
        setField(term1180331, term1180331.getClass(), "typeOfThis", term1180335);
        setField(term1180331, term1180331.getClass(), "source", null);
        setField(term1180331, term1180331.getClass(), "implementedInterfaces", null);
        setField(term1180331, term1180331.getClass(), "subTypes", null);
        setField(term1180331, term1180331.getClass(), "templateTypeName", null);
        setField(term1180331, term1180331.getClass(), "className", null);
        setField(term1180331, term1180331.getClass(), "properties", null);
        setField(term1180331, term1180331.getClass(), "implicitPrototype", null);
        setBooleanField(term1180331, term1180331.getClass(), "nativeType", false);
        setBooleanField(term1180331, term1180331.getClass(), "visited", false);
        setField(term1180331, term1180331.getClass(), "docInfo", null);
        setBooleanField(term1180331, term1180331.getClass(), "unknown", false);
        setBooleanField(term1180331, term1180331.getClass(), "resolved", false);
        setField(term1180331, term1180331.getClass(), "resolveResult", null);
        setField(term1180331, term1180331.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1177984;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1177726, args);
        assertTrue(recursiveEquals(term1177726, term1180327));
        assertTrue(recursiveEquals(term1177984, term1180331));
        assertTrue(recursiveEquals(retValue, false));
    }

};


