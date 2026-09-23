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
import java.util.ArrayList;

public class FunctionType_setPrototypeBasedOn_1012666130588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563252;
     Object term563556;
     Object term564152;
     Object term564162;

    public FunctionType_setPrototypeBasedOn_1012666130588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term564173 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term564172 = ((Class) term564173).getDeclaredField((String) "INTERFACE");
        ((Field) term564172).setAccessible(true);
        Object enum921 = ((Field) term564172).get((Object) null);
        ArrayList term563452 = new ArrayList();
        term563252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term563252, term563252.getClass(), "nativeType", false);
        setField(term563252, term563252.getClass(), "kind", enum921);
        setField(term563252, term563252.getClass(), "prototypeSlot", null);
        setField(term563252, term563252.getClass(), "source", null);
        setField(term563252, term563252.getClass(), "extendedInterfaces", term563452);
        term563556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term563556, term563556.getClass(), "className", null);
        setField(term563556, term563556.getClass(), "ownerFunction", null);
        Class<? extends Object> term564476 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term564475 = ((Class) term564476).getDeclaredField((String) "INTERFACE");
        ((Field) term564475).setAccessible(true);
        Object enum922 = ((Field) term564475).get((Object) null);
        ArrayList term564160 = new ArrayList();
        term564152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term564153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term564156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term564152, term564152.getClass(), "call", null);
        setField(term564153, term564153.getClass(), "name", "prototype");
        setField(term564156, term564156.getClass(), "call", null);
        setField(term564156, term564156.getClass(), "prototypeSlot", null);
        setField(term564156, term564156.getClass(), "kind", null);
        setField(term564156, term564156.getClass(), "propAccess", null);
        setField(term564156, term564156.getClass(), "typeOfThis", null);
        setField(term564156, term564156.getClass(), "source", null);
        setField(term564156, term564156.getClass(), "implementedInterfaces", null);
        setField(term564156, term564156.getClass(), "extendedInterfaces", null);
        setField(term564156, term564156.getClass(), "subTypes", null);
        setField(term564156, term564156.getClass(), "templateTypeNames", null);
        setField(term564156, term564156.getClass(), "className", null);
        setField(term564156, term564156.getClass(), "properties", null);
        setBooleanField(term564156, term564156.getClass(), "nativeType", false);
        setField(term564156, term564156.getClass(), "implicitPrototypeFallback", null);
        setField(term564156, term564156.getClass(), "ownerFunction", term564152);
        setBooleanField(term564156, term564156.getClass(), "prettyPrint", false);
        setBooleanField(term564156, term564156.getClass(), "visited", false);
        setField(term564156, term564156.getClass(), "docInfo", null);
        setBooleanField(term564156, term564156.getClass(), "unknown", false);
        setBooleanField(term564156, term564156.getClass(), "resolved", false);
        setField(term564156, term564156.getClass(), "resolveResult", null);
        setBooleanField(term564156, term564156.getClass(), "inTemplatedCheckVisit", false);
        setField(term564156, term564156.getClass(), "registry", null);
        setField(term564153, term564153.getClass(), "type", term564156);
        setBooleanField(term564153, term564153.getClass(), "inferred", true);
        setField(term564153, term564153.getClass(), "propertyNode", null);
        setField(term564153, term564153.getClass(), "docInfo", null);
        setField(term564152, term564152.getClass(), "prototypeSlot", term564153);
        setField(term564152, term564152.getClass(), "kind", enum922);
        setField(term564152, term564152.getClass(), "propAccess", null);
        setField(term564152, term564152.getClass(), "typeOfThis", null);
        setField(term564152, term564152.getClass(), "source", null);
        setField(term564152, term564152.getClass(), "implementedInterfaces", null);
        setField(term564152, term564152.getClass(), "extendedInterfaces", term564160);
        setField(term564152, term564152.getClass(), "subTypes", null);
        setField(term564152, term564152.getClass(), "templateTypeNames", null);
        setField(term564152, term564152.getClass(), "className", null);
        setField(term564152, term564152.getClass(), "properties", null);
        setBooleanField(term564152, term564152.getClass(), "nativeType", false);
        setField(term564152, term564152.getClass(), "implicitPrototypeFallback", null);
        setField(term564152, term564152.getClass(), "ownerFunction", null);
        setBooleanField(term564152, term564152.getClass(), "prettyPrint", false);
        setBooleanField(term564152, term564152.getClass(), "visited", false);
        setField(term564152, term564152.getClass(), "docInfo", null);
        setBooleanField(term564152, term564152.getClass(), "unknown", false);
        setBooleanField(term564152, term564152.getClass(), "resolved", false);
        setField(term564152, term564152.getClass(), "resolveResult", null);
        setBooleanField(term564152, term564152.getClass(), "inTemplatedCheckVisit", false);
        setField(term564152, term564152.getClass(), "registry", null);
        Class<? extends Object> term564779 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term564778 = ((Class) term564779).getDeclaredField((String) "INTERFACE");
        ((Field) term564778).setAccessible(true);
        Object enum923 = ((Field) term564778).get((Object) null);
        ArrayList term564170 = new ArrayList();
        term564162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term564163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term564164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term564162, term564162.getClass(), "call", null);
        setField(term564162, term564162.getClass(), "prototypeSlot", null);
        setField(term564162, term564162.getClass(), "kind", null);
        setField(term564162, term564162.getClass(), "propAccess", null);
        setField(term564162, term564162.getClass(), "typeOfThis", null);
        setField(term564162, term564162.getClass(), "source", null);
        setField(term564162, term564162.getClass(), "implementedInterfaces", null);
        setField(term564162, term564162.getClass(), "extendedInterfaces", null);
        setField(term564162, term564162.getClass(), "subTypes", null);
        setField(term564162, term564162.getClass(), "templateTypeNames", null);
        setField(term564162, term564162.getClass(), "className", null);
        setField(term564162, term564162.getClass(), "properties", null);
        setBooleanField(term564162, term564162.getClass(), "nativeType", false);
        setField(term564162, term564162.getClass(), "implicitPrototypeFallback", null);
        setField(term564163, term564163.getClass(), "call", null);
        setField(term564164, term564164.getClass(), "name", "prototype");
        setField(term564164, term564164.getClass(), "type", term564162);
        setBooleanField(term564164, term564164.getClass(), "inferred", true);
        setField(term564164, term564164.getClass(), "propertyNode", null);
        setField(term564164, term564164.getClass(), "docInfo", null);
        setField(term564163, term564163.getClass(), "prototypeSlot", term564164);
        setField(term564163, term564163.getClass(), "kind", enum923);
        setField(term564163, term564163.getClass(), "propAccess", null);
        setField(term564163, term564163.getClass(), "typeOfThis", null);
        setField(term564163, term564163.getClass(), "source", null);
        setField(term564163, term564163.getClass(), "implementedInterfaces", null);
        setField(term564163, term564163.getClass(), "extendedInterfaces", term564170);
        setField(term564163, term564163.getClass(), "subTypes", null);
        setField(term564163, term564163.getClass(), "templateTypeNames", null);
        setField(term564163, term564163.getClass(), "className", null);
        setField(term564163, term564163.getClass(), "properties", null);
        setBooleanField(term564163, term564163.getClass(), "nativeType", false);
        setField(term564163, term564163.getClass(), "implicitPrototypeFallback", null);
        setField(term564163, term564163.getClass(), "ownerFunction", null);
        setBooleanField(term564163, term564163.getClass(), "prettyPrint", false);
        setBooleanField(term564163, term564163.getClass(), "visited", false);
        setField(term564163, term564163.getClass(), "docInfo", null);
        setBooleanField(term564163, term564163.getClass(), "unknown", false);
        setBooleanField(term564163, term564163.getClass(), "resolved", false);
        setField(term564163, term564163.getClass(), "resolveResult", null);
        setBooleanField(term564163, term564163.getClass(), "inTemplatedCheckVisit", false);
        setField(term564163, term564163.getClass(), "registry", null);
        setField(term564162, term564162.getClass(), "ownerFunction", term564163);
        setBooleanField(term564162, term564162.getClass(), "prettyPrint", false);
        setBooleanField(term564162, term564162.getClass(), "visited", false);
        setField(term564162, term564162.getClass(), "docInfo", null);
        setBooleanField(term564162, term564162.getClass(), "unknown", false);
        setBooleanField(term564162, term564162.getClass(), "resolved", false);
        setField(term564162, term564162.getClass(), "resolveResult", null);
        setBooleanField(term564162, term564162.getClass(), "inTemplatedCheckVisit", false);
        setField(term564162, term564162.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term563556;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term563252, args);
        assertTrue(recursiveEquals(term563252, term564152));
        assertTrue(recursiveEquals(term563556, term564162));
    }

};


