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

public class PrototypeObjectType_getOwnPropertyNames_208787190447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;
     Object term5197;
     Object term5164;

    public PrototypeObjectType_getOwnPropertyNames_208787190447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term487 = new HashMap();
        term474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term507 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term474, term474.getClass(), "className", "eVpkWxjuki");
        setField(term474, term474.getClass(), "properties", term487);
        setBooleanField(term474, term474.getClass(), "nativeType", false);
        setField(term474, term474.getClass(), "implicitPrototypeFallback", null);
        setField(term499, term499.getClass(), "call", null);
        setField(term499, term499.getClass(), "prototypeSlot", null);
        setField(term499, term499.getClass(), "kind", null);
        setField(term499, term499.getClass(), "typeOfThis", null);
        setField(term499, term499.getClass(), "source", null);
        setField(term499, term499.getClass(), "implementedInterfaces", null);
        setField(term499, term499.getClass(), "extendedInterfaces", null);
        setField(term499, term499.getClass(), "subTypes", null);
        setField(term499, term499.getClass(), "templateTypeName", null);
        setField(term499, term499.getClass(), "className", null);
        setField(term499, term499.getClass(), "properties", null);
        setBooleanField(term499, term499.getClass(), "nativeType", false);
        setField(term499, term499.getClass(), "implicitPrototypeFallback", null);
        setField(term499, term499.getClass(), "ownerFunction", null);
        setBooleanField(term499, term499.getClass(), "prettyPrint", false);
        setBooleanField(term499, term499.getClass(), "visited", false);
        setField(term499, term499.getClass(), "docInfo", null);
        setBooleanField(term499, term499.getClass(), "unknown", false);
        setBooleanField(term499, term499.getClass(), "resolved", false);
        setField(term499, term499.getClass(), "resolveResult", null);
        setField(term499, term499.getClass(), "registry", null);
        setField(term474, term474.getClass(), "ownerFunction", term499);
        setBooleanField(term474, term474.getClass(), "prettyPrint", true);
        setBooleanField(term474, term474.getClass(), "visited", true);
        setField(term507, term507.getClass(), "info", null);
        setField(term507, term507.getClass(), "documentation", null);
        setField(term507, term507.getClass(), "associatedNode", null);
        setField(term507, term507.getClass(), "visibility", null);
        setIntField(term507, term507.getClass(), "bitset", 0);
        setField(term507, term507.getClass(), "type", null);
        setField(term507, term507.getClass(), "thisType", null);
        setBooleanField(term507, term507.getClass(), "includeDocumentation", false);
        setField(term474, term474.getClass(), "docInfo", term507);
        setBooleanField(term474, term474.getClass(), "unknown", true);
        setBooleanField(term474, term474.getClass(), "resolved", false);
        setField(term474, term474.getClass(), "resolveResult", null);
        setField(term474, term474.getClass(), "registry", null);
        HashMap term5200 = new HashMap();
        term5197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term5202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5203 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5197, term5197.getClass(), "className", "eVpkWxjuki");
        setField(term5197, term5197.getClass(), "properties", term5200);
        setBooleanField(term5197, term5197.getClass(), "nativeType", false);
        setField(term5197, term5197.getClass(), "implicitPrototypeFallback", null);
        setField(term5202, term5202.getClass(), "call", null);
        setField(term5202, term5202.getClass(), "prototypeSlot", null);
        setField(term5202, term5202.getClass(), "kind", null);
        setField(term5202, term5202.getClass(), "typeOfThis", null);
        setField(term5202, term5202.getClass(), "source", null);
        setField(term5202, term5202.getClass(), "implementedInterfaces", null);
        setField(term5202, term5202.getClass(), "extendedInterfaces", null);
        setField(term5202, term5202.getClass(), "subTypes", null);
        setField(term5202, term5202.getClass(), "templateTypeName", null);
        setField(term5202, term5202.getClass(), "className", null);
        setField(term5202, term5202.getClass(), "properties", null);
        setBooleanField(term5202, term5202.getClass(), "nativeType", false);
        setField(term5202, term5202.getClass(), "implicitPrototypeFallback", null);
        setField(term5202, term5202.getClass(), "ownerFunction", null);
        setBooleanField(term5202, term5202.getClass(), "prettyPrint", false);
        setBooleanField(term5202, term5202.getClass(), "visited", false);
        setField(term5202, term5202.getClass(), "docInfo", null);
        setBooleanField(term5202, term5202.getClass(), "unknown", false);
        setBooleanField(term5202, term5202.getClass(), "resolved", false);
        setField(term5202, term5202.getClass(), "resolveResult", null);
        setField(term5202, term5202.getClass(), "registry", null);
        setField(term5197, term5197.getClass(), "ownerFunction", term5202);
        setBooleanField(term5197, term5197.getClass(), "prettyPrint", true);
        setBooleanField(term5197, term5197.getClass(), "visited", true);
        setField(term5203, term5203.getClass(), "info", null);
        setField(term5203, term5203.getClass(), "documentation", null);
        setField(term5203, term5203.getClass(), "associatedNode", null);
        setField(term5203, term5203.getClass(), "visibility", null);
        setIntField(term5203, term5203.getClass(), "bitset", 0);
        setField(term5203, term5203.getClass(), "type", null);
        setField(term5203, term5203.getClass(), "thisType", null);
        setBooleanField(term5203, term5203.getClass(), "includeDocumentation", false);
        setField(term5197, term5197.getClass(), "docInfo", term5203);
        setBooleanField(term5197, term5197.getClass(), "unknown", true);
        setBooleanField(term5197, term5197.getClass(), "resolved", false);
        setField(term5197, term5197.getClass(), "resolveResult", null);
        setField(term5197, term5197.getClass(), "registry", null);
        HashMap term5165 = new HashMap();
        term5164 = newInstance(Class.forName("java.util.HashMap$KeySet"));
        setField(term5164, term5164.getClass(), "this$0", term5165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOwnPropertyNames", argTypes, term474, args);
        assertTrue(recursiveEquals(term474, term5197));
        assertTrue(recursiveEquals(retValue, term5164));
    }

};


