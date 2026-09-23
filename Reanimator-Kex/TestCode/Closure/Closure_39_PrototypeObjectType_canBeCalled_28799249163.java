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

public class PrototypeObjectType_canBeCalled_28799249163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2091;
     Object term7796;

    public PrototypeObjectType_canBeCalled_28799249163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2104 = new HashMap();
        term2091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2124 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2091, term2091.getClass(), "className", "iikZEapDlu");
        setField(term2091, term2091.getClass(), "properties", term2104);
        setBooleanField(term2091, term2091.getClass(), "nativeType", true);
        setField(term2091, term2091.getClass(), "implicitPrototypeFallback", null);
        setField(term2116, term2116.getClass(), "call", null);
        setField(term2116, term2116.getClass(), "prototypeSlot", null);
        setField(term2116, term2116.getClass(), "kind", null);
        setField(term2116, term2116.getClass(), "typeOfThis", null);
        setField(term2116, term2116.getClass(), "source", null);
        setField(term2116, term2116.getClass(), "implementedInterfaces", null);
        setField(term2116, term2116.getClass(), "extendedInterfaces", null);
        setField(term2116, term2116.getClass(), "subTypes", null);
        setField(term2116, term2116.getClass(), "templateTypeName", null);
        setField(term2116, term2116.getClass(), "className", null);
        setField(term2116, term2116.getClass(), "properties", null);
        setBooleanField(term2116, term2116.getClass(), "nativeType", false);
        setField(term2116, term2116.getClass(), "implicitPrototypeFallback", null);
        setField(term2116, term2116.getClass(), "ownerFunction", null);
        setBooleanField(term2116, term2116.getClass(), "prettyPrint", false);
        setBooleanField(term2116, term2116.getClass(), "visited", false);
        setField(term2116, term2116.getClass(), "docInfo", null);
        setBooleanField(term2116, term2116.getClass(), "unknown", false);
        setBooleanField(term2116, term2116.getClass(), "resolved", false);
        setField(term2116, term2116.getClass(), "resolveResult", null);
        setField(term2116, term2116.getClass(), "registry", null);
        setField(term2091, term2091.getClass(), "ownerFunction", term2116);
        setBooleanField(term2091, term2091.getClass(), "prettyPrint", false);
        setBooleanField(term2091, term2091.getClass(), "visited", false);
        setField(term2124, term2124.getClass(), "info", null);
        setField(term2124, term2124.getClass(), "documentation", null);
        setField(term2124, term2124.getClass(), "associatedNode", null);
        setField(term2124, term2124.getClass(), "visibility", null);
        setIntField(term2124, term2124.getClass(), "bitset", 0);
        setField(term2124, term2124.getClass(), "type", null);
        setField(term2124, term2124.getClass(), "thisType", null);
        setBooleanField(term2124, term2124.getClass(), "includeDocumentation", false);
        setField(term2091, term2091.getClass(), "docInfo", term2124);
        setBooleanField(term2091, term2091.getClass(), "unknown", true);
        setBooleanField(term2091, term2091.getClass(), "resolved", false);
        setField(term2091, term2091.getClass(), "resolveResult", null);
        setField(term2091, term2091.getClass(), "registry", null);
        HashMap term7799 = new HashMap();
        term7796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7801 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7796, term7796.getClass(), "className", "iikZEapDlu");
        setField(term7796, term7796.getClass(), "properties", term7799);
        setBooleanField(term7796, term7796.getClass(), "nativeType", true);
        setField(term7796, term7796.getClass(), "implicitPrototypeFallback", null);
        setField(term7800, term7800.getClass(), "call", null);
        setField(term7800, term7800.getClass(), "prototypeSlot", null);
        setField(term7800, term7800.getClass(), "kind", null);
        setField(term7800, term7800.getClass(), "typeOfThis", null);
        setField(term7800, term7800.getClass(), "source", null);
        setField(term7800, term7800.getClass(), "implementedInterfaces", null);
        setField(term7800, term7800.getClass(), "extendedInterfaces", null);
        setField(term7800, term7800.getClass(), "subTypes", null);
        setField(term7800, term7800.getClass(), "templateTypeName", null);
        setField(term7800, term7800.getClass(), "className", null);
        setField(term7800, term7800.getClass(), "properties", null);
        setBooleanField(term7800, term7800.getClass(), "nativeType", false);
        setField(term7800, term7800.getClass(), "implicitPrototypeFallback", null);
        setField(term7800, term7800.getClass(), "ownerFunction", null);
        setBooleanField(term7800, term7800.getClass(), "prettyPrint", false);
        setBooleanField(term7800, term7800.getClass(), "visited", false);
        setField(term7800, term7800.getClass(), "docInfo", null);
        setBooleanField(term7800, term7800.getClass(), "unknown", false);
        setBooleanField(term7800, term7800.getClass(), "resolved", false);
        setField(term7800, term7800.getClass(), "resolveResult", null);
        setField(term7800, term7800.getClass(), "registry", null);
        setField(term7796, term7796.getClass(), "ownerFunction", term7800);
        setBooleanField(term7796, term7796.getClass(), "prettyPrint", false);
        setBooleanField(term7796, term7796.getClass(), "visited", false);
        setField(term7801, term7801.getClass(), "info", null);
        setField(term7801, term7801.getClass(), "documentation", null);
        setField(term7801, term7801.getClass(), "associatedNode", null);
        setField(term7801, term7801.getClass(), "visibility", null);
        setIntField(term7801, term7801.getClass(), "bitset", 0);
        setField(term7801, term7801.getClass(), "type", null);
        setField(term7801, term7801.getClass(), "thisType", null);
        setBooleanField(term7801, term7801.getClass(), "includeDocumentation", false);
        setField(term7796, term7796.getClass(), "docInfo", term7801);
        setBooleanField(term7796, term7796.getClass(), "unknown", true);
        setBooleanField(term7796, term7796.getClass(), "resolved", false);
        setField(term7796, term7796.getClass(), "resolveResult", null);
        setField(term7796, term7796.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBeCalled", argTypes, term2091, args);
        assertTrue(recursiveEquals(term2091, term7796));
    }

};


