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

public class PrototypeObjectType_getOwnPropertyNames_208787190448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;
     Object term5245;
     Object term5212;

    public PrototypeObjectType_getOwnPropertyNames_208787190448() {
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
        HashMap term5248 = new HashMap();
        term5245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term5250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5251 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5245, term5245.getClass(), "className", "eVpkWxjuki");
        setField(term5245, term5245.getClass(), "properties", term5248);
        setBooleanField(term5245, term5245.getClass(), "nativeType", false);
        setField(term5245, term5245.getClass(), "implicitPrototypeFallback", null);
        setField(term5250, term5250.getClass(), "call", null);
        setField(term5250, term5250.getClass(), "prototypeSlot", null);
        setField(term5250, term5250.getClass(), "kind", null);
        setField(term5250, term5250.getClass(), "typeOfThis", null);
        setField(term5250, term5250.getClass(), "source", null);
        setField(term5250, term5250.getClass(), "implementedInterfaces", null);
        setField(term5250, term5250.getClass(), "extendedInterfaces", null);
        setField(term5250, term5250.getClass(), "subTypes", null);
        setField(term5250, term5250.getClass(), "templateTypeName", null);
        setField(term5250, term5250.getClass(), "className", null);
        setField(term5250, term5250.getClass(), "properties", null);
        setBooleanField(term5250, term5250.getClass(), "nativeType", false);
        setField(term5250, term5250.getClass(), "implicitPrototypeFallback", null);
        setField(term5250, term5250.getClass(), "ownerFunction", null);
        setBooleanField(term5250, term5250.getClass(), "prettyPrint", false);
        setBooleanField(term5250, term5250.getClass(), "visited", false);
        setField(term5250, term5250.getClass(), "docInfo", null);
        setBooleanField(term5250, term5250.getClass(), "unknown", false);
        setBooleanField(term5250, term5250.getClass(), "resolved", false);
        setField(term5250, term5250.getClass(), "resolveResult", null);
        setField(term5250, term5250.getClass(), "registry", null);
        setField(term5245, term5245.getClass(), "ownerFunction", term5250);
        setBooleanField(term5245, term5245.getClass(), "prettyPrint", true);
        setBooleanField(term5245, term5245.getClass(), "visited", true);
        setField(term5251, term5251.getClass(), "info", null);
        setField(term5251, term5251.getClass(), "documentation", null);
        setField(term5251, term5251.getClass(), "associatedNode", null);
        setField(term5251, term5251.getClass(), "visibility", null);
        setIntField(term5251, term5251.getClass(), "bitset", 0);
        setField(term5251, term5251.getClass(), "type", null);
        setField(term5251, term5251.getClass(), "thisType", null);
        setBooleanField(term5251, term5251.getClass(), "includeDocumentation", false);
        setField(term5245, term5245.getClass(), "docInfo", term5251);
        setBooleanField(term5245, term5245.getClass(), "unknown", true);
        setBooleanField(term5245, term5245.getClass(), "resolved", false);
        setField(term5245, term5245.getClass(), "resolveResult", null);
        setField(term5245, term5245.getClass(), "registry", null);
        HashMap term5213 = new HashMap();
        term5212 = newInstance(Class.forName("java.util.HashMap$KeySet"));
        setField(term5212, term5212.getClass(), "this$0", term5213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOwnPropertyNames", argTypes, term474, args);
        assertTrue(recursiveEquals(term474, term5245));
        assertTrue(recursiveEquals(retValue, term5212));
    }

};


