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

public class FunctionType_getImplementedInterfaces_281458626684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680385;
     Object term681275;

    public FunctionType_getImplementedInterfaces_281458626684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term681283 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term681282 = ((Class) term681283).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term681282).setAccessible(true);
        Object enum1118 = ((Field) term681282).get((Object) null);
        term680385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term680647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term680757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term680867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term680385, term680385.getClass(), "kind", enum1118);
        setField(term680757, term680757.getClass(), "implicitPrototypeFallback", term680867);
        setField(term680647, term680647.getClass(), "type", term680757);
        setField(term680385, term680385.getClass(), "prototypeSlot", term680647);
        Class<? extends Object> term681583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term681582 = ((Class) term681583).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term681582).setAccessible(true);
        Object enum1119 = ((Field) term681582).get((Object) null);
        term681275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term681276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term681277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term681278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term681275, term681275.getClass(), "call", null);
        setField(term681276, term681276.getClass(), "name", null);
        setField(term681277, term681277.getClass(), "call", null);
        setField(term681277, term681277.getClass(), "prototypeSlot", null);
        setField(term681277, term681277.getClass(), "kind", null);
        setField(term681277, term681277.getClass(), "propAccess", null);
        setField(term681277, term681277.getClass(), "typeOfThis", null);
        setField(term681277, term681277.getClass(), "source", null);
        setField(term681277, term681277.getClass(), "implementedInterfaces", null);
        setField(term681277, term681277.getClass(), "extendedInterfaces", null);
        setField(term681277, term681277.getClass(), "subTypes", null);
        setField(term681277, term681277.getClass(), "templateTypeNames", null);
        setField(term681277, term681277.getClass(), "className", null);
        setField(term681277, term681277.getClass(), "properties", null);
        setBooleanField(term681277, term681277.getClass(), "nativeType", false);
        setField(term681278, term681278.getClass(), "call", null);
        setField(term681278, term681278.getClass(), "prototypeSlot", null);
        setField(term681278, term681278.getClass(), "kind", null);
        setField(term681278, term681278.getClass(), "propAccess", null);
        setField(term681278, term681278.getClass(), "typeOfThis", null);
        setField(term681278, term681278.getClass(), "source", null);
        setField(term681278, term681278.getClass(), "implementedInterfaces", null);
        setField(term681278, term681278.getClass(), "extendedInterfaces", null);
        setField(term681278, term681278.getClass(), "subTypes", null);
        setField(term681278, term681278.getClass(), "templateTypeNames", null);
        setField(term681278, term681278.getClass(), "className", null);
        setField(term681278, term681278.getClass(), "properties", null);
        setBooleanField(term681278, term681278.getClass(), "nativeType", false);
        setField(term681278, term681278.getClass(), "implicitPrototypeFallback", null);
        setField(term681278, term681278.getClass(), "ownerFunction", null);
        setBooleanField(term681278, term681278.getClass(), "prettyPrint", false);
        setBooleanField(term681278, term681278.getClass(), "visited", false);
        setField(term681278, term681278.getClass(), "docInfo", null);
        setBooleanField(term681278, term681278.getClass(), "unknown", false);
        setBooleanField(term681278, term681278.getClass(), "resolved", false);
        setField(term681278, term681278.getClass(), "resolveResult", null);
        setBooleanField(term681278, term681278.getClass(), "inTemplatedCheckVisit", false);
        setField(term681278, term681278.getClass(), "registry", null);
        setField(term681277, term681277.getClass(), "implicitPrototypeFallback", term681278);
        setField(term681277, term681277.getClass(), "ownerFunction", null);
        setBooleanField(term681277, term681277.getClass(), "prettyPrint", false);
        setBooleanField(term681277, term681277.getClass(), "visited", false);
        setField(term681277, term681277.getClass(), "docInfo", null);
        setBooleanField(term681277, term681277.getClass(), "unknown", false);
        setBooleanField(term681277, term681277.getClass(), "resolved", false);
        setField(term681277, term681277.getClass(), "resolveResult", null);
        setBooleanField(term681277, term681277.getClass(), "inTemplatedCheckVisit", false);
        setField(term681277, term681277.getClass(), "registry", null);
        setField(term681276, term681276.getClass(), "type", term681277);
        setBooleanField(term681276, term681276.getClass(), "inferred", false);
        setField(term681276, term681276.getClass(), "propertyNode", null);
        setField(term681276, term681276.getClass(), "docInfo", null);
        setField(term681275, term681275.getClass(), "prototypeSlot", term681276);
        setField(term681275, term681275.getClass(), "kind", enum1119);
        setField(term681275, term681275.getClass(), "propAccess", null);
        setField(term681275, term681275.getClass(), "typeOfThis", null);
        setField(term681275, term681275.getClass(), "source", null);
        setField(term681275, term681275.getClass(), "implementedInterfaces", null);
        setField(term681275, term681275.getClass(), "extendedInterfaces", null);
        setField(term681275, term681275.getClass(), "subTypes", null);
        setField(term681275, term681275.getClass(), "templateTypeNames", null);
        setField(term681275, term681275.getClass(), "className", null);
        setField(term681275, term681275.getClass(), "properties", null);
        setBooleanField(term681275, term681275.getClass(), "nativeType", false);
        setField(term681275, term681275.getClass(), "implicitPrototypeFallback", null);
        setField(term681275, term681275.getClass(), "ownerFunction", null);
        setBooleanField(term681275, term681275.getClass(), "prettyPrint", false);
        setBooleanField(term681275, term681275.getClass(), "visited", false);
        setField(term681275, term681275.getClass(), "docInfo", null);
        setBooleanField(term681275, term681275.getClass(), "unknown", false);
        setBooleanField(term681275, term681275.getClass(), "resolved", false);
        setField(term681275, term681275.getClass(), "resolveResult", null);
        setBooleanField(term681275, term681275.getClass(), "inTemplatedCheckVisit", false);
        setField(term681275, term681275.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term680385, args);
        assertTrue(recursiveEquals(term680385, term681275));
        assertTrue(recursiveEquals(retValue, null));
    }

};


