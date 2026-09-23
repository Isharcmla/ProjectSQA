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

public class FunctionType_isSubtype_21010021581451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1886140;
     Object term1886900;
     Object term1888059;
     Object term1888065;

    public FunctionType_isSubtype_21010021581451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1888076 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1888075 = ((Class) term1888076).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1888075).setAccessible(true);
        Object enum3517 = ((Field) term1888075).get((Object) null);
        term1886140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1886684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1886792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1886140, term1886140.getClass(), "kind", enum3517);
        setField(term1886684, term1886684.getClass(), "kind", enum3517);
        setField(term1886684, term1886684.getClass(), "typeOfThis", term1886792);
        setField(term1886684, term1886684.getClass(), "call", null);
        setField(term1886140, term1886140.getClass(), "typeOfThis", term1886684);
        Class<? extends Object> term1888376 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1888375 = ((Class) term1888376).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1888375).setAccessible(true);
        Object enum3518 = ((Field) term1888375).get((Object) null);
        term1886900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1887230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1887324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1886900, term1886900.getClass(), "kind", enum3517);
        setField(term1887230, term1887230.getClass(), "kind", enum3518);
        setField(term1887230, term1887230.getClass(), "typeOfThis", null);
        setField(term1887230, term1887230.getClass(), "call", term1887324);
        setField(term1886900, term1886900.getClass(), "typeOfThis", term1887230);
        Class<? extends Object> term1888676 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1888675 = ((Class) term1888676).getDeclaredField((String) "INTERFACE");
        ((Field) term1888675).setAccessible(true);
        Object enum3519 = ((Field) term1888675).get((Object) null);
        term1888059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1888063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1888064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1888059, term1888059.getClass(), "this$0", null);
        setField(term1888059, term1888059.getClass(), "call", null);
        setField(term1888059, term1888059.getClass(), "prototype", null);
        setField(term1888059, term1888059.getClass(), "kind", enum3519);
        setField(term1888063, term1888063.getClass(), "call", null);
        setField(term1888063, term1888063.getClass(), "prototype", null);
        setField(term1888063, term1888063.getClass(), "kind", enum3519);
        setField(term1888064, term1888064.getClass(), "this$0", null);
        setField(term1888064, term1888064.getClass(), "call", null);
        setField(term1888064, term1888064.getClass(), "prototype", null);
        setField(term1888064, term1888064.getClass(), "kind", null);
        setField(term1888064, term1888064.getClass(), "typeOfThis", null);
        setField(term1888064, term1888064.getClass(), "source", null);
        setField(term1888064, term1888064.getClass(), "implementedInterfaces", null);
        setField(term1888064, term1888064.getClass(), "subTypes", null);
        setField(term1888064, term1888064.getClass(), "templateTypeName", null);
        setField(term1888064, term1888064.getClass(), "className", null);
        setField(term1888064, term1888064.getClass(), "properties", null);
        setField(term1888064, term1888064.getClass(), "implicitPrototype", null);
        setBooleanField(term1888064, term1888064.getClass(), "nativeType", false);
        setBooleanField(term1888064, term1888064.getClass(), "visited", false);
        setField(term1888064, term1888064.getClass(), "docInfo", null);
        setBooleanField(term1888064, term1888064.getClass(), "unknown", false);
        setBooleanField(term1888064, term1888064.getClass(), "resolved", false);
        setField(term1888064, term1888064.getClass(), "resolveResult", null);
        setField(term1888064, term1888064.getClass(), "registry", null);
        setField(term1888063, term1888063.getClass(), "typeOfThis", term1888064);
        setField(term1888063, term1888063.getClass(), "source", null);
        setField(term1888063, term1888063.getClass(), "implementedInterfaces", null);
        setField(term1888063, term1888063.getClass(), "subTypes", null);
        setField(term1888063, term1888063.getClass(), "templateTypeName", null);
        setField(term1888063, term1888063.getClass(), "className", null);
        setField(term1888063, term1888063.getClass(), "properties", null);
        setField(term1888063, term1888063.getClass(), "implicitPrototype", null);
        setBooleanField(term1888063, term1888063.getClass(), "nativeType", false);
        setBooleanField(term1888063, term1888063.getClass(), "visited", false);
        setField(term1888063, term1888063.getClass(), "docInfo", null);
        setBooleanField(term1888063, term1888063.getClass(), "unknown", false);
        setBooleanField(term1888063, term1888063.getClass(), "resolved", false);
        setField(term1888063, term1888063.getClass(), "resolveResult", null);
        setField(term1888063, term1888063.getClass(), "registry", null);
        setField(term1888059, term1888059.getClass(), "typeOfThis", term1888063);
        setField(term1888059, term1888059.getClass(), "source", null);
        setField(term1888059, term1888059.getClass(), "implementedInterfaces", null);
        setField(term1888059, term1888059.getClass(), "subTypes", null);
        setField(term1888059, term1888059.getClass(), "templateTypeName", null);
        setField(term1888059, term1888059.getClass(), "className", null);
        setField(term1888059, term1888059.getClass(), "properties", null);
        setField(term1888059, term1888059.getClass(), "implicitPrototype", null);
        setBooleanField(term1888059, term1888059.getClass(), "nativeType", false);
        setBooleanField(term1888059, term1888059.getClass(), "visited", false);
        setField(term1888059, term1888059.getClass(), "docInfo", null);
        setBooleanField(term1888059, term1888059.getClass(), "unknown", false);
        setBooleanField(term1888059, term1888059.getClass(), "resolved", false);
        setField(term1888059, term1888059.getClass(), "resolveResult", null);
        setField(term1888059, term1888059.getClass(), "registry", null);
        Class<? extends Object> term1888970 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1888969 = ((Class) term1888970).getDeclaredField((String) "INTERFACE");
        ((Field) term1888969).setAccessible(true);
        Object enum3520 = ((Field) term1888969).get((Object) null);
        Class<? extends Object> term1889264 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1889263 = ((Class) term1889264).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1889263).setAccessible(true);
        Object enum3521 = ((Field) term1889263).get((Object) null);
        term1888065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1888069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1888070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1888065, term1888065.getClass(), "this$0", null);
        setField(term1888065, term1888065.getClass(), "call", null);
        setField(term1888065, term1888065.getClass(), "prototype", null);
        setField(term1888065, term1888065.getClass(), "kind", enum3520);
        setField(term1888069, term1888069.getClass(), "this$0", null);
        setField(term1888070, term1888070.getClass(), "parameters", null);
        setField(term1888070, term1888070.getClass(), "returnType", null);
        setBooleanField(term1888070, term1888070.getClass(), "resolved", false);
        setField(term1888070, term1888070.getClass(), "resolveResult", null);
        setField(term1888070, term1888070.getClass(), "registry", null);
        setField(term1888069, term1888069.getClass(), "call", term1888070);
        setField(term1888069, term1888069.getClass(), "prototype", null);
        setField(term1888069, term1888069.getClass(), "kind", enum3521);
        setField(term1888069, term1888069.getClass(), "typeOfThis", null);
        setField(term1888069, term1888069.getClass(), "source", null);
        setField(term1888069, term1888069.getClass(), "implementedInterfaces", null);
        setField(term1888069, term1888069.getClass(), "subTypes", null);
        setField(term1888069, term1888069.getClass(), "templateTypeName", null);
        setField(term1888069, term1888069.getClass(), "className", null);
        setField(term1888069, term1888069.getClass(), "properties", null);
        setField(term1888069, term1888069.getClass(), "implicitPrototype", null);
        setBooleanField(term1888069, term1888069.getClass(), "nativeType", false);
        setBooleanField(term1888069, term1888069.getClass(), "visited", false);
        setField(term1888069, term1888069.getClass(), "docInfo", null);
        setBooleanField(term1888069, term1888069.getClass(), "unknown", false);
        setBooleanField(term1888069, term1888069.getClass(), "resolved", false);
        setField(term1888069, term1888069.getClass(), "resolveResult", null);
        setField(term1888069, term1888069.getClass(), "registry", null);
        setField(term1888065, term1888065.getClass(), "typeOfThis", term1888069);
        setField(term1888065, term1888065.getClass(), "source", null);
        setField(term1888065, term1888065.getClass(), "implementedInterfaces", null);
        setField(term1888065, term1888065.getClass(), "subTypes", null);
        setField(term1888065, term1888065.getClass(), "templateTypeName", null);
        setField(term1888065, term1888065.getClass(), "className", null);
        setField(term1888065, term1888065.getClass(), "properties", null);
        setField(term1888065, term1888065.getClass(), "implicitPrototype", null);
        setBooleanField(term1888065, term1888065.getClass(), "nativeType", false);
        setBooleanField(term1888065, term1888065.getClass(), "visited", false);
        setField(term1888065, term1888065.getClass(), "docInfo", null);
        setBooleanField(term1888065, term1888065.getClass(), "unknown", false);
        setBooleanField(term1888065, term1888065.getClass(), "resolved", false);
        setField(term1888065, term1888065.getClass(), "resolveResult", null);
        setField(term1888065, term1888065.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1886900;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1886140, args);
        assertTrue(recursiveEquals(term1886140, term1888059));
        assertTrue(recursiveEquals(term1886900, term1888065));
        assertTrue(recursiveEquals(retValue, true));
    }

};


