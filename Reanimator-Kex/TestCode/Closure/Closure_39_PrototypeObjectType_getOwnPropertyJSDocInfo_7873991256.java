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

public class PrototypeObjectType_getOwnPropertyJSDocInfo_7873991256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1104;
     Object term6827;

    public PrototypeObjectType_getOwnPropertyJSDocInfo_7873991256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1117 = new HashMap();
        term1104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1137 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1104, term1104.getClass(), "className", "UfQtPRyWRC");
        setField(term1104, term1104.getClass(), "properties", term1117);
        setBooleanField(term1104, term1104.getClass(), "nativeType", false);
        setField(term1104, term1104.getClass(), "implicitPrototypeFallback", null);
        setField(term1129, term1129.getClass(), "call", null);
        setField(term1129, term1129.getClass(), "prototypeSlot", null);
        setField(term1129, term1129.getClass(), "kind", null);
        setField(term1129, term1129.getClass(), "typeOfThis", null);
        setField(term1129, term1129.getClass(), "source", null);
        setField(term1129, term1129.getClass(), "implementedInterfaces", null);
        setField(term1129, term1129.getClass(), "extendedInterfaces", null);
        setField(term1129, term1129.getClass(), "subTypes", null);
        setField(term1129, term1129.getClass(), "templateTypeName", null);
        setField(term1129, term1129.getClass(), "className", null);
        setField(term1129, term1129.getClass(), "properties", null);
        setBooleanField(term1129, term1129.getClass(), "nativeType", false);
        setField(term1129, term1129.getClass(), "implicitPrototypeFallback", null);
        setField(term1129, term1129.getClass(), "ownerFunction", null);
        setBooleanField(term1129, term1129.getClass(), "prettyPrint", false);
        setBooleanField(term1129, term1129.getClass(), "visited", false);
        setField(term1129, term1129.getClass(), "docInfo", null);
        setBooleanField(term1129, term1129.getClass(), "unknown", false);
        setBooleanField(term1129, term1129.getClass(), "resolved", false);
        setField(term1129, term1129.getClass(), "resolveResult", null);
        setField(term1129, term1129.getClass(), "registry", null);
        setField(term1104, term1104.getClass(), "ownerFunction", term1129);
        setBooleanField(term1104, term1104.getClass(), "prettyPrint", true);
        setBooleanField(term1104, term1104.getClass(), "visited", true);
        setField(term1137, term1137.getClass(), "info", null);
        setField(term1137, term1137.getClass(), "documentation", null);
        setField(term1137, term1137.getClass(), "associatedNode", null);
        setField(term1137, term1137.getClass(), "visibility", null);
        setIntField(term1137, term1137.getClass(), "bitset", 0);
        setField(term1137, term1137.getClass(), "type", null);
        setField(term1137, term1137.getClass(), "thisType", null);
        setBooleanField(term1137, term1137.getClass(), "includeDocumentation", false);
        setField(term1104, term1104.getClass(), "docInfo", term1137);
        setBooleanField(term1104, term1104.getClass(), "unknown", false);
        setBooleanField(term1104, term1104.getClass(), "resolved", false);
        setField(term1104, term1104.getClass(), "resolveResult", null);
        setField(term1104, term1104.getClass(), "registry", null);
        HashMap term6830 = new HashMap();
        term6827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6832 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6827, term6827.getClass(), "className", "UfQtPRyWRC");
        setField(term6827, term6827.getClass(), "properties", term6830);
        setBooleanField(term6827, term6827.getClass(), "nativeType", false);
        setField(term6827, term6827.getClass(), "implicitPrototypeFallback", null);
        setField(term6831, term6831.getClass(), "call", null);
        setField(term6831, term6831.getClass(), "prototypeSlot", null);
        setField(term6831, term6831.getClass(), "kind", null);
        setField(term6831, term6831.getClass(), "typeOfThis", null);
        setField(term6831, term6831.getClass(), "source", null);
        setField(term6831, term6831.getClass(), "implementedInterfaces", null);
        setField(term6831, term6831.getClass(), "extendedInterfaces", null);
        setField(term6831, term6831.getClass(), "subTypes", null);
        setField(term6831, term6831.getClass(), "templateTypeName", null);
        setField(term6831, term6831.getClass(), "className", null);
        setField(term6831, term6831.getClass(), "properties", null);
        setBooleanField(term6831, term6831.getClass(), "nativeType", false);
        setField(term6831, term6831.getClass(), "implicitPrototypeFallback", null);
        setField(term6831, term6831.getClass(), "ownerFunction", null);
        setBooleanField(term6831, term6831.getClass(), "prettyPrint", false);
        setBooleanField(term6831, term6831.getClass(), "visited", false);
        setField(term6831, term6831.getClass(), "docInfo", null);
        setBooleanField(term6831, term6831.getClass(), "unknown", false);
        setBooleanField(term6831, term6831.getClass(), "resolved", false);
        setField(term6831, term6831.getClass(), "resolveResult", null);
        setField(term6831, term6831.getClass(), "registry", null);
        setField(term6827, term6827.getClass(), "ownerFunction", term6831);
        setBooleanField(term6827, term6827.getClass(), "prettyPrint", true);
        setBooleanField(term6827, term6827.getClass(), "visited", true);
        setField(term6832, term6832.getClass(), "info", null);
        setField(term6832, term6832.getClass(), "documentation", null);
        setField(term6832, term6832.getClass(), "associatedNode", null);
        setField(term6832, term6832.getClass(), "visibility", null);
        setIntField(term6832, term6832.getClass(), "bitset", 0);
        setField(term6832, term6832.getClass(), "type", null);
        setField(term6832, term6832.getClass(), "thisType", null);
        setBooleanField(term6832, term6832.getClass(), "includeDocumentation", false);
        setField(term6827, term6827.getClass(), "docInfo", term6832);
        setBooleanField(term6827, term6827.getClass(), "unknown", false);
        setBooleanField(term6827, term6827.getClass(), "resolved", false);
        setField(term6827, term6827.getClass(), "resolveResult", null);
        setField(term6827, term6827.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HzqpegHiRq";
        Object retValue = callMethod(klass, "getOwnPropertyJSDocInfo", argTypes, term1104, args);
        assertTrue(recursiveEquals(term1104, term6827));
        assertTrue(recursiveEquals(retValue, null));
    }

};


