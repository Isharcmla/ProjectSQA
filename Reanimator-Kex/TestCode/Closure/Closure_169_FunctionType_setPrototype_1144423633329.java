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

public class FunctionType_setPrototype_1144423633329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301202;
     Object term301454;
     Object term301836;
     Object term301844;

    public FunctionType_setPrototype_1144423633329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term301854 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term301853 = ((Class) term301854).getDeclaredField((String) "ORDINARY");
        ((Field) term301853).setAccessible(true);
        Object enum532 = ((Field) term301853).get((Object) null);
        term301202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term301202, term301202.getClass(), "kind", enum532);
        setField(term301202, term301202.getClass(), "prototypeSlot", null);
        setField(term301202, term301202.getClass(), "source", null);
        term301454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term301454, term301454.getClass(), "ownerFunction", null);
        Class<? extends Object> term302154 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term302153 = ((Class) term302154).getDeclaredField((String) "ORDINARY");
        ((Field) term302153).setAccessible(true);
        Object enum533 = ((Field) term302153).get((Object) null);
        term301836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term301837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term301840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term301836, term301836.getClass(), "call", null);
        setField(term301837, term301837.getClass(), "name", "prototype");
        setField(term301840, term301840.getClass(), "call", null);
        setField(term301840, term301840.getClass(), "prototypeSlot", null);
        setField(term301840, term301840.getClass(), "kind", null);
        setField(term301840, term301840.getClass(), "propAccess", null);
        setField(term301840, term301840.getClass(), "typeOfThis", null);
        setField(term301840, term301840.getClass(), "source", null);
        setField(term301840, term301840.getClass(), "implementedInterfaces", null);
        setField(term301840, term301840.getClass(), "extendedInterfaces", null);
        setField(term301840, term301840.getClass(), "subTypes", null);
        setField(term301840, term301840.getClass(), "templateTypeNames", null);
        setField(term301840, term301840.getClass(), "className", null);
        setField(term301840, term301840.getClass(), "properties", null);
        setBooleanField(term301840, term301840.getClass(), "nativeType", false);
        setField(term301840, term301840.getClass(), "implicitPrototypeFallback", null);
        setField(term301840, term301840.getClass(), "ownerFunction", term301836);
        setBooleanField(term301840, term301840.getClass(), "prettyPrint", false);
        setBooleanField(term301840, term301840.getClass(), "visited", false);
        setField(term301840, term301840.getClass(), "docInfo", null);
        setBooleanField(term301840, term301840.getClass(), "unknown", false);
        setBooleanField(term301840, term301840.getClass(), "resolved", false);
        setField(term301840, term301840.getClass(), "resolveResult", null);
        setBooleanField(term301840, term301840.getClass(), "inTemplatedCheckVisit", false);
        setField(term301840, term301840.getClass(), "registry", null);
        setField(term301837, term301837.getClass(), "type", term301840);
        setBooleanField(term301837, term301837.getClass(), "inferred", true);
        setField(term301837, term301837.getClass(), "propertyNode", null);
        setField(term301837, term301837.getClass(), "docInfo", null);
        setField(term301836, term301836.getClass(), "prototypeSlot", term301837);
        setField(term301836, term301836.getClass(), "kind", enum533);
        setField(term301836, term301836.getClass(), "propAccess", null);
        setField(term301836, term301836.getClass(), "typeOfThis", null);
        setField(term301836, term301836.getClass(), "source", null);
        setField(term301836, term301836.getClass(), "implementedInterfaces", null);
        setField(term301836, term301836.getClass(), "extendedInterfaces", null);
        setField(term301836, term301836.getClass(), "subTypes", null);
        setField(term301836, term301836.getClass(), "templateTypeNames", null);
        setField(term301836, term301836.getClass(), "className", null);
        setField(term301836, term301836.getClass(), "properties", null);
        setBooleanField(term301836, term301836.getClass(), "nativeType", false);
        setField(term301836, term301836.getClass(), "implicitPrototypeFallback", null);
        setField(term301836, term301836.getClass(), "ownerFunction", null);
        setBooleanField(term301836, term301836.getClass(), "prettyPrint", false);
        setBooleanField(term301836, term301836.getClass(), "visited", false);
        setField(term301836, term301836.getClass(), "docInfo", null);
        setBooleanField(term301836, term301836.getClass(), "unknown", false);
        setBooleanField(term301836, term301836.getClass(), "resolved", false);
        setField(term301836, term301836.getClass(), "resolveResult", null);
        setBooleanField(term301836, term301836.getClass(), "inTemplatedCheckVisit", false);
        setField(term301836, term301836.getClass(), "registry", null);
        Class<? extends Object> term302454 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term302453 = ((Class) term302454).getDeclaredField((String) "ORDINARY");
        ((Field) term302453).setAccessible(true);
        Object enum534 = ((Field) term302453).get((Object) null);
        term301844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term301845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term301846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term301844, term301844.getClass(), "call", null);
        setField(term301844, term301844.getClass(), "prototypeSlot", null);
        setField(term301844, term301844.getClass(), "kind", null);
        setField(term301844, term301844.getClass(), "propAccess", null);
        setField(term301844, term301844.getClass(), "typeOfThis", null);
        setField(term301844, term301844.getClass(), "source", null);
        setField(term301844, term301844.getClass(), "implementedInterfaces", null);
        setField(term301844, term301844.getClass(), "extendedInterfaces", null);
        setField(term301844, term301844.getClass(), "subTypes", null);
        setField(term301844, term301844.getClass(), "templateTypeNames", null);
        setField(term301844, term301844.getClass(), "className", null);
        setField(term301844, term301844.getClass(), "properties", null);
        setBooleanField(term301844, term301844.getClass(), "nativeType", false);
        setField(term301844, term301844.getClass(), "implicitPrototypeFallback", null);
        setField(term301845, term301845.getClass(), "call", null);
        setField(term301846, term301846.getClass(), "name", "prototype");
        setField(term301846, term301846.getClass(), "type", term301844);
        setBooleanField(term301846, term301846.getClass(), "inferred", true);
        setField(term301846, term301846.getClass(), "propertyNode", null);
        setField(term301846, term301846.getClass(), "docInfo", null);
        setField(term301845, term301845.getClass(), "prototypeSlot", term301846);
        setField(term301845, term301845.getClass(), "kind", enum534);
        setField(term301845, term301845.getClass(), "propAccess", null);
        setField(term301845, term301845.getClass(), "typeOfThis", null);
        setField(term301845, term301845.getClass(), "source", null);
        setField(term301845, term301845.getClass(), "implementedInterfaces", null);
        setField(term301845, term301845.getClass(), "extendedInterfaces", null);
        setField(term301845, term301845.getClass(), "subTypes", null);
        setField(term301845, term301845.getClass(), "templateTypeNames", null);
        setField(term301845, term301845.getClass(), "className", null);
        setField(term301845, term301845.getClass(), "properties", null);
        setBooleanField(term301845, term301845.getClass(), "nativeType", false);
        setField(term301845, term301845.getClass(), "implicitPrototypeFallback", null);
        setField(term301845, term301845.getClass(), "ownerFunction", null);
        setBooleanField(term301845, term301845.getClass(), "prettyPrint", false);
        setBooleanField(term301845, term301845.getClass(), "visited", false);
        setField(term301845, term301845.getClass(), "docInfo", null);
        setBooleanField(term301845, term301845.getClass(), "unknown", false);
        setBooleanField(term301845, term301845.getClass(), "resolved", false);
        setField(term301845, term301845.getClass(), "resolveResult", null);
        setBooleanField(term301845, term301845.getClass(), "inTemplatedCheckVisit", false);
        setField(term301845, term301845.getClass(), "registry", null);
        setField(term301844, term301844.getClass(), "ownerFunction", term301845);
        setBooleanField(term301844, term301844.getClass(), "prettyPrint", false);
        setBooleanField(term301844, term301844.getClass(), "visited", false);
        setField(term301844, term301844.getClass(), "docInfo", null);
        setBooleanField(term301844, term301844.getClass(), "unknown", false);
        setBooleanField(term301844, term301844.getClass(), "resolved", false);
        setField(term301844, term301844.getClass(), "resolveResult", null);
        setBooleanField(term301844, term301844.getClass(), "inTemplatedCheckVisit", false);
        setField(term301844, term301844.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term301454;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term301202, args);
        assertTrue(recursiveEquals(term301202, term301836));
        assertTrue(recursiveEquals(term301454, term301844));
        assertTrue(recursiveEquals(retValue, true));
    }

};


