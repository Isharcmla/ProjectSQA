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
import java.lang.Boolean;

public class PrototypeObjectType_setPrettyPrint_168347772265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2189;
     Object term2227;
     Object term7952;

    public PrototypeObjectType_setPrettyPrint_168347772265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2202 = new HashMap();
        term2189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2222 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2189, term2189.getClass(), "className", "tlzpzIjMib");
        setField(term2189, term2189.getClass(), "properties", term2202);
        setBooleanField(term2189, term2189.getClass(), "nativeType", false);
        setField(term2189, term2189.getClass(), "implicitPrototypeFallback", null);
        setField(term2214, term2214.getClass(), "call", null);
        setField(term2214, term2214.getClass(), "prototypeSlot", null);
        setField(term2214, term2214.getClass(), "kind", null);
        setField(term2214, term2214.getClass(), "typeOfThis", null);
        setField(term2214, term2214.getClass(), "source", null);
        setField(term2214, term2214.getClass(), "implementedInterfaces", null);
        setField(term2214, term2214.getClass(), "extendedInterfaces", null);
        setField(term2214, term2214.getClass(), "subTypes", null);
        setField(term2214, term2214.getClass(), "templateTypeName", null);
        setField(term2214, term2214.getClass(), "className", null);
        setField(term2214, term2214.getClass(), "properties", null);
        setBooleanField(term2214, term2214.getClass(), "nativeType", false);
        setField(term2214, term2214.getClass(), "implicitPrototypeFallback", null);
        setField(term2214, term2214.getClass(), "ownerFunction", null);
        setBooleanField(term2214, term2214.getClass(), "prettyPrint", false);
        setBooleanField(term2214, term2214.getClass(), "visited", false);
        setField(term2214, term2214.getClass(), "docInfo", null);
        setBooleanField(term2214, term2214.getClass(), "unknown", false);
        setBooleanField(term2214, term2214.getClass(), "resolved", false);
        setField(term2214, term2214.getClass(), "resolveResult", null);
        setField(term2214, term2214.getClass(), "registry", null);
        setField(term2189, term2189.getClass(), "ownerFunction", term2214);
        setBooleanField(term2189, term2189.getClass(), "prettyPrint", false);
        setBooleanField(term2189, term2189.getClass(), "visited", true);
        setField(term2222, term2222.getClass(), "info", null);
        setField(term2222, term2222.getClass(), "documentation", null);
        setField(term2222, term2222.getClass(), "associatedNode", null);
        setField(term2222, term2222.getClass(), "visibility", null);
        setIntField(term2222, term2222.getClass(), "bitset", 0);
        setField(term2222, term2222.getClass(), "type", null);
        setField(term2222, term2222.getClass(), "thisType", null);
        setBooleanField(term2222, term2222.getClass(), "includeDocumentation", false);
        setField(term2189, term2189.getClass(), "docInfo", term2222);
        setBooleanField(term2189, term2189.getClass(), "unknown", false);
        setBooleanField(term2189, term2189.getClass(), "resolved", false);
        setField(term2189, term2189.getClass(), "resolveResult", null);
        setField(term2189, term2189.getClass(), "registry", null);
        term2227 = new Boolean(false);
        HashMap term7955 = new HashMap();
        term7952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7957 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7952, term7952.getClass(), "className", "tlzpzIjMib");
        setField(term7952, term7952.getClass(), "properties", term7955);
        setBooleanField(term7952, term7952.getClass(), "nativeType", false);
        setField(term7952, term7952.getClass(), "implicitPrototypeFallback", null);
        setField(term7956, term7956.getClass(), "call", null);
        setField(term7956, term7956.getClass(), "prototypeSlot", null);
        setField(term7956, term7956.getClass(), "kind", null);
        setField(term7956, term7956.getClass(), "typeOfThis", null);
        setField(term7956, term7956.getClass(), "source", null);
        setField(term7956, term7956.getClass(), "implementedInterfaces", null);
        setField(term7956, term7956.getClass(), "extendedInterfaces", null);
        setField(term7956, term7956.getClass(), "subTypes", null);
        setField(term7956, term7956.getClass(), "templateTypeName", null);
        setField(term7956, term7956.getClass(), "className", null);
        setField(term7956, term7956.getClass(), "properties", null);
        setBooleanField(term7956, term7956.getClass(), "nativeType", false);
        setField(term7956, term7956.getClass(), "implicitPrototypeFallback", null);
        setField(term7956, term7956.getClass(), "ownerFunction", null);
        setBooleanField(term7956, term7956.getClass(), "prettyPrint", false);
        setBooleanField(term7956, term7956.getClass(), "visited", false);
        setField(term7956, term7956.getClass(), "docInfo", null);
        setBooleanField(term7956, term7956.getClass(), "unknown", false);
        setBooleanField(term7956, term7956.getClass(), "resolved", false);
        setField(term7956, term7956.getClass(), "resolveResult", null);
        setField(term7956, term7956.getClass(), "registry", null);
        setField(term7952, term7952.getClass(), "ownerFunction", term7956);
        setBooleanField(term7952, term7952.getClass(), "prettyPrint", false);
        setBooleanField(term7952, term7952.getClass(), "visited", true);
        setField(term7957, term7957.getClass(), "info", null);
        setField(term7957, term7957.getClass(), "documentation", null);
        setField(term7957, term7957.getClass(), "associatedNode", null);
        setField(term7957, term7957.getClass(), "visibility", null);
        setIntField(term7957, term7957.getClass(), "bitset", 0);
        setField(term7957, term7957.getClass(), "type", null);
        setField(term7957, term7957.getClass(), "thisType", null);
        setBooleanField(term7957, term7957.getClass(), "includeDocumentation", false);
        setField(term7952, term7952.getClass(), "docInfo", term7957);
        setBooleanField(term7952, term7952.getClass(), "unknown", false);
        setBooleanField(term7952, term7952.getClass(), "resolved", false);
        setField(term7952, term7952.getClass(), "resolveResult", null);
        setField(term7952, term7952.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2227;
        callMethod(klass, "setPrettyPrint", argTypes, term2189, args);
        assertTrue(recursiveEquals(term2189, term7952));
        assertTrue(recursiveEquals(term2227, false));
    }

};


