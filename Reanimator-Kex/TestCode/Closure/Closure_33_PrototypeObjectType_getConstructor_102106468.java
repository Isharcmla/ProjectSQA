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

public class PrototypeObjectType_getConstructor_102106468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2287;
     Object term8118;

    public PrototypeObjectType_getConstructor_102106468() {
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
        HashMap term8121 = new HashMap();
        term8118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8123 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8118, term8118.getClass(), "className", "izPpKDErnQ");
        setField(term8118, term8118.getClass(), "properties", term8121);
        setBooleanField(term8118, term8118.getClass(), "nativeType", true);
        setField(term8118, term8118.getClass(), "implicitPrototypeFallback", null);
        setField(term8122, term8122.getClass(), "call", null);
        setField(term8122, term8122.getClass(), "prototypeSlot", null);
        setField(term8122, term8122.getClass(), "kind", null);
        setField(term8122, term8122.getClass(), "typeOfThis", null);
        setField(term8122, term8122.getClass(), "source", null);
        setField(term8122, term8122.getClass(), "implementedInterfaces", null);
        setField(term8122, term8122.getClass(), "extendedInterfaces", null);
        setField(term8122, term8122.getClass(), "subTypes", null);
        setField(term8122, term8122.getClass(), "templateTypeName", null);
        setField(term8122, term8122.getClass(), "className", null);
        setField(term8122, term8122.getClass(), "properties", null);
        setBooleanField(term8122, term8122.getClass(), "nativeType", false);
        setField(term8122, term8122.getClass(), "implicitPrototypeFallback", null);
        setField(term8122, term8122.getClass(), "ownerFunction", null);
        setBooleanField(term8122, term8122.getClass(), "prettyPrint", false);
        setBooleanField(term8122, term8122.getClass(), "visited", false);
        setField(term8122, term8122.getClass(), "docInfo", null);
        setBooleanField(term8122, term8122.getClass(), "unknown", false);
        setBooleanField(term8122, term8122.getClass(), "resolved", false);
        setField(term8122, term8122.getClass(), "resolveResult", null);
        setField(term8122, term8122.getClass(), "registry", null);
        setField(term8118, term8118.getClass(), "ownerFunction", term8122);
        setBooleanField(term8118, term8118.getClass(), "prettyPrint", false);
        setBooleanField(term8118, term8118.getClass(), "visited", false);
        setField(term8123, term8123.getClass(), "info", null);
        setField(term8123, term8123.getClass(), "documentation", null);
        setField(term8123, term8123.getClass(), "associatedNode", null);
        setField(term8123, term8123.getClass(), "visibility", null);
        setIntField(term8123, term8123.getClass(), "bitset", 0);
        setField(term8123, term8123.getClass(), "type", null);
        setField(term8123, term8123.getClass(), "thisType", null);
        setBooleanField(term8123, term8123.getClass(), "includeDocumentation", false);
        setField(term8118, term8118.getClass(), "docInfo", term8123);
        setBooleanField(term8118, term8118.getClass(), "unknown", true);
        setBooleanField(term8118, term8118.getClass(), "resolved", false);
        setField(term8118, term8118.getClass(), "resolveResult", null);
        setField(term8118, term8118.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getConstructor", argTypes, term2287, args);
        assertTrue(recursiveEquals(term2287, term8118));
        assertTrue(recursiveEquals(retValue, null));
    }

};


