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

public class PrototypeObjectType_setPrettyPrint_168347772266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2189;
     Object term2227;
     Object term8001;

    public PrototypeObjectType_setPrettyPrint_168347772266() {
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
        HashMap term8004 = new HashMap();
        term8001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8006 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8001, term8001.getClass(), "className", "tlzpzIjMib");
        setField(term8001, term8001.getClass(), "properties", term8004);
        setBooleanField(term8001, term8001.getClass(), "nativeType", false);
        setField(term8001, term8001.getClass(), "implicitPrototypeFallback", null);
        setField(term8005, term8005.getClass(), "call", null);
        setField(term8005, term8005.getClass(), "prototypeSlot", null);
        setField(term8005, term8005.getClass(), "kind", null);
        setField(term8005, term8005.getClass(), "typeOfThis", null);
        setField(term8005, term8005.getClass(), "source", null);
        setField(term8005, term8005.getClass(), "implementedInterfaces", null);
        setField(term8005, term8005.getClass(), "extendedInterfaces", null);
        setField(term8005, term8005.getClass(), "subTypes", null);
        setField(term8005, term8005.getClass(), "templateTypeName", null);
        setField(term8005, term8005.getClass(), "className", null);
        setField(term8005, term8005.getClass(), "properties", null);
        setBooleanField(term8005, term8005.getClass(), "nativeType", false);
        setField(term8005, term8005.getClass(), "implicitPrototypeFallback", null);
        setField(term8005, term8005.getClass(), "ownerFunction", null);
        setBooleanField(term8005, term8005.getClass(), "prettyPrint", false);
        setBooleanField(term8005, term8005.getClass(), "visited", false);
        setField(term8005, term8005.getClass(), "docInfo", null);
        setBooleanField(term8005, term8005.getClass(), "unknown", false);
        setBooleanField(term8005, term8005.getClass(), "resolved", false);
        setField(term8005, term8005.getClass(), "resolveResult", null);
        setField(term8005, term8005.getClass(), "registry", null);
        setField(term8001, term8001.getClass(), "ownerFunction", term8005);
        setBooleanField(term8001, term8001.getClass(), "prettyPrint", false);
        setBooleanField(term8001, term8001.getClass(), "visited", true);
        setField(term8006, term8006.getClass(), "info", null);
        setField(term8006, term8006.getClass(), "documentation", null);
        setField(term8006, term8006.getClass(), "associatedNode", null);
        setField(term8006, term8006.getClass(), "visibility", null);
        setIntField(term8006, term8006.getClass(), "bitset", 0);
        setField(term8006, term8006.getClass(), "type", null);
        setField(term8006, term8006.getClass(), "thisType", null);
        setBooleanField(term8006, term8006.getClass(), "includeDocumentation", false);
        setField(term8001, term8001.getClass(), "docInfo", term8006);
        setBooleanField(term8001, term8001.getClass(), "unknown", false);
        setBooleanField(term8001, term8001.getClass(), "resolved", false);
        setField(term8001, term8001.getClass(), "resolveResult", null);
        setField(term8001, term8001.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2227;
        callMethod(klass, "setPrettyPrint", argTypes, term2189, args);
        assertTrue(recursiveEquals(term2189, term8001));
        assertTrue(recursiveEquals(term2227, false));
    }

};


