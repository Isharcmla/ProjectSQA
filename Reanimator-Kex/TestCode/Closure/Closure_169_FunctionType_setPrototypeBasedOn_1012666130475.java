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

public class FunctionType_setPrototypeBasedOn_1012666130475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438491;
     Object term438779;
     Object term439383;
     Object term439393;

    public FunctionType_setPrototypeBasedOn_1012666130475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term439404 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term439403 = ((Class) term439404).getDeclaredField((String) "INTERFACE");
        ((Field) term439403).setAccessible(true);
        Object enum722 = ((Field) term439403).get((Object) null);
        ArrayList term438691 = new ArrayList();
        term438491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term438491, term438491.getClass(), "nativeType", false);
        setField(term438491, term438491.getClass(), "kind", enum722);
        setField(term438491, term438491.getClass(), "prototypeSlot", null);
        setField(term438491, term438491.getClass(), "source", null);
        setField(term438491, term438491.getClass(), "extendedInterfaces", term438691);
        term438779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term438779, term438779.getClass(), "className", null);
        setField(term438779, term438779.getClass(), "ownerFunction", null);
        Class<? extends Object> term439707 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term439706 = ((Class) term439707).getDeclaredField((String) "INTERFACE");
        ((Field) term439706).setAccessible(true);
        Object enum723 = ((Field) term439706).get((Object) null);
        ArrayList term439391 = new ArrayList();
        term439383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term439384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term439387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term439383, term439383.getClass(), "call", null);
        setField(term439384, term439384.getClass(), "name", "prototype");
        setField(term439387, term439387.getClass(), "call", null);
        setField(term439387, term439387.getClass(), "prototypeSlot", null);
        setField(term439387, term439387.getClass(), "kind", null);
        setField(term439387, term439387.getClass(), "propAccess", null);
        setField(term439387, term439387.getClass(), "typeOfThis", null);
        setField(term439387, term439387.getClass(), "source", null);
        setField(term439387, term439387.getClass(), "implementedInterfaces", null);
        setField(term439387, term439387.getClass(), "extendedInterfaces", null);
        setField(term439387, term439387.getClass(), "subTypes", null);
        setField(term439387, term439387.getClass(), "templateTypeNames", null);
        setField(term439387, term439387.getClass(), "className", null);
        setField(term439387, term439387.getClass(), "properties", null);
        setBooleanField(term439387, term439387.getClass(), "nativeType", false);
        setField(term439387, term439387.getClass(), "implicitPrototypeFallback", null);
        setField(term439387, term439387.getClass(), "ownerFunction", term439383);
        setBooleanField(term439387, term439387.getClass(), "prettyPrint", false);
        setBooleanField(term439387, term439387.getClass(), "visited", false);
        setField(term439387, term439387.getClass(), "docInfo", null);
        setBooleanField(term439387, term439387.getClass(), "unknown", false);
        setBooleanField(term439387, term439387.getClass(), "resolved", false);
        setField(term439387, term439387.getClass(), "resolveResult", null);
        setBooleanField(term439387, term439387.getClass(), "inTemplatedCheckVisit", false);
        setField(term439387, term439387.getClass(), "registry", null);
        setField(term439384, term439384.getClass(), "type", term439387);
        setBooleanField(term439384, term439384.getClass(), "inferred", true);
        setField(term439384, term439384.getClass(), "propertyNode", null);
        setField(term439384, term439384.getClass(), "docInfo", null);
        setField(term439383, term439383.getClass(), "prototypeSlot", term439384);
        setField(term439383, term439383.getClass(), "kind", enum723);
        setField(term439383, term439383.getClass(), "propAccess", null);
        setField(term439383, term439383.getClass(), "typeOfThis", null);
        setField(term439383, term439383.getClass(), "source", null);
        setField(term439383, term439383.getClass(), "implementedInterfaces", null);
        setField(term439383, term439383.getClass(), "extendedInterfaces", term439391);
        setField(term439383, term439383.getClass(), "subTypes", null);
        setField(term439383, term439383.getClass(), "templateTypeNames", null);
        setField(term439383, term439383.getClass(), "className", null);
        setField(term439383, term439383.getClass(), "properties", null);
        setBooleanField(term439383, term439383.getClass(), "nativeType", false);
        setField(term439383, term439383.getClass(), "implicitPrototypeFallback", null);
        setField(term439383, term439383.getClass(), "ownerFunction", null);
        setBooleanField(term439383, term439383.getClass(), "prettyPrint", false);
        setBooleanField(term439383, term439383.getClass(), "visited", false);
        setField(term439383, term439383.getClass(), "docInfo", null);
        setBooleanField(term439383, term439383.getClass(), "unknown", false);
        setBooleanField(term439383, term439383.getClass(), "resolved", false);
        setField(term439383, term439383.getClass(), "resolveResult", null);
        setBooleanField(term439383, term439383.getClass(), "inTemplatedCheckVisit", false);
        setField(term439383, term439383.getClass(), "registry", null);
        Class<? extends Object> term440010 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term440009 = ((Class) term440010).getDeclaredField((String) "INTERFACE");
        ((Field) term440009).setAccessible(true);
        Object enum724 = ((Field) term440009).get((Object) null);
        ArrayList term439401 = new ArrayList();
        term439393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term439394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term439395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term439393, term439393.getClass(), "call", null);
        setField(term439393, term439393.getClass(), "prototypeSlot", null);
        setField(term439393, term439393.getClass(), "kind", null);
        setField(term439393, term439393.getClass(), "propAccess", null);
        setField(term439393, term439393.getClass(), "typeOfThis", null);
        setField(term439393, term439393.getClass(), "source", null);
        setField(term439393, term439393.getClass(), "implementedInterfaces", null);
        setField(term439393, term439393.getClass(), "extendedInterfaces", null);
        setField(term439393, term439393.getClass(), "subTypes", null);
        setField(term439393, term439393.getClass(), "templateTypeNames", null);
        setField(term439393, term439393.getClass(), "className", null);
        setField(term439393, term439393.getClass(), "properties", null);
        setBooleanField(term439393, term439393.getClass(), "nativeType", false);
        setField(term439393, term439393.getClass(), "implicitPrototypeFallback", null);
        setField(term439394, term439394.getClass(), "call", null);
        setField(term439395, term439395.getClass(), "name", "prototype");
        setField(term439395, term439395.getClass(), "type", term439393);
        setBooleanField(term439395, term439395.getClass(), "inferred", true);
        setField(term439395, term439395.getClass(), "propertyNode", null);
        setField(term439395, term439395.getClass(), "docInfo", null);
        setField(term439394, term439394.getClass(), "prototypeSlot", term439395);
        setField(term439394, term439394.getClass(), "kind", enum724);
        setField(term439394, term439394.getClass(), "propAccess", null);
        setField(term439394, term439394.getClass(), "typeOfThis", null);
        setField(term439394, term439394.getClass(), "source", null);
        setField(term439394, term439394.getClass(), "implementedInterfaces", null);
        setField(term439394, term439394.getClass(), "extendedInterfaces", term439401);
        setField(term439394, term439394.getClass(), "subTypes", null);
        setField(term439394, term439394.getClass(), "templateTypeNames", null);
        setField(term439394, term439394.getClass(), "className", null);
        setField(term439394, term439394.getClass(), "properties", null);
        setBooleanField(term439394, term439394.getClass(), "nativeType", false);
        setField(term439394, term439394.getClass(), "implicitPrototypeFallback", null);
        setField(term439394, term439394.getClass(), "ownerFunction", null);
        setBooleanField(term439394, term439394.getClass(), "prettyPrint", false);
        setBooleanField(term439394, term439394.getClass(), "visited", false);
        setField(term439394, term439394.getClass(), "docInfo", null);
        setBooleanField(term439394, term439394.getClass(), "unknown", false);
        setBooleanField(term439394, term439394.getClass(), "resolved", false);
        setField(term439394, term439394.getClass(), "resolveResult", null);
        setBooleanField(term439394, term439394.getClass(), "inTemplatedCheckVisit", false);
        setField(term439394, term439394.getClass(), "registry", null);
        setField(term439393, term439393.getClass(), "ownerFunction", term439394);
        setBooleanField(term439393, term439393.getClass(), "prettyPrint", false);
        setBooleanField(term439393, term439393.getClass(), "visited", false);
        setField(term439393, term439393.getClass(), "docInfo", null);
        setBooleanField(term439393, term439393.getClass(), "unknown", false);
        setBooleanField(term439393, term439393.getClass(), "resolved", false);
        setField(term439393, term439393.getClass(), "resolveResult", null);
        setBooleanField(term439393, term439393.getClass(), "inTemplatedCheckVisit", false);
        setField(term439393, term439393.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term438779;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term438491, args);
        assertTrue(recursiveEquals(term438491, term439383));
        assertTrue(recursiveEquals(term438779, term439393));
    }

};


