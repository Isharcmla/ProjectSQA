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

public class FunctionType_getLeastSupertype_418850886295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156190;
     Object term156550;
     Object term157598;
     Object term157603;
     Object term157510;

    public FunctionType_getLeastSupertype_418850886295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term157608 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term157607 = ((Class) term157608).getDeclaredField((String) "INTERFACE");
        ((Field) term157607).setAccessible(true);
        Object enum284 = ((Field) term157607).get((Object) null);
        term156190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term156442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term156190, term156190.getClass(), "kind", enum284);
        setField(term156190, term156190.getClass(), "registry", term156442);
        Class<? extends Object> term157902 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term157901 = ((Class) term157902).getDeclaredField((String) "ORDINARY");
        ((Field) term157901).setAccessible(true);
        Object enum285 = ((Field) term157901).get((Object) null);
        term156550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term156550, term156550.getClass(), "kind", enum285);
        Class<? extends Object> term158193 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term158192 = ((Class) term158193).getDeclaredField((String) "INTERFACE");
        ((Field) term158192).setAccessible(true);
        Object enum286 = ((Field) term158192).get((Object) null);
        term157598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term157602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term157598, term157598.getClass(), "call", null);
        setField(term157598, term157598.getClass(), "prototype", null);
        setField(term157598, term157598.getClass(), "kind", enum286);
        setField(term157598, term157598.getClass(), "typeOfThis", null);
        setField(term157598, term157598.getClass(), "source", null);
        setField(term157598, term157598.getClass(), "implementedInterfaces", null);
        setField(term157598, term157598.getClass(), "subTypes", null);
        setField(term157598, term157598.getClass(), "templateTypeName", null);
        setField(term157598, term157598.getClass(), "className", null);
        setField(term157598, term157598.getClass(), "properties", null);
        setField(term157598, term157598.getClass(), "implicitPrototype", null);
        setBooleanField(term157598, term157598.getClass(), "nativeType", false);
        setBooleanField(term157598, term157598.getClass(), "visited", false);
        setField(term157598, term157598.getClass(), "docInfo", null);
        setBooleanField(term157598, term157598.getClass(), "unknown", false);
        setBooleanField(term157598, term157598.getClass(), "resolved", false);
        setField(term157598, term157598.getClass(), "resolveResult", null);
        setField(term157602, term157602.getClass(), "reporter", null);
        setField(term157602, term157602.getClass(), "nativeTypes", null);
        setField(term157602, term157602.getClass(), "namesToTypes", null);
        setField(term157602, term157602.getClass(), "namespaces", null);
        setField(term157602, term157602.getClass(), "enumTypeNames", null);
        setField(term157602, term157602.getClass(), "forwardDeclaredTypes", null);
        setField(term157602, term157602.getClass(), "typesIndexedByProperty", null);
        setField(term157602, term157602.getClass(), "greatestSubtypeByProperty", null);
        setField(term157602, term157602.getClass(), "interfaceToImplementors", null);
        setField(term157602, term157602.getClass(), "unresolvedNamedTypes", null);
        setField(term157602, term157602.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term157602, term157602.getClass(), "lastGeneration", false);
        setField(term157602, term157602.getClass(), "templateTypeName", null);
        setField(term157602, term157602.getClass(), "templateType", null);
        setField(term157598, term157598.getClass(), "registry", term157602);
        Class<? extends Object> term158487 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term158486 = ((Class) term158487).getDeclaredField((String) "INTERFACE");
        ((Field) term158486).setAccessible(true);
        Object enum287 = ((Field) term158486).get((Object) null);
        term157603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term157603, term157603.getClass(), "this$0", null);
        setField(term157603, term157603.getClass(), "call", null);
        setField(term157603, term157603.getClass(), "prototype", null);
        setField(term157603, term157603.getClass(), "kind", enum287);
        setField(term157603, term157603.getClass(), "typeOfThis", null);
        setField(term157603, term157603.getClass(), "source", null);
        setField(term157603, term157603.getClass(), "implementedInterfaces", null);
        setField(term157603, term157603.getClass(), "subTypes", null);
        setField(term157603, term157603.getClass(), "templateTypeName", null);
        setField(term157603, term157603.getClass(), "className", null);
        setField(term157603, term157603.getClass(), "properties", null);
        setField(term157603, term157603.getClass(), "implicitPrototype", null);
        setBooleanField(term157603, term157603.getClass(), "nativeType", false);
        setBooleanField(term157603, term157603.getClass(), "visited", false);
        setField(term157603, term157603.getClass(), "docInfo", null);
        setBooleanField(term157603, term157603.getClass(), "unknown", false);
        setBooleanField(term157603, term157603.getClass(), "resolved", false);
        setField(term157603, term157603.getClass(), "resolveResult", null);
        setField(term157603, term157603.getClass(), "registry", null);
        Class<? extends Object> term158781 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term158780 = ((Class) term158781).getDeclaredField((String) "INTERFACE");
        ((Field) term158780).setAccessible(true);
        Object enum288 = ((Field) term158780).get((Object) null);
        term157510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term157528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term157510, term157510.getClass(), "call", null);
        setField(term157510, term157510.getClass(), "prototype", null);
        setField(term157510, term157510.getClass(), "kind", enum288);
        setField(term157510, term157510.getClass(), "typeOfThis", null);
        setField(term157510, term157510.getClass(), "source", null);
        setField(term157510, term157510.getClass(), "implementedInterfaces", null);
        setField(term157510, term157510.getClass(), "subTypes", null);
        setField(term157510, term157510.getClass(), "templateTypeName", null);
        setField(term157510, term157510.getClass(), "className", null);
        setField(term157510, term157510.getClass(), "properties", null);
        setField(term157510, term157510.getClass(), "implicitPrototype", null);
        setBooleanField(term157510, term157510.getClass(), "nativeType", false);
        setBooleanField(term157510, term157510.getClass(), "visited", false);
        setField(term157510, term157510.getClass(), "docInfo", null);
        setBooleanField(term157510, term157510.getClass(), "unknown", false);
        setBooleanField(term157510, term157510.getClass(), "resolved", false);
        setField(term157510, term157510.getClass(), "resolveResult", null);
        setField(term157528, term157528.getClass(), "reporter", null);
        setField(term157528, term157528.getClass(), "nativeTypes", null);
        setField(term157528, term157528.getClass(), "namesToTypes", null);
        setField(term157528, term157528.getClass(), "namespaces", null);
        setField(term157528, term157528.getClass(), "enumTypeNames", null);
        setField(term157528, term157528.getClass(), "forwardDeclaredTypes", null);
        setField(term157528, term157528.getClass(), "typesIndexedByProperty", null);
        setField(term157528, term157528.getClass(), "greatestSubtypeByProperty", null);
        setField(term157528, term157528.getClass(), "interfaceToImplementors", null);
        setField(term157528, term157528.getClass(), "unresolvedNamedTypes", null);
        setField(term157528, term157528.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term157528, term157528.getClass(), "lastGeneration", false);
        setField(term157528, term157528.getClass(), "templateTypeName", null);
        setField(term157528, term157528.getClass(), "templateType", null);
        setField(term157510, term157510.getClass(), "registry", term157528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term156550;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term156190, args);
        assertTrue(recursiveEquals(term156190, term157598));
        assertTrue(recursiveEquals(term156550, term157603));
        assertTrue(recursiveEquals(retValue, term157510));
    }

};


