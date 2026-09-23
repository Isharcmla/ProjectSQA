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

public class FunctionType_isSubtype_2101002158311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171239;
     Object term171879;
     Object term172653;
     Object term172658;

    public FunctionType_isSubtype_2101002158311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term172664 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term172663 = ((Class) term172664).getDeclaredField((String) "INTERFACE");
        ((Field) term172663).setAccessible(true);
        Object enum314 = ((Field) term172663).get((Object) null);
        term171239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term171771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term171239, term171239.getClass(), "kind", enum314);
        setField(term171239, term171239.getClass(), "typeOfThis", term171771);
        Class<? extends Object> term172958 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term172957 = ((Class) term172958).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term172957).setAccessible(true);
        Object enum315 = ((Field) term172957).get((Object) null);
        term171879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term171879, term171879.getClass(), "kind", enum315);
        setField(term171879, term171879.getClass(), "typeOfThis", null);
        Class<? extends Object> term173258 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term173257 = ((Class) term173258).getDeclaredField((String) "INTERFACE");
        ((Field) term173257).setAccessible(true);
        Object enum316 = ((Field) term173257).get((Object) null);
        term172653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term172657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term172653, term172653.getClass(), "call", null);
        setField(term172653, term172653.getClass(), "prototype", null);
        setField(term172653, term172653.getClass(), "kind", enum316);
        setField(term172657, term172657.getClass(), "leastSupertypeVisitor", null);
        setField(term172657, term172657.getClass(), "greatestSubtypeVisitor", null);
        setField(term172657, term172657.getClass(), "call", null);
        setField(term172657, term172657.getClass(), "prototype", null);
        setField(term172657, term172657.getClass(), "kind", null);
        setField(term172657, term172657.getClass(), "typeOfThis", null);
        setField(term172657, term172657.getClass(), "source", null);
        setField(term172657, term172657.getClass(), "implementedInterfaces", null);
        setField(term172657, term172657.getClass(), "subTypes", null);
        setField(term172657, term172657.getClass(), "templateTypeName", null);
        setField(term172657, term172657.getClass(), "className", null);
        setField(term172657, term172657.getClass(), "properties", null);
        setField(term172657, term172657.getClass(), "implicitPrototype", null);
        setBooleanField(term172657, term172657.getClass(), "nativeType", false);
        setBooleanField(term172657, term172657.getClass(), "visited", false);
        setField(term172657, term172657.getClass(), "docInfo", null);
        setBooleanField(term172657, term172657.getClass(), "unknown", false);
        setBooleanField(term172657, term172657.getClass(), "resolved", false);
        setField(term172657, term172657.getClass(), "resolveResult", null);
        setField(term172657, term172657.getClass(), "registry", null);
        setField(term172653, term172653.getClass(), "typeOfThis", term172657);
        setField(term172653, term172653.getClass(), "source", null);
        setField(term172653, term172653.getClass(), "implementedInterfaces", null);
        setField(term172653, term172653.getClass(), "subTypes", null);
        setField(term172653, term172653.getClass(), "templateTypeName", null);
        setField(term172653, term172653.getClass(), "className", null);
        setField(term172653, term172653.getClass(), "properties", null);
        setField(term172653, term172653.getClass(), "implicitPrototype", null);
        setBooleanField(term172653, term172653.getClass(), "nativeType", false);
        setBooleanField(term172653, term172653.getClass(), "visited", false);
        setField(term172653, term172653.getClass(), "docInfo", null);
        setBooleanField(term172653, term172653.getClass(), "unknown", false);
        setBooleanField(term172653, term172653.getClass(), "resolved", false);
        setField(term172653, term172653.getClass(), "resolveResult", null);
        setField(term172653, term172653.getClass(), "registry", null);
        Class<? extends Object> term173552 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term173551 = ((Class) term173552).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term173551).setAccessible(true);
        Object enum317 = ((Field) term173551).get((Object) null);
        term172658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term172658, term172658.getClass(), "this$0", null);
        setField(term172658, term172658.getClass(), "call", null);
        setField(term172658, term172658.getClass(), "prototype", null);
        setField(term172658, term172658.getClass(), "kind", enum317);
        setField(term172658, term172658.getClass(), "typeOfThis", null);
        setField(term172658, term172658.getClass(), "source", null);
        setField(term172658, term172658.getClass(), "implementedInterfaces", null);
        setField(term172658, term172658.getClass(), "subTypes", null);
        setField(term172658, term172658.getClass(), "templateTypeName", null);
        setField(term172658, term172658.getClass(), "className", null);
        setField(term172658, term172658.getClass(), "properties", null);
        setField(term172658, term172658.getClass(), "implicitPrototype", null);
        setBooleanField(term172658, term172658.getClass(), "nativeType", false);
        setBooleanField(term172658, term172658.getClass(), "visited", false);
        setField(term172658, term172658.getClass(), "docInfo", null);
        setBooleanField(term172658, term172658.getClass(), "unknown", false);
        setBooleanField(term172658, term172658.getClass(), "resolved", false);
        setField(term172658, term172658.getClass(), "resolveResult", null);
        setField(term172658, term172658.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term171879;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term171239, args);
        assertTrue(recursiveEquals(term171239, term172653));
        assertTrue(recursiveEquals(term171879, term172658));
        assertTrue(recursiveEquals(retValue, false));
    }

};


