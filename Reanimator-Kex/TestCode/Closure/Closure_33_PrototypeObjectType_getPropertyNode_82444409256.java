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

public class PrototypeObjectType_getPropertyNode_82444409256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1034;
     Object term6782;

    public PrototypeObjectType_getPropertyNode_82444409256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1047 = new HashMap();
        term1034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1067 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1034, term1034.getClass(), "className", "mvrkADEgpp");
        setField(term1034, term1034.getClass(), "properties", term1047);
        setBooleanField(term1034, term1034.getClass(), "nativeType", true);
        setField(term1034, term1034.getClass(), "implicitPrototypeFallback", null);
        setField(term1059, term1059.getClass(), "call", null);
        setField(term1059, term1059.getClass(), "prototypeSlot", null);
        setField(term1059, term1059.getClass(), "kind", null);
        setField(term1059, term1059.getClass(), "typeOfThis", null);
        setField(term1059, term1059.getClass(), "source", null);
        setField(term1059, term1059.getClass(), "implementedInterfaces", null);
        setField(term1059, term1059.getClass(), "extendedInterfaces", null);
        setField(term1059, term1059.getClass(), "subTypes", null);
        setField(term1059, term1059.getClass(), "templateTypeName", null);
        setField(term1059, term1059.getClass(), "className", null);
        setField(term1059, term1059.getClass(), "properties", null);
        setBooleanField(term1059, term1059.getClass(), "nativeType", false);
        setField(term1059, term1059.getClass(), "implicitPrototypeFallback", null);
        setField(term1059, term1059.getClass(), "ownerFunction", null);
        setBooleanField(term1059, term1059.getClass(), "prettyPrint", false);
        setBooleanField(term1059, term1059.getClass(), "visited", false);
        setField(term1059, term1059.getClass(), "docInfo", null);
        setBooleanField(term1059, term1059.getClass(), "unknown", false);
        setBooleanField(term1059, term1059.getClass(), "resolved", false);
        setField(term1059, term1059.getClass(), "resolveResult", null);
        setField(term1059, term1059.getClass(), "registry", null);
        setField(term1034, term1034.getClass(), "ownerFunction", term1059);
        setBooleanField(term1034, term1034.getClass(), "prettyPrint", false);
        setBooleanField(term1034, term1034.getClass(), "visited", false);
        setField(term1067, term1067.getClass(), "info", null);
        setField(term1067, term1067.getClass(), "documentation", null);
        setField(term1067, term1067.getClass(), "associatedNode", null);
        setField(term1067, term1067.getClass(), "visibility", null);
        setIntField(term1067, term1067.getClass(), "bitset", 0);
        setField(term1067, term1067.getClass(), "type", null);
        setField(term1067, term1067.getClass(), "thisType", null);
        setBooleanField(term1067, term1067.getClass(), "includeDocumentation", false);
        setField(term1034, term1034.getClass(), "docInfo", term1067);
        setBooleanField(term1034, term1034.getClass(), "unknown", true);
        setBooleanField(term1034, term1034.getClass(), "resolved", true);
        setField(term1034, term1034.getClass(), "resolveResult", null);
        setField(term1034, term1034.getClass(), "registry", null);
        HashMap term6785 = new HashMap();
        term6782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6787 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6782, term6782.getClass(), "className", "mvrkADEgpp");
        setField(term6782, term6782.getClass(), "properties", term6785);
        setBooleanField(term6782, term6782.getClass(), "nativeType", true);
        setField(term6782, term6782.getClass(), "implicitPrototypeFallback", null);
        setField(term6786, term6786.getClass(), "call", null);
        setField(term6786, term6786.getClass(), "prototypeSlot", null);
        setField(term6786, term6786.getClass(), "kind", null);
        setField(term6786, term6786.getClass(), "typeOfThis", null);
        setField(term6786, term6786.getClass(), "source", null);
        setField(term6786, term6786.getClass(), "implementedInterfaces", null);
        setField(term6786, term6786.getClass(), "extendedInterfaces", null);
        setField(term6786, term6786.getClass(), "subTypes", null);
        setField(term6786, term6786.getClass(), "templateTypeName", null);
        setField(term6786, term6786.getClass(), "className", null);
        setField(term6786, term6786.getClass(), "properties", null);
        setBooleanField(term6786, term6786.getClass(), "nativeType", false);
        setField(term6786, term6786.getClass(), "implicitPrototypeFallback", null);
        setField(term6786, term6786.getClass(), "ownerFunction", null);
        setBooleanField(term6786, term6786.getClass(), "prettyPrint", false);
        setBooleanField(term6786, term6786.getClass(), "visited", false);
        setField(term6786, term6786.getClass(), "docInfo", null);
        setBooleanField(term6786, term6786.getClass(), "unknown", false);
        setBooleanField(term6786, term6786.getClass(), "resolved", false);
        setField(term6786, term6786.getClass(), "resolveResult", null);
        setField(term6786, term6786.getClass(), "registry", null);
        setField(term6782, term6782.getClass(), "ownerFunction", term6786);
        setBooleanField(term6782, term6782.getClass(), "prettyPrint", false);
        setBooleanField(term6782, term6782.getClass(), "visited", false);
        setField(term6787, term6787.getClass(), "info", null);
        setField(term6787, term6787.getClass(), "documentation", null);
        setField(term6787, term6787.getClass(), "associatedNode", null);
        setField(term6787, term6787.getClass(), "visibility", null);
        setIntField(term6787, term6787.getClass(), "bitset", 0);
        setField(term6787, term6787.getClass(), "type", null);
        setField(term6787, term6787.getClass(), "thisType", null);
        setBooleanField(term6787, term6787.getClass(), "includeDocumentation", false);
        setField(term6782, term6782.getClass(), "docInfo", term6787);
        setBooleanField(term6782, term6782.getClass(), "unknown", true);
        setBooleanField(term6782, term6782.getClass(), "resolved", true);
        setField(term6782, term6782.getClass(), "resolveResult", null);
        setField(term6782, term6782.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EeBVbzjcCI";
        Object retValue = callMethod(klass, "getPropertyNode", argTypes, term1034, args);
        assertTrue(recursiveEquals(term1034, term6782));
        assertTrue(recursiveEquals(retValue, null));
    }

};


