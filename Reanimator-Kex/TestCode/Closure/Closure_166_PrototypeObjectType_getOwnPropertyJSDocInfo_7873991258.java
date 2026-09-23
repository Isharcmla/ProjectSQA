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
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_getOwnPropertyJSDocInfo_7873991258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1130;
     Object term7028;

    public PrototypeObjectType_getOwnPropertyJSDocInfo_7873991258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1143 = new HashMap();
        term1130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1164 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1130, term1130.getClass(), "className", "UfQtPRyWRC");
        setField(term1130, term1130.getClass(), "properties", term1143);
        setBooleanField(term1130, term1130.getClass(), "nativeType", false);
        setField(term1130, term1130.getClass(), "implicitPrototypeFallback", null);
        setField(term1155, term1155.getClass(), "call", null);
        setField(term1155, term1155.getClass(), "prototypeSlot", null);
        setField(term1155, term1155.getClass(), "kind", null);
        setField(term1155, term1155.getClass(), "typeOfThis", null);
        setField(term1155, term1155.getClass(), "source", null);
        setField(term1155, term1155.getClass(), "implementedInterfaces", null);
        setField(term1155, term1155.getClass(), "extendedInterfaces", null);
        setField(term1155, term1155.getClass(), "subTypes", null);
        setField(term1155, term1155.getClass(), "templateTypeNames", null);
        setField(term1155, term1155.getClass(), "className", null);
        setField(term1155, term1155.getClass(), "properties", null);
        setBooleanField(term1155, term1155.getClass(), "nativeType", false);
        setField(term1155, term1155.getClass(), "implicitPrototypeFallback", null);
        setField(term1155, term1155.getClass(), "ownerFunction", null);
        setBooleanField(term1155, term1155.getClass(), "prettyPrint", false);
        setBooleanField(term1155, term1155.getClass(), "visited", false);
        setField(term1155, term1155.getClass(), "docInfo", null);
        setBooleanField(term1155, term1155.getClass(), "unknown", false);
        setBooleanField(term1155, term1155.getClass(), "resolved", false);
        setField(term1155, term1155.getClass(), "resolveResult", null);
        setBooleanField(term1155, term1155.getClass(), "inTemplatedCheckVisit", false);
        setField(term1155, term1155.getClass(), "registry", null);
        setField(term1130, term1130.getClass(), "ownerFunction", term1155);
        setBooleanField(term1130, term1130.getClass(), "prettyPrint", true);
        setBooleanField(term1130, term1130.getClass(), "visited", true);
        setField(term1164, term1164.getClass(), "info", null);
        setField(term1164, term1164.getClass(), "documentation", null);
        setField(term1164, term1164.getClass(), "associatedNode", null);
        setField(term1164, term1164.getClass(), "visibility", null);
        setIntField(term1164, term1164.getClass(), "bitset", 0);
        setField(term1164, term1164.getClass(), "type", null);
        setField(term1164, term1164.getClass(), "thisType", null);
        setBooleanField(term1164, term1164.getClass(), "includeDocumentation", false);
        setField(term1130, term1130.getClass(), "docInfo", term1164);
        setBooleanField(term1130, term1130.getClass(), "unknown", false);
        setBooleanField(term1130, term1130.getClass(), "resolved", false);
        setField(term1130, term1130.getClass(), "resolveResult", null);
        setBooleanField(term1130, term1130.getClass(), "inTemplatedCheckVisit", false);
        setField(term1130, term1130.getClass(), "registry", null);
        HashMap term7031 = new HashMap();
        term7028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7033 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7028, term7028.getClass(), "className", "UfQtPRyWRC");
        setField(term7028, term7028.getClass(), "properties", term7031);
        setBooleanField(term7028, term7028.getClass(), "nativeType", false);
        setField(term7028, term7028.getClass(), "implicitPrototypeFallback", null);
        setField(term7032, term7032.getClass(), "call", null);
        setField(term7032, term7032.getClass(), "prototypeSlot", null);
        setField(term7032, term7032.getClass(), "kind", null);
        setField(term7032, term7032.getClass(), "typeOfThis", null);
        setField(term7032, term7032.getClass(), "source", null);
        setField(term7032, term7032.getClass(), "implementedInterfaces", null);
        setField(term7032, term7032.getClass(), "extendedInterfaces", null);
        setField(term7032, term7032.getClass(), "subTypes", null);
        setField(term7032, term7032.getClass(), "templateTypeNames", null);
        setField(term7032, term7032.getClass(), "className", null);
        setField(term7032, term7032.getClass(), "properties", null);
        setBooleanField(term7032, term7032.getClass(), "nativeType", false);
        setField(term7032, term7032.getClass(), "implicitPrototypeFallback", null);
        setField(term7032, term7032.getClass(), "ownerFunction", null);
        setBooleanField(term7032, term7032.getClass(), "prettyPrint", false);
        setBooleanField(term7032, term7032.getClass(), "visited", false);
        setField(term7032, term7032.getClass(), "docInfo", null);
        setBooleanField(term7032, term7032.getClass(), "unknown", false);
        setBooleanField(term7032, term7032.getClass(), "resolved", false);
        setField(term7032, term7032.getClass(), "resolveResult", null);
        setBooleanField(term7032, term7032.getClass(), "inTemplatedCheckVisit", false);
        setField(term7032, term7032.getClass(), "registry", null);
        setField(term7028, term7028.getClass(), "ownerFunction", term7032);
        setBooleanField(term7028, term7028.getClass(), "prettyPrint", true);
        setBooleanField(term7028, term7028.getClass(), "visited", true);
        setField(term7033, term7033.getClass(), "info", null);
        setField(term7033, term7033.getClass(), "documentation", null);
        setField(term7033, term7033.getClass(), "associatedNode", null);
        setField(term7033, term7033.getClass(), "visibility", null);
        setIntField(term7033, term7033.getClass(), "bitset", 0);
        setField(term7033, term7033.getClass(), "type", null);
        setField(term7033, term7033.getClass(), "thisType", null);
        setBooleanField(term7033, term7033.getClass(), "includeDocumentation", false);
        setField(term7028, term7028.getClass(), "docInfo", term7033);
        setBooleanField(term7028, term7028.getClass(), "unknown", false);
        setBooleanField(term7028, term7028.getClass(), "resolved", false);
        setField(term7028, term7028.getClass(), "resolveResult", null);
        setBooleanField(term7028, term7028.getClass(), "inTemplatedCheckVisit", false);
        setField(term7028, term7028.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HzqpegHiRq";
        Object retValue = callMethod(klass, "getOwnPropertyJSDocInfo", argTypes, term1130, args);
        assertTrue(recursiveEquals(term1130, term7028));
        assertTrue(recursiveEquals(retValue, null));
    }

};


