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

public class PrototypeObjectType_isPrettyPrint_86441724067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2239;
     Object term8060;

    public PrototypeObjectType_isPrettyPrint_86441724067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2252 = new HashMap();
        term2239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2272 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2239, term2239.getClass(), "className", "FwPbDZcHmB");
        setField(term2239, term2239.getClass(), "properties", term2252);
        setBooleanField(term2239, term2239.getClass(), "nativeType", false);
        setField(term2239, term2239.getClass(), "implicitPrototypeFallback", null);
        setField(term2264, term2264.getClass(), "call", null);
        setField(term2264, term2264.getClass(), "prototypeSlot", null);
        setField(term2264, term2264.getClass(), "kind", null);
        setField(term2264, term2264.getClass(), "typeOfThis", null);
        setField(term2264, term2264.getClass(), "source", null);
        setField(term2264, term2264.getClass(), "implementedInterfaces", null);
        setField(term2264, term2264.getClass(), "extendedInterfaces", null);
        setField(term2264, term2264.getClass(), "subTypes", null);
        setField(term2264, term2264.getClass(), "templateTypeName", null);
        setField(term2264, term2264.getClass(), "className", null);
        setField(term2264, term2264.getClass(), "properties", null);
        setBooleanField(term2264, term2264.getClass(), "nativeType", false);
        setField(term2264, term2264.getClass(), "implicitPrototypeFallback", null);
        setField(term2264, term2264.getClass(), "ownerFunction", null);
        setBooleanField(term2264, term2264.getClass(), "prettyPrint", false);
        setBooleanField(term2264, term2264.getClass(), "visited", false);
        setField(term2264, term2264.getClass(), "docInfo", null);
        setBooleanField(term2264, term2264.getClass(), "unknown", false);
        setBooleanField(term2264, term2264.getClass(), "resolved", false);
        setField(term2264, term2264.getClass(), "resolveResult", null);
        setField(term2264, term2264.getClass(), "registry", null);
        setField(term2239, term2239.getClass(), "ownerFunction", term2264);
        setBooleanField(term2239, term2239.getClass(), "prettyPrint", false);
        setBooleanField(term2239, term2239.getClass(), "visited", true);
        setField(term2272, term2272.getClass(), "info", null);
        setField(term2272, term2272.getClass(), "documentation", null);
        setField(term2272, term2272.getClass(), "associatedNode", null);
        setField(term2272, term2272.getClass(), "visibility", null);
        setIntField(term2272, term2272.getClass(), "bitset", 0);
        setField(term2272, term2272.getClass(), "type", null);
        setField(term2272, term2272.getClass(), "thisType", null);
        setBooleanField(term2272, term2272.getClass(), "includeDocumentation", false);
        setField(term2239, term2239.getClass(), "docInfo", term2272);
        setBooleanField(term2239, term2239.getClass(), "unknown", true);
        setBooleanField(term2239, term2239.getClass(), "resolved", false);
        setField(term2239, term2239.getClass(), "resolveResult", null);
        setField(term2239, term2239.getClass(), "registry", null);
        HashMap term8063 = new HashMap();
        term8060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8065 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8060, term8060.getClass(), "className", "FwPbDZcHmB");
        setField(term8060, term8060.getClass(), "properties", term8063);
        setBooleanField(term8060, term8060.getClass(), "nativeType", false);
        setField(term8060, term8060.getClass(), "implicitPrototypeFallback", null);
        setField(term8064, term8064.getClass(), "call", null);
        setField(term8064, term8064.getClass(), "prototypeSlot", null);
        setField(term8064, term8064.getClass(), "kind", null);
        setField(term8064, term8064.getClass(), "typeOfThis", null);
        setField(term8064, term8064.getClass(), "source", null);
        setField(term8064, term8064.getClass(), "implementedInterfaces", null);
        setField(term8064, term8064.getClass(), "extendedInterfaces", null);
        setField(term8064, term8064.getClass(), "subTypes", null);
        setField(term8064, term8064.getClass(), "templateTypeName", null);
        setField(term8064, term8064.getClass(), "className", null);
        setField(term8064, term8064.getClass(), "properties", null);
        setBooleanField(term8064, term8064.getClass(), "nativeType", false);
        setField(term8064, term8064.getClass(), "implicitPrototypeFallback", null);
        setField(term8064, term8064.getClass(), "ownerFunction", null);
        setBooleanField(term8064, term8064.getClass(), "prettyPrint", false);
        setBooleanField(term8064, term8064.getClass(), "visited", false);
        setField(term8064, term8064.getClass(), "docInfo", null);
        setBooleanField(term8064, term8064.getClass(), "unknown", false);
        setBooleanField(term8064, term8064.getClass(), "resolved", false);
        setField(term8064, term8064.getClass(), "resolveResult", null);
        setField(term8064, term8064.getClass(), "registry", null);
        setField(term8060, term8060.getClass(), "ownerFunction", term8064);
        setBooleanField(term8060, term8060.getClass(), "prettyPrint", false);
        setBooleanField(term8060, term8060.getClass(), "visited", true);
        setField(term8065, term8065.getClass(), "info", null);
        setField(term8065, term8065.getClass(), "documentation", null);
        setField(term8065, term8065.getClass(), "associatedNode", null);
        setField(term8065, term8065.getClass(), "visibility", null);
        setIntField(term8065, term8065.getClass(), "bitset", 0);
        setField(term8065, term8065.getClass(), "type", null);
        setField(term8065, term8065.getClass(), "thisType", null);
        setBooleanField(term8065, term8065.getClass(), "includeDocumentation", false);
        setField(term8060, term8060.getClass(), "docInfo", term8065);
        setBooleanField(term8060, term8060.getClass(), "unknown", true);
        setBooleanField(term8060, term8060.getClass(), "resolved", false);
        setField(term8060, term8060.getClass(), "resolveResult", null);
        setField(term8060, term8060.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrettyPrint", argTypes, term2239, args);
        assertTrue(recursiveEquals(term2239, term8060));
    }

};


