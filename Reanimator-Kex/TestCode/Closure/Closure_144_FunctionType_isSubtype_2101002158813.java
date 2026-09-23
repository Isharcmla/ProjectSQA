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

public class FunctionType_isSubtype_2101002158813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term937643;
     Object term938241;
     Object term939331;
     Object term939340;

    public FunctionType_isSubtype_2101002158813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term939347 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term939346 = ((Class) term939347).getDeclaredField((String) "ORDINARY");
        ((Field) term939346).setAccessible(true);
        Object enum1697 = ((Field) term939346).get((Object) null);
        Class<? extends Object> term939638 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term939637 = ((Class) term939638).getDeclaredField((String) "INTERFACE");
        ((Field) term939637).setAccessible(true);
        Object enum1698 = ((Field) term939637).get((Object) null);
        term937643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term937891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term938133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term937643, term937643.getClass(), "kind", enum1697);
        setField(term937891, term937891.getClass(), "kind", enum1698);
        setField(term937643, term937643.getClass(), "typeOfThis", term937891);
        setField(term937643, term937643.getClass(), "call", term938133);
        term938241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term938425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term938241, term938241.getClass(), "kind", enum1697);
        setField(term938425, term938425.getClass(), "kind", enum1697);
        setField(term938241, term938241.getClass(), "typeOfThis", term938425);
        setField(term938241, term938241.getClass(), "call", null);
        Class<? extends Object> term939932 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term939931 = ((Class) term939932).getDeclaredField((String) "ORDINARY");
        ((Field) term939931).setAccessible(true);
        Object enum1699 = ((Field) term939931).get((Object) null);
        Class<? extends Object> term940223 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term940222 = ((Class) term940223).getDeclaredField((String) "INTERFACE");
        ((Field) term940222).setAccessible(true);
        Object enum1700 = ((Field) term940222).get((Object) null);
        term939331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term939332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term939336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term939331, term939331.getClass(), "this$0", null);
        setField(term939332, term939332.getClass(), "parameters", null);
        setField(term939332, term939332.getClass(), "returnType", null);
        setBooleanField(term939332, term939332.getClass(), "returnTypeInferred", false);
        setBooleanField(term939332, term939332.getClass(), "resolved", false);
        setField(term939332, term939332.getClass(), "resolveResult", null);
        setField(term939332, term939332.getClass(), "registry", null);
        setField(term939331, term939331.getClass(), "call", term939332);
        setField(term939331, term939331.getClass(), "prototype", null);
        setField(term939331, term939331.getClass(), "kind", enum1699);
        setField(term939336, term939336.getClass(), "call", null);
        setField(term939336, term939336.getClass(), "prototype", null);
        setField(term939336, term939336.getClass(), "kind", enum1700);
        setField(term939336, term939336.getClass(), "typeOfThis", null);
        setField(term939336, term939336.getClass(), "source", null);
        setField(term939336, term939336.getClass(), "implementedInterfaces", null);
        setField(term939336, term939336.getClass(), "subTypes", null);
        setField(term939336, term939336.getClass(), "templateTypeName", null);
        setField(term939336, term939336.getClass(), "className", null);
        setField(term939336, term939336.getClass(), "properties", null);
        setField(term939336, term939336.getClass(), "implicitPrototype", null);
        setBooleanField(term939336, term939336.getClass(), "nativeType", false);
        setBooleanField(term939336, term939336.getClass(), "prettyPrint", false);
        setBooleanField(term939336, term939336.getClass(), "visited", false);
        setField(term939336, term939336.getClass(), "docInfo", null);
        setBooleanField(term939336, term939336.getClass(), "unknown", false);
        setBooleanField(term939336, term939336.getClass(), "resolved", false);
        setField(term939336, term939336.getClass(), "resolveResult", null);
        setField(term939336, term939336.getClass(), "registry", null);
        setField(term939331, term939331.getClass(), "typeOfThis", term939336);
        setField(term939331, term939331.getClass(), "source", null);
        setField(term939331, term939331.getClass(), "implementedInterfaces", null);
        setField(term939331, term939331.getClass(), "subTypes", null);
        setField(term939331, term939331.getClass(), "templateTypeName", null);
        setField(term939331, term939331.getClass(), "className", null);
        setField(term939331, term939331.getClass(), "properties", null);
        setField(term939331, term939331.getClass(), "implicitPrototype", null);
        setBooleanField(term939331, term939331.getClass(), "nativeType", false);
        setBooleanField(term939331, term939331.getClass(), "prettyPrint", false);
        setBooleanField(term939331, term939331.getClass(), "visited", false);
        setField(term939331, term939331.getClass(), "docInfo", null);
        setBooleanField(term939331, term939331.getClass(), "unknown", false);
        setBooleanField(term939331, term939331.getClass(), "resolved", false);
        setField(term939331, term939331.getClass(), "resolveResult", null);
        setField(term939331, term939331.getClass(), "registry", null);
        Class<? extends Object> term940517 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term940516 = ((Class) term940517).getDeclaredField((String) "ORDINARY");
        ((Field) term940516).setAccessible(true);
        Object enum1701 = ((Field) term940516).get((Object) null);
        term939340 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term939344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term939340, term939340.getClass(), "this$0", null);
        setField(term939340, term939340.getClass(), "call", null);
        setField(term939340, term939340.getClass(), "prototype", null);
        setField(term939340, term939340.getClass(), "kind", enum1701);
        setField(term939344, term939344.getClass(), "call", null);
        setField(term939344, term939344.getClass(), "prototype", null);
        setField(term939344, term939344.getClass(), "kind", enum1701);
        setField(term939344, term939344.getClass(), "typeOfThis", null);
        setField(term939344, term939344.getClass(), "source", null);
        setField(term939344, term939344.getClass(), "implementedInterfaces", null);
        setField(term939344, term939344.getClass(), "subTypes", null);
        setField(term939344, term939344.getClass(), "templateTypeName", null);
        setField(term939344, term939344.getClass(), "className", null);
        setField(term939344, term939344.getClass(), "properties", null);
        setField(term939344, term939344.getClass(), "implicitPrototype", null);
        setBooleanField(term939344, term939344.getClass(), "nativeType", false);
        setBooleanField(term939344, term939344.getClass(), "prettyPrint", false);
        setBooleanField(term939344, term939344.getClass(), "visited", false);
        setField(term939344, term939344.getClass(), "docInfo", null);
        setBooleanField(term939344, term939344.getClass(), "unknown", false);
        setBooleanField(term939344, term939344.getClass(), "resolved", false);
        setField(term939344, term939344.getClass(), "resolveResult", null);
        setField(term939344, term939344.getClass(), "registry", null);
        setField(term939340, term939340.getClass(), "typeOfThis", term939344);
        setField(term939340, term939340.getClass(), "source", null);
        setField(term939340, term939340.getClass(), "implementedInterfaces", null);
        setField(term939340, term939340.getClass(), "subTypes", null);
        setField(term939340, term939340.getClass(), "templateTypeName", null);
        setField(term939340, term939340.getClass(), "className", null);
        setField(term939340, term939340.getClass(), "properties", null);
        setField(term939340, term939340.getClass(), "implicitPrototype", null);
        setBooleanField(term939340, term939340.getClass(), "nativeType", false);
        setBooleanField(term939340, term939340.getClass(), "prettyPrint", false);
        setBooleanField(term939340, term939340.getClass(), "visited", false);
        setField(term939340, term939340.getClass(), "docInfo", null);
        setBooleanField(term939340, term939340.getClass(), "unknown", false);
        setBooleanField(term939340, term939340.getClass(), "resolved", false);
        setField(term939340, term939340.getClass(), "resolveResult", null);
        setField(term939340, term939340.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term938241;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term937643, args);
        assertTrue(recursiveEquals(term937643, term939331));
        assertTrue(recursiveEquals(term938241, term939340));
        assertTrue(recursiveEquals(retValue, false));
    }

};


