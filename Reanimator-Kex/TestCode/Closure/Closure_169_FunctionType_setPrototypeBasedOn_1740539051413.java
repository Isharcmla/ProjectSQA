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

public class FunctionType_setPrototypeBasedOn_1740539051413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376746;
     Object term377294;
     Object term377882;
     Object term377890;

    public FunctionType_setPrototypeBasedOn_1740539051413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term377899 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term377898 = ((Class) term377899).getDeclaredField((String) "INTERFACE");
        ((Field) term377898).setAccessible(true);
        Object enum634 = ((Field) term377898).get((Object) null);
        term376746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term376746, term376746.getClass(), "nativeType", false);
        setField(term376746, term376746.getClass(), "kind", enum634);
        setField(term376746, term376746.getClass(), "prototypeSlot", null);
        setField(term376746, term376746.getClass(), "source", null);
        term377294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term377294, term377294.getClass(), "className", null);
        setField(term377294, term377294.getClass(), "ownerFunction", null);
        Class<? extends Object> term378202 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term378201 = ((Class) term378202).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term378201).setAccessible(true);
        Object enum635 = ((Field) term378201).get((Object) null);
        term377882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term377883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term377886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term377882, term377882.getClass(), "call", null);
        setField(term377883, term377883.getClass(), "name", "prototype");
        setField(term377886, term377886.getClass(), "call", null);
        setField(term377886, term377886.getClass(), "prototypeSlot", null);
        setField(term377886, term377886.getClass(), "kind", null);
        setField(term377886, term377886.getClass(), "propAccess", null);
        setField(term377886, term377886.getClass(), "typeOfThis", null);
        setField(term377886, term377886.getClass(), "source", null);
        setField(term377886, term377886.getClass(), "implementedInterfaces", null);
        setField(term377886, term377886.getClass(), "extendedInterfaces", null);
        setField(term377886, term377886.getClass(), "subTypes", null);
        setField(term377886, term377886.getClass(), "templateTypeNames", null);
        setField(term377886, term377886.getClass(), "className", null);
        setField(term377886, term377886.getClass(), "properties", null);
        setBooleanField(term377886, term377886.getClass(), "nativeType", false);
        setField(term377886, term377886.getClass(), "implicitPrototypeFallback", null);
        setField(term377886, term377886.getClass(), "ownerFunction", term377882);
        setBooleanField(term377886, term377886.getClass(), "prettyPrint", false);
        setBooleanField(term377886, term377886.getClass(), "visited", false);
        setField(term377886, term377886.getClass(), "docInfo", null);
        setBooleanField(term377886, term377886.getClass(), "unknown", false);
        setBooleanField(term377886, term377886.getClass(), "resolved", false);
        setField(term377886, term377886.getClass(), "resolveResult", null);
        setBooleanField(term377886, term377886.getClass(), "inTemplatedCheckVisit", false);
        setField(term377886, term377886.getClass(), "registry", null);
        setField(term377883, term377883.getClass(), "type", term377886);
        setBooleanField(term377883, term377883.getClass(), "inferred", true);
        setField(term377883, term377883.getClass(), "propertyNode", null);
        setField(term377883, term377883.getClass(), "docInfo", null);
        setField(term377882, term377882.getClass(), "prototypeSlot", term377883);
        setField(term377882, term377882.getClass(), "kind", enum635);
        setField(term377882, term377882.getClass(), "propAccess", null);
        setField(term377882, term377882.getClass(), "typeOfThis", null);
        setField(term377882, term377882.getClass(), "source", null);
        setField(term377882, term377882.getClass(), "implementedInterfaces", null);
        setField(term377882, term377882.getClass(), "extendedInterfaces", null);
        setField(term377882, term377882.getClass(), "subTypes", null);
        setField(term377882, term377882.getClass(), "templateTypeNames", null);
        setField(term377882, term377882.getClass(), "className", null);
        setField(term377882, term377882.getClass(), "properties", null);
        setBooleanField(term377882, term377882.getClass(), "nativeType", false);
        setField(term377882, term377882.getClass(), "implicitPrototypeFallback", null);
        setField(term377882, term377882.getClass(), "ownerFunction", null);
        setBooleanField(term377882, term377882.getClass(), "prettyPrint", false);
        setBooleanField(term377882, term377882.getClass(), "visited", false);
        setField(term377882, term377882.getClass(), "docInfo", null);
        setBooleanField(term377882, term377882.getClass(), "unknown", false);
        setBooleanField(term377882, term377882.getClass(), "resolved", false);
        setField(term377882, term377882.getClass(), "resolveResult", null);
        setBooleanField(term377882, term377882.getClass(), "inTemplatedCheckVisit", false);
        setField(term377882, term377882.getClass(), "registry", null);
        Class<? extends Object> term378511 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term378510 = ((Class) term378511).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term378510).setAccessible(true);
        Object enum636 = ((Field) term378510).get((Object) null);
        term377890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term377891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term377892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term377890, term377890.getClass(), "call", null);
        setField(term377890, term377890.getClass(), "prototypeSlot", null);
        setField(term377890, term377890.getClass(), "kind", null);
        setField(term377890, term377890.getClass(), "propAccess", null);
        setField(term377890, term377890.getClass(), "typeOfThis", null);
        setField(term377890, term377890.getClass(), "source", null);
        setField(term377890, term377890.getClass(), "implementedInterfaces", null);
        setField(term377890, term377890.getClass(), "extendedInterfaces", null);
        setField(term377890, term377890.getClass(), "subTypes", null);
        setField(term377890, term377890.getClass(), "templateTypeNames", null);
        setField(term377890, term377890.getClass(), "className", null);
        setField(term377890, term377890.getClass(), "properties", null);
        setBooleanField(term377890, term377890.getClass(), "nativeType", false);
        setField(term377890, term377890.getClass(), "implicitPrototypeFallback", null);
        setField(term377891, term377891.getClass(), "call", null);
        setField(term377892, term377892.getClass(), "name", "prototype");
        setField(term377892, term377892.getClass(), "type", term377890);
        setBooleanField(term377892, term377892.getClass(), "inferred", true);
        setField(term377892, term377892.getClass(), "propertyNode", null);
        setField(term377892, term377892.getClass(), "docInfo", null);
        setField(term377891, term377891.getClass(), "prototypeSlot", term377892);
        setField(term377891, term377891.getClass(), "kind", enum636);
        setField(term377891, term377891.getClass(), "propAccess", null);
        setField(term377891, term377891.getClass(), "typeOfThis", null);
        setField(term377891, term377891.getClass(), "source", null);
        setField(term377891, term377891.getClass(), "implementedInterfaces", null);
        setField(term377891, term377891.getClass(), "extendedInterfaces", null);
        setField(term377891, term377891.getClass(), "subTypes", null);
        setField(term377891, term377891.getClass(), "templateTypeNames", null);
        setField(term377891, term377891.getClass(), "className", null);
        setField(term377891, term377891.getClass(), "properties", null);
        setBooleanField(term377891, term377891.getClass(), "nativeType", false);
        setField(term377891, term377891.getClass(), "implicitPrototypeFallback", null);
        setField(term377891, term377891.getClass(), "ownerFunction", null);
        setBooleanField(term377891, term377891.getClass(), "prettyPrint", false);
        setBooleanField(term377891, term377891.getClass(), "visited", false);
        setField(term377891, term377891.getClass(), "docInfo", null);
        setBooleanField(term377891, term377891.getClass(), "unknown", false);
        setBooleanField(term377891, term377891.getClass(), "resolved", false);
        setField(term377891, term377891.getClass(), "resolveResult", null);
        setBooleanField(term377891, term377891.getClass(), "inTemplatedCheckVisit", false);
        setField(term377891, term377891.getClass(), "registry", null);
        setField(term377890, term377890.getClass(), "ownerFunction", term377891);
        setBooleanField(term377890, term377890.getClass(), "prettyPrint", false);
        setBooleanField(term377890, term377890.getClass(), "visited", false);
        setField(term377890, term377890.getClass(), "docInfo", null);
        setBooleanField(term377890, term377890.getClass(), "unknown", false);
        setBooleanField(term377890, term377890.getClass(), "resolved", false);
        setField(term377890, term377890.getClass(), "resolveResult", null);
        setBooleanField(term377890, term377890.getClass(), "inTemplatedCheckVisit", false);
        setField(term377890, term377890.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term377294;
        args[1] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term376746, args);
        assertTrue(recursiveEquals(term376746, term377882));
        assertTrue(recursiveEquals(term377294, term377890));
    }

};


