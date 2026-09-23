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

public class PrototypeObjectType_hasCachedValues_10136018574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2623;
     Object term8964;

    public PrototypeObjectType_hasCachedValues_10136018574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2636 = new HashMap();
        term2623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2656 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2623, term2623.getClass(), "className", "mfCpTPPQQm");
        setField(term2623, term2623.getClass(), "properties", term2636);
        setBooleanField(term2623, term2623.getClass(), "nativeType", true);
        setField(term2623, term2623.getClass(), "implicitPrototypeFallback", null);
        setField(term2648, term2648.getClass(), "call", null);
        setField(term2648, term2648.getClass(), "prototypeSlot", null);
        setField(term2648, term2648.getClass(), "kind", null);
        setField(term2648, term2648.getClass(), "typeOfThis", null);
        setField(term2648, term2648.getClass(), "source", null);
        setField(term2648, term2648.getClass(), "implementedInterfaces", null);
        setField(term2648, term2648.getClass(), "extendedInterfaces", null);
        setField(term2648, term2648.getClass(), "subTypes", null);
        setField(term2648, term2648.getClass(), "templateTypeName", null);
        setField(term2648, term2648.getClass(), "className", null);
        setField(term2648, term2648.getClass(), "properties", null);
        setBooleanField(term2648, term2648.getClass(), "nativeType", false);
        setField(term2648, term2648.getClass(), "implicitPrototypeFallback", null);
        setField(term2648, term2648.getClass(), "ownerFunction", null);
        setBooleanField(term2648, term2648.getClass(), "prettyPrint", false);
        setBooleanField(term2648, term2648.getClass(), "visited", false);
        setField(term2648, term2648.getClass(), "docInfo", null);
        setBooleanField(term2648, term2648.getClass(), "unknown", false);
        setBooleanField(term2648, term2648.getClass(), "resolved", false);
        setField(term2648, term2648.getClass(), "resolveResult", null);
        setField(term2648, term2648.getClass(), "registry", null);
        setField(term2623, term2623.getClass(), "ownerFunction", term2648);
        setBooleanField(term2623, term2623.getClass(), "prettyPrint", false);
        setBooleanField(term2623, term2623.getClass(), "visited", false);
        setField(term2656, term2656.getClass(), "info", null);
        setField(term2656, term2656.getClass(), "documentation", null);
        setField(term2656, term2656.getClass(), "associatedNode", null);
        setField(term2656, term2656.getClass(), "visibility", null);
        setIntField(term2656, term2656.getClass(), "bitset", 0);
        setField(term2656, term2656.getClass(), "type", null);
        setField(term2656, term2656.getClass(), "thisType", null);
        setBooleanField(term2656, term2656.getClass(), "includeDocumentation", false);
        setField(term2623, term2623.getClass(), "docInfo", term2656);
        setBooleanField(term2623, term2623.getClass(), "unknown", true);
        setBooleanField(term2623, term2623.getClass(), "resolved", false);
        setField(term2623, term2623.getClass(), "resolveResult", null);
        setField(term2623, term2623.getClass(), "registry", null);
        HashMap term8967 = new HashMap();
        term8964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8969 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8964, term8964.getClass(), "className", "mfCpTPPQQm");
        setField(term8964, term8964.getClass(), "properties", term8967);
        setBooleanField(term8964, term8964.getClass(), "nativeType", true);
        setField(term8964, term8964.getClass(), "implicitPrototypeFallback", null);
        setField(term8968, term8968.getClass(), "call", null);
        setField(term8968, term8968.getClass(), "prototypeSlot", null);
        setField(term8968, term8968.getClass(), "kind", null);
        setField(term8968, term8968.getClass(), "typeOfThis", null);
        setField(term8968, term8968.getClass(), "source", null);
        setField(term8968, term8968.getClass(), "implementedInterfaces", null);
        setField(term8968, term8968.getClass(), "extendedInterfaces", null);
        setField(term8968, term8968.getClass(), "subTypes", null);
        setField(term8968, term8968.getClass(), "templateTypeName", null);
        setField(term8968, term8968.getClass(), "className", null);
        setField(term8968, term8968.getClass(), "properties", null);
        setBooleanField(term8968, term8968.getClass(), "nativeType", false);
        setField(term8968, term8968.getClass(), "implicitPrototypeFallback", null);
        setField(term8968, term8968.getClass(), "ownerFunction", null);
        setBooleanField(term8968, term8968.getClass(), "prettyPrint", false);
        setBooleanField(term8968, term8968.getClass(), "visited", false);
        setField(term8968, term8968.getClass(), "docInfo", null);
        setBooleanField(term8968, term8968.getClass(), "unknown", false);
        setBooleanField(term8968, term8968.getClass(), "resolved", false);
        setField(term8968, term8968.getClass(), "resolveResult", null);
        setField(term8968, term8968.getClass(), "registry", null);
        setField(term8964, term8964.getClass(), "ownerFunction", term8968);
        setBooleanField(term8964, term8964.getClass(), "prettyPrint", false);
        setBooleanField(term8964, term8964.getClass(), "visited", false);
        setField(term8969, term8969.getClass(), "info", null);
        setField(term8969, term8969.getClass(), "documentation", null);
        setField(term8969, term8969.getClass(), "associatedNode", null);
        setField(term8969, term8969.getClass(), "visibility", null);
        setIntField(term8969, term8969.getClass(), "bitset", 0);
        setField(term8969, term8969.getClass(), "type", null);
        setField(term8969, term8969.getClass(), "thisType", null);
        setBooleanField(term8969, term8969.getClass(), "includeDocumentation", false);
        setField(term8964, term8964.getClass(), "docInfo", term8969);
        setBooleanField(term8964, term8964.getClass(), "unknown", true);
        setBooleanField(term8964, term8964.getClass(), "resolved", false);
        setField(term8964, term8964.getClass(), "resolveResult", null);
        setField(term8964, term8964.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasCachedValues", argTypes, term2623, args);
        assertTrue(recursiveEquals(term2623, term8964));
    }

};


