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

public class FunctionType_setPrototypeNoCheck_1402626902249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246743;
     Object term247027;
     Object term247109;
     Object term247115;

    public FunctionType_setPrototypeNoCheck_1402626902249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term246857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term246927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term246857, term246857.getClass(), "type", null);
        setField(term246743, term246743.getClass(), "prototypeSlot", term246857);
        setField(term246743, term246743.getClass(), "source", term246927);
        term247027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term247109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term247110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term247113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term247114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term247109, term247109.getClass(), "call", null);
        setField(term247110, term247110.getClass(), "name", "prototype");
        setField(term247113, term247113.getClass(), "call", null);
        setField(term247113, term247113.getClass(), "prototypeSlot", null);
        setField(term247113, term247113.getClass(), "kind", null);
        setField(term247113, term247113.getClass(), "propAccess", null);
        setField(term247113, term247113.getClass(), "typeOfThis", null);
        setField(term247113, term247113.getClass(), "source", null);
        setField(term247113, term247113.getClass(), "implementedInterfaces", null);
        setField(term247113, term247113.getClass(), "extendedInterfaces", null);
        setField(term247113, term247113.getClass(), "subTypes", null);
        setField(term247113, term247113.getClass(), "templateTypeNames", null);
        setField(term247113, term247113.getClass(), "className", null);
        setField(term247113, term247113.getClass(), "properties", null);
        setBooleanField(term247113, term247113.getClass(), "nativeType", false);
        setField(term247113, term247113.getClass(), "implicitPrototypeFallback", null);
        setField(term247113, term247113.getClass(), "ownerFunction", term247109);
        setBooleanField(term247113, term247113.getClass(), "prettyPrint", false);
        setBooleanField(term247113, term247113.getClass(), "visited", false);
        setField(term247113, term247113.getClass(), "docInfo", null);
        setBooleanField(term247113, term247113.getClass(), "unknown", false);
        setBooleanField(term247113, term247113.getClass(), "resolved", false);
        setField(term247113, term247113.getClass(), "resolveResult", null);
        setBooleanField(term247113, term247113.getClass(), "inTemplatedCheckVisit", false);
        setField(term247113, term247113.getClass(), "registry", null);
        setField(term247110, term247110.getClass(), "type", term247113);
        setBooleanField(term247110, term247110.getClass(), "inferred", true);
        setIntField(term247114, term247114.getClass(), "type", 0);
        setField(term247114, term247114.getClass(), "next", null);
        setField(term247114, term247114.getClass(), "first", null);
        setField(term247114, term247114.getClass(), "last", null);
        setField(term247114, term247114.getClass(), "propListHead", null);
        setIntField(term247114, term247114.getClass(), "sourcePosition", 0);
        setField(term247114, term247114.getClass(), "jsType", null);
        setField(term247114, term247114.getClass(), "parent", null);
        setField(term247110, term247110.getClass(), "propertyNode", term247114);
        setField(term247110, term247110.getClass(), "docInfo", null);
        setField(term247109, term247109.getClass(), "prototypeSlot", term247110);
        setField(term247109, term247109.getClass(), "kind", null);
        setField(term247109, term247109.getClass(), "propAccess", null);
        setField(term247109, term247109.getClass(), "typeOfThis", null);
        setField(term247109, term247109.getClass(), "source", term247114);
        setField(term247109, term247109.getClass(), "implementedInterfaces", null);
        setField(term247109, term247109.getClass(), "extendedInterfaces", null);
        setField(term247109, term247109.getClass(), "subTypes", null);
        setField(term247109, term247109.getClass(), "templateTypeNames", null);
        setField(term247109, term247109.getClass(), "className", null);
        setField(term247109, term247109.getClass(), "properties", null);
        setBooleanField(term247109, term247109.getClass(), "nativeType", false);
        setField(term247109, term247109.getClass(), "implicitPrototypeFallback", null);
        setField(term247109, term247109.getClass(), "ownerFunction", null);
        setBooleanField(term247109, term247109.getClass(), "prettyPrint", false);
        setBooleanField(term247109, term247109.getClass(), "visited", false);
        setField(term247109, term247109.getClass(), "docInfo", null);
        setBooleanField(term247109, term247109.getClass(), "unknown", false);
        setBooleanField(term247109, term247109.getClass(), "resolved", false);
        setField(term247109, term247109.getClass(), "resolveResult", null);
        setBooleanField(term247109, term247109.getClass(), "inTemplatedCheckVisit", false);
        setField(term247109, term247109.getClass(), "registry", null);
        term247115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term247116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term247117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term247120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term247115, term247115.getClass(), "call", null);
        setField(term247115, term247115.getClass(), "prototypeSlot", null);
        setField(term247115, term247115.getClass(), "kind", null);
        setField(term247115, term247115.getClass(), "propAccess", null);
        setField(term247115, term247115.getClass(), "typeOfThis", null);
        setField(term247115, term247115.getClass(), "source", null);
        setField(term247115, term247115.getClass(), "implementedInterfaces", null);
        setField(term247115, term247115.getClass(), "extendedInterfaces", null);
        setField(term247115, term247115.getClass(), "subTypes", null);
        setField(term247115, term247115.getClass(), "templateTypeNames", null);
        setField(term247115, term247115.getClass(), "className", null);
        setField(term247115, term247115.getClass(), "properties", null);
        setBooleanField(term247115, term247115.getClass(), "nativeType", false);
        setField(term247115, term247115.getClass(), "implicitPrototypeFallback", null);
        setField(term247116, term247116.getClass(), "call", null);
        setField(term247117, term247117.getClass(), "name", "prototype");
        setField(term247117, term247117.getClass(), "type", term247115);
        setBooleanField(term247117, term247117.getClass(), "inferred", true);
        setIntField(term247120, term247120.getClass(), "type", 0);
        setField(term247120, term247120.getClass(), "next", null);
        setField(term247120, term247120.getClass(), "first", null);
        setField(term247120, term247120.getClass(), "last", null);
        setField(term247120, term247120.getClass(), "propListHead", null);
        setIntField(term247120, term247120.getClass(), "sourcePosition", 0);
        setField(term247120, term247120.getClass(), "jsType", null);
        setField(term247120, term247120.getClass(), "parent", null);
        setField(term247117, term247117.getClass(), "propertyNode", term247120);
        setField(term247117, term247117.getClass(), "docInfo", null);
        setField(term247116, term247116.getClass(), "prototypeSlot", term247117);
        setField(term247116, term247116.getClass(), "kind", null);
        setField(term247116, term247116.getClass(), "propAccess", null);
        setField(term247116, term247116.getClass(), "typeOfThis", null);
        setField(term247116, term247116.getClass(), "source", term247120);
        setField(term247116, term247116.getClass(), "implementedInterfaces", null);
        setField(term247116, term247116.getClass(), "extendedInterfaces", null);
        setField(term247116, term247116.getClass(), "subTypes", null);
        setField(term247116, term247116.getClass(), "templateTypeNames", null);
        setField(term247116, term247116.getClass(), "className", null);
        setField(term247116, term247116.getClass(), "properties", null);
        setBooleanField(term247116, term247116.getClass(), "nativeType", false);
        setField(term247116, term247116.getClass(), "implicitPrototypeFallback", null);
        setField(term247116, term247116.getClass(), "ownerFunction", null);
        setBooleanField(term247116, term247116.getClass(), "prettyPrint", false);
        setBooleanField(term247116, term247116.getClass(), "visited", false);
        setField(term247116, term247116.getClass(), "docInfo", null);
        setBooleanField(term247116, term247116.getClass(), "unknown", false);
        setBooleanField(term247116, term247116.getClass(), "resolved", false);
        setField(term247116, term247116.getClass(), "resolveResult", null);
        setBooleanField(term247116, term247116.getClass(), "inTemplatedCheckVisit", false);
        setField(term247116, term247116.getClass(), "registry", null);
        setField(term247115, term247115.getClass(), "ownerFunction", term247116);
        setBooleanField(term247115, term247115.getClass(), "prettyPrint", false);
        setBooleanField(term247115, term247115.getClass(), "visited", false);
        setField(term247115, term247115.getClass(), "docInfo", null);
        setBooleanField(term247115, term247115.getClass(), "unknown", false);
        setBooleanField(term247115, term247115.getClass(), "resolved", false);
        setField(term247115, term247115.getClass(), "resolveResult", null);
        setBooleanField(term247115, term247115.getClass(), "inTemplatedCheckVisit", false);
        setField(term247115, term247115.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term247027;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term246743, args);
        assertTrue(recursiveEquals(term246743, term247109));
        assertTrue(recursiveEquals(term247027, term247115));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


