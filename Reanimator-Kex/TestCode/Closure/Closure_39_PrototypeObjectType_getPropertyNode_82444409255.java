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

public class PrototypeObjectType_getPropertyNode_82444409255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1034;
     Object term6734;

    public PrototypeObjectType_getPropertyNode_82444409255() {
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
        HashMap term6737 = new HashMap();
        term6734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6739 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6734, term6734.getClass(), "className", "mvrkADEgpp");
        setField(term6734, term6734.getClass(), "properties", term6737);
        setBooleanField(term6734, term6734.getClass(), "nativeType", true);
        setField(term6734, term6734.getClass(), "implicitPrototypeFallback", null);
        setField(term6738, term6738.getClass(), "call", null);
        setField(term6738, term6738.getClass(), "prototypeSlot", null);
        setField(term6738, term6738.getClass(), "kind", null);
        setField(term6738, term6738.getClass(), "typeOfThis", null);
        setField(term6738, term6738.getClass(), "source", null);
        setField(term6738, term6738.getClass(), "implementedInterfaces", null);
        setField(term6738, term6738.getClass(), "extendedInterfaces", null);
        setField(term6738, term6738.getClass(), "subTypes", null);
        setField(term6738, term6738.getClass(), "templateTypeName", null);
        setField(term6738, term6738.getClass(), "className", null);
        setField(term6738, term6738.getClass(), "properties", null);
        setBooleanField(term6738, term6738.getClass(), "nativeType", false);
        setField(term6738, term6738.getClass(), "implicitPrototypeFallback", null);
        setField(term6738, term6738.getClass(), "ownerFunction", null);
        setBooleanField(term6738, term6738.getClass(), "prettyPrint", false);
        setBooleanField(term6738, term6738.getClass(), "visited", false);
        setField(term6738, term6738.getClass(), "docInfo", null);
        setBooleanField(term6738, term6738.getClass(), "unknown", false);
        setBooleanField(term6738, term6738.getClass(), "resolved", false);
        setField(term6738, term6738.getClass(), "resolveResult", null);
        setField(term6738, term6738.getClass(), "registry", null);
        setField(term6734, term6734.getClass(), "ownerFunction", term6738);
        setBooleanField(term6734, term6734.getClass(), "prettyPrint", false);
        setBooleanField(term6734, term6734.getClass(), "visited", false);
        setField(term6739, term6739.getClass(), "info", null);
        setField(term6739, term6739.getClass(), "documentation", null);
        setField(term6739, term6739.getClass(), "associatedNode", null);
        setField(term6739, term6739.getClass(), "visibility", null);
        setIntField(term6739, term6739.getClass(), "bitset", 0);
        setField(term6739, term6739.getClass(), "type", null);
        setField(term6739, term6739.getClass(), "thisType", null);
        setBooleanField(term6739, term6739.getClass(), "includeDocumentation", false);
        setField(term6734, term6734.getClass(), "docInfo", term6739);
        setBooleanField(term6734, term6734.getClass(), "unknown", true);
        setBooleanField(term6734, term6734.getClass(), "resolved", true);
        setField(term6734, term6734.getClass(), "resolveResult", null);
        setField(term6734, term6734.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EeBVbzjcCI";
        Object retValue = callMethod(klass, "getPropertyNode", argTypes, term1034, args);
        assertTrue(recursiveEquals(term1034, term6734));
        assertTrue(recursiveEquals(retValue, null));
    }

};


