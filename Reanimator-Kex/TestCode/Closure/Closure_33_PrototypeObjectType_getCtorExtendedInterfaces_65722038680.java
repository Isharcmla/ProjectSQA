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

public class PrototypeObjectType_getCtorExtendedInterfaces_65722038680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3253;
     Object term9854;

    public PrototypeObjectType_getCtorExtendedInterfaces_65722038680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3266 = new HashMap();
        term3253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3286 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3253, term3253.getClass(), "className", "vOuMEpOQAg");
        setField(term3253, term3253.getClass(), "properties", term3266);
        setBooleanField(term3253, term3253.getClass(), "nativeType", false);
        setField(term3253, term3253.getClass(), "implicitPrototypeFallback", null);
        setField(term3278, term3278.getClass(), "call", null);
        setField(term3278, term3278.getClass(), "prototypeSlot", null);
        setField(term3278, term3278.getClass(), "kind", null);
        setField(term3278, term3278.getClass(), "typeOfThis", null);
        setField(term3278, term3278.getClass(), "source", null);
        setField(term3278, term3278.getClass(), "implementedInterfaces", null);
        setField(term3278, term3278.getClass(), "extendedInterfaces", null);
        setField(term3278, term3278.getClass(), "subTypes", null);
        setField(term3278, term3278.getClass(), "templateTypeName", null);
        setField(term3278, term3278.getClass(), "className", null);
        setField(term3278, term3278.getClass(), "properties", null);
        setBooleanField(term3278, term3278.getClass(), "nativeType", false);
        setField(term3278, term3278.getClass(), "implicitPrototypeFallback", null);
        setField(term3278, term3278.getClass(), "ownerFunction", null);
        setBooleanField(term3278, term3278.getClass(), "prettyPrint", false);
        setBooleanField(term3278, term3278.getClass(), "visited", false);
        setField(term3278, term3278.getClass(), "docInfo", null);
        setBooleanField(term3278, term3278.getClass(), "unknown", false);
        setBooleanField(term3278, term3278.getClass(), "resolved", false);
        setField(term3278, term3278.getClass(), "resolveResult", null);
        setField(term3278, term3278.getClass(), "registry", null);
        setField(term3253, term3253.getClass(), "ownerFunction", term3278);
        setBooleanField(term3253, term3253.getClass(), "prettyPrint", true);
        setBooleanField(term3253, term3253.getClass(), "visited", false);
        setField(term3286, term3286.getClass(), "info", null);
        setField(term3286, term3286.getClass(), "documentation", null);
        setField(term3286, term3286.getClass(), "associatedNode", null);
        setField(term3286, term3286.getClass(), "visibility", null);
        setIntField(term3286, term3286.getClass(), "bitset", 0);
        setField(term3286, term3286.getClass(), "type", null);
        setField(term3286, term3286.getClass(), "thisType", null);
        setBooleanField(term3286, term3286.getClass(), "includeDocumentation", false);
        setField(term3253, term3253.getClass(), "docInfo", term3286);
        setBooleanField(term3253, term3253.getClass(), "unknown", false);
        setBooleanField(term3253, term3253.getClass(), "resolved", true);
        setField(term3253, term3253.getClass(), "resolveResult", null);
        setField(term3253, term3253.getClass(), "registry", null);
        HashMap term9857 = new HashMap();
        term9854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9859 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9854, term9854.getClass(), "className", "vOuMEpOQAg");
        setField(term9854, term9854.getClass(), "properties", term9857);
        setBooleanField(term9854, term9854.getClass(), "nativeType", false);
        setField(term9854, term9854.getClass(), "implicitPrototypeFallback", null);
        setField(term9858, term9858.getClass(), "call", null);
        setField(term9858, term9858.getClass(), "prototypeSlot", null);
        setField(term9858, term9858.getClass(), "kind", null);
        setField(term9858, term9858.getClass(), "typeOfThis", null);
        setField(term9858, term9858.getClass(), "source", null);
        setField(term9858, term9858.getClass(), "implementedInterfaces", null);
        setField(term9858, term9858.getClass(), "extendedInterfaces", null);
        setField(term9858, term9858.getClass(), "subTypes", null);
        setField(term9858, term9858.getClass(), "templateTypeName", null);
        setField(term9858, term9858.getClass(), "className", null);
        setField(term9858, term9858.getClass(), "properties", null);
        setBooleanField(term9858, term9858.getClass(), "nativeType", false);
        setField(term9858, term9858.getClass(), "implicitPrototypeFallback", null);
        setField(term9858, term9858.getClass(), "ownerFunction", null);
        setBooleanField(term9858, term9858.getClass(), "prettyPrint", false);
        setBooleanField(term9858, term9858.getClass(), "visited", false);
        setField(term9858, term9858.getClass(), "docInfo", null);
        setBooleanField(term9858, term9858.getClass(), "unknown", false);
        setBooleanField(term9858, term9858.getClass(), "resolved", false);
        setField(term9858, term9858.getClass(), "resolveResult", null);
        setField(term9858, term9858.getClass(), "registry", null);
        setField(term9854, term9854.getClass(), "ownerFunction", term9858);
        setBooleanField(term9854, term9854.getClass(), "prettyPrint", true);
        setBooleanField(term9854, term9854.getClass(), "visited", false);
        setField(term9859, term9859.getClass(), "info", null);
        setField(term9859, term9859.getClass(), "documentation", null);
        setField(term9859, term9859.getClass(), "associatedNode", null);
        setField(term9859, term9859.getClass(), "visibility", null);
        setIntField(term9859, term9859.getClass(), "bitset", 0);
        setField(term9859, term9859.getClass(), "type", null);
        setField(term9859, term9859.getClass(), "thisType", null);
        setBooleanField(term9859, term9859.getClass(), "includeDocumentation", false);
        setField(term9854, term9854.getClass(), "docInfo", term9859);
        setBooleanField(term9854, term9854.getClass(), "unknown", false);
        setBooleanField(term9854, term9854.getClass(), "resolved", true);
        setField(term9854, term9854.getClass(), "resolveResult", null);
        setField(term9854, term9854.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCtorExtendedInterfaces", argTypes, term3253, args);
        assertTrue(recursiveEquals(term3253, term9854));
        assertTrue(recursiveEquals(retValue, null));
    }

};


