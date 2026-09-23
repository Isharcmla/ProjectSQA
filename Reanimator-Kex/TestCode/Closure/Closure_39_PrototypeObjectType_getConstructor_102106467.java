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

public class PrototypeObjectType_getConstructor_102106467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2287;
     Object term8069;

    public PrototypeObjectType_getConstructor_102106467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2300 = new HashMap();
        term2287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2320 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2287, term2287.getClass(), "className", "izPpKDErnQ");
        setField(term2287, term2287.getClass(), "properties", term2300);
        setBooleanField(term2287, term2287.getClass(), "nativeType", true);
        setField(term2287, term2287.getClass(), "implicitPrototypeFallback", null);
        setField(term2312, term2312.getClass(), "call", null);
        setField(term2312, term2312.getClass(), "prototypeSlot", null);
        setField(term2312, term2312.getClass(), "kind", null);
        setField(term2312, term2312.getClass(), "typeOfThis", null);
        setField(term2312, term2312.getClass(), "source", null);
        setField(term2312, term2312.getClass(), "implementedInterfaces", null);
        setField(term2312, term2312.getClass(), "extendedInterfaces", null);
        setField(term2312, term2312.getClass(), "subTypes", null);
        setField(term2312, term2312.getClass(), "templateTypeName", null);
        setField(term2312, term2312.getClass(), "className", null);
        setField(term2312, term2312.getClass(), "properties", null);
        setBooleanField(term2312, term2312.getClass(), "nativeType", false);
        setField(term2312, term2312.getClass(), "implicitPrototypeFallback", null);
        setField(term2312, term2312.getClass(), "ownerFunction", null);
        setBooleanField(term2312, term2312.getClass(), "prettyPrint", false);
        setBooleanField(term2312, term2312.getClass(), "visited", false);
        setField(term2312, term2312.getClass(), "docInfo", null);
        setBooleanField(term2312, term2312.getClass(), "unknown", false);
        setBooleanField(term2312, term2312.getClass(), "resolved", false);
        setField(term2312, term2312.getClass(), "resolveResult", null);
        setField(term2312, term2312.getClass(), "registry", null);
        setField(term2287, term2287.getClass(), "ownerFunction", term2312);
        setBooleanField(term2287, term2287.getClass(), "prettyPrint", false);
        setBooleanField(term2287, term2287.getClass(), "visited", false);
        setField(term2320, term2320.getClass(), "info", null);
        setField(term2320, term2320.getClass(), "documentation", null);
        setField(term2320, term2320.getClass(), "associatedNode", null);
        setField(term2320, term2320.getClass(), "visibility", null);
        setIntField(term2320, term2320.getClass(), "bitset", 0);
        setField(term2320, term2320.getClass(), "type", null);
        setField(term2320, term2320.getClass(), "thisType", null);
        setBooleanField(term2320, term2320.getClass(), "includeDocumentation", false);
        setField(term2287, term2287.getClass(), "docInfo", term2320);
        setBooleanField(term2287, term2287.getClass(), "unknown", true);
        setBooleanField(term2287, term2287.getClass(), "resolved", false);
        setField(term2287, term2287.getClass(), "resolveResult", null);
        setField(term2287, term2287.getClass(), "registry", null);
        HashMap term8072 = new HashMap();
        term8069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8074 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8069, term8069.getClass(), "className", "izPpKDErnQ");
        setField(term8069, term8069.getClass(), "properties", term8072);
        setBooleanField(term8069, term8069.getClass(), "nativeType", true);
        setField(term8069, term8069.getClass(), "implicitPrototypeFallback", null);
        setField(term8073, term8073.getClass(), "call", null);
        setField(term8073, term8073.getClass(), "prototypeSlot", null);
        setField(term8073, term8073.getClass(), "kind", null);
        setField(term8073, term8073.getClass(), "typeOfThis", null);
        setField(term8073, term8073.getClass(), "source", null);
        setField(term8073, term8073.getClass(), "implementedInterfaces", null);
        setField(term8073, term8073.getClass(), "extendedInterfaces", null);
        setField(term8073, term8073.getClass(), "subTypes", null);
        setField(term8073, term8073.getClass(), "templateTypeName", null);
        setField(term8073, term8073.getClass(), "className", null);
        setField(term8073, term8073.getClass(), "properties", null);
        setBooleanField(term8073, term8073.getClass(), "nativeType", false);
        setField(term8073, term8073.getClass(), "implicitPrototypeFallback", null);
        setField(term8073, term8073.getClass(), "ownerFunction", null);
        setBooleanField(term8073, term8073.getClass(), "prettyPrint", false);
        setBooleanField(term8073, term8073.getClass(), "visited", false);
        setField(term8073, term8073.getClass(), "docInfo", null);
        setBooleanField(term8073, term8073.getClass(), "unknown", false);
        setBooleanField(term8073, term8073.getClass(), "resolved", false);
        setField(term8073, term8073.getClass(), "resolveResult", null);
        setField(term8073, term8073.getClass(), "registry", null);
        setField(term8069, term8069.getClass(), "ownerFunction", term8073);
        setBooleanField(term8069, term8069.getClass(), "prettyPrint", false);
        setBooleanField(term8069, term8069.getClass(), "visited", false);
        setField(term8074, term8074.getClass(), "info", null);
        setField(term8074, term8074.getClass(), "documentation", null);
        setField(term8074, term8074.getClass(), "associatedNode", null);
        setField(term8074, term8074.getClass(), "visibility", null);
        setIntField(term8074, term8074.getClass(), "bitset", 0);
        setField(term8074, term8074.getClass(), "type", null);
        setField(term8074, term8074.getClass(), "thisType", null);
        setBooleanField(term8074, term8074.getClass(), "includeDocumentation", false);
        setField(term8069, term8069.getClass(), "docInfo", term8074);
        setBooleanField(term8069, term8069.getClass(), "unknown", true);
        setBooleanField(term8069, term8069.getClass(), "resolved", false);
        setField(term8069, term8069.getClass(), "resolveResult", null);
        setField(term8069, term8069.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getConstructor", argTypes, term2287, args);
        assertTrue(recursiveEquals(term2287, term8069));
        assertTrue(recursiveEquals(retValue, null));
    }

};


