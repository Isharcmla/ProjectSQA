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

public class FunctionType_setPrototypeNoCheck_1402626902634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609296;
     Object term609662;
     Object term610187;
     Object term610195;

    public FunctionType_setPrototypeNoCheck_1402626902634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term610205 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term610204 = ((Class) term610205).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term610204).setAccessible(true);
        Object enum991 = ((Field) term610204).get((Object) null);
        term609296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term609410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term609410, term609410.getClass(), "type", null);
        setField(term609296, term609296.getClass(), "prototypeSlot", term609410);
        setField(term609296, term609296.getClass(), "source", null);
        setField(term609296, term609296.getClass(), "kind", enum991);
        term609662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term609662, term609662.getClass(), "ownerFunction", null);
        Class<? extends Object> term610514 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term610513 = ((Class) term610514).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term610513).setAccessible(true);
        Object enum992 = ((Field) term610513).get((Object) null);
        term610187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term610188 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term610191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term610187, term610187.getClass(), "call", null);
        setField(term610188, term610188.getClass(), "name", "prototype");
        setField(term610191, term610191.getClass(), "call", null);
        setField(term610191, term610191.getClass(), "prototypeSlot", null);
        setField(term610191, term610191.getClass(), "kind", null);
        setField(term610191, term610191.getClass(), "propAccess", null);
        setField(term610191, term610191.getClass(), "typeOfThis", null);
        setField(term610191, term610191.getClass(), "source", null);
        setField(term610191, term610191.getClass(), "implementedInterfaces", null);
        setField(term610191, term610191.getClass(), "extendedInterfaces", null);
        setField(term610191, term610191.getClass(), "subTypes", null);
        setField(term610191, term610191.getClass(), "templateTypeNames", null);
        setField(term610191, term610191.getClass(), "className", null);
        setField(term610191, term610191.getClass(), "properties", null);
        setBooleanField(term610191, term610191.getClass(), "nativeType", false);
        setField(term610191, term610191.getClass(), "implicitPrototypeFallback", null);
        setField(term610191, term610191.getClass(), "ownerFunction", term610187);
        setBooleanField(term610191, term610191.getClass(), "prettyPrint", false);
        setBooleanField(term610191, term610191.getClass(), "visited", false);
        setField(term610191, term610191.getClass(), "docInfo", null);
        setBooleanField(term610191, term610191.getClass(), "unknown", false);
        setBooleanField(term610191, term610191.getClass(), "resolved", false);
        setField(term610191, term610191.getClass(), "resolveResult", null);
        setBooleanField(term610191, term610191.getClass(), "inTemplatedCheckVisit", false);
        setField(term610191, term610191.getClass(), "registry", null);
        setField(term610188, term610188.getClass(), "type", term610191);
        setBooleanField(term610188, term610188.getClass(), "inferred", true);
        setField(term610188, term610188.getClass(), "propertyNode", null);
        setField(term610188, term610188.getClass(), "docInfo", null);
        setField(term610187, term610187.getClass(), "prototypeSlot", term610188);
        setField(term610187, term610187.getClass(), "kind", enum992);
        setField(term610187, term610187.getClass(), "propAccess", null);
        setField(term610187, term610187.getClass(), "typeOfThis", null);
        setField(term610187, term610187.getClass(), "source", null);
        setField(term610187, term610187.getClass(), "implementedInterfaces", null);
        setField(term610187, term610187.getClass(), "extendedInterfaces", null);
        setField(term610187, term610187.getClass(), "subTypes", null);
        setField(term610187, term610187.getClass(), "templateTypeNames", null);
        setField(term610187, term610187.getClass(), "className", null);
        setField(term610187, term610187.getClass(), "properties", null);
        setBooleanField(term610187, term610187.getClass(), "nativeType", false);
        setField(term610187, term610187.getClass(), "implicitPrototypeFallback", null);
        setField(term610187, term610187.getClass(), "ownerFunction", null);
        setBooleanField(term610187, term610187.getClass(), "prettyPrint", false);
        setBooleanField(term610187, term610187.getClass(), "visited", false);
        setField(term610187, term610187.getClass(), "docInfo", null);
        setBooleanField(term610187, term610187.getClass(), "unknown", false);
        setBooleanField(term610187, term610187.getClass(), "resolved", false);
        setField(term610187, term610187.getClass(), "resolveResult", null);
        setBooleanField(term610187, term610187.getClass(), "inTemplatedCheckVisit", false);
        setField(term610187, term610187.getClass(), "registry", null);
        Class<? extends Object> term610823 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term610822 = ((Class) term610823).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term610822).setAccessible(true);
        Object enum993 = ((Field) term610822).get((Object) null);
        term610195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term610196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term610197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term610195, term610195.getClass(), "call", null);
        setField(term610195, term610195.getClass(), "prototypeSlot", null);
        setField(term610195, term610195.getClass(), "kind", null);
        setField(term610195, term610195.getClass(), "propAccess", null);
        setField(term610195, term610195.getClass(), "typeOfThis", null);
        setField(term610195, term610195.getClass(), "source", null);
        setField(term610195, term610195.getClass(), "implementedInterfaces", null);
        setField(term610195, term610195.getClass(), "extendedInterfaces", null);
        setField(term610195, term610195.getClass(), "subTypes", null);
        setField(term610195, term610195.getClass(), "templateTypeNames", null);
        setField(term610195, term610195.getClass(), "className", null);
        setField(term610195, term610195.getClass(), "properties", null);
        setBooleanField(term610195, term610195.getClass(), "nativeType", false);
        setField(term610195, term610195.getClass(), "implicitPrototypeFallback", null);
        setField(term610196, term610196.getClass(), "call", null);
        setField(term610197, term610197.getClass(), "name", "prototype");
        setField(term610197, term610197.getClass(), "type", term610195);
        setBooleanField(term610197, term610197.getClass(), "inferred", true);
        setField(term610197, term610197.getClass(), "propertyNode", null);
        setField(term610197, term610197.getClass(), "docInfo", null);
        setField(term610196, term610196.getClass(), "prototypeSlot", term610197);
        setField(term610196, term610196.getClass(), "kind", enum993);
        setField(term610196, term610196.getClass(), "propAccess", null);
        setField(term610196, term610196.getClass(), "typeOfThis", null);
        setField(term610196, term610196.getClass(), "source", null);
        setField(term610196, term610196.getClass(), "implementedInterfaces", null);
        setField(term610196, term610196.getClass(), "extendedInterfaces", null);
        setField(term610196, term610196.getClass(), "subTypes", null);
        setField(term610196, term610196.getClass(), "templateTypeNames", null);
        setField(term610196, term610196.getClass(), "className", null);
        setField(term610196, term610196.getClass(), "properties", null);
        setBooleanField(term610196, term610196.getClass(), "nativeType", false);
        setField(term610196, term610196.getClass(), "implicitPrototypeFallback", null);
        setField(term610196, term610196.getClass(), "ownerFunction", null);
        setBooleanField(term610196, term610196.getClass(), "prettyPrint", false);
        setBooleanField(term610196, term610196.getClass(), "visited", false);
        setField(term610196, term610196.getClass(), "docInfo", null);
        setBooleanField(term610196, term610196.getClass(), "unknown", false);
        setBooleanField(term610196, term610196.getClass(), "resolved", false);
        setField(term610196, term610196.getClass(), "resolveResult", null);
        setBooleanField(term610196, term610196.getClass(), "inTemplatedCheckVisit", false);
        setField(term610196, term610196.getClass(), "registry", null);
        setField(term610195, term610195.getClass(), "ownerFunction", term610196);
        setBooleanField(term610195, term610195.getClass(), "prettyPrint", false);
        setBooleanField(term610195, term610195.getClass(), "visited", false);
        setField(term610195, term610195.getClass(), "docInfo", null);
        setBooleanField(term610195, term610195.getClass(), "unknown", false);
        setBooleanField(term610195, term610195.getClass(), "resolved", false);
        setField(term610195, term610195.getClass(), "resolveResult", null);
        setBooleanField(term610195, term610195.getClass(), "inTemplatedCheckVisit", false);
        setField(term610195, term610195.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term609662;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term609296, args);
        assertTrue(recursiveEquals(term609296, term610187));
        assertTrue(recursiveEquals(term609662, term610195));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


