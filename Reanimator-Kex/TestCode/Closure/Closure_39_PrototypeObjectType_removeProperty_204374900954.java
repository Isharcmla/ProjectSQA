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

public class PrototypeObjectType_removeProperty_204374900954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term964;
     Object term6639;

    public PrototypeObjectType_removeProperty_204374900954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term977 = new HashMap();
        term964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term997 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term964, term964.getClass(), "className", "PznxWXsZME");
        setField(term964, term964.getClass(), "properties", term977);
        setBooleanField(term964, term964.getClass(), "nativeType", false);
        setField(term964, term964.getClass(), "implicitPrototypeFallback", null);
        setField(term989, term989.getClass(), "call", null);
        setField(term989, term989.getClass(), "prototypeSlot", null);
        setField(term989, term989.getClass(), "kind", null);
        setField(term989, term989.getClass(), "typeOfThis", null);
        setField(term989, term989.getClass(), "source", null);
        setField(term989, term989.getClass(), "implementedInterfaces", null);
        setField(term989, term989.getClass(), "extendedInterfaces", null);
        setField(term989, term989.getClass(), "subTypes", null);
        setField(term989, term989.getClass(), "templateTypeName", null);
        setField(term989, term989.getClass(), "className", null);
        setField(term989, term989.getClass(), "properties", null);
        setBooleanField(term989, term989.getClass(), "nativeType", false);
        setField(term989, term989.getClass(), "implicitPrototypeFallback", null);
        setField(term989, term989.getClass(), "ownerFunction", null);
        setBooleanField(term989, term989.getClass(), "prettyPrint", false);
        setBooleanField(term989, term989.getClass(), "visited", false);
        setField(term989, term989.getClass(), "docInfo", null);
        setBooleanField(term989, term989.getClass(), "unknown", false);
        setBooleanField(term989, term989.getClass(), "resolved", false);
        setField(term989, term989.getClass(), "resolveResult", null);
        setField(term989, term989.getClass(), "registry", null);
        setField(term964, term964.getClass(), "ownerFunction", term989);
        setBooleanField(term964, term964.getClass(), "prettyPrint", false);
        setBooleanField(term964, term964.getClass(), "visited", true);
        setField(term997, term997.getClass(), "info", null);
        setField(term997, term997.getClass(), "documentation", null);
        setField(term997, term997.getClass(), "associatedNode", null);
        setField(term997, term997.getClass(), "visibility", null);
        setIntField(term997, term997.getClass(), "bitset", 0);
        setField(term997, term997.getClass(), "type", null);
        setField(term997, term997.getClass(), "thisType", null);
        setBooleanField(term997, term997.getClass(), "includeDocumentation", false);
        setField(term964, term964.getClass(), "docInfo", term997);
        setBooleanField(term964, term964.getClass(), "unknown", true);
        setBooleanField(term964, term964.getClass(), "resolved", true);
        setField(term964, term964.getClass(), "resolveResult", null);
        setField(term964, term964.getClass(), "registry", null);
        HashMap term6642 = new HashMap();
        term6639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6644 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6639, term6639.getClass(), "className", "PznxWXsZME");
        setField(term6639, term6639.getClass(), "properties", term6642);
        setBooleanField(term6639, term6639.getClass(), "nativeType", false);
        setField(term6639, term6639.getClass(), "implicitPrototypeFallback", null);
        setField(term6643, term6643.getClass(), "call", null);
        setField(term6643, term6643.getClass(), "prototypeSlot", null);
        setField(term6643, term6643.getClass(), "kind", null);
        setField(term6643, term6643.getClass(), "typeOfThis", null);
        setField(term6643, term6643.getClass(), "source", null);
        setField(term6643, term6643.getClass(), "implementedInterfaces", null);
        setField(term6643, term6643.getClass(), "extendedInterfaces", null);
        setField(term6643, term6643.getClass(), "subTypes", null);
        setField(term6643, term6643.getClass(), "templateTypeName", null);
        setField(term6643, term6643.getClass(), "className", null);
        setField(term6643, term6643.getClass(), "properties", null);
        setBooleanField(term6643, term6643.getClass(), "nativeType", false);
        setField(term6643, term6643.getClass(), "implicitPrototypeFallback", null);
        setField(term6643, term6643.getClass(), "ownerFunction", null);
        setBooleanField(term6643, term6643.getClass(), "prettyPrint", false);
        setBooleanField(term6643, term6643.getClass(), "visited", false);
        setField(term6643, term6643.getClass(), "docInfo", null);
        setBooleanField(term6643, term6643.getClass(), "unknown", false);
        setBooleanField(term6643, term6643.getClass(), "resolved", false);
        setField(term6643, term6643.getClass(), "resolveResult", null);
        setField(term6643, term6643.getClass(), "registry", null);
        setField(term6639, term6639.getClass(), "ownerFunction", term6643);
        setBooleanField(term6639, term6639.getClass(), "prettyPrint", false);
        setBooleanField(term6639, term6639.getClass(), "visited", true);
        setField(term6644, term6644.getClass(), "info", null);
        setField(term6644, term6644.getClass(), "documentation", null);
        setField(term6644, term6644.getClass(), "associatedNode", null);
        setField(term6644, term6644.getClass(), "visibility", null);
        setIntField(term6644, term6644.getClass(), "bitset", 0);
        setField(term6644, term6644.getClass(), "type", null);
        setField(term6644, term6644.getClass(), "thisType", null);
        setBooleanField(term6644, term6644.getClass(), "includeDocumentation", false);
        setField(term6639, term6639.getClass(), "docInfo", term6644);
        setBooleanField(term6639, term6639.getClass(), "unknown", true);
        setBooleanField(term6639, term6639.getClass(), "resolved", true);
        setField(term6639, term6639.getClass(), "resolveResult", null);
        setField(term6639, term6639.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        Object retValue = callMethod(klass, "removeProperty", argTypes, term964, args);
        assertTrue(recursiveEquals(term964, term6639));
        assertTrue(recursiveEquals(retValue, false));
    }

};


