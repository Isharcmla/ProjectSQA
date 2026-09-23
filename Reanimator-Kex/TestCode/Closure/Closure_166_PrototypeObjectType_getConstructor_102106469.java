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

public class PrototypeObjectType_getConstructor_102106469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2313;
     Object term8298;

    public PrototypeObjectType_getConstructor_102106469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2326 = new HashMap();
        term2313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2347 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2313, term2313.getClass(), "className", "tlzpzIjMib");
        setField(term2313, term2313.getClass(), "properties", term2326);
        setBooleanField(term2313, term2313.getClass(), "nativeType", true);
        setField(term2313, term2313.getClass(), "implicitPrototypeFallback", null);
        setField(term2338, term2338.getClass(), "call", null);
        setField(term2338, term2338.getClass(), "prototypeSlot", null);
        setField(term2338, term2338.getClass(), "kind", null);
        setField(term2338, term2338.getClass(), "typeOfThis", null);
        setField(term2338, term2338.getClass(), "source", null);
        setField(term2338, term2338.getClass(), "implementedInterfaces", null);
        setField(term2338, term2338.getClass(), "extendedInterfaces", null);
        setField(term2338, term2338.getClass(), "subTypes", null);
        setField(term2338, term2338.getClass(), "templateTypeNames", null);
        setField(term2338, term2338.getClass(), "className", null);
        setField(term2338, term2338.getClass(), "properties", null);
        setBooleanField(term2338, term2338.getClass(), "nativeType", false);
        setField(term2338, term2338.getClass(), "implicitPrototypeFallback", null);
        setField(term2338, term2338.getClass(), "ownerFunction", null);
        setBooleanField(term2338, term2338.getClass(), "prettyPrint", false);
        setBooleanField(term2338, term2338.getClass(), "visited", false);
        setField(term2338, term2338.getClass(), "docInfo", null);
        setBooleanField(term2338, term2338.getClass(), "unknown", false);
        setBooleanField(term2338, term2338.getClass(), "resolved", false);
        setField(term2338, term2338.getClass(), "resolveResult", null);
        setBooleanField(term2338, term2338.getClass(), "inTemplatedCheckVisit", false);
        setField(term2338, term2338.getClass(), "registry", null);
        setField(term2313, term2313.getClass(), "ownerFunction", term2338);
        setBooleanField(term2313, term2313.getClass(), "prettyPrint", false);
        setBooleanField(term2313, term2313.getClass(), "visited", false);
        setField(term2347, term2347.getClass(), "info", null);
        setField(term2347, term2347.getClass(), "documentation", null);
        setField(term2347, term2347.getClass(), "associatedNode", null);
        setField(term2347, term2347.getClass(), "visibility", null);
        setIntField(term2347, term2347.getClass(), "bitset", 0);
        setField(term2347, term2347.getClass(), "type", null);
        setField(term2347, term2347.getClass(), "thisType", null);
        setBooleanField(term2347, term2347.getClass(), "includeDocumentation", false);
        setField(term2313, term2313.getClass(), "docInfo", term2347);
        setBooleanField(term2313, term2313.getClass(), "unknown", true);
        setBooleanField(term2313, term2313.getClass(), "resolved", false);
        setField(term2313, term2313.getClass(), "resolveResult", null);
        setBooleanField(term2313, term2313.getClass(), "inTemplatedCheckVisit", false);
        setField(term2313, term2313.getClass(), "registry", null);
        HashMap term8301 = new HashMap();
        term8298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8303 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8298, term8298.getClass(), "className", "tlzpzIjMib");
        setField(term8298, term8298.getClass(), "properties", term8301);
        setBooleanField(term8298, term8298.getClass(), "nativeType", true);
        setField(term8298, term8298.getClass(), "implicitPrototypeFallback", null);
        setField(term8302, term8302.getClass(), "call", null);
        setField(term8302, term8302.getClass(), "prototypeSlot", null);
        setField(term8302, term8302.getClass(), "kind", null);
        setField(term8302, term8302.getClass(), "typeOfThis", null);
        setField(term8302, term8302.getClass(), "source", null);
        setField(term8302, term8302.getClass(), "implementedInterfaces", null);
        setField(term8302, term8302.getClass(), "extendedInterfaces", null);
        setField(term8302, term8302.getClass(), "subTypes", null);
        setField(term8302, term8302.getClass(), "templateTypeNames", null);
        setField(term8302, term8302.getClass(), "className", null);
        setField(term8302, term8302.getClass(), "properties", null);
        setBooleanField(term8302, term8302.getClass(), "nativeType", false);
        setField(term8302, term8302.getClass(), "implicitPrototypeFallback", null);
        setField(term8302, term8302.getClass(), "ownerFunction", null);
        setBooleanField(term8302, term8302.getClass(), "prettyPrint", false);
        setBooleanField(term8302, term8302.getClass(), "visited", false);
        setField(term8302, term8302.getClass(), "docInfo", null);
        setBooleanField(term8302, term8302.getClass(), "unknown", false);
        setBooleanField(term8302, term8302.getClass(), "resolved", false);
        setField(term8302, term8302.getClass(), "resolveResult", null);
        setBooleanField(term8302, term8302.getClass(), "inTemplatedCheckVisit", false);
        setField(term8302, term8302.getClass(), "registry", null);
        setField(term8298, term8298.getClass(), "ownerFunction", term8302);
        setBooleanField(term8298, term8298.getClass(), "prettyPrint", false);
        setBooleanField(term8298, term8298.getClass(), "visited", false);
        setField(term8303, term8303.getClass(), "info", null);
        setField(term8303, term8303.getClass(), "documentation", null);
        setField(term8303, term8303.getClass(), "associatedNode", null);
        setField(term8303, term8303.getClass(), "visibility", null);
        setIntField(term8303, term8303.getClass(), "bitset", 0);
        setField(term8303, term8303.getClass(), "type", null);
        setField(term8303, term8303.getClass(), "thisType", null);
        setBooleanField(term8303, term8303.getClass(), "includeDocumentation", false);
        setField(term8298, term8298.getClass(), "docInfo", term8303);
        setBooleanField(term8298, term8298.getClass(), "unknown", true);
        setBooleanField(term8298, term8298.getClass(), "resolved", false);
        setField(term8298, term8298.getClass(), "resolveResult", null);
        setBooleanField(term8298, term8298.getClass(), "inTemplatedCheckVisit", false);
        setField(term8298, term8298.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getConstructor", argTypes, term2313, args);
        assertTrue(recursiveEquals(term2313, term8298));
        assertTrue(recursiveEquals(retValue, null));
    }

};


