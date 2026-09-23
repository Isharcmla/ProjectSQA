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

public class FunctionType_setPrototypeNoCheck_1402626902646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626650;
     Object term626902;
     Object term627287;
     Object term627295;

    public FunctionType_setPrototypeNoCheck_1402626902646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term627305 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term627304 = ((Class) term627305).getDeclaredField((String) "ORDINARY");
        ((Field) term627304).setAccessible(true);
        Object enum1023 = ((Field) term627304).get((Object) null);
        term626650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term626650, term626650.getClass(), "prototypeSlot", null);
        setField(term626650, term626650.getClass(), "source", null);
        setField(term626650, term626650.getClass(), "kind", enum1023);
        term626902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term626902, term626902.getClass(), "ownerFunction", null);
        Class<? extends Object> term627605 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term627604 = ((Class) term627605).getDeclaredField((String) "ORDINARY");
        ((Field) term627604).setAccessible(true);
        Object enum1024 = ((Field) term627604).get((Object) null);
        term627287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term627288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term627291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term627287, term627287.getClass(), "call", null);
        setField(term627288, term627288.getClass(), "name", "prototype");
        setField(term627291, term627291.getClass(), "call", null);
        setField(term627291, term627291.getClass(), "prototypeSlot", null);
        setField(term627291, term627291.getClass(), "kind", null);
        setField(term627291, term627291.getClass(), "propAccess", null);
        setField(term627291, term627291.getClass(), "typeOfThis", null);
        setField(term627291, term627291.getClass(), "source", null);
        setField(term627291, term627291.getClass(), "implementedInterfaces", null);
        setField(term627291, term627291.getClass(), "extendedInterfaces", null);
        setField(term627291, term627291.getClass(), "subTypes", null);
        setField(term627291, term627291.getClass(), "templateTypeNames", null);
        setField(term627291, term627291.getClass(), "className", null);
        setField(term627291, term627291.getClass(), "properties", null);
        setBooleanField(term627291, term627291.getClass(), "nativeType", false);
        setField(term627291, term627291.getClass(), "implicitPrototypeFallback", null);
        setField(term627291, term627291.getClass(), "ownerFunction", term627287);
        setBooleanField(term627291, term627291.getClass(), "prettyPrint", false);
        setBooleanField(term627291, term627291.getClass(), "visited", false);
        setField(term627291, term627291.getClass(), "docInfo", null);
        setBooleanField(term627291, term627291.getClass(), "unknown", false);
        setBooleanField(term627291, term627291.getClass(), "resolved", false);
        setField(term627291, term627291.getClass(), "resolveResult", null);
        setBooleanField(term627291, term627291.getClass(), "inTemplatedCheckVisit", false);
        setField(term627291, term627291.getClass(), "registry", null);
        setField(term627288, term627288.getClass(), "type", term627291);
        setBooleanField(term627288, term627288.getClass(), "inferred", true);
        setField(term627288, term627288.getClass(), "propertyNode", null);
        setField(term627288, term627288.getClass(), "docInfo", null);
        setField(term627287, term627287.getClass(), "prototypeSlot", term627288);
        setField(term627287, term627287.getClass(), "kind", enum1024);
        setField(term627287, term627287.getClass(), "propAccess", null);
        setField(term627287, term627287.getClass(), "typeOfThis", null);
        setField(term627287, term627287.getClass(), "source", null);
        setField(term627287, term627287.getClass(), "implementedInterfaces", null);
        setField(term627287, term627287.getClass(), "extendedInterfaces", null);
        setField(term627287, term627287.getClass(), "subTypes", null);
        setField(term627287, term627287.getClass(), "templateTypeNames", null);
        setField(term627287, term627287.getClass(), "className", null);
        setField(term627287, term627287.getClass(), "properties", null);
        setBooleanField(term627287, term627287.getClass(), "nativeType", false);
        setField(term627287, term627287.getClass(), "implicitPrototypeFallback", null);
        setField(term627287, term627287.getClass(), "ownerFunction", null);
        setBooleanField(term627287, term627287.getClass(), "prettyPrint", false);
        setBooleanField(term627287, term627287.getClass(), "visited", false);
        setField(term627287, term627287.getClass(), "docInfo", null);
        setBooleanField(term627287, term627287.getClass(), "unknown", false);
        setBooleanField(term627287, term627287.getClass(), "resolved", false);
        setField(term627287, term627287.getClass(), "resolveResult", null);
        setBooleanField(term627287, term627287.getClass(), "inTemplatedCheckVisit", false);
        setField(term627287, term627287.getClass(), "registry", null);
        Class<? extends Object> term627905 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term627904 = ((Class) term627905).getDeclaredField((String) "ORDINARY");
        ((Field) term627904).setAccessible(true);
        Object enum1025 = ((Field) term627904).get((Object) null);
        term627295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term627296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term627297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term627295, term627295.getClass(), "call", null);
        setField(term627295, term627295.getClass(), "prototypeSlot", null);
        setField(term627295, term627295.getClass(), "kind", null);
        setField(term627295, term627295.getClass(), "propAccess", null);
        setField(term627295, term627295.getClass(), "typeOfThis", null);
        setField(term627295, term627295.getClass(), "source", null);
        setField(term627295, term627295.getClass(), "implementedInterfaces", null);
        setField(term627295, term627295.getClass(), "extendedInterfaces", null);
        setField(term627295, term627295.getClass(), "subTypes", null);
        setField(term627295, term627295.getClass(), "templateTypeNames", null);
        setField(term627295, term627295.getClass(), "className", null);
        setField(term627295, term627295.getClass(), "properties", null);
        setBooleanField(term627295, term627295.getClass(), "nativeType", false);
        setField(term627295, term627295.getClass(), "implicitPrototypeFallback", null);
        setField(term627296, term627296.getClass(), "call", null);
        setField(term627297, term627297.getClass(), "name", "prototype");
        setField(term627297, term627297.getClass(), "type", term627295);
        setBooleanField(term627297, term627297.getClass(), "inferred", true);
        setField(term627297, term627297.getClass(), "propertyNode", null);
        setField(term627297, term627297.getClass(), "docInfo", null);
        setField(term627296, term627296.getClass(), "prototypeSlot", term627297);
        setField(term627296, term627296.getClass(), "kind", enum1025);
        setField(term627296, term627296.getClass(), "propAccess", null);
        setField(term627296, term627296.getClass(), "typeOfThis", null);
        setField(term627296, term627296.getClass(), "source", null);
        setField(term627296, term627296.getClass(), "implementedInterfaces", null);
        setField(term627296, term627296.getClass(), "extendedInterfaces", null);
        setField(term627296, term627296.getClass(), "subTypes", null);
        setField(term627296, term627296.getClass(), "templateTypeNames", null);
        setField(term627296, term627296.getClass(), "className", null);
        setField(term627296, term627296.getClass(), "properties", null);
        setBooleanField(term627296, term627296.getClass(), "nativeType", false);
        setField(term627296, term627296.getClass(), "implicitPrototypeFallback", null);
        setField(term627296, term627296.getClass(), "ownerFunction", null);
        setBooleanField(term627296, term627296.getClass(), "prettyPrint", false);
        setBooleanField(term627296, term627296.getClass(), "visited", false);
        setField(term627296, term627296.getClass(), "docInfo", null);
        setBooleanField(term627296, term627296.getClass(), "unknown", false);
        setBooleanField(term627296, term627296.getClass(), "resolved", false);
        setField(term627296, term627296.getClass(), "resolveResult", null);
        setBooleanField(term627296, term627296.getClass(), "inTemplatedCheckVisit", false);
        setField(term627296, term627296.getClass(), "registry", null);
        setField(term627295, term627295.getClass(), "ownerFunction", term627296);
        setBooleanField(term627295, term627295.getClass(), "prettyPrint", false);
        setBooleanField(term627295, term627295.getClass(), "visited", false);
        setField(term627295, term627295.getClass(), "docInfo", null);
        setBooleanField(term627295, term627295.getClass(), "unknown", false);
        setBooleanField(term627295, term627295.getClass(), "resolved", false);
        setField(term627295, term627295.getClass(), "resolveResult", null);
        setBooleanField(term627295, term627295.getClass(), "inTemplatedCheckVisit", false);
        setField(term627295, term627295.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term626902;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term626650, args);
        assertTrue(recursiveEquals(term626650, term627287));
        assertTrue(recursiveEquals(term626902, term627295));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


