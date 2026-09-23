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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_setPrototypeBasedOn_101266613096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14324;

    public FunctionType_setPrototypeBasedOn_101266613096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76959 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term76958 = ((Class) term76959).getDeclaredField((String) "ORDINARY");
        ((Field) term76958).setAccessible(true);
        Object enum222 = ((Field) term76958).get((Object) null);
        Class<? extends Object> term77250 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term77249 = ((Class) term77250).getDeclaredField((String) "ANY");
        ((Field) term77249).setAccessible(true);
        Object enum223 = ((Field) term77249).get((Object) null);
        term14324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term14325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term14326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term14326, term14326.getClass(), "type", -1747406163);
        setIntField(term14328, term14328.getClass(), "type", 388157121);
        setIntField(term14330, term14330.getClass(), "type", 1684998508);
        setField(term14330, term14330.getClass(), "next", null);
        setField(term14330, term14330.getClass(), "first", null);
        setField(term14330, term14330.getClass(), "last", null);
        setField(term14330, term14330.getClass(), "propListHead", null);
        setIntField(term14330, term14330.getClass(), "sourcePosition", 0);
        setField(term14330, term14330.getClass(), "jsType", null);
        setField(term14330, term14330.getClass(), "parent", null);
        setField(term14328, term14328.getClass(), "next", term14330);
        setIntField(term14333, term14333.getClass(), "type", 0);
        setField(term14333, term14333.getClass(), "next", null);
        setField(term14333, term14333.getClass(), "first", null);
        setField(term14333, term14333.getClass(), "last", null);
        setField(term14333, term14333.getClass(), "propListHead", null);
        setIntField(term14333, term14333.getClass(), "sourcePosition", 0);
        setField(term14333, term14333.getClass(), "jsType", null);
        setField(term14333, term14333.getClass(), "parent", null);
        setField(term14328, term14328.getClass(), "first", term14333);
        setIntField(term14336, term14336.getClass(), "type", -1022990421);
        setField(term14336, term14336.getClass(), "next", null);
        setField(term14336, term14336.getClass(), "first", term14333);
        setField(term14336, term14336.getClass(), "last", term14336);
        setField(term14336, term14336.getClass(), "propListHead", null);
        setIntField(term14336, term14336.getClass(), "sourcePosition", 0);
        setField(term14336, term14336.getClass(), "jsType", null);
        setField(term14336, term14336.getClass(), "parent", null);
        setField(term14328, term14328.getClass(), "last", term14336);
        setField(term14328, term14328.getClass(), "propListHead", null);
        setIntField(term14328, term14328.getClass(), "sourcePosition", 0);
        setField(term14328, term14328.getClass(), "jsType", null);
        setField(term14328, term14328.getClass(), "parent", null);
        setField(term14326, term14326.getClass(), "next", term14328);
        setIntField(term14340, term14340.getClass(), "type", -1146679443);
        setIntField(term14342, term14342.getClass(), "type", -860131894);
        setField(term14342, term14342.getClass(), "next", term14336);
        setField(term14342, term14342.getClass(), "first", null);
        setField(term14342, term14342.getClass(), "last", term14326);
        setField(term14342, term14342.getClass(), "propListHead", null);
        setIntField(term14342, term14342.getClass(), "sourcePosition", 0);
        setField(term14342, term14342.getClass(), "jsType", null);
        setField(term14342, term14342.getClass(), "parent", null);
        setField(term14340, term14340.getClass(), "next", term14342);
        setField(term14340, term14340.getClass(), "first", term14340);
        setIntField(term14345, term14345.getClass(), "type", -1476644457);
        setField(term14345, term14345.getClass(), "next", null);
        setField(term14345, term14345.getClass(), "first", term14333);
        setField(term14345, term14345.getClass(), "last", term14336);
        setField(term14345, term14345.getClass(), "propListHead", null);
        setIntField(term14345, term14345.getClass(), "sourcePosition", 0);
        setField(term14345, term14345.getClass(), "jsType", null);
        setField(term14345, term14345.getClass(), "parent", null);
        setField(term14340, term14340.getClass(), "last", term14345);
        setField(term14340, term14340.getClass(), "propListHead", null);
        setIntField(term14340, term14340.getClass(), "sourcePosition", 0);
        setField(term14340, term14340.getClass(), "jsType", null);
        setField(term14340, term14340.getClass(), "parent", null);
        setField(term14326, term14326.getClass(), "first", term14340);
        setField(term14326, term14326.getClass(), "last", term14330);
        setField(term14326, term14326.getClass(), "propListHead", null);
        setIntField(term14326, term14326.getClass(), "sourcePosition", 0);
        setField(term14326, term14326.getClass(), "jsType", null);
        setField(term14326, term14326.getClass(), "parent", null);
        setField(term14325, term14325.getClass(), "parameters", term14326);
        setField(term14325, term14325.getClass(), "returnType", null);
        setBooleanField(term14325, term14325.getClass(), "returnTypeInferred", false);
        setBooleanField(term14325, term14325.getClass(), "resolved", false);
        setField(term14325, term14325.getClass(), "resolveResult", null);
        setBooleanField(term14325, term14325.getClass(), "inTemplatedCheckVisit", false);
        setField(term14325, term14325.getClass(), "registry", null);
        setField(term14324, term14324.getClass(), "call", term14325);
        setField(term14353, term14353.getClass(), "name", null);
        setField(term14353, term14353.getClass(), "type", null);
        setBooleanField(term14353, term14353.getClass(), "inferred", false);
        setField(term14353, term14353.getClass(), "propertyNode", null);
        setField(term14353, term14353.getClass(), "docInfo", null);
        setField(term14324, term14324.getClass(), "prototypeSlot", term14353);
        setField(term14324, term14324.getClass(), "kind", enum222);
        setField(term14324, term14324.getClass(), "propAccess", enum223);
        setField(term14324, term14324.getClass(), "typeOfThis", null);
        setField(term14324, term14324.getClass(), "source", null);
        setField(term14324, term14324.getClass(), "implementedInterfaces", null);
        setField(term14324, term14324.getClass(), "extendedInterfaces", null);
        setField(term14324, term14324.getClass(), "subTypes", null);
        setField(term14324, term14324.getClass(), "templateTypeNames", null);
        setField(term14324, term14324.getClass(), "className", null);
        setField(term14324, term14324.getClass(), "properties", null);
        setBooleanField(term14324, term14324.getClass(), "nativeType", false);
        setField(term14324, term14324.getClass(), "implicitPrototypeFallback", null);
        setField(term14324, term14324.getClass(), "ownerFunction", null);
        setBooleanField(term14324, term14324.getClass(), "prettyPrint", false);
        setBooleanField(term14324, term14324.getClass(), "visited", false);
        setField(term14324, term14324.getClass(), "docInfo", null);
        setBooleanField(term14324, term14324.getClass(), "unknown", false);
        setBooleanField(term14324, term14324.getClass(), "resolved", false);
        setField(term14324, term14324.getClass(), "resolveResult", null);
        setBooleanField(term14324, term14324.getClass(), "inTemplatedCheckVisit", false);
        setField(term14324, term14324.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term14324, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


