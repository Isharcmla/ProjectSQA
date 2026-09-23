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

public class FunctionType_setPrototype_1144423633643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622099;
     Object term622351;
     Object term624020;
     Object term624028;

    public FunctionType_setPrototype_1144423633643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term624038 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term624037 = ((Class) term624038).getDeclaredField((String) "ORDINARY");
        ((Field) term624037).setAccessible(true);
        Object enum1016 = ((Field) term624037).get((Object) null);
        term622099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term622099, term622099.getClass(), "kind", enum1016);
        setField(term622099, term622099.getClass(), "prototypeSlot", null);
        setField(term622099, term622099.getClass(), "source", null);
        term622351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term622351, term622351.getClass(), "ownerFunction", null);
        Class<? extends Object> term624338 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term624337 = ((Class) term624338).getDeclaredField((String) "ORDINARY");
        ((Field) term624337).setAccessible(true);
        Object enum1017 = ((Field) term624337).get((Object) null);
        term624020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term624021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term624024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term624020, term624020.getClass(), "call", null);
        setField(term624021, term624021.getClass(), "name", "prototype");
        setField(term624024, term624024.getClass(), "call", null);
        setField(term624024, term624024.getClass(), "prototypeSlot", null);
        setField(term624024, term624024.getClass(), "kind", null);
        setField(term624024, term624024.getClass(), "propAccess", null);
        setField(term624024, term624024.getClass(), "typeOfThis", null);
        setField(term624024, term624024.getClass(), "source", null);
        setField(term624024, term624024.getClass(), "implementedInterfaces", null);
        setField(term624024, term624024.getClass(), "extendedInterfaces", null);
        setField(term624024, term624024.getClass(), "subTypes", null);
        setField(term624024, term624024.getClass(), "templateTypeNames", null);
        setField(term624024, term624024.getClass(), "className", null);
        setField(term624024, term624024.getClass(), "properties", null);
        setBooleanField(term624024, term624024.getClass(), "nativeType", false);
        setField(term624024, term624024.getClass(), "implicitPrototypeFallback", null);
        setField(term624024, term624024.getClass(), "ownerFunction", term624020);
        setBooleanField(term624024, term624024.getClass(), "prettyPrint", false);
        setBooleanField(term624024, term624024.getClass(), "visited", false);
        setField(term624024, term624024.getClass(), "docInfo", null);
        setBooleanField(term624024, term624024.getClass(), "unknown", false);
        setBooleanField(term624024, term624024.getClass(), "resolved", false);
        setField(term624024, term624024.getClass(), "resolveResult", null);
        setBooleanField(term624024, term624024.getClass(), "inTemplatedCheckVisit", false);
        setField(term624024, term624024.getClass(), "registry", null);
        setField(term624021, term624021.getClass(), "type", term624024);
        setBooleanField(term624021, term624021.getClass(), "inferred", true);
        setField(term624021, term624021.getClass(), "propertyNode", null);
        setField(term624021, term624021.getClass(), "docInfo", null);
        setField(term624020, term624020.getClass(), "prototypeSlot", term624021);
        setField(term624020, term624020.getClass(), "kind", enum1017);
        setField(term624020, term624020.getClass(), "propAccess", null);
        setField(term624020, term624020.getClass(), "typeOfThis", null);
        setField(term624020, term624020.getClass(), "source", null);
        setField(term624020, term624020.getClass(), "implementedInterfaces", null);
        setField(term624020, term624020.getClass(), "extendedInterfaces", null);
        setField(term624020, term624020.getClass(), "subTypes", null);
        setField(term624020, term624020.getClass(), "templateTypeNames", null);
        setField(term624020, term624020.getClass(), "className", null);
        setField(term624020, term624020.getClass(), "properties", null);
        setBooleanField(term624020, term624020.getClass(), "nativeType", false);
        setField(term624020, term624020.getClass(), "implicitPrototypeFallback", null);
        setField(term624020, term624020.getClass(), "ownerFunction", null);
        setBooleanField(term624020, term624020.getClass(), "prettyPrint", false);
        setBooleanField(term624020, term624020.getClass(), "visited", false);
        setField(term624020, term624020.getClass(), "docInfo", null);
        setBooleanField(term624020, term624020.getClass(), "unknown", false);
        setBooleanField(term624020, term624020.getClass(), "resolved", false);
        setField(term624020, term624020.getClass(), "resolveResult", null);
        setBooleanField(term624020, term624020.getClass(), "inTemplatedCheckVisit", false);
        setField(term624020, term624020.getClass(), "registry", null);
        Class<? extends Object> term624638 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term624637 = ((Class) term624638).getDeclaredField((String) "ORDINARY");
        ((Field) term624637).setAccessible(true);
        Object enum1018 = ((Field) term624637).get((Object) null);
        term624028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term624029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term624030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term624028, term624028.getClass(), "call", null);
        setField(term624028, term624028.getClass(), "prototypeSlot", null);
        setField(term624028, term624028.getClass(), "kind", null);
        setField(term624028, term624028.getClass(), "propAccess", null);
        setField(term624028, term624028.getClass(), "typeOfThis", null);
        setField(term624028, term624028.getClass(), "source", null);
        setField(term624028, term624028.getClass(), "implementedInterfaces", null);
        setField(term624028, term624028.getClass(), "extendedInterfaces", null);
        setField(term624028, term624028.getClass(), "subTypes", null);
        setField(term624028, term624028.getClass(), "templateTypeNames", null);
        setField(term624028, term624028.getClass(), "className", null);
        setField(term624028, term624028.getClass(), "properties", null);
        setBooleanField(term624028, term624028.getClass(), "nativeType", false);
        setField(term624028, term624028.getClass(), "implicitPrototypeFallback", null);
        setField(term624029, term624029.getClass(), "call", null);
        setField(term624030, term624030.getClass(), "name", "prototype");
        setField(term624030, term624030.getClass(), "type", term624028);
        setBooleanField(term624030, term624030.getClass(), "inferred", true);
        setField(term624030, term624030.getClass(), "propertyNode", null);
        setField(term624030, term624030.getClass(), "docInfo", null);
        setField(term624029, term624029.getClass(), "prototypeSlot", term624030);
        setField(term624029, term624029.getClass(), "kind", enum1018);
        setField(term624029, term624029.getClass(), "propAccess", null);
        setField(term624029, term624029.getClass(), "typeOfThis", null);
        setField(term624029, term624029.getClass(), "source", null);
        setField(term624029, term624029.getClass(), "implementedInterfaces", null);
        setField(term624029, term624029.getClass(), "extendedInterfaces", null);
        setField(term624029, term624029.getClass(), "subTypes", null);
        setField(term624029, term624029.getClass(), "templateTypeNames", null);
        setField(term624029, term624029.getClass(), "className", null);
        setField(term624029, term624029.getClass(), "properties", null);
        setBooleanField(term624029, term624029.getClass(), "nativeType", false);
        setField(term624029, term624029.getClass(), "implicitPrototypeFallback", null);
        setField(term624029, term624029.getClass(), "ownerFunction", null);
        setBooleanField(term624029, term624029.getClass(), "prettyPrint", false);
        setBooleanField(term624029, term624029.getClass(), "visited", false);
        setField(term624029, term624029.getClass(), "docInfo", null);
        setBooleanField(term624029, term624029.getClass(), "unknown", false);
        setBooleanField(term624029, term624029.getClass(), "resolved", false);
        setField(term624029, term624029.getClass(), "resolveResult", null);
        setBooleanField(term624029, term624029.getClass(), "inTemplatedCheckVisit", false);
        setField(term624029, term624029.getClass(), "registry", null);
        setField(term624028, term624028.getClass(), "ownerFunction", term624029);
        setBooleanField(term624028, term624028.getClass(), "prettyPrint", false);
        setBooleanField(term624028, term624028.getClass(), "visited", false);
        setField(term624028, term624028.getClass(), "docInfo", null);
        setBooleanField(term624028, term624028.getClass(), "unknown", false);
        setBooleanField(term624028, term624028.getClass(), "resolved", false);
        setField(term624028, term624028.getClass(), "resolveResult", null);
        setBooleanField(term624028, term624028.getClass(), "inTemplatedCheckVisit", false);
        setField(term624028, term624028.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term622351;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term622099, args);
        assertTrue(recursiveEquals(term622099, term624020));
        assertTrue(recursiveEquals(term622351, term624028));
        assertTrue(recursiveEquals(retValue, true));
    }

};


