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

public class FunctionType_getAllImplementedInterfaces_572683533100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17065;

    public FunctionType_getAllImplementedInterfaces_572683533100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80998 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term80997 = ((Class) term80998).getDeclaredField((String) "ORDINARY");
        ((Field) term80997).setAccessible(true);
        Object enum232 = ((Field) term80997).get((Object) null);
        Class<? extends Object> term81289 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term81288 = ((Class) term81289).getDeclaredField((String) "ANY");
        ((Field) term81288).setAccessible(true);
        Object enum233 = ((Field) term81288).get((Object) null);
        term17065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term17066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term17067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term17067, term17067.getClass(), "type", -43417861);
        setIntField(term17069, term17069.getClass(), "type", -1533843432);
        setIntField(term17071, term17071.getClass(), "type", -123338791);
        setField(term17071, term17071.getClass(), "next", null);
        setField(term17071, term17071.getClass(), "first", null);
        setField(term17071, term17071.getClass(), "last", null);
        setField(term17071, term17071.getClass(), "propListHead", null);
        setIntField(term17071, term17071.getClass(), "sourcePosition", 0);
        setField(term17071, term17071.getClass(), "jsType", null);
        setField(term17071, term17071.getClass(), "parent", null);
        setField(term17069, term17069.getClass(), "next", term17071);
        setIntField(term17074, term17074.getClass(), "type", 0);
        setField(term17074, term17074.getClass(), "next", null);
        setField(term17074, term17074.getClass(), "first", null);
        setField(term17074, term17074.getClass(), "last", null);
        setField(term17074, term17074.getClass(), "propListHead", null);
        setIntField(term17074, term17074.getClass(), "sourcePosition", 0);
        setField(term17074, term17074.getClass(), "jsType", null);
        setField(term17074, term17074.getClass(), "parent", null);
        setField(term17069, term17069.getClass(), "first", term17074);
        setIntField(term17077, term17077.getClass(), "type", -1070592289);
        setField(term17077, term17077.getClass(), "next", null);
        setField(term17077, term17077.getClass(), "first", term17074);
        setField(term17077, term17077.getClass(), "last", term17077);
        setField(term17077, term17077.getClass(), "propListHead", null);
        setIntField(term17077, term17077.getClass(), "sourcePosition", 0);
        setField(term17077, term17077.getClass(), "jsType", null);
        setField(term17077, term17077.getClass(), "parent", null);
        setField(term17069, term17069.getClass(), "last", term17077);
        setField(term17069, term17069.getClass(), "propListHead", null);
        setIntField(term17069, term17069.getClass(), "sourcePosition", 0);
        setField(term17069, term17069.getClass(), "jsType", null);
        setField(term17069, term17069.getClass(), "parent", null);
        setField(term17067, term17067.getClass(), "next", term17069);
        setIntField(term17081, term17081.getClass(), "type", 1901317214);
        setIntField(term17083, term17083.getClass(), "type", 1166710220);
        setField(term17083, term17083.getClass(), "next", term17077);
        setField(term17083, term17083.getClass(), "first", null);
        setField(term17083, term17083.getClass(), "last", term17067);
        setField(term17083, term17083.getClass(), "propListHead", null);
        setIntField(term17083, term17083.getClass(), "sourcePosition", 0);
        setField(term17083, term17083.getClass(), "jsType", null);
        setField(term17083, term17083.getClass(), "parent", null);
        setField(term17081, term17081.getClass(), "next", term17083);
        setField(term17081, term17081.getClass(), "first", term17081);
        setIntField(term17086, term17086.getClass(), "type", -1467089634);
        setField(term17086, term17086.getClass(), "next", null);
        setField(term17086, term17086.getClass(), "first", term17074);
        setField(term17086, term17086.getClass(), "last", term17077);
        setField(term17086, term17086.getClass(), "propListHead", null);
        setIntField(term17086, term17086.getClass(), "sourcePosition", 0);
        setField(term17086, term17086.getClass(), "jsType", null);
        setField(term17086, term17086.getClass(), "parent", null);
        setField(term17081, term17081.getClass(), "last", term17086);
        setField(term17081, term17081.getClass(), "propListHead", null);
        setIntField(term17081, term17081.getClass(), "sourcePosition", 0);
        setField(term17081, term17081.getClass(), "jsType", null);
        setField(term17081, term17081.getClass(), "parent", null);
        setField(term17067, term17067.getClass(), "first", term17081);
        setField(term17067, term17067.getClass(), "last", term17071);
        setField(term17067, term17067.getClass(), "propListHead", null);
        setIntField(term17067, term17067.getClass(), "sourcePosition", 0);
        setField(term17067, term17067.getClass(), "jsType", null);
        setField(term17067, term17067.getClass(), "parent", null);
        setField(term17066, term17066.getClass(), "parameters", term17067);
        setField(term17066, term17066.getClass(), "returnType", null);
        setBooleanField(term17066, term17066.getClass(), "returnTypeInferred", false);
        setBooleanField(term17066, term17066.getClass(), "resolved", false);
        setField(term17066, term17066.getClass(), "resolveResult", null);
        setBooleanField(term17066, term17066.getClass(), "inTemplatedCheckVisit", false);
        setField(term17066, term17066.getClass(), "registry", null);
        setField(term17065, term17065.getClass(), "call", term17066);
        setField(term17094, term17094.getClass(), "name", null);
        setField(term17094, term17094.getClass(), "type", null);
        setBooleanField(term17094, term17094.getClass(), "inferred", false);
        setField(term17094, term17094.getClass(), "propertyNode", null);
        setField(term17094, term17094.getClass(), "docInfo", null);
        setField(term17065, term17065.getClass(), "prototypeSlot", term17094);
        setField(term17065, term17065.getClass(), "kind", enum232);
        setField(term17065, term17065.getClass(), "propAccess", enum233);
        setField(term17065, term17065.getClass(), "typeOfThis", null);
        setField(term17065, term17065.getClass(), "source", null);
        setField(term17065, term17065.getClass(), "implementedInterfaces", null);
        setField(term17065, term17065.getClass(), "extendedInterfaces", null);
        setField(term17065, term17065.getClass(), "subTypes", null);
        setField(term17065, term17065.getClass(), "templateTypeNames", null);
        setField(term17065, term17065.getClass(), "className", null);
        setField(term17065, term17065.getClass(), "properties", null);
        setBooleanField(term17065, term17065.getClass(), "nativeType", false);
        setField(term17065, term17065.getClass(), "implicitPrototypeFallback", null);
        setField(term17065, term17065.getClass(), "ownerFunction", null);
        setBooleanField(term17065, term17065.getClass(), "prettyPrint", false);
        setBooleanField(term17065, term17065.getClass(), "visited", false);
        setField(term17065, term17065.getClass(), "docInfo", null);
        setBooleanField(term17065, term17065.getClass(), "unknown", false);
        setBooleanField(term17065, term17065.getClass(), "resolved", false);
        setField(term17065, term17065.getClass(), "resolveResult", null);
        setBooleanField(term17065, term17065.getClass(), "inTemplatedCheckVisit", false);
        setField(term17065, term17065.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term17065, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


