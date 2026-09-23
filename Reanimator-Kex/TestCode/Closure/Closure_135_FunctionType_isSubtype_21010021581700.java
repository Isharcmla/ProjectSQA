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

public class FunctionType_isSubtype_21010021581700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2310325;
     Object term2310923;
     Object term2312618;
     Object term2312627;

    public FunctionType_isSubtype_21010021581700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2312638 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2312637 = ((Class) term2312638).getDeclaredField((String) "ORDINARY");
        ((Field) term2312637).setAccessible(true);
        Object enum4316 = ((Field) term2312637).get((Object) null);
        Class<? extends Object> term2312929 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2312928 = ((Class) term2312929).getDeclaredField((String) "INTERFACE");
        ((Field) term2312928).setAccessible(true);
        Object enum4317 = ((Field) term2312928).get((Object) null);
        term2310325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2310573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2310815 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2310325, term2310325.getClass(), "kind", enum4316);
        setField(term2310573, term2310573.getClass(), "kind", enum4317);
        setField(term2310325, term2310325.getClass(), "typeOfThis", term2310573);
        setField(term2310325, term2310325.getClass(), "call", term2310815);
        Class<? extends Object> term2313223 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2313222 = ((Class) term2313223).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2313222).setAccessible(true);
        Object enum4318 = ((Field) term2313222).get((Object) null);
        term2310923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2311105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2311347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2310923, term2310923.getClass(), "kind", enum4316);
        setField(term2311105, term2311105.getClass(), "kind", enum4318);
        setField(term2310923, term2310923.getClass(), "typeOfThis", term2311105);
        setField(term2310923, term2310923.getClass(), "call", term2311347);
        Class<? extends Object> term2313523 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2313522 = ((Class) term2313523).getDeclaredField((String) "ORDINARY");
        ((Field) term2313522).setAccessible(true);
        Object enum4319 = ((Field) term2313522).get((Object) null);
        Class<? extends Object> term2313814 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2313813 = ((Class) term2313814).getDeclaredField((String) "INTERFACE");
        ((Field) term2313813).setAccessible(true);
        Object enum4320 = ((Field) term2313813).get((Object) null);
        term2312618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2312619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2312623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2312618, term2312618.getClass(), "this$0", null);
        setField(term2312619, term2312619.getClass(), "parameters", null);
        setField(term2312619, term2312619.getClass(), "returnType", null);
        setBooleanField(term2312619, term2312619.getClass(), "resolved", false);
        setField(term2312619, term2312619.getClass(), "resolveResult", null);
        setField(term2312619, term2312619.getClass(), "registry", null);
        setField(term2312618, term2312618.getClass(), "call", term2312619);
        setField(term2312618, term2312618.getClass(), "prototype", null);
        setField(term2312618, term2312618.getClass(), "kind", enum4319);
        setField(term2312623, term2312623.getClass(), "call", null);
        setField(term2312623, term2312623.getClass(), "prototype", null);
        setField(term2312623, term2312623.getClass(), "kind", enum4320);
        setField(term2312623, term2312623.getClass(), "typeOfThis", null);
        setField(term2312623, term2312623.getClass(), "source", null);
        setField(term2312623, term2312623.getClass(), "implementedInterfaces", null);
        setField(term2312623, term2312623.getClass(), "subTypes", null);
        setField(term2312623, term2312623.getClass(), "templateTypeName", null);
        setField(term2312623, term2312623.getClass(), "className", null);
        setField(term2312623, term2312623.getClass(), "properties", null);
        setField(term2312623, term2312623.getClass(), "implicitPrototype", null);
        setBooleanField(term2312623, term2312623.getClass(), "nativeType", false);
        setBooleanField(term2312623, term2312623.getClass(), "visited", false);
        setField(term2312623, term2312623.getClass(), "docInfo", null);
        setBooleanField(term2312623, term2312623.getClass(), "unknown", false);
        setBooleanField(term2312623, term2312623.getClass(), "resolved", false);
        setField(term2312623, term2312623.getClass(), "resolveResult", null);
        setField(term2312623, term2312623.getClass(), "registry", null);
        setField(term2312618, term2312618.getClass(), "typeOfThis", term2312623);
        setField(term2312618, term2312618.getClass(), "source", null);
        setField(term2312618, term2312618.getClass(), "implementedInterfaces", null);
        setField(term2312618, term2312618.getClass(), "subTypes", null);
        setField(term2312618, term2312618.getClass(), "templateTypeName", null);
        setField(term2312618, term2312618.getClass(), "className", null);
        setField(term2312618, term2312618.getClass(), "properties", null);
        setField(term2312618, term2312618.getClass(), "implicitPrototype", null);
        setBooleanField(term2312618, term2312618.getClass(), "nativeType", false);
        setBooleanField(term2312618, term2312618.getClass(), "visited", false);
        setField(term2312618, term2312618.getClass(), "docInfo", null);
        setBooleanField(term2312618, term2312618.getClass(), "unknown", false);
        setBooleanField(term2312618, term2312618.getClass(), "resolved", false);
        setField(term2312618, term2312618.getClass(), "resolveResult", null);
        setField(term2312618, term2312618.getClass(), "registry", null);
        Class<? extends Object> term2314108 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2314107 = ((Class) term2314108).getDeclaredField((String) "ORDINARY");
        ((Field) term2314107).setAccessible(true);
        Object enum4321 = ((Field) term2314107).get((Object) null);
        Class<? extends Object> term2314399 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2314398 = ((Class) term2314399).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2314398).setAccessible(true);
        Object enum4322 = ((Field) term2314398).get((Object) null);
        term2312627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2312628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2312632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2312627, term2312627.getClass(), "this$0", null);
        setField(term2312628, term2312628.getClass(), "parameters", null);
        setField(term2312628, term2312628.getClass(), "returnType", null);
        setBooleanField(term2312628, term2312628.getClass(), "resolved", false);
        setField(term2312628, term2312628.getClass(), "resolveResult", null);
        setField(term2312628, term2312628.getClass(), "registry", null);
        setField(term2312627, term2312627.getClass(), "call", term2312628);
        setField(term2312627, term2312627.getClass(), "prototype", null);
        setField(term2312627, term2312627.getClass(), "kind", enum4321);
        setField(term2312632, term2312632.getClass(), "this$0", null);
        setField(term2312632, term2312632.getClass(), "call", null);
        setField(term2312632, term2312632.getClass(), "prototype", null);
        setField(term2312632, term2312632.getClass(), "kind", enum4322);
        setField(term2312632, term2312632.getClass(), "typeOfThis", null);
        setField(term2312632, term2312632.getClass(), "source", null);
        setField(term2312632, term2312632.getClass(), "implementedInterfaces", null);
        setField(term2312632, term2312632.getClass(), "subTypes", null);
        setField(term2312632, term2312632.getClass(), "templateTypeName", null);
        setField(term2312632, term2312632.getClass(), "className", null);
        setField(term2312632, term2312632.getClass(), "properties", null);
        setField(term2312632, term2312632.getClass(), "implicitPrototype", null);
        setBooleanField(term2312632, term2312632.getClass(), "nativeType", false);
        setBooleanField(term2312632, term2312632.getClass(), "visited", false);
        setField(term2312632, term2312632.getClass(), "docInfo", null);
        setBooleanField(term2312632, term2312632.getClass(), "unknown", false);
        setBooleanField(term2312632, term2312632.getClass(), "resolved", false);
        setField(term2312632, term2312632.getClass(), "resolveResult", null);
        setField(term2312632, term2312632.getClass(), "registry", null);
        setField(term2312627, term2312627.getClass(), "typeOfThis", term2312632);
        setField(term2312627, term2312627.getClass(), "source", null);
        setField(term2312627, term2312627.getClass(), "implementedInterfaces", null);
        setField(term2312627, term2312627.getClass(), "subTypes", null);
        setField(term2312627, term2312627.getClass(), "templateTypeName", null);
        setField(term2312627, term2312627.getClass(), "className", null);
        setField(term2312627, term2312627.getClass(), "properties", null);
        setField(term2312627, term2312627.getClass(), "implicitPrototype", null);
        setBooleanField(term2312627, term2312627.getClass(), "nativeType", false);
        setBooleanField(term2312627, term2312627.getClass(), "visited", false);
        setField(term2312627, term2312627.getClass(), "docInfo", null);
        setBooleanField(term2312627, term2312627.getClass(), "unknown", false);
        setBooleanField(term2312627, term2312627.getClass(), "resolved", false);
        setField(term2312627, term2312627.getClass(), "resolveResult", null);
        setField(term2312627, term2312627.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2310923;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2310325, args);
        assertTrue(recursiveEquals(term2310325, term2312618));
        assertTrue(recursiveEquals(term2310923, term2312627));
        assertTrue(recursiveEquals(retValue, true));
    }

};


