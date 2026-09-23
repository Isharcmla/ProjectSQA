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

public class FunctionType_setPrototype_1144423633546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520590;
     Object term520848;
     Object term521383;
     Object term521391;

    public FunctionType_setPrototype_1144423633546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term521401 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term521400 = ((Class) term521401).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term521400).setAccessible(true);
        Object enum855 = ((Field) term521400).get((Object) null);
        term520590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term520590, term520590.getClass(), "kind", enum855);
        setField(term520590, term520590.getClass(), "typeOfThis", null);
        setField(term520590, term520590.getClass(), "prototypeSlot", null);
        setField(term520590, term520590.getClass(), "source", null);
        term520848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term520848, term520848.getClass(), "ownerFunction", null);
        Class<? extends Object> term521710 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term521709 = ((Class) term521710).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term521709).setAccessible(true);
        Object enum856 = ((Field) term521709).get((Object) null);
        term521383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term521384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term521387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term521383, term521383.getClass(), "call", null);
        setField(term521384, term521384.getClass(), "name", "prototype");
        setField(term521387, term521387.getClass(), "call", null);
        setField(term521387, term521387.getClass(), "prototypeSlot", null);
        setField(term521387, term521387.getClass(), "kind", null);
        setField(term521387, term521387.getClass(), "propAccess", null);
        setField(term521387, term521387.getClass(), "typeOfThis", null);
        setField(term521387, term521387.getClass(), "source", null);
        setField(term521387, term521387.getClass(), "implementedInterfaces", null);
        setField(term521387, term521387.getClass(), "extendedInterfaces", null);
        setField(term521387, term521387.getClass(), "subTypes", null);
        setField(term521387, term521387.getClass(), "templateTypeNames", null);
        setField(term521387, term521387.getClass(), "className", null);
        setField(term521387, term521387.getClass(), "properties", null);
        setBooleanField(term521387, term521387.getClass(), "nativeType", false);
        setField(term521387, term521387.getClass(), "implicitPrototypeFallback", null);
        setField(term521387, term521387.getClass(), "ownerFunction", term521383);
        setBooleanField(term521387, term521387.getClass(), "prettyPrint", false);
        setBooleanField(term521387, term521387.getClass(), "visited", false);
        setField(term521387, term521387.getClass(), "docInfo", null);
        setBooleanField(term521387, term521387.getClass(), "unknown", false);
        setBooleanField(term521387, term521387.getClass(), "resolved", false);
        setField(term521387, term521387.getClass(), "resolveResult", null);
        setBooleanField(term521387, term521387.getClass(), "inTemplatedCheckVisit", false);
        setField(term521387, term521387.getClass(), "registry", null);
        setField(term521384, term521384.getClass(), "type", term521387);
        setBooleanField(term521384, term521384.getClass(), "inferred", true);
        setField(term521384, term521384.getClass(), "propertyNode", null);
        setField(term521384, term521384.getClass(), "docInfo", null);
        setField(term521383, term521383.getClass(), "prototypeSlot", term521384);
        setField(term521383, term521383.getClass(), "kind", enum856);
        setField(term521383, term521383.getClass(), "propAccess", null);
        setField(term521383, term521383.getClass(), "typeOfThis", null);
        setField(term521383, term521383.getClass(), "source", null);
        setField(term521383, term521383.getClass(), "implementedInterfaces", null);
        setField(term521383, term521383.getClass(), "extendedInterfaces", null);
        setField(term521383, term521383.getClass(), "subTypes", null);
        setField(term521383, term521383.getClass(), "templateTypeNames", null);
        setField(term521383, term521383.getClass(), "className", null);
        setField(term521383, term521383.getClass(), "properties", null);
        setBooleanField(term521383, term521383.getClass(), "nativeType", false);
        setField(term521383, term521383.getClass(), "implicitPrototypeFallback", null);
        setField(term521383, term521383.getClass(), "ownerFunction", null);
        setBooleanField(term521383, term521383.getClass(), "prettyPrint", false);
        setBooleanField(term521383, term521383.getClass(), "visited", false);
        setField(term521383, term521383.getClass(), "docInfo", null);
        setBooleanField(term521383, term521383.getClass(), "unknown", false);
        setBooleanField(term521383, term521383.getClass(), "resolved", false);
        setField(term521383, term521383.getClass(), "resolveResult", null);
        setBooleanField(term521383, term521383.getClass(), "inTemplatedCheckVisit", false);
        setField(term521383, term521383.getClass(), "registry", null);
        Class<? extends Object> term522019 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term522018 = ((Class) term522019).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term522018).setAccessible(true);
        Object enum857 = ((Field) term522018).get((Object) null);
        term521391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term521392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term521393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term521391, term521391.getClass(), "call", null);
        setField(term521391, term521391.getClass(), "prototypeSlot", null);
        setField(term521391, term521391.getClass(), "kind", null);
        setField(term521391, term521391.getClass(), "propAccess", null);
        setField(term521391, term521391.getClass(), "typeOfThis", null);
        setField(term521391, term521391.getClass(), "source", null);
        setField(term521391, term521391.getClass(), "implementedInterfaces", null);
        setField(term521391, term521391.getClass(), "extendedInterfaces", null);
        setField(term521391, term521391.getClass(), "subTypes", null);
        setField(term521391, term521391.getClass(), "templateTypeNames", null);
        setField(term521391, term521391.getClass(), "className", null);
        setField(term521391, term521391.getClass(), "properties", null);
        setBooleanField(term521391, term521391.getClass(), "nativeType", false);
        setField(term521391, term521391.getClass(), "implicitPrototypeFallback", null);
        setField(term521392, term521392.getClass(), "call", null);
        setField(term521393, term521393.getClass(), "name", "prototype");
        setField(term521393, term521393.getClass(), "type", term521391);
        setBooleanField(term521393, term521393.getClass(), "inferred", true);
        setField(term521393, term521393.getClass(), "propertyNode", null);
        setField(term521393, term521393.getClass(), "docInfo", null);
        setField(term521392, term521392.getClass(), "prototypeSlot", term521393);
        setField(term521392, term521392.getClass(), "kind", enum857);
        setField(term521392, term521392.getClass(), "propAccess", null);
        setField(term521392, term521392.getClass(), "typeOfThis", null);
        setField(term521392, term521392.getClass(), "source", null);
        setField(term521392, term521392.getClass(), "implementedInterfaces", null);
        setField(term521392, term521392.getClass(), "extendedInterfaces", null);
        setField(term521392, term521392.getClass(), "subTypes", null);
        setField(term521392, term521392.getClass(), "templateTypeNames", null);
        setField(term521392, term521392.getClass(), "className", null);
        setField(term521392, term521392.getClass(), "properties", null);
        setBooleanField(term521392, term521392.getClass(), "nativeType", false);
        setField(term521392, term521392.getClass(), "implicitPrototypeFallback", null);
        setField(term521392, term521392.getClass(), "ownerFunction", null);
        setBooleanField(term521392, term521392.getClass(), "prettyPrint", false);
        setBooleanField(term521392, term521392.getClass(), "visited", false);
        setField(term521392, term521392.getClass(), "docInfo", null);
        setBooleanField(term521392, term521392.getClass(), "unknown", false);
        setBooleanField(term521392, term521392.getClass(), "resolved", false);
        setField(term521392, term521392.getClass(), "resolveResult", null);
        setBooleanField(term521392, term521392.getClass(), "inTemplatedCheckVisit", false);
        setField(term521392, term521392.getClass(), "registry", null);
        setField(term521391, term521391.getClass(), "ownerFunction", term521392);
        setBooleanField(term521391, term521391.getClass(), "prettyPrint", false);
        setBooleanField(term521391, term521391.getClass(), "visited", false);
        setField(term521391, term521391.getClass(), "docInfo", null);
        setBooleanField(term521391, term521391.getClass(), "unknown", false);
        setBooleanField(term521391, term521391.getClass(), "resolved", false);
        setField(term521391, term521391.getClass(), "resolveResult", null);
        setBooleanField(term521391, term521391.getClass(), "inTemplatedCheckVisit", false);
        setField(term521391, term521391.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term520848;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term520590, args);
        assertTrue(recursiveEquals(term520590, term521383));
        assertTrue(recursiveEquals(term520848, term521391));
        assertTrue(recursiveEquals(retValue, true));
    }

};


