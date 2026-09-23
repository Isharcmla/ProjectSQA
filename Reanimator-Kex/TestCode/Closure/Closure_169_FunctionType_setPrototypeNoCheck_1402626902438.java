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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400918;
     Object term401430;
     Object term402168;
     Object term402178;

    public FunctionType_setPrototypeNoCheck_1402626902438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term402190 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term402189 = ((Class) term402190).getDeclaredField((String) "ORDINARY");
        ((Field) term402189).setAccessible(true);
        Object enum663 = ((Field) term402189).get((Object) null);
        ArrayList term401320 = new ArrayList();
        term400918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term401032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term401120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term401120, term401120.getClass(), "ownerFunction", term400918);
        setField(term401032, term401032.getClass(), "type", term401120);
        setField(term400918, term400918.getClass(), "prototypeSlot", term401032);
        setField(term400918, term400918.getClass(), "source", null);
        setField(term400918, term400918.getClass(), "kind", enum663);
        setBooleanField(term400918, term400918.getClass(), "unknown", false);
        setField(term400918, term400918.getClass(), "subTypes", term401320);
        term401430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term401430, term401430.getClass(), "ownerFunction", null);
        Class<? extends Object> term402490 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term402489 = ((Class) term402490).getDeclaredField((String) "ORDINARY");
        ((Field) term402489).setAccessible(true);
        Object enum664 = ((Field) term402489).get((Object) null);
        ArrayList term402176 = new ArrayList();
        term402168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term402169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term402172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term402168, term402168.getClass(), "call", null);
        setField(term402169, term402169.getClass(), "name", "prototype");
        setField(term402172, term402172.getClass(), "call", null);
        setField(term402172, term402172.getClass(), "prototypeSlot", null);
        setField(term402172, term402172.getClass(), "kind", null);
        setField(term402172, term402172.getClass(), "propAccess", null);
        setField(term402172, term402172.getClass(), "typeOfThis", null);
        setField(term402172, term402172.getClass(), "source", null);
        setField(term402172, term402172.getClass(), "implementedInterfaces", null);
        setField(term402172, term402172.getClass(), "extendedInterfaces", null);
        setField(term402172, term402172.getClass(), "subTypes", null);
        setField(term402172, term402172.getClass(), "templateTypeNames", null);
        setField(term402172, term402172.getClass(), "className", null);
        setField(term402172, term402172.getClass(), "properties", null);
        setBooleanField(term402172, term402172.getClass(), "nativeType", false);
        setField(term402172, term402172.getClass(), "implicitPrototypeFallback", null);
        setField(term402172, term402172.getClass(), "ownerFunction", term402168);
        setBooleanField(term402172, term402172.getClass(), "prettyPrint", false);
        setBooleanField(term402172, term402172.getClass(), "visited", false);
        setField(term402172, term402172.getClass(), "docInfo", null);
        setBooleanField(term402172, term402172.getClass(), "unknown", true);
        setBooleanField(term402172, term402172.getClass(), "resolved", false);
        setField(term402172, term402172.getClass(), "resolveResult", null);
        setBooleanField(term402172, term402172.getClass(), "inTemplatedCheckVisit", false);
        setField(term402172, term402172.getClass(), "registry", null);
        setField(term402169, term402169.getClass(), "type", term402172);
        setBooleanField(term402169, term402169.getClass(), "inferred", true);
        setField(term402169, term402169.getClass(), "propertyNode", null);
        setField(term402169, term402169.getClass(), "docInfo", null);
        setField(term402168, term402168.getClass(), "prototypeSlot", term402169);
        setField(term402168, term402168.getClass(), "kind", enum664);
        setField(term402168, term402168.getClass(), "propAccess", null);
        setField(term402168, term402168.getClass(), "typeOfThis", null);
        setField(term402168, term402168.getClass(), "source", null);
        setField(term402168, term402168.getClass(), "implementedInterfaces", null);
        setField(term402168, term402168.getClass(), "extendedInterfaces", null);
        setField(term402168, term402168.getClass(), "subTypes", term402176);
        setField(term402168, term402168.getClass(), "templateTypeNames", null);
        setField(term402168, term402168.getClass(), "className", null);
        setField(term402168, term402168.getClass(), "properties", null);
        setBooleanField(term402168, term402168.getClass(), "nativeType", false);
        setField(term402168, term402168.getClass(), "implicitPrototypeFallback", null);
        setField(term402168, term402168.getClass(), "ownerFunction", null);
        setBooleanField(term402168, term402168.getClass(), "prettyPrint", false);
        setBooleanField(term402168, term402168.getClass(), "visited", false);
        setField(term402168, term402168.getClass(), "docInfo", null);
        setBooleanField(term402168, term402168.getClass(), "unknown", true);
        setBooleanField(term402168, term402168.getClass(), "resolved", false);
        setField(term402168, term402168.getClass(), "resolveResult", null);
        setBooleanField(term402168, term402168.getClass(), "inTemplatedCheckVisit", false);
        setField(term402168, term402168.getClass(), "registry", null);
        Class<? extends Object> term402790 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term402789 = ((Class) term402790).getDeclaredField((String) "ORDINARY");
        ((Field) term402789).setAccessible(true);
        Object enum665 = ((Field) term402789).get((Object) null);
        ArrayList term402186 = new ArrayList();
        term402178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term402179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term402180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term402178, term402178.getClass(), "call", null);
        setField(term402178, term402178.getClass(), "prototypeSlot", null);
        setField(term402178, term402178.getClass(), "kind", null);
        setField(term402178, term402178.getClass(), "propAccess", null);
        setField(term402178, term402178.getClass(), "typeOfThis", null);
        setField(term402178, term402178.getClass(), "source", null);
        setField(term402178, term402178.getClass(), "implementedInterfaces", null);
        setField(term402178, term402178.getClass(), "extendedInterfaces", null);
        setField(term402178, term402178.getClass(), "subTypes", null);
        setField(term402178, term402178.getClass(), "templateTypeNames", null);
        setField(term402178, term402178.getClass(), "className", null);
        setField(term402178, term402178.getClass(), "properties", null);
        setBooleanField(term402178, term402178.getClass(), "nativeType", false);
        setField(term402178, term402178.getClass(), "implicitPrototypeFallback", null);
        setField(term402179, term402179.getClass(), "call", null);
        setField(term402180, term402180.getClass(), "name", "prototype");
        setField(term402180, term402180.getClass(), "type", term402178);
        setBooleanField(term402180, term402180.getClass(), "inferred", true);
        setField(term402180, term402180.getClass(), "propertyNode", null);
        setField(term402180, term402180.getClass(), "docInfo", null);
        setField(term402179, term402179.getClass(), "prototypeSlot", term402180);
        setField(term402179, term402179.getClass(), "kind", enum665);
        setField(term402179, term402179.getClass(), "propAccess", null);
        setField(term402179, term402179.getClass(), "typeOfThis", null);
        setField(term402179, term402179.getClass(), "source", null);
        setField(term402179, term402179.getClass(), "implementedInterfaces", null);
        setField(term402179, term402179.getClass(), "extendedInterfaces", null);
        setField(term402179, term402179.getClass(), "subTypes", term402186);
        setField(term402179, term402179.getClass(), "templateTypeNames", null);
        setField(term402179, term402179.getClass(), "className", null);
        setField(term402179, term402179.getClass(), "properties", null);
        setBooleanField(term402179, term402179.getClass(), "nativeType", false);
        setField(term402179, term402179.getClass(), "implicitPrototypeFallback", null);
        setField(term402179, term402179.getClass(), "ownerFunction", null);
        setBooleanField(term402179, term402179.getClass(), "prettyPrint", false);
        setBooleanField(term402179, term402179.getClass(), "visited", false);
        setField(term402179, term402179.getClass(), "docInfo", null);
        setBooleanField(term402179, term402179.getClass(), "unknown", true);
        setBooleanField(term402179, term402179.getClass(), "resolved", false);
        setField(term402179, term402179.getClass(), "resolveResult", null);
        setBooleanField(term402179, term402179.getClass(), "inTemplatedCheckVisit", false);
        setField(term402179, term402179.getClass(), "registry", null);
        setField(term402178, term402178.getClass(), "ownerFunction", term402179);
        setBooleanField(term402178, term402178.getClass(), "prettyPrint", false);
        setBooleanField(term402178, term402178.getClass(), "visited", false);
        setField(term402178, term402178.getClass(), "docInfo", null);
        setBooleanField(term402178, term402178.getClass(), "unknown", true);
        setBooleanField(term402178, term402178.getClass(), "resolved", false);
        setField(term402178, term402178.getClass(), "resolveResult", null);
        setBooleanField(term402178, term402178.getClass(), "inTemplatedCheckVisit", false);
        setField(term402178, term402178.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term401430;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term400918, args);
        assertTrue(recursiveEquals(term400918, term402168));
        assertTrue(recursiveEquals(term401430, term402178));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


