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

public class FunctionType_setPrototypeBasedOn_1012666130570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548481;
     Object term549013;
     Object term549445;
     Object term549453;

    public FunctionType_setPrototypeBasedOn_1012666130570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term549462 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term549461 = ((Class) term549462).getDeclaredField((String) "ORDINARY");
        ((Field) term549461).setAccessible(true);
        Object enum897 = ((Field) term549461).get((Object) null);
        term548481 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term548481, term548481.getClass(), "nativeType", false);
        setField(term548481, term548481.getClass(), "kind", enum897);
        setField(term548481, term548481.getClass(), "prototypeSlot", null);
        setField(term548481, term548481.getClass(), "source", null);
        term549013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term549013, term549013.getClass(), "className", null);
        setField(term549013, term549013.getClass(), "ownerFunction", null);
        Class<? extends Object> term549762 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term549761 = ((Class) term549762).getDeclaredField((String) "ORDINARY");
        ((Field) term549761).setAccessible(true);
        Object enum898 = ((Field) term549761).get((Object) null);
        term549445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term549446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term549449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term549445, term549445.getClass(), "call", null);
        setField(term549446, term549446.getClass(), "name", "prototype");
        setField(term549449, term549449.getClass(), "call", null);
        setField(term549449, term549449.getClass(), "prototypeSlot", null);
        setField(term549449, term549449.getClass(), "kind", null);
        setField(term549449, term549449.getClass(), "propAccess", null);
        setField(term549449, term549449.getClass(), "typeOfThis", null);
        setField(term549449, term549449.getClass(), "source", null);
        setField(term549449, term549449.getClass(), "implementedInterfaces", null);
        setField(term549449, term549449.getClass(), "extendedInterfaces", null);
        setField(term549449, term549449.getClass(), "subTypes", null);
        setField(term549449, term549449.getClass(), "templateTypeNames", null);
        setField(term549449, term549449.getClass(), "className", null);
        setField(term549449, term549449.getClass(), "properties", null);
        setBooleanField(term549449, term549449.getClass(), "nativeType", false);
        setField(term549449, term549449.getClass(), "implicitPrototypeFallback", null);
        setField(term549449, term549449.getClass(), "ownerFunction", term549445);
        setBooleanField(term549449, term549449.getClass(), "prettyPrint", false);
        setBooleanField(term549449, term549449.getClass(), "visited", false);
        setField(term549449, term549449.getClass(), "docInfo", null);
        setBooleanField(term549449, term549449.getClass(), "unknown", false);
        setBooleanField(term549449, term549449.getClass(), "resolved", false);
        setField(term549449, term549449.getClass(), "resolveResult", null);
        setBooleanField(term549449, term549449.getClass(), "inTemplatedCheckVisit", false);
        setField(term549449, term549449.getClass(), "registry", null);
        setField(term549446, term549446.getClass(), "type", term549449);
        setBooleanField(term549446, term549446.getClass(), "inferred", true);
        setField(term549446, term549446.getClass(), "propertyNode", null);
        setField(term549446, term549446.getClass(), "docInfo", null);
        setField(term549445, term549445.getClass(), "prototypeSlot", term549446);
        setField(term549445, term549445.getClass(), "kind", enum898);
        setField(term549445, term549445.getClass(), "propAccess", null);
        setField(term549445, term549445.getClass(), "typeOfThis", null);
        setField(term549445, term549445.getClass(), "source", null);
        setField(term549445, term549445.getClass(), "implementedInterfaces", null);
        setField(term549445, term549445.getClass(), "extendedInterfaces", null);
        setField(term549445, term549445.getClass(), "subTypes", null);
        setField(term549445, term549445.getClass(), "templateTypeNames", null);
        setField(term549445, term549445.getClass(), "className", null);
        setField(term549445, term549445.getClass(), "properties", null);
        setBooleanField(term549445, term549445.getClass(), "nativeType", false);
        setField(term549445, term549445.getClass(), "implicitPrototypeFallback", null);
        setField(term549445, term549445.getClass(), "ownerFunction", null);
        setBooleanField(term549445, term549445.getClass(), "prettyPrint", false);
        setBooleanField(term549445, term549445.getClass(), "visited", false);
        setField(term549445, term549445.getClass(), "docInfo", null);
        setBooleanField(term549445, term549445.getClass(), "unknown", false);
        setBooleanField(term549445, term549445.getClass(), "resolved", false);
        setField(term549445, term549445.getClass(), "resolveResult", null);
        setBooleanField(term549445, term549445.getClass(), "inTemplatedCheckVisit", false);
        setField(term549445, term549445.getClass(), "registry", null);
        Class<? extends Object> term550062 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term550061 = ((Class) term550062).getDeclaredField((String) "ORDINARY");
        ((Field) term550061).setAccessible(true);
        Object enum899 = ((Field) term550061).get((Object) null);
        term549453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term549454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term549455 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term549453, term549453.getClass(), "call", null);
        setField(term549453, term549453.getClass(), "prototypeSlot", null);
        setField(term549453, term549453.getClass(), "kind", null);
        setField(term549453, term549453.getClass(), "propAccess", null);
        setField(term549453, term549453.getClass(), "typeOfThis", null);
        setField(term549453, term549453.getClass(), "source", null);
        setField(term549453, term549453.getClass(), "implementedInterfaces", null);
        setField(term549453, term549453.getClass(), "extendedInterfaces", null);
        setField(term549453, term549453.getClass(), "subTypes", null);
        setField(term549453, term549453.getClass(), "templateTypeNames", null);
        setField(term549453, term549453.getClass(), "className", null);
        setField(term549453, term549453.getClass(), "properties", null);
        setBooleanField(term549453, term549453.getClass(), "nativeType", false);
        setField(term549453, term549453.getClass(), "implicitPrototypeFallback", null);
        setField(term549454, term549454.getClass(), "call", null);
        setField(term549455, term549455.getClass(), "name", "prototype");
        setField(term549455, term549455.getClass(), "type", term549453);
        setBooleanField(term549455, term549455.getClass(), "inferred", true);
        setField(term549455, term549455.getClass(), "propertyNode", null);
        setField(term549455, term549455.getClass(), "docInfo", null);
        setField(term549454, term549454.getClass(), "prototypeSlot", term549455);
        setField(term549454, term549454.getClass(), "kind", enum899);
        setField(term549454, term549454.getClass(), "propAccess", null);
        setField(term549454, term549454.getClass(), "typeOfThis", null);
        setField(term549454, term549454.getClass(), "source", null);
        setField(term549454, term549454.getClass(), "implementedInterfaces", null);
        setField(term549454, term549454.getClass(), "extendedInterfaces", null);
        setField(term549454, term549454.getClass(), "subTypes", null);
        setField(term549454, term549454.getClass(), "templateTypeNames", null);
        setField(term549454, term549454.getClass(), "className", null);
        setField(term549454, term549454.getClass(), "properties", null);
        setBooleanField(term549454, term549454.getClass(), "nativeType", false);
        setField(term549454, term549454.getClass(), "implicitPrototypeFallback", null);
        setField(term549454, term549454.getClass(), "ownerFunction", null);
        setBooleanField(term549454, term549454.getClass(), "prettyPrint", false);
        setBooleanField(term549454, term549454.getClass(), "visited", false);
        setField(term549454, term549454.getClass(), "docInfo", null);
        setBooleanField(term549454, term549454.getClass(), "unknown", false);
        setBooleanField(term549454, term549454.getClass(), "resolved", false);
        setField(term549454, term549454.getClass(), "resolveResult", null);
        setBooleanField(term549454, term549454.getClass(), "inTemplatedCheckVisit", false);
        setField(term549454, term549454.getClass(), "registry", null);
        setField(term549453, term549453.getClass(), "ownerFunction", term549454);
        setBooleanField(term549453, term549453.getClass(), "prettyPrint", false);
        setBooleanField(term549453, term549453.getClass(), "visited", false);
        setField(term549453, term549453.getClass(), "docInfo", null);
        setBooleanField(term549453, term549453.getClass(), "unknown", false);
        setBooleanField(term549453, term549453.getClass(), "resolved", false);
        setField(term549453, term549453.getClass(), "resolveResult", null);
        setBooleanField(term549453, term549453.getClass(), "inTemplatedCheckVisit", false);
        setField(term549453, term549453.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term549013;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term548481, args);
        assertTrue(recursiveEquals(term548481, term549445));
        assertTrue(recursiveEquals(term549013, term549453));
    }

};


