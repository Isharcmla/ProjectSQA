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

public class FunctionType_isSubtype_2101002158435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289935;
     Object term290191;
     Object term290646;
     Object term290650;

    public FunctionType_isSubtype_2101002158435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term290656 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term290655 = ((Class) term290656).getDeclaredField((String) "INTERFACE");
        ((Field) term290655).setAccessible(true);
        Object enum531 = ((Field) term290655).get((Object) null);
        term289935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term289935, term289935.getClass(), "kind", enum531);
        term290191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term290191, term290191.getClass(), "kind", enum531);
        Class<? extends Object> term290950 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term290949 = ((Class) term290950).getDeclaredField((String) "INTERFACE");
        ((Field) term290949).setAccessible(true);
        Object enum532 = ((Field) term290949).get((Object) null);
        term290646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term290646, term290646.getClass(), "this$0", null);
        setField(term290646, term290646.getClass(), "call", null);
        setField(term290646, term290646.getClass(), "prototype", null);
        setField(term290646, term290646.getClass(), "kind", enum532);
        setField(term290646, term290646.getClass(), "typeOfThis", null);
        setField(term290646, term290646.getClass(), "source", null);
        setField(term290646, term290646.getClass(), "implementedInterfaces", null);
        setField(term290646, term290646.getClass(), "subTypes", null);
        setField(term290646, term290646.getClass(), "templateTypeName", null);
        setField(term290646, term290646.getClass(), "className", null);
        setField(term290646, term290646.getClass(), "properties", null);
        setField(term290646, term290646.getClass(), "implicitPrototype", null);
        setBooleanField(term290646, term290646.getClass(), "nativeType", false);
        setBooleanField(term290646, term290646.getClass(), "visited", false);
        setField(term290646, term290646.getClass(), "docInfo", null);
        setBooleanField(term290646, term290646.getClass(), "unknown", false);
        setBooleanField(term290646, term290646.getClass(), "resolved", false);
        setField(term290646, term290646.getClass(), "resolveResult", null);
        setField(term290646, term290646.getClass(), "registry", null);
        Class<? extends Object> term291244 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term291243 = ((Class) term291244).getDeclaredField((String) "INTERFACE");
        ((Field) term291243).setAccessible(true);
        Object enum533 = ((Field) term291243).get((Object) null);
        term290650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term290650, term290650.getClass(), "this$0", null);
        setField(term290650, term290650.getClass(), "call", null);
        setField(term290650, term290650.getClass(), "prototype", null);
        setField(term290650, term290650.getClass(), "kind", enum533);
        setField(term290650, term290650.getClass(), "typeOfThis", null);
        setField(term290650, term290650.getClass(), "source", null);
        setField(term290650, term290650.getClass(), "implementedInterfaces", null);
        setField(term290650, term290650.getClass(), "subTypes", null);
        setField(term290650, term290650.getClass(), "templateTypeName", null);
        setField(term290650, term290650.getClass(), "className", null);
        setField(term290650, term290650.getClass(), "properties", null);
        setField(term290650, term290650.getClass(), "implicitPrototype", null);
        setBooleanField(term290650, term290650.getClass(), "nativeType", false);
        setBooleanField(term290650, term290650.getClass(), "visited", false);
        setField(term290650, term290650.getClass(), "docInfo", null);
        setBooleanField(term290650, term290650.getClass(), "unknown", false);
        setBooleanField(term290650, term290650.getClass(), "resolved", false);
        setField(term290650, term290650.getClass(), "resolveResult", null);
        setField(term290650, term290650.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term290191;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term289935, args);
        assertTrue(recursiveEquals(term289935, term290646));
        assertTrue(recursiveEquals(term290191, term290650));
        assertTrue(recursiveEquals(retValue, true));
    }

};


