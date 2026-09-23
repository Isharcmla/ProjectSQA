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

public class FunctionType_isSubtype_21010021581555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2063624;
     Object term2064074;
     Object term2067356;
     Object term2067362;

    public FunctionType_isSubtype_21010021581555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2067370 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2067369 = ((Class) term2067370).getDeclaredField((String) "ORDINARY");
        ((Field) term2067369).setAccessible(true);
        Object enum3850 = ((Field) term2067369).get((Object) null);
        term2063624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2063872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2063966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2063624, term2063624.getClass(), "kind", enum3850);
        setField(term2063624, term2063624.getClass(), "typeOfThis", term2063872);
        setField(term2063624, term2063624.getClass(), "call", term2063966);
        Class<? extends Object> term2067661 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2067660 = ((Class) term2067661).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2067660).setAccessible(true);
        Object enum3851 = ((Field) term2067660).get((Object) null);
        term2064074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2064310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term2064404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2064074, term2064074.getClass(), "kind", enum3851);
        setField(term2064074, term2064074.getClass(), "typeOfThis", term2064310);
        setField(term2064074, term2064074.getClass(), "call", term2064404);
        Class<? extends Object> term2067961 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2067960 = ((Class) term2067961).getDeclaredField((String) "ORDINARY");
        ((Field) term2067960).setAccessible(true);
        Object enum3852 = ((Field) term2067960).get((Object) null);
        term2067356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2067357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2067361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2067356, term2067356.getClass(), "this$0", null);
        setField(term2067357, term2067357.getClass(), "parameters", null);
        setField(term2067357, term2067357.getClass(), "returnType", null);
        setBooleanField(term2067357, term2067357.getClass(), "resolved", false);
        setField(term2067357, term2067357.getClass(), "resolveResult", null);
        setField(term2067357, term2067357.getClass(), "registry", null);
        setField(term2067356, term2067356.getClass(), "call", term2067357);
        setField(term2067356, term2067356.getClass(), "prototype", null);
        setField(term2067356, term2067356.getClass(), "kind", enum3852);
        setField(term2067361, term2067361.getClass(), "call", null);
        setField(term2067361, term2067361.getClass(), "prototype", null);
        setField(term2067361, term2067361.getClass(), "kind", null);
        setField(term2067361, term2067361.getClass(), "typeOfThis", null);
        setField(term2067361, term2067361.getClass(), "source", null);
        setField(term2067361, term2067361.getClass(), "implementedInterfaces", null);
        setField(term2067361, term2067361.getClass(), "subTypes", null);
        setField(term2067361, term2067361.getClass(), "templateTypeName", null);
        setField(term2067361, term2067361.getClass(), "className", null);
        setField(term2067361, term2067361.getClass(), "properties", null);
        setField(term2067361, term2067361.getClass(), "implicitPrototype", null);
        setBooleanField(term2067361, term2067361.getClass(), "nativeType", false);
        setBooleanField(term2067361, term2067361.getClass(), "visited", false);
        setField(term2067361, term2067361.getClass(), "docInfo", null);
        setBooleanField(term2067361, term2067361.getClass(), "unknown", false);
        setBooleanField(term2067361, term2067361.getClass(), "resolved", false);
        setField(term2067361, term2067361.getClass(), "resolveResult", null);
        setField(term2067361, term2067361.getClass(), "registry", null);
        setField(term2067356, term2067356.getClass(), "typeOfThis", term2067361);
        setField(term2067356, term2067356.getClass(), "source", null);
        setField(term2067356, term2067356.getClass(), "implementedInterfaces", null);
        setField(term2067356, term2067356.getClass(), "subTypes", null);
        setField(term2067356, term2067356.getClass(), "templateTypeName", null);
        setField(term2067356, term2067356.getClass(), "className", null);
        setField(term2067356, term2067356.getClass(), "properties", null);
        setField(term2067356, term2067356.getClass(), "implicitPrototype", null);
        setBooleanField(term2067356, term2067356.getClass(), "nativeType", false);
        setBooleanField(term2067356, term2067356.getClass(), "visited", false);
        setField(term2067356, term2067356.getClass(), "docInfo", null);
        setBooleanField(term2067356, term2067356.getClass(), "unknown", false);
        setBooleanField(term2067356, term2067356.getClass(), "resolved", false);
        setField(term2067356, term2067356.getClass(), "resolveResult", null);
        setField(term2067356, term2067356.getClass(), "registry", null);
        Class<? extends Object> term2068252 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2068251 = ((Class) term2068252).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2068251).setAccessible(true);
        Object enum3853 = ((Field) term2068251).get((Object) null);
        term2067362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2067363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2067367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2067362, term2067362.getClass(), "this$0", null);
        setField(term2067363, term2067363.getClass(), "parameters", null);
        setField(term2067363, term2067363.getClass(), "returnType", null);
        setBooleanField(term2067363, term2067363.getClass(), "resolved", false);
        setField(term2067363, term2067363.getClass(), "resolveResult", null);
        setField(term2067363, term2067363.getClass(), "registry", null);
        setField(term2067362, term2067362.getClass(), "call", term2067363);
        setField(term2067362, term2067362.getClass(), "prototype", null);
        setField(term2067362, term2067362.getClass(), "kind", enum3853);
        setField(term2067367, term2067367.getClass(), "leastSupertypeVisitor", null);
        setField(term2067367, term2067367.getClass(), "greatestSubtypeVisitor", null);
        setField(term2067367, term2067367.getClass(), "call", null);
        setField(term2067367, term2067367.getClass(), "prototype", null);
        setField(term2067367, term2067367.getClass(), "kind", null);
        setField(term2067367, term2067367.getClass(), "typeOfThis", null);
        setField(term2067367, term2067367.getClass(), "source", null);
        setField(term2067367, term2067367.getClass(), "implementedInterfaces", null);
        setField(term2067367, term2067367.getClass(), "subTypes", null);
        setField(term2067367, term2067367.getClass(), "templateTypeName", null);
        setField(term2067367, term2067367.getClass(), "className", null);
        setField(term2067367, term2067367.getClass(), "properties", null);
        setField(term2067367, term2067367.getClass(), "implicitPrototype", null);
        setBooleanField(term2067367, term2067367.getClass(), "nativeType", false);
        setBooleanField(term2067367, term2067367.getClass(), "visited", false);
        setField(term2067367, term2067367.getClass(), "docInfo", null);
        setBooleanField(term2067367, term2067367.getClass(), "unknown", false);
        setBooleanField(term2067367, term2067367.getClass(), "resolved", false);
        setField(term2067367, term2067367.getClass(), "resolveResult", null);
        setField(term2067367, term2067367.getClass(), "registry", null);
        setField(term2067362, term2067362.getClass(), "typeOfThis", term2067367);
        setField(term2067362, term2067362.getClass(), "source", null);
        setField(term2067362, term2067362.getClass(), "implementedInterfaces", null);
        setField(term2067362, term2067362.getClass(), "subTypes", null);
        setField(term2067362, term2067362.getClass(), "templateTypeName", null);
        setField(term2067362, term2067362.getClass(), "className", null);
        setField(term2067362, term2067362.getClass(), "properties", null);
        setField(term2067362, term2067362.getClass(), "implicitPrototype", null);
        setBooleanField(term2067362, term2067362.getClass(), "nativeType", false);
        setBooleanField(term2067362, term2067362.getClass(), "visited", false);
        setField(term2067362, term2067362.getClass(), "docInfo", null);
        setBooleanField(term2067362, term2067362.getClass(), "unknown", false);
        setBooleanField(term2067362, term2067362.getClass(), "resolved", false);
        setField(term2067362, term2067362.getClass(), "resolveResult", null);
        setField(term2067362, term2067362.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2064074;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2063624, args);
        assertTrue(recursiveEquals(term2063624, term2067356));
        assertTrue(recursiveEquals(term2064074, term2067362));
        assertTrue(recursiveEquals(retValue, true));
    }

};


