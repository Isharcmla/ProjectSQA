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
import java.lang.Boolean;

public class FunctionType_appendVarArgsString_1435184971163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35214;
     Object term35272;
     Object term35292;

    public FunctionType_appendVarArgsString_1435184971163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term190139 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term190138 = ((Class) term190139).getDeclaredField((String) "INTERFACE");
        ((Field) term190138).setAccessible(true);
        Object enum335 = ((Field) term190138).get((Object) null);
        Class<? extends Object> term190433 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term190432 = ((Class) term190433).getDeclaredField((String) "DICT");
        ((Field) term190432).setAccessible(true);
        Object enum336 = ((Field) term190432).get((Object) null);
        term35214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term35215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term35216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term35216, term35216.getClass(), "type", 633598642);
        setIntField(term35218, term35218.getClass(), "type", 1862841859);
        setIntField(term35220, term35220.getClass(), "type", -1114668574);
        setField(term35220, term35220.getClass(), "next", null);
        setField(term35220, term35220.getClass(), "first", null);
        setField(term35220, term35220.getClass(), "last", null);
        setField(term35220, term35220.getClass(), "propListHead", null);
        setIntField(term35220, term35220.getClass(), "sourcePosition", 0);
        setField(term35220, term35220.getClass(), "jsType", null);
        setField(term35220, term35220.getClass(), "parent", null);
        setField(term35218, term35218.getClass(), "next", term35220);
        setIntField(term35223, term35223.getClass(), "type", 0);
        setField(term35223, term35223.getClass(), "next", null);
        setField(term35223, term35223.getClass(), "first", null);
        setField(term35223, term35223.getClass(), "last", null);
        setField(term35223, term35223.getClass(), "propListHead", null);
        setIntField(term35223, term35223.getClass(), "sourcePosition", 0);
        setField(term35223, term35223.getClass(), "jsType", null);
        setField(term35223, term35223.getClass(), "parent", null);
        setField(term35218, term35218.getClass(), "first", term35223);
        setIntField(term35226, term35226.getClass(), "type", -26316536);
        setField(term35226, term35226.getClass(), "next", null);
        setField(term35226, term35226.getClass(), "first", term35223);
        setField(term35226, term35226.getClass(), "last", term35226);
        setField(term35226, term35226.getClass(), "propListHead", null);
        setIntField(term35226, term35226.getClass(), "sourcePosition", 0);
        setField(term35226, term35226.getClass(), "jsType", null);
        setField(term35226, term35226.getClass(), "parent", null);
        setField(term35218, term35218.getClass(), "last", term35226);
        setField(term35218, term35218.getClass(), "propListHead", null);
        setIntField(term35218, term35218.getClass(), "sourcePosition", 0);
        setField(term35218, term35218.getClass(), "jsType", null);
        setField(term35218, term35218.getClass(), "parent", null);
        setField(term35216, term35216.getClass(), "next", term35218);
        setIntField(term35230, term35230.getClass(), "type", 1956590498);
        setIntField(term35232, term35232.getClass(), "type", 1467356494);
        setField(term35232, term35232.getClass(), "next", term35226);
        setField(term35232, term35232.getClass(), "first", null);
        setField(term35232, term35232.getClass(), "last", term35216);
        setField(term35232, term35232.getClass(), "propListHead", null);
        setIntField(term35232, term35232.getClass(), "sourcePosition", 0);
        setField(term35232, term35232.getClass(), "jsType", null);
        setField(term35232, term35232.getClass(), "parent", null);
        setField(term35230, term35230.getClass(), "next", term35232);
        setField(term35230, term35230.getClass(), "first", term35230);
        setIntField(term35235, term35235.getClass(), "type", 514511037);
        setField(term35235, term35235.getClass(), "next", null);
        setField(term35235, term35235.getClass(), "first", term35223);
        setField(term35235, term35235.getClass(), "last", term35226);
        setField(term35235, term35235.getClass(), "propListHead", null);
        setIntField(term35235, term35235.getClass(), "sourcePosition", 0);
        setField(term35235, term35235.getClass(), "jsType", null);
        setField(term35235, term35235.getClass(), "parent", null);
        setField(term35230, term35230.getClass(), "last", term35235);
        setField(term35230, term35230.getClass(), "propListHead", null);
        setIntField(term35230, term35230.getClass(), "sourcePosition", 0);
        setField(term35230, term35230.getClass(), "jsType", null);
        setField(term35230, term35230.getClass(), "parent", null);
        setField(term35216, term35216.getClass(), "first", term35230);
        setField(term35216, term35216.getClass(), "last", term35220);
        setField(term35216, term35216.getClass(), "propListHead", null);
        setIntField(term35216, term35216.getClass(), "sourcePosition", 0);
        setField(term35216, term35216.getClass(), "jsType", null);
        setField(term35216, term35216.getClass(), "parent", null);
        setField(term35215, term35215.getClass(), "parameters", term35216);
        setField(term35215, term35215.getClass(), "returnType", null);
        setBooleanField(term35215, term35215.getClass(), "returnTypeInferred", false);
        setBooleanField(term35215, term35215.getClass(), "resolved", false);
        setField(term35215, term35215.getClass(), "resolveResult", null);
        setBooleanField(term35215, term35215.getClass(), "inTemplatedCheckVisit", false);
        setField(term35215, term35215.getClass(), "registry", null);
        setField(term35214, term35214.getClass(), "call", term35215);
        setField(term35243, term35243.getClass(), "name", null);
        setField(term35243, term35243.getClass(), "type", null);
        setBooleanField(term35243, term35243.getClass(), "inferred", false);
        setField(term35243, term35243.getClass(), "propertyNode", null);
        setField(term35243, term35243.getClass(), "docInfo", null);
        setField(term35214, term35214.getClass(), "prototypeSlot", term35243);
        setField(term35214, term35214.getClass(), "kind", enum335);
        setField(term35214, term35214.getClass(), "propAccess", enum336);
        setField(term35214, term35214.getClass(), "typeOfThis", null);
        setField(term35214, term35214.getClass(), "source", null);
        setField(term35214, term35214.getClass(), "implementedInterfaces", null);
        setField(term35214, term35214.getClass(), "extendedInterfaces", null);
        setField(term35214, term35214.getClass(), "subTypes", null);
        setField(term35214, term35214.getClass(), "templateTypeNames", null);
        setField(term35214, term35214.getClass(), "className", null);
        setField(term35214, term35214.getClass(), "properties", null);
        setBooleanField(term35214, term35214.getClass(), "nativeType", false);
        setField(term35214, term35214.getClass(), "implicitPrototypeFallback", null);
        setField(term35214, term35214.getClass(), "ownerFunction", null);
        setBooleanField(term35214, term35214.getClass(), "prettyPrint", false);
        setBooleanField(term35214, term35214.getClass(), "visited", false);
        setField(term35214, term35214.getClass(), "docInfo", null);
        setBooleanField(term35214, term35214.getClass(), "unknown", false);
        setBooleanField(term35214, term35214.getClass(), "resolved", false);
        setField(term35214, term35214.getClass(), "resolveResult", null);
        setBooleanField(term35214, term35214.getClass(), "inTemplatedCheckVisit", false);
        setField(term35214, term35214.getClass(), "registry", null);
        term35272 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35273 = (byte[]) newByteArray(16);
        setField(term35272, term35272.getClass(), "value", term35273);
        setByteField(term35272, term35272.getClass(), "coder", (byte) 48);
        setIntField(term35272, term35272.getClass(), "count", 1716165145);
        term35292 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term35272;
        args[1] = null;
        args[2] = term35292;
        try {
            callMethod(klass, "appendVarArgsString", argTypes, term35214, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


