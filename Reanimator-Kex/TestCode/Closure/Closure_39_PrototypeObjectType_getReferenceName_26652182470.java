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

public class PrototypeObjectType_getReferenceName_26652182470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2431;
     Object term8511;

    public PrototypeObjectType_getReferenceName_26652182470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2444 = new HashMap();
        term2431 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2464 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2431, term2431.getClass(), "className", "OIHoJeysUi");
        setField(term2431, term2431.getClass(), "properties", term2444);
        setBooleanField(term2431, term2431.getClass(), "nativeType", true);
        setField(term2431, term2431.getClass(), "implicitPrototypeFallback", null);
        setField(term2456, term2456.getClass(), "call", null);
        setField(term2456, term2456.getClass(), "prototypeSlot", null);
        setField(term2456, term2456.getClass(), "kind", null);
        setField(term2456, term2456.getClass(), "typeOfThis", null);
        setField(term2456, term2456.getClass(), "source", null);
        setField(term2456, term2456.getClass(), "implementedInterfaces", null);
        setField(term2456, term2456.getClass(), "extendedInterfaces", null);
        setField(term2456, term2456.getClass(), "subTypes", null);
        setField(term2456, term2456.getClass(), "templateTypeName", null);
        setField(term2456, term2456.getClass(), "className", null);
        setField(term2456, term2456.getClass(), "properties", null);
        setBooleanField(term2456, term2456.getClass(), "nativeType", false);
        setField(term2456, term2456.getClass(), "implicitPrototypeFallback", null);
        setField(term2456, term2456.getClass(), "ownerFunction", null);
        setBooleanField(term2456, term2456.getClass(), "prettyPrint", false);
        setBooleanField(term2456, term2456.getClass(), "visited", false);
        setField(term2456, term2456.getClass(), "docInfo", null);
        setBooleanField(term2456, term2456.getClass(), "unknown", false);
        setBooleanField(term2456, term2456.getClass(), "resolved", false);
        setField(term2456, term2456.getClass(), "resolveResult", null);
        setField(term2456, term2456.getClass(), "registry", null);
        setField(term2431, term2431.getClass(), "ownerFunction", term2456);
        setBooleanField(term2431, term2431.getClass(), "prettyPrint", true);
        setBooleanField(term2431, term2431.getClass(), "visited", false);
        setField(term2464, term2464.getClass(), "info", null);
        setField(term2464, term2464.getClass(), "documentation", null);
        setField(term2464, term2464.getClass(), "associatedNode", null);
        setField(term2464, term2464.getClass(), "visibility", null);
        setIntField(term2464, term2464.getClass(), "bitset", 0);
        setField(term2464, term2464.getClass(), "type", null);
        setField(term2464, term2464.getClass(), "thisType", null);
        setBooleanField(term2464, term2464.getClass(), "includeDocumentation", false);
        setField(term2431, term2431.getClass(), "docInfo", term2464);
        setBooleanField(term2431, term2431.getClass(), "unknown", false);
        setBooleanField(term2431, term2431.getClass(), "resolved", false);
        setField(term2431, term2431.getClass(), "resolveResult", null);
        setField(term2431, term2431.getClass(), "registry", null);
        HashMap term8514 = new HashMap();
        term8511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8516 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8511, term8511.getClass(), "className", "OIHoJeysUi");
        setField(term8511, term8511.getClass(), "properties", term8514);
        setBooleanField(term8511, term8511.getClass(), "nativeType", true);
        setField(term8511, term8511.getClass(), "implicitPrototypeFallback", null);
        setField(term8515, term8515.getClass(), "call", null);
        setField(term8515, term8515.getClass(), "prototypeSlot", null);
        setField(term8515, term8515.getClass(), "kind", null);
        setField(term8515, term8515.getClass(), "typeOfThis", null);
        setField(term8515, term8515.getClass(), "source", null);
        setField(term8515, term8515.getClass(), "implementedInterfaces", null);
        setField(term8515, term8515.getClass(), "extendedInterfaces", null);
        setField(term8515, term8515.getClass(), "subTypes", null);
        setField(term8515, term8515.getClass(), "templateTypeName", null);
        setField(term8515, term8515.getClass(), "className", null);
        setField(term8515, term8515.getClass(), "properties", null);
        setBooleanField(term8515, term8515.getClass(), "nativeType", false);
        setField(term8515, term8515.getClass(), "implicitPrototypeFallback", null);
        setField(term8515, term8515.getClass(), "ownerFunction", null);
        setBooleanField(term8515, term8515.getClass(), "prettyPrint", false);
        setBooleanField(term8515, term8515.getClass(), "visited", false);
        setField(term8515, term8515.getClass(), "docInfo", null);
        setBooleanField(term8515, term8515.getClass(), "unknown", false);
        setBooleanField(term8515, term8515.getClass(), "resolved", false);
        setField(term8515, term8515.getClass(), "resolveResult", null);
        setField(term8515, term8515.getClass(), "registry", null);
        setField(term8511, term8511.getClass(), "ownerFunction", term8515);
        setBooleanField(term8511, term8511.getClass(), "prettyPrint", true);
        setBooleanField(term8511, term8511.getClass(), "visited", false);
        setField(term8516, term8516.getClass(), "info", null);
        setField(term8516, term8516.getClass(), "documentation", null);
        setField(term8516, term8516.getClass(), "associatedNode", null);
        setField(term8516, term8516.getClass(), "visibility", null);
        setIntField(term8516, term8516.getClass(), "bitset", 0);
        setField(term8516, term8516.getClass(), "type", null);
        setField(term8516, term8516.getClass(), "thisType", null);
        setBooleanField(term8516, term8516.getClass(), "includeDocumentation", false);
        setField(term8511, term8511.getClass(), "docInfo", term8516);
        setBooleanField(term8511, term8511.getClass(), "unknown", false);
        setBooleanField(term8511, term8511.getClass(), "resolved", false);
        setField(term8511, term8511.getClass(), "resolveResult", null);
        setField(term8511, term8511.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReferenceName", argTypes, term2431, args);
        assertTrue(recursiveEquals(term2431, term8511));
        assertTrue(recursiveEquals(retValue, "OIHoJeysUi"));
    }

};


